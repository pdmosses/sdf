---
title: Regular.sdf3
hide:
  - toc
---

# `Regular.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/regular/Regular.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/regular/Regular.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/regular/Regular.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="regular/Regular_1_8" title="Multi-file references" data-urls="../../sdf2-core/Sdf2-Syntax.sdf3/#regular/Regular_6_9 ../../sorts/Sorts.sdf3/#regular/Regular_6_1">regular/Regular</button>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_0_7" id="kernel/Kernel_3_9" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> <a href="../../constants/IntCon.sdf3/#constants/IntCon_0_7" id="constants/IntCon_3_23" title="Defined at ../../constants/IntCon.sdf3 line 1">constants/IntCon</a> <a href="../../symbols/Symbols.sdf3/#symbols/Symbols_0_7" id="symbols/Symbols_3_40" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a> <a href="../../constants/StrCon.sdf3/#constants/StrCon_0_7" id="constants/StrCon_3_56" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a> <a href="../../labels/Labels.sdf3/#labels/Labels_0_7" id="labels/Labels_3_73" title="Defined at ../../labels/Labels.sdf3 line 1">labels/Labels</a> <a href="../../sorts/Sorts.sdf3/#sorts/Sorts_0_7" id="sorts/Sorts_3_87" title="Defined at ../../sorts/Sorts.sdf3 line 1">sorts/Sorts</a>
 
<span class="keyword">context-free syntax</span> 

<span class="layout">// Symbol.Empty = &lt;()&gt;</span>
<a href="#Symbol_7_26" id="Symbol_8_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a>.<span class="cons_Constructor"><span id="Sequence_8_8" title="Not referenced locally, nor via imports">Sequence</span></span> = &lt;<span class="cons_String">(</span>&lt;<span class="cons_Unquoted"><span id="head_8_22" title="Not referenced locally, nor via imports">head</span></span>:<a href="#Symbol_7_0" id="Symbol_8_27" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt; &lt;<span class="cons_Unquoted"><span id="tail_8_36" title="Not referenced locally, nor via imports">tail</span></span>:<a href="#Symbol_7_0" id="Symbol_8_41" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>+&gt;<span class="cons_String">)</span>&gt;
<span class="layout">// Symbol.Tuple = &lt;\&lt;&lt;head:Symbol&gt; , &lt;rest:Symbol+; separator=","&gt;\&gt;&gt;</span>


<a href="#Symbol_7_26" id="Symbol_12_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a>.<span class="cons_Constructor"><a href="#Opt_42_8" id="Opt_12_8" title="Referenced at line 43">Opt</a></span> = &lt;&lt;<a href="#Symbol_7_0" id="Symbol_12_16" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt;<span class="cons_String">?</span>&gt;
<a href="#Symbol_7_26" id="Symbol_13_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a>.<span class="cons_Constructor"><a href="#Iter_44_8" id="Iter_13_8" title="Referenced at line 45">Iter</a></span> = &lt;&lt;<a href="#Symbol_7_0" id="Symbol_13_17" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt;<span class="cons_String">+</span>&gt;
<a href="#Symbol_7_26" id="Symbol_14_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a>.<span class="cons_Constructor"><a href="#IterStar_43_8" id="IterStar_14_8" title="Referenced at line 44">IterStar</a></span> = &lt;&lt;<a href="#Symbol_7_0" id="Symbol_14_21" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt;<span class="cons_String">*</span>&gt;
<a href="#Symbol_7_26" id="Symbol_15_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a>.<span class="cons_Constructor"><span id="IterSep_15_8" title="Not referenced locally, nor via imports">IterSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#Symbol_7_0" id="Symbol_15_21" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_15_30" title="Not referenced locally, nor via imports">sep</span></span>:<a href="#Separator_24_0" id="Separator_15_34" title="Defined at line 25">Separator</a>&gt;<span class="cons_String">}+</span>&gt;
<a href="#Symbol_7_26" id="Symbol_16_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a>.<span class="cons_Constructor"><span id="IterStarSep_16_8" title="Not referenced locally, nor via imports">IterStarSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#Symbol_7_0" id="Symbol_16_25" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_16_34" title="Not referenced locally, nor via imports">sep</span></span>:<a href="#Separator_24_0" id="Separator_16_38" title="Defined at line 25">Separator</a>&gt;<span class="cons_String">}*</span>&gt;



