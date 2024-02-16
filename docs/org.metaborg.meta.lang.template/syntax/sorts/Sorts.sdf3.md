---
title: Sorts.sdf3
hide:
  - toc
---

# `Sorts.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/sorts/Sorts.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/sorts/Sorts.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/sorts/Sorts.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="sorts/Sorts_1_8" title="a definition with multiple references" data-urls="../../TemplateLang.sdf3/#sorts/Sorts line 5_3; ../../basic/Basic.sdf3/#sorts/Sorts line 4_3; ../../regular/Regular.sdf3/#sorts/Sorts line 3_87; ../../sdf2-core/Sdf2-Syntax.sdf3/#sorts/Sorts line 10_9">sorts/Sorts</button>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_1_8" id="kernel/Kernel_3_9" title="a reference to a single-file definition">kernel/Kernel</a>
<a href="../../symbols/Symbols.sdf3/#symbols/Symbols_1_8" id="symbols/Symbols_4_1" title="a reference to a single-file definition">symbols/Symbols</a>
<a href="../../basic/Basic.sdf3/#basic/Basic_1_8" id="basic/Basic_5_1" title="a reference to a single-file definition">basic/Basic</a>
<a href="../../regular/Regular.sdf3/#regular/Regular_1_8" id="regular/Regular_6_1" title="a reference to a single-file definition">regular/Regular</a>

<span class="keyword">lexical syntax</span>
  <span class="layout">//head:[A-Z] -&gt; Sort {cons("one-char")}</span>
  <button class="modal-open" id="Sort_10_3" title="a definition with multiple references" data-urls="#Sort line 15_17, 16_30, 17_23, 22_26, 23_26, 24_26, 25_26, 33_18, 37_23, 41_19, 46_5; ../../regular/Regular.sdf3/#Sort line 20_20, 21_21, 22_25, 23_25, 24_29">Sort</button>.<span class="cons_Constructor"><span id="OneChar_10_8" title="a definition with no references">OneChar</span></span> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>]
  <span class="layout">//head:[A-Z] middle:[A-Za-z0-9\_\-]* last:[A-Za-z0-9] -&gt; Sort {cons("more-chars")}</span>
  <button class="modal-open" id="Sort_12_3" title="a definition with multiple references" data-urls="#Sort line 15_17, 16_30, 17_23, 22_26, 23_26, 24_26, 25_26, 33_18, 37_23, 41_19, 46_5; ../../regular/Regular.sdf3/#Sort line 20_20, 21_21, 22_25, 23_25, 24_29">Sort</button>.<span class="cons_Constructor"><span id="MoreChars_12_8" title="a definition with no references">MoreChars</span></span> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-]* [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]

