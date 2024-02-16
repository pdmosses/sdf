---
title: Basic.sdf3
hide:
  - toc
---

# `Basic.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/basic/Basic.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/basic/Basic.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/basic/Basic.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="basic/Basic_1_8" title="a definition with multiple references" data-urls="../../TemplateLang.sdf3/#basic/Basic line 12_3; ../../sdf2-core/Sdf2-Syntax.sdf3/#basic/Basic line 4_9; ../../sorts/Sorts.sdf3/#basic/Basic line 5_1">basic/Basic</button>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_1_8" id="kernel/Kernel_3_9" title="a reference to a single-file definition">kernel/Kernel</a>
                <a href="../../sorts/Sorts.sdf3/#sorts/Sorts_1_8" id="sorts/Sorts_4_3" title="a reference to a single-file definition">sorts/Sorts</a>
                <a href="../../TemplateLang.sdf3/#TemplateLang_1_8" id="TemplateLang_5_3" title="a reference to a single-file definition">TemplateLang</a>

<span class="keyword">context-free syntax</span>
 
<span id="Grammar_9_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="Lexical_9_9" title="a definition with no references">Lexical</span></span> = &lt;
        <span class="cons_String">lexical</span> <span class="cons_String">syntax</span>
        
                &lt;<a href="../../kernel/Kernel.sdf3/#Productions_52_1" id="Productions_12_4" title="a reference to a single-file definition">Productions</a>&gt;
        
        &gt;
<span id="Grammar_15_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="Contextfree_15_9" title="a definition with no references">Contextfree</span></span> = &lt;
        <span class="cons_String">context-free</span> <span class="cons_String">syntax</span>
        
                &lt;<a href="../../kernel/Kernel.sdf3/#Productions_52_1" id="Productions_18_4" title="a reference to a single-file definition">Productions</a>&gt;
        
        &gt;
<span id="Grammar_21_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="Variables_21_9" title="a definition with no references">Variables</span></span> = &lt;
        <span class="cons_String">variables</span>
        
                &lt;<a href="../../kernel/Kernel.sdf3/#Productions_52_1" id="Productions_24_4" title="a reference to a single-file definition">Productions</a>&gt;
        
        &gt;
<span id="Grammar_27_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="VariablesProductive_27_9" title="a definition with no references">VariablesProductive</span></span> = &lt;
    <span class="cons_String">variables</span>
    
            &lt;{<a href="../../TemplateLang.sdf3/#SdfProduction_85_1" id="SdfProduction_30_8" title="a reference to a single-file definition">SdfProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;
            
    &gt;        {<span class="keyword">prefer</span>}
        
<span id="Grammar_34_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="LexVariables_34_9" title="a definition with no references">LexVariables</span></span> = &lt;
        <span class="cons_String">lexical</span> <span class="cons_String">variables</span>
        
                &lt;<a href="../../kernel/Kernel.sdf3/#Productions_52_1" id="Productions_37_4" title="a reference to a single-file definition">Productions</a>&gt;
        
        &gt;
        
<span id="Grammar_41_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="LexVariablesProductive_41_9" title="a definition with no references">LexVariablesProductive</span></span> = &lt;
    <span class="cons_String">lexical</span> <span class="cons_String">variables</span>
    
            &lt;{<a href="../../TemplateLang.sdf3/#SdfProduction_85_1" id="SdfProduction_44_8" title="a reference to a single-file definition">SdfProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;

    &gt; {<span class="keyword">prefer</span>}

<button class="modal-open" id="Symbol_48_1" title="a definition with multiple references" data-urls="#Symbol line 48_15, 49_16, 50_19">Symbol</button>.<span class="cons_Constructor"><a href="../../sorts/Sorts.sdf3/#Cf_50_51" id="Cf_48_8" title="a definition with a single reference">Cf</a></span> = &lt;&lt;<a href="#Symbol_48_1" id="Symbol_48_15" title="a reference to a single-file definition">Symbol</a>&gt;<span class="cons_String">-CF</span>&gt;
<button class="modal-open" id="Symbol_49_1" title="a definition with multiple references" data-urls="#Symbol line 48_15, 49_16, 50_19">Symbol</button>.<span class="cons_Constructor"><a href="../../sorts/Sorts.sdf3/#Lex_50_61" id="Lex_49_8" title="a definition with a single reference">Lex</a></span> = &lt;&lt;<a href="#Symbol_48_1" id="Symbol_49_16" title="a reference to a single-file definition">Symbol</a>&gt;<span class="cons_String">-LEX</span>&gt;
<button class="modal-open" id="Symbol_50_1" title="a definition with multiple references" data-urls="#Symbol line 48_15, 49_16, 50_19">Symbol</button>.<span class="cons_Constructor"><a href="../../sorts/Sorts.sdf3/#Varsym_50_72" id="Varsym_50_8" title="a definition with a single reference">Varsym</a></span> = &lt;&lt;<a href="#Symbol_48_1" id="Symbol_50_19" title="a reference to a single-file definition">Symbol</a>&gt;<span class="cons_String">-VAR</span>&gt;
<button class="modal-open" id="Symbol_51_1" title="a definition with multiple references" data-urls="#Symbol line 48_15, 49_16, 50_19">Symbol</button>.<span class="cons_Constructor"><span id="Layout_51_8" title="a definition with no references">Layout</span></span> = &lt;<span class="cons_String">LAYOUT</span>&gt;  

<span class="keyword">lexical syntax</span>

<button class="modal-open" id="Sort_55_1" title="a definition with multiple references" data-urls="#Sort line 55_8, 56_8, 57_8">Sort</button> = <a href="#Sort_55_1" id="Sort_55_8" title="a reference to a single-file definition">Sort</a> <span class="cons_Lit">"-LEX"</span> {<span class="keyword">reject</span>}
<button class="modal-open" id="Sort_56_1" title="a definition with multiple references" data-urls="#Sort line 55_8, 56_8, 57_8">Sort</button> = <a href="#Sort_55_1" id="Sort_56_8" title="a reference to a single-file definition">Sort</a> <span class="cons_Lit">"-CF"</span> {<span class="keyword">reject</span>}
<button class="modal-open" id="Sort_57_1" title="a definition with multiple references" data-urls="#Sort line 55_8, 56_8, 57_8">Sort</button> = <a href="#Sort_55_1" id="Sort_57_8" title="a reference to a single-file definition">Sort</a> <span class="cons_Lit">"-VAR"</span> {<span class="keyword">reject</span>}
<button class="modal-open" id="Sort_58_1" title="a definition with multiple references" data-urls="#Sort line 55_8, 56_8, 57_8">Sort</button> = <span class="cons_Lit">"LAYOUT"</span> <span class="cons_Lit">"-LEX"</span> {<span class="keyword">reject</span>}
<button class="modal-open" id="Sort_59_1" title="a definition with multiple references" data-urls="#Sort line 55_8, 56_8, 57_8">Sort</button> = <span class="cons_Lit">"LAYOUT"</span> <span class="cons_Lit">"-CF"</span> {<span class="keyword">reject</span>}
<button class="modal-open" id="Sort_60_1" title="a definition with multiple references" data-urls="#Sort line 55_8, 56_8, 57_8">Sort</button> = <span class="cons_Lit">"LAYOUT"</span> <span class="cons_Lit">"-VAR"</span> {<span class="keyword">reject</span>}







</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