<a href="#SortSymbol_27_11" id="SortSymbol_20_1" title="Referenced at line 28, 29, 30, 31, 32">SortSymbol</a>.<span class="cons_Constructor"><span id="Opt_20_12" title="Not referenced locally, nor via imports">Opt</span></span> = &lt;&lt;<a href="../../sorts/Sorts.sdf3/#Sort_9_2" id="Sort_20_20" title="Defined at ../../sorts/Sorts.sdf3 line 10, 12">Sort</a>&gt;<span class="cons_String">?</span>&gt;
<a href="#SortSymbol_27_11" id="SortSymbol_21_1" title="Referenced at line 28, 29, 30, 31, 32">SortSymbol</a>.<span class="cons_Constructor"><span id="Iter_21_12" title="Not referenced locally, nor via imports">Iter</span></span> = &lt;&lt;<a href="../../sorts/Sorts.sdf3/#Sort_9_2" id="Sort_21_21" title="Defined at ../../sorts/Sorts.sdf3 line 10, 12">Sort</a>&gt;<span class="cons_String">+</span>&gt;
<a href="#SortSymbol_27_11" id="SortSymbol_22_1" title="Referenced at line 28, 29, 30, 31, 32">SortSymbol</a>.<span class="cons_Constructor"><span id="IterStar_22_12" title="Not referenced locally, nor via imports">IterStar</span></span> = &lt;&lt;<a href="../../sorts/Sorts.sdf3/#Sort_9_2" id="Sort_22_25" title="Defined at ../../sorts/Sorts.sdf3 line 10, 12">Sort</a>&gt;<span class="cons_String">*</span>&gt;
<a href="#SortSymbol_27_11" id="SortSymbol_23_1" title="Referenced at line 28, 29, 30, 31, 32">SortSymbol</a>.<span class="cons_Constructor"><span id="IterSep_23_12" title="Not referenced locally, nor via imports">IterSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="../../sorts/Sorts.sdf3/#Sort_9_2" id="Sort_23_25" title="Defined at ../../sorts/Sorts.sdf3 line 10, 12">Sort</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_23_32" title="Not referenced locally, nor via imports">sep</span></span>:<a href="#Separator_24_0" id="Separator_23_36" title="Defined at line 25">Separator</a>&gt;<span class="cons_String">}+</span>&gt;
<a href="#SortSymbol_27_11" id="SortSymbol_24_1" title="Referenced at line 28, 29, 30, 31, 32">SortSymbol</a>.<span class="cons_Constructor"><span id="IterStarSep_24_12" title="Not referenced locally, nor via imports">IterStarSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="../../sorts/Sorts.sdf3/#Sort_9_2" id="Sort_24_29" title="Defined at ../../sorts/Sorts.sdf3 line 10, 12">Sort</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_24_36" title="Not referenced locally, nor via imports">sep</span></span>:<a href="#Separator_24_0" id="Separator_24_40" title="Defined at line 25">Separator</a>&gt;<span class="cons_String">}*</span>&gt;
<a href="#Separator_14_33" id="Separator_25_1" title="Referenced at line 15, 16, 23, 24, 31, 32">Separator</a>.<span class="cons_Constructor"><span id="Lit_25_11" title="Not referenced locally, nor via imports">Lit</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3/#StrCon_11_4" id="StrCon_25_19" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;


