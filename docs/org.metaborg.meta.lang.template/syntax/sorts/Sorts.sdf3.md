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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="sorts/Sorts_1_8" title="Multi-file references" data-urls="../../TemplateLang.sdf3/#sorts/Sorts_5_3 ../../basic/Basic.sdf3/#sorts/Sorts_4_3 ../../regular/Regular.sdf3/#sorts/Sorts_3_87 ../../sdf2-core/Sdf2-Syntax.sdf3/#sorts/Sorts_10_9">sorts/Sorts</button>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_0_7" id="kernel/Kernel_3_9" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a>
<a href="../../symbols/Symbols.sdf3/#symbols/Symbols_0_7" id="symbols/Symbols_4_1" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a>
<a href="../../basic/Basic.sdf3/#basic/Basic_0_7" id="basic/Basic_5_1" title="Defined at ../../basic/Basic.sdf3 line 1">basic/Basic</a>
<a href="../../regular/Regular.sdf3/#regular/Regular_0_7" id="regular/Regular_6_1" title="Defined at ../../regular/Regular.sdf3 line 1">regular/Regular</a>

<span class="keyword">lexical syntax</span>
  <span class="layout">//head:[A-Z] -&gt; Sort {cons("one-char")}</span>
  <button class="modal-open" id="Sort_10_3" title="Multi-file references" data-urls="#Sort_15_17 ../../regular/Regular.sdf3/#Sort_20_20">Sort</button>.<span class="cons_Constructor"><span id="OneChar_10_8" title="Not referenced locally, nor via imports">OneChar</span></span> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>]
  <span class="layout">//head:[A-Z] middle:[A-Za-z0-9\_\-]* last:[A-Za-z0-9] -&gt; Sort {cons("more-chars")}</span>
  <button class="modal-open" id="Sort_12_3" title="Multi-file references" data-urls="#Sort_15_17 ../../regular/Regular.sdf3/#Sort_20_20">Sort</button>.<span class="cons_Constructor"><span id="MoreChars_12_8" title="Not referenced locally, nor via imports">MoreChars</span></span> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-]* [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]