<span class="keyword">context-free syntax</span>
<button class="modal-open" id="Symbol_15_1" title="a definition with multiple references" data-urls="#Symbol line 16_51, 50_44, 50_54, 50_65, 50_82">Symbol</button>.<span class="cons_Constructor"><span id="Sort_15_8" title="a definition with no references">Sort</span></span> = &lt;&lt;<a href="#Sort_10_3" id="Sort_15_17" title="a reference to a single-file definition">Sort</a>&gt;&gt;
<button class="modal-open" id="Symbol_16_1" title="a definition with multiple references" data-urls="#Symbol line 16_51, 50_44, 50_54, 50_65, 50_82">Symbol</button>.<span class="cons_Constructor"><span id="ParameterizedSort_16_8" title="a definition with no references">ParameterizedSort</span></span> = &lt;&lt;<a href="#Sort_10_3" id="Sort_16_30" title="a reference to a single-file definition">Sort</a>&gt; <span class="cons_String">[[</span>&lt;<span class="cons_Unquoted"><span id="parameters_16_39" title="a definition with no references">parameters</span></span>:{<a href="#Symbol_15_1" id="Symbol_16_51" title="a reference to a single-file definition">Symbol</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">]]</span>&gt;
<button class="modal-open" id="SymbolDef_17_1" title="a definition with multiple references" data-urls="#SymbolDef line 18_23, 19_23, 20_23, 50_3, 50_16, 50_30; ../../TemplateLang.sdf3/#SymbolDef line 30_38, 85_33, 90_43, 97_23">SymbolDef</button>.<span class="cons_Constructor"><span id="SortDef_17_11" title="a definition with no references">SortDef</span></span> = &lt;&lt;<a href="#Sort_10_3" id="Sort_17_23" title="a reference to a single-file definition">Sort</a>&gt;&gt; {<span class="keyword">prefer</span>}
<button class="modal-open" id="SymbolDef_18_1" title="a definition with multiple references" data-urls="#SymbolDef line 18_23, 19_23, 20_23, 50_3, 50_16, 50_30; ../../TemplateLang.sdf3/#SymbolDef line 30_38, 85_33, 90_43, 97_23">SymbolDef</button>.<span class="cons_Constructor"><a href="#Cf_50_13" id="Cf_18_11" title="a definition with a single reference">Cf</a></span>      = &lt;&lt;<a href="#SymbolDef_17_1" id="SymbolDef_18_23" title="a reference to a single-file definition">SymbolDef</a>&gt;<span class="cons_String">-CF</span>&gt; {<span class="keyword">prefer</span>}
<button class="modal-open" id="SymbolDef_19_1" title="a definition with multiple references" data-urls="#SymbolDef line 18_23, 19_23, 20_23, 50_3, 50_16, 50_30; ../../TemplateLang.sdf3/#SymbolDef line 30_38, 85_33, 90_43, 97_23">SymbolDef</button>.<span class="cons_Constructor"><a href="#Lex_50_26" id="Lex_19_11" title="a definition with a single reference">Lex</a></span>     = &lt;&lt;<a href="#SymbolDef_17_1" id="SymbolDef_19_23" title="a reference to a single-file definition">SymbolDef</a>&gt;<span class="cons_String">-LEX</span>&gt; {<span class="keyword">prefer</span>}
<button class="modal-open" id="SymbolDef_20_1" title="a definition with multiple references" data-urls="#SymbolDef line 18_23, 19_23, 20_23, 50_3, 50_16, 50_30; ../../TemplateLang.sdf3/#SymbolDef line 30_38, 85_33, 90_43, 97_23">SymbolDef</button>.<span class="cons_Constructor"><a href="#Var_50_40" id="Var_20_11" title="a definition with a single reference">Var</a></span>     = &lt;&lt;<a href="#SymbolDef_17_1" id="SymbolDef_20_23" title="a reference to a single-file definition">SymbolDef</a>&gt;<span class="cons_String">-VAR</span>&gt; {<span class="keyword">prefer</span>}

<a href="#DeclSort_29_10" id="DeclSort_22_1" title="a definition with a single reference">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSort_22_10" title="a definition with no references">DeclSort</span></span>    = &lt;&lt;<a href="#Sort_10_3" id="Sort_22_26" title="a reference to a single-file definition">Sort</a>&gt;&gt;     <span class="layout">// context-free</span>
<a href="#DeclSort_29_10" id="DeclSort_23_1" title="a definition with a single reference">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSortCf_23_10" title="a definition with no references">DeclSortCf</span></span>  = &lt;&lt;<a href="#Sort_10_3" id="Sort_23_26" title="a reference to a single-file definition">Sort</a>&gt;<span class="cons_String">-CF</span>&gt;  <span class="layout">// desugared to DeclSort</span>
<a href="#DeclSort_29_10" id="DeclSort_24_1" title="a definition with a single reference">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSortLex_24_10" title="a definition with no references">DeclSortLex</span></span> = &lt;&lt;<a href="#Sort_10_3" id="Sort_24_26" title="a reference to a single-file definition">Sort</a>&gt;<span class="cons_String">-LEX</span>&gt;
<a href="#DeclSort_29_10" id="DeclSort_25_1" title="a definition with a single reference">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSortVar_25_10" title="a definition with no references">DeclSortVar</span></span> = &lt;&lt;<a href="#Sort_10_3" id="Sort_25_26" title="a reference to a single-file definition">Sort</a>&gt;<span class="cons_String">-VAR</span>&gt;


<span id="Grammar_28_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="Sorts_28_9" title="a definition with no references">Sorts</span></span> = &lt;
  <span class="cons_String">sorts</span> &lt;<a href="#DeclSort_22_1" id="DeclSort_29_10" title="a reference to a single-file definition">DeclSort</a>*&gt;

    &gt;
<span id="Grammar_32_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="LexSorts_32_9" title="a definition with no references">LexSorts</span></span> = /* <span class="keyword">desugared</span> */ &lt;
  <span class="cons_String">lexical</span> <span class="cons_String">sorts</span> &lt;<a href="#Sort_10_3" id="Sort_33_18" title="a reference to a single-file definition">Sort</a>*&gt;

    &gt;
<span id="Grammar_36_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="CfSorts_36_9" title="a definition with no references">CfSorts</span></span> = /* <span class="keyword">desugared</span> */ &lt;
  <span class="cons_String">context-free</span> <span class="cons_String">sorts</span> &lt;<a href="#Sort_10_3" id="Sort_37_23" title="a reference to a single-file definition">Sort</a>*&gt;

    &gt;
<span id="Grammar_40_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="VarSorts_40_9" title="a definition with no references">VarSorts</span></span> = /* <span class="keyword">desugared</span> */ &lt;
  <span class="cons_String">variable</span> <span class="cons_String">sorts</span> &lt;<a href="#Sort_10_3" id="Sort_41_19" title="a reference to a single-file definition">Sort</a>*&gt;

    &gt;

<span class="keyword">lexical restrictions</span>
    <a href="#Sort_10_3" id="Sort_46_5" title="a reference to a single-file definition">Sort</a> -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]

<span class="keyword">context-free priorities</span>

{ <a href="#SymbolDef_17_1" id="SymbolDef_50_3" title="a reference to a single-file definition">SymbolDef</a>.<span class="cons_Constructor"><a href="#Cf_18_11" id="Cf_50_13" title="a reference to a single-file definition">Cf</a></span> <a href="#SymbolDef_17_1" id="SymbolDef_50_16" title="a reference to a single-file definition">SymbolDef</a>.<span class="cons_Constructor"><a href="#Lex_19_11" id="Lex_50_26" title="a reference to a single-file definition">Lex</a></span> <a href="#SymbolDef_17_1" id="SymbolDef_50_30" title="a reference to a single-file definition">SymbolDef</a>.<span class="cons_Constructor"><a href="#Var_20_11" id="Var_50_40" title="a reference to a single-file definition">Var</a></span> <a href="#Symbol_15_1" id="Symbol_50_44" title="a reference to a single-file definition">Symbol</a>.<span class="cons_Constructor"><a href="../../basic/Basic.sdf3/#Cf_48_8" id="Cf_50_51" title="a reference to a single-file definition">Cf</a></span> <a href="#Symbol_15_1" id="Symbol_50_54" title="a reference to a single-file definition">Symbol</a>.<span class="cons_Constructor"><a href="../../basic/Basic.sdf3/#Lex_49_8" id="Lex_50_61" title="a reference to a single-file definition">Lex</a></span> <a href="#Symbol_15_1" id="Symbol_50_65" title="a reference to a single-file definition">Symbol</a>.<span class="cons_Constructor"><a href="../../basic/Basic.sdf3/#Varsym_50_8" id="Varsym_50_72" title="a reference to a single-file definition">Varsym</a></span>} &gt; <a href="#Symbol_15_1" id="Symbol_50_82" title="a reference to a single-file definition">Symbol</a>.<span class="cons_Constructor"><a href="../../regular/Regular.sdf3/#Alt_38_8" id="Alt_50_89" title="a reference to a single-file definition">Alt</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