<a href="#Symbol_7_26" id="Symbol_28_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a> = &lt;&lt;<a href="#SortSymbol_19_0" id="SortSymbol_28_12" title="Defined at line 20, 21, 22, 23, 24">SortSymbol</a>&gt;<span class="cons_String">?</span>&gt; {<span class="keyword">reject</span>}
<a href="#Symbol_7_26" id="Symbol_29_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a> = &lt;&lt;<a href="#SortSymbol_19_0" id="SortSymbol_29_12" title="Defined at line 20, 21, 22, 23, 24">SortSymbol</a>&gt;<span class="cons_String">+</span>&gt; {<span class="keyword">reject</span>}
<a href="#Symbol_7_26" id="Symbol_30_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a> = &lt;&lt;<a href="#SortSymbol_19_0" id="SortSymbol_30_12" title="Defined at line 20, 21, 22, 23, 24">SortSymbol</a>&gt;<span class="cons_String">*</span>&gt; {<span class="keyword">reject</span>}
<a href="#Symbol_7_26" id="Symbol_31_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a> = &lt;<span class="cons_String">{</span>&lt;<a href="#SortSymbol_19_0" id="SortSymbol_31_13" title="Defined at line 20, 21, 22, 23, 24">SortSymbol</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_31_26" title="Not referenced locally, nor via imports">sep</span></span>:<a href="#Separator_24_0" id="Separator_31_30" title="Defined at line 25">Separator</a>&gt;<span class="cons_String">}+</span>&gt; {<span class="keyword">reject</span>}
<a href="#Symbol_7_26" id="Symbol_32_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a> = &lt;<span class="cons_String">{</span>&lt;<a href="#SortSymbol_19_0" id="SortSymbol_32_13" title="Defined at line 20, 21, 22, 23, 24">SortSymbol</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_32_26" title="Not referenced locally, nor via imports">sep</span></span>:<a href="#Separator_24_0" id="Separator_32_30" title="Defined at line 25">Separator</a>&gt;<span class="cons_String">}*</span>&gt; {<span class="keyword">reject</span>}



<span class="layout">//Symbol.Func = &lt;(&lt;arguments:Symbols&gt; =\&gt; &lt;results:Symbol&gt;)&gt;</span>
<span class="layout">//"left":Symbol "|" "right":Symbol              - &gt; Symbol {right,cons("alt")}</span>
<a href="#Symbol_7_26" id="Symbol_38_1" title="Referenced at line 8, 12, 13, 14, 15, 16, 38, 43, 44, 45, 46, 47">Symbol</a>.<span class="cons_Constructor"><button class="modal-open" id="Alt_38_8" title="Multi-file references" data-urls="#Alt_46_9 ../../sorts/Sorts.sdf3/#Alt_50_89">Alt</button></span> = &lt;&lt;<a href="#Symbol_7_0" id="Symbol_38_16" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt; <span class="cons_String">|</span> &lt;<a href="#Symbol_7_0" id="Symbol_38_27" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt;&gt; {<span class="keyword">right</span>}
<span class="layout">// "(" "left":Symbol "-&gt;" "right":Symbol ")"     -&gt; Symbol {cons("strategy")}</span>
<span class="layout">//Symbol.Strategy = &lt;(&lt;Symbol&gt; -\&gt; &lt;Symbol&gt; )&gt;</span>
 
<span class="keyword">context-free priorities</span> 
{<a href="#Symbol_7_0" id="Symbol_43_2" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>.<span class="cons_Constructor"><a href="#Opt_11_7" id="Opt_43_9" title="Defined at line 12">Opt</a></span>
 <a href="#Symbol_7_0" id="Symbol_44_2" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>.<span class="cons_Constructor"><a href="#IterStar_13_7" id="IterStar_44_9" title="Defined at line 14">IterStar</a></span>
 <a href="#Symbol_7_0" id="Symbol_45_2" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>.<span class="cons_Constructor"><a href="#Iter_12_7" id="Iter_45_9" title="Defined at line 13">Iter</a></span>} &gt;
 <a href="#Symbol_7_0" id="Symbol_46_2" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>.<span class="cons_Constructor"><a href="#Alt_37_7" id="Alt_46_9" title="Defined at line 38">Alt</a></span> &gt;
 <a href="#Symbol_7_0" id="Symbol_47_2" title="Defined at line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>.<span class="cons_Constructor"><a href="../../labels/Labels.sdf3/#Label_10_7" id="Label_47_9" title="Defined at ../../labels/Labels.sdf3 line 11">Label</a></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
