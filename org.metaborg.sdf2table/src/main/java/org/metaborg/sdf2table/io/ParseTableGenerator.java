package org.metaborg.sdf2table.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.commons.vfs2.FileObject;
import org.metaborg.sdf2table.grammar.CharacterClass;
import org.metaborg.sdf2table.grammar.IPriority;
import org.metaborg.sdf2table.grammar.IProduction;
import org.metaborg.sdf2table.grammar.NormGrammar;
import org.metaborg.sdf2table.parsetable.Action;
import org.metaborg.sdf2table.parsetable.GoTo;
import org.metaborg.sdf2table.parsetable.IParseTable;
import org.metaborg.sdf2table.parsetable.ParseTable;
import org.metaborg.sdf2table.parsetable.State;
import org.metaborg.util.log.ILogger;
import org.metaborg.util.log.LoggerUtils;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.terms.TermFactory;

import com.google.common.collect.Lists;

public class ParseTableGenerator {

    private static final ILogger logger = LoggerUtils.logger(ParseTableGenerator.class);

    private File input;
    private File outputFile;
    private File ctxGrammarFile;
    private File normGrammarFile;
    private List<String> paths;
    private final ITermFactory termFactory = new TermFactory();
    private boolean tableCreated = false;
    private ParseTable pt;

    public ParseTableGenerator(File input, File output, File normGrammar, File ctxGrammar, List<String> paths) {
        this.input = input;
        this.outputFile = output;
        this.paths = paths;
        this.normGrammarFile = normGrammar;
        this.ctxGrammarFile = ctxGrammar;
    }

    public ParseTableGenerator(FileObject grammarFile) throws Exception {
        NormGrammar grammar;

        InputStream out = grammarFile.getContent().getInputStream();
        ObjectInputStream ois = new ObjectInputStream(out);
        // read persisted normalized grammar
        grammar = (NormGrammar) ois.readObject();
        ois.close();
        out.close();

        pt = new ParseTable(grammar, true);
        tableCreated = true;
    }

    public void createParseTable(boolean dynamic) throws Exception {
        NormGrammar grammar = new GrammarReader(termFactory).readGrammar(input, paths);
        pt = new ParseTable(grammar, dynamic);
        tableCreated = true;
    }

    public void outputTable(boolean dynamic) throws Exception {
        if(tableCreated == false) {
            createParseTable(dynamic);
        }
        // FIXME add option to generate the contextual grammar in the Yaml file
        if(ctxGrammarFile != null) {
            IStrategoTerm ctxGrammar = generateATermContextualGrammar(pt);
            outputToFile(ctxGrammar.toString(), ctxGrammarFile);
        }

        // if(parenthesizerFile != null) {
        // // output parenthesizer in Stratego
        // IStrategoTerm parenthesizer = Parenthesizer.generateParenthesizer(
        // FilenameUtils.getBaseName(parenthesizerFile.getName()), pt.getGrammar(), termFactory);
        // // fixed location of the parenthesizer at src-gen/pp/<Lang>-Parenthesizer?
        // // FIXME need to depend on stratego-jar to pretty-print stratego, but that creates problems
        // outputToFile(parenthesizer.toString(), parenthesizerFile);
        // }

        // output binary normalized grammar
        if(normGrammarFile != null) {
            persistObjectToFile(pt.normalizedGrammar(), normGrammarFile);
        }

        IStrategoTerm ptAterm = generateATerm(pt);
        // output aterm corresponding to the parse table
        outputToFile(ptAterm.toString(), outputFile);

    }

    public IStrategoTerm generateATerm(IParseTable pt) throws Exception {

        IStrategoTerm version = termFactory.makeInt(ParseTable.VERSION_NUMBER);
        IStrategoTerm initialState = termFactory.makeInt(ParseTable.INITIAL_STATE_NUMBER);


        IStrategoTerm labels = generateLabelsAterm(pt);
        IStrategoTerm priorities = generatePrioritiesAterm(pt);
        IStrategoTerm states = generateStatesAterm(pt);



        return termFactory.makeAppl(termFactory.makeConstructor("parse-table", 5), version, initialState, labels,
            states, priorities);
    }

    private IStrategoTerm generateATermContextualGrammar(IParseTable pt) {

        List<IStrategoTerm> productions = Lists.newArrayList();
        List<IStrategoTerm> priorities = Lists.newArrayList();
        for(IProduction p : pt.productionLabels().keySet()) {
            productions.add(p.toSDF3Aterm(termFactory, pt.normalizedGrammar().getProductionAttributesMapping(),
                ((ParseTable) pt).getCtxUniqueInt(), null));
        }

        IStrategoTerm syntaxSection = termFactory.makeAppl(termFactory.makeConstructor("SDFSection", 1),
            termFactory.makeAppl(termFactory.makeConstructor("Kernel", 1), termFactory.makeList(productions)));

        IStrategoTerm prioritiesSection = termFactory.makeAppl(termFactory.makeConstructor("SDFSection", 1),
            termFactory.makeAppl(termFactory.makeConstructor("Priorities", 1), termFactory.makeList(priorities)));

        IStrategoTerm restrictionsSection = termFactory.makeAppl(termFactory.makeConstructor("SDFSection", 1),
            termFactory.makeAppl(termFactory.makeConstructor("Restrictions", 1), termFactory.makeList(priorities)));

        return termFactory.makeAppl(termFactory.makeConstructor("Module", 3),
            termFactory.makeAppl(termFactory.makeConstructor("Unparameterized", 1),
                termFactory.makeString("contextual-grammar")),
            termFactory.makeList(), termFactory.makeList(syntaxSection, prioritiesSection, restrictionsSection));
    }