<span class="keyword">context-free syntax</span>
<a href="#Symbol_15_50" id="Symbol_15_1" title="Referenced at line 16, 50">Symbol</a>.<span class="cons_Constructor"><span id="Sort_15_8" title="Not referenced locally, nor via imports">Sort</span></span> = &lt;&lt;<a href="#Sort_9_2" id="Sort_15_17" title="Defined at line 10, 12">Sort</a>&gt;&gt;
<a href="#Symbol_15_50" id="Symbol_16_1" title="Referenced at line 16, 50">Symbol</a>.<span class="cons_Constructor"><span id="ParameterizedSort_16_8" title="Not referenced locally, nor via imports">ParameterizedSort</span></span> = &lt;&lt;<a href="#Sort_9_2" id="Sort_16_30" title="Defined at line 10, 12">Sort</a>&gt; <span class="cons_String">[[</span>&lt;<span class="cons_Unquoted"><span id="parameters_16_39" title="Not referenced locally, nor via imports">parameters</span></span>:{<a href="#Symbol_14_0" id="Symbol_16_51" title="Defined at line 15, 16">Symbol</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">]]</span>&gt;
<button class="modal-open" id="SymbolDef_17_1" title="Multi-file references" data-urls="#SymbolDef_18_23 ../../TemplateLang.sdf3/#SymbolDef_30_38">SymbolDef</button>.<span class="cons_Constructor"><span id="SortDef_17_11" title="Not referenced locally, nor via imports">SortDef</span></span> = &lt;&lt;<a href="#Sort_9_2" id="Sort_17_23" title="Defined at line 10, 12">Sort</a>&gt;&gt; {<span class="keyword">prefer</span>}
<button class="modal-open" id="SymbolDef_18_1" title="Multi-file references" data-urls="#SymbolDef_18_23 ../../TemplateLang.sdf3/#SymbolDef_30_38">SymbolDef</button>.<span class="cons_Constructor"><a href="#Cf_49_12" id="Cf_18_11" title="Referenced at line 50">Cf</a></span>      = &lt;&lt;<a href="#SymbolDef_16_0" id="SymbolDef_18_23" title="Defined at line 17, 18, 19, 20">SymbolDef</a>&gt;<span class="cons_String">-CF</span>&gt; {<span class="keyword">prefer</span>}
<button class="modal-open" id="SymbolDef_19_1" title="Multi-file references" data-urls="#SymbolDef_18_23 ../../TemplateLang.sdf3/#SymbolDef_30_38">SymbolDef</button>.<span class="cons_Constructor"><a href="#Lex_49_25" id="Lex_19_11" title="Referenced at line 50">Lex</a></span>     = &lt;&lt;<a href="#SymbolDef_16_0" id="SymbolDef_19_23" title="Defined at line 17, 18, 19, 20">SymbolDef</a>&gt;<span class="cons_String">-LEX</span>&gt; {<span class="keyword">prefer</span>}
<button class="modal-open" id="SymbolDef_20_1" title="Multi-file references" data-urls="#SymbolDef_18_23 ../../TemplateLang.sdf3/#SymbolDef_30_38">SymbolDef</button>.<span class="cons_Constructor"><a href="#Var_49_39" id="Var_20_11" title="Referenced at line 50">Var</a></span>     = &lt;&lt;<a href="#SymbolDef_16_0" id="SymbolDef_20_23" title="Defined at line 17, 18, 19, 20">SymbolDef</a>&gt;<span class="cons_String">-VAR</span>&gt; {<span class="keyword">prefer</span>}

<a href="#DeclSort_28_9" id="DeclSort_22_1" title="Referenced at line 29">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSort_22_10" title="Not referenced locally, nor via imports">DeclSort</span></span>    = &lt;&lt;<a href="#Sort_9_2" id="Sort_22_26" title="Defined at line 10, 12">Sort</a>&gt;&gt;     <span class="layout">// context-free</span>
<a href="#DeclSort_28_9" id="DeclSort_23_1" title="Referenced at line 29">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSortCf_23_10" title="Not referenced locally, nor via imports">DeclSortCf</span></span>  = &lt;&lt;<a href="#Sort_9_2" id="Sort_23_26" title="Defined at line 10, 12">Sort</a>&gt;<span class="cons_String">-CF</span>&gt;  <span class="layout">// desugared to DeclSort</span>
<a href="#DeclSort_28_9" id="DeclSort_24_1" title="Referenced at line 29">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSortLex_24_10" title="Not referenced locally, nor via imports">DeclSortLex</span></span> = &lt;&lt;<a href="#Sort_9_2" id="Sort_24_26" title="Defined at line 10, 12">Sort</a>&gt;<span class="cons_String">-LEX</span>&gt;
<a href="#DeclSort_28_9" id="DeclSort_25_1" title="Referenced at line 29">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSortVar_25_10" title="Not referenced locally, nor via imports">DeclSortVar</span></span> = &lt;&lt;<a href="#Sort_9_2" id="Sort_25_26" title="Defined at line 10, 12">Sort</a>&gt;<span class="cons_String">-VAR</span>&gt;


<span id="Grammar_28_1" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="Sorts_28_9" title="Not referenced locally, nor via imports">Sorts</span></span> = &lt;
  <span class="cons_String">sorts</span> &lt;<a href="#DeclSort_21_0" id="DeclSort_29_10" title="Defined at line 22, 23, 24, 25">DeclSort</a>*&gt;

    &gt;
<span id="Grammar_32_1" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="LexSorts_32_9" title="Not referenced locally, nor via imports">LexSorts</span></span> = /* <span class="keyword">desugared</span> */ &lt;
  <span class="cons_String">lexical</span> <span class="cons_String">sorts</span> &lt;<a href="#Sort_9_2" id="Sort_33_18" title="Defined at line 10, 12">Sort</a>*&gt;

    &gt;
<span id="Grammar_36_1" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="CfSorts_36_9" title="Not referenced locally, nor via imports">CfSorts</span></span> = /* <span class="keyword">desugared</span> */ &lt;
  <span class="cons_String">context-free</span> <span class="cons_String">sorts</span> &lt;<a href="#Sort_9_2" id="Sort_37_23" title="Defined at line 10, 12">Sort</a>*&gt;

    &gt;
<span id="Grammar_40_1" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="VarSorts_40_9" title="Not referenced locally, nor via imports">VarSorts</span></span> = /* <span class="keyword">desugared</span> */ &lt;
  <span class="cons_String">variable</span> <span class="cons_String">sorts</span> &lt;<a href="#Sort_9_2" id="Sort_41_19" title="Defined at line 10, 12">Sort</a>*&gt;

    &gt;

<span class="keyword">lexical restrictions</span>
    <a href="#Sort_9_2" id="Sort_46_5" title="Defined at line 10, 12">Sort</a> -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]

<span class="keyword">context-free priorities</span>

{ <a href="#SymbolDef_16_0" id="SymbolDef_50_3" title="Defined at line 17, 18, 19, 20">SymbolDef</a>.<span class="cons_Constructor"><a href="#Cf_17_10" id="Cf_50_13" title="Defined at line 18">Cf</a></span> <a href="#SymbolDef_16_0" id="SymbolDef_50_16" title="Defined at line 17, 18, 19, 20">SymbolDef</a>.<span class="cons_Constructor"><a href="#Lex_18_10" id="Lex_50_26" title="Defined at line 19">Lex</a></span> <a href="#SymbolDef_16_0" id="SymbolDef_50_30" title="Defined at line 17, 18, 19, 20">SymbolDef</a>.<span class="cons_Constructor"><a href="#Var_19_10" id="Var_50_40" title="Defined at line 20">Var</a></span> <a href="#Symbol_14_0" id="Symbol_50_44" title="Defined at line 15, 16">Symbol</a>.<span class="cons_Constructor"><a href="../../basic/Basic.sdf3/#Cf_47_7" id="Cf_50_51" title="Defined at ../../basic/Basic.sdf3 line 48">Cf</a></span> <a href="#Symbol_14_0" id="Symbol_50_54" title="Defined at line 15, 16">Symbol</a>.<span class="cons_Constructor"><a href="../../basic/Basic.sdf3/#Lex_48_7" id="Lex_50_61" title="Defined at ../../basic/Basic.sdf3 line 49">Lex</a></span> <a href="#Symbol_14_0" id="Symbol_50_65" title="Defined at line 15, 16">Symbol</a>.<span class="cons_Constructor"><a href="../../basic/Basic.sdf3/#Varsym_49_7" id="Varsym_50_72" title="Defined at ../../basic/Basic.sdf3 line 50">Varsym</a></span>} &gt; <a href="#Symbol_14_0" id="Symbol_50_82" title="Defined at line 15, 16">Symbol</a>.<span class="cons_Constructor"><a href="../../regular/Regular.sdf3/#Alt_37_7" id="Alt_50_89" title="Defined at ../../regular/Regular.sdf3 line 38">Alt</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