    private IStrategoTerm generateStatesAterm(IParseTable pt) {
        List<IStrategoTerm> terms = Lists.newArrayList();
        for(int i = 0; i < pt.totalStates(); i++) {
            State s = pt.stateLabels().get(i);
            List<IStrategoTerm> goto_terms = Lists.newArrayList();
            List<IStrategoTerm> action_terms = Lists.newArrayList();
            for(GoTo goto_action : s.gotos()) {
                goto_terms.add(goto_action.toAterm(termFactory));
            }
            for(CharacterClass cc : s.actions().keySet()) {
                List<IStrategoTerm> actions = Lists.newArrayList();
                for(Action a : s.actions().get(cc)) {
                    actions.add(a.toAterm(termFactory, pt));
                }
                action_terms.add(termFactory.makeAppl(termFactory.makeConstructor("action", 2),
                    cc.toStateAterm(termFactory), termFactory.makeList(actions)));
                // action_terms.add(action.toAterm(termFactory, this));
            }
            terms.add(
                termFactory.makeAppl(termFactory.makeConstructor("state-rec", 3), termFactory.makeInt(s.getLabel()),
                    termFactory.makeList(goto_terms), termFactory.makeList(action_terms)));
        }

        return termFactory.makeAppl(termFactory.makeConstructor("states", 1), termFactory.makeList(terms));
    }

    private IStrategoTerm generatePrioritiesAterm(IParseTable pt) throws Exception {
        List<IStrategoTerm> terms = Lists.newArrayList();
        for(java.util.Map.Entry<IPriority, Integer> e : pt.normalizedGrammar().priorities().entries()) {
            IProduction prod_higher = e.getKey().higher();
            IProduction prod_lower = e.getKey().lower();
            // because non-contextual production got replaced
            if(pt.normalizedGrammar().getProdContextualProdMapping().containsKey(prod_higher)) {
                prod_higher = pt.normalizedGrammar().getProdContextualProdMapping().get(e.getKey().higher());
            }
            if(pt.normalizedGrammar().getProdContextualProdMapping().containsKey(prod_lower)) {
                prod_lower = pt.normalizedGrammar().getProdContextualProdMapping().get(e.getKey().lower());
            }
            Integer label_higher = pt.productionLabels().get(prod_higher);
            Integer label_lower = pt.productionLabels().get(prod_lower);
            if(label_higher == null || label_lower == null) {
                throw new Exception("Production label not found.");
            }
            if(e.getValue() == -1) {
                IStrategoTerm prio_term = termFactory.makeAppl(termFactory.makeConstructor("gtr-prio", 2),
                    termFactory.makeInt(label_higher), termFactory.makeInt(label_lower));
                terms.add(prio_term);
            } else {
                if(e.getValue() == Integer.MAX_VALUE || e.getValue() == Integer.MIN_VALUE)
                    continue;

                IStrategoTerm prio_term = termFactory.makeAppl(termFactory.makeConstructor("arg-gtr-prio", 3),
                    termFactory.makeInt(label_higher), termFactory.makeInt(e.getValue()),
                    termFactory.makeInt(label_lower));
                terms.add(prio_term);
            }
        }

        return termFactory.makeAppl(termFactory.makeConstructor("priorities", 1), termFactory.makeList(terms));

    }

    private IStrategoTerm generateLabelsAterm(IParseTable pt) {
        List<IStrategoTerm> terms = Lists.newArrayList();

        for(int i = 257 + pt.productionLabels().size() - 1; i >= 257; i--) {
            IProduction p = pt.productionLabels().inverse().get(i);

            IStrategoTerm p_term = termFactory.makeAppl(termFactory.makeConstructor("label", 2),
                p.toAterm(termFactory, pt.normalizedGrammar().getProductionAttributesMapping()),
                termFactory.makeInt(i));
            terms.add(p_term);
        }

        return termFactory.makeList(terms);
    }

    public ParseTable getParseTable() {
        return pt;
    }

    public void setParseTable(ParseTable pt) {
        this.pt = pt;
    }

    private void outputToFile(String outputString, File output) {
        if(output != null) {
            output.getParentFile().mkdirs();
            try {
                output.createNewFile();
                FileWriter out = null;
                out = new FileWriter(output);
                out.write(outputString);
                out.close();
            } catch(IOException e) {
                logger.error("Could not write parse table", e);
            }
        }

    }

    private void persistObjectToFile(NormGrammar grammar, File output) {
        FileOutputStream out = null;
        ObjectOutputStream outObj = null;
        try {
            String name = normGrammarFile.getAbsolutePath();
            out = new FileOutputStream(name);
            outObj = new ObjectOutputStream(out);
            outObj.writeObject(grammar);
            outObj.close();
            out.close();
        } catch(IOException e) {
            logger.error("Could not persist normalized grammar", e);
        }

    }

}
