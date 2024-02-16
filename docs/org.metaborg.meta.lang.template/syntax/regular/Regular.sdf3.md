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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="regular/Regular_1_8" title="a definition with multiple references" data-urls="../../sdf2-core/Sdf2-Syntax.sdf3/#regular/Regular line 6_9; ../../sorts/Sorts.sdf3/#regular/Regular line 6_1">regular/Regular</button>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_1_8" id="kernel/Kernel_3_9" title="a reference to a single-file definition">kernel/Kernel</a> <a href="../../constants/IntCon.sdf3/#constants/IntCon_1_8" id="constants/IntCon_3_23" title="a reference to a single-file definition">constants/IntCon</a> <a href="../../symbols/Symbols.sdf3/#symbols/Symbols_1_8" id="symbols/Symbols_3_40" title="a reference to a single-file definition">symbols/Symbols</a> <a href="../../constants/StrCon.sdf3/#constants/StrCon_1_8" id="constants/StrCon_3_56" title="a reference to a single-file definition">constants/StrCon</a> <a href="../../labels/Labels.sdf3/#labels/Labels_1_8" id="labels/Labels_3_73" title="a reference to a single-file definition">labels/Labels</a> <a href="../../sorts/Sorts.sdf3/#sorts/Sorts_1_8" id="sorts/Sorts_3_87" title="a reference to a single-file definition">sorts/Sorts</a>
 
<span class="keyword">context-free syntax</span> 

<span class="layout">// Symbol.Empty = &lt;()&gt;</span>
<button class="modal-open" id="Symbol_8_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button>.<span class="cons_Constructor"><span id="Sequence_8_8" title="a definition with no references">Sequence</span></span> = &lt;<span class="cons_String">(</span>&lt;<span class="cons_Unquoted"><span id="head_8_22" title="a definition with no references">head</span></span>:<a href="#Symbol_8_1" id="Symbol_8_27" title="a reference to a single-file definition">Symbol</a>&gt; &lt;<span class="cons_Unquoted"><span id="tail_8_36" title="a definition with no references">tail</span></span>:<a href="#Symbol_8_1" id="Symbol_8_41" title="a reference to a single-file definition">Symbol</a>+&gt;<span class="cons_String">)</span>&gt;
<span class="layout">// Symbol.Tuple = &lt;\&lt;&lt;head:Symbol&gt; , &lt;rest:Symbol+; separator=","&gt;\&gt;&gt;</span>


<button class="modal-open" id="Symbol_12_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button>.<span class="cons_Constructor"><a href="#Opt_43_9" id="Opt_12_8" title="a definition with a single reference">Opt</a></span> = &lt;&lt;<a href="#Symbol_8_1" id="Symbol_12_16" title="a reference to a single-file definition">Symbol</a>&gt;<span class="cons_String">?</span>&gt;
<button class="modal-open" id="Symbol_13_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button>.<span class="cons_Constructor"><a href="#Iter_45_9" id="Iter_13_8" title="a definition with a single reference">Iter</a></span> = &lt;&lt;<a href="#Symbol_8_1" id="Symbol_13_17" title="a reference to a single-file definition">Symbol</a>&gt;<span class="cons_String">+</span>&gt;
<button class="modal-open" id="Symbol_14_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button>.<span class="cons_Constructor"><a href="#IterStar_44_9" id="IterStar_14_8" title="a definition with a single reference">IterStar</a></span> = &lt;&lt;<a href="#Symbol_8_1" id="Symbol_14_21" title="a reference to a single-file definition">Symbol</a>&gt;<span class="cons_String">*</span>&gt;
<button class="modal-open" id="Symbol_15_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button>.<span class="cons_Constructor"><span id="IterSep_15_8" title="a definition with no references">IterSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#Symbol_8_1" id="Symbol_15_21" title="a reference to a single-file definition">Symbol</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_15_30" title="a definition with no references">sep</span></span>:<a href="#Separator_25_1" id="Separator_15_34" title="a reference to a single-file definition">Separator</a>&gt;<span class="cons_String">}+</span>&gt;
<button class="modal-open" id="Symbol_16_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button>.<span class="cons_Constructor"><span id="IterStarSep_16_8" title="a definition with no references">IterStarSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#Symbol_8_1" id="Symbol_16_25" title="a reference to a single-file definition">Symbol</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_16_34" title="a definition with no references">sep</span></span>:<a href="#Separator_25_1" id="Separator_16_38" title="a reference to a single-file definition">Separator</a>&gt;<span class="cons_String">}*</span>&gt;



<button class="modal-open" id="SortSymbol_20_1" title="a definition with multiple references" data-urls="#SortSymbol line 28_12, 29_12, 30_12, 31_13, 32_13">SortSymbol</button>.<span class="cons_Constructor"><span id="Opt_20_12" title="a definition with no references">Opt</span></span> = &lt;&lt;<a href="../../sorts/Sorts.sdf3/#Sort_10_3" id="Sort_20_20" title="a reference to a single-file definition">Sort</a>&gt;<span class="cons_String">?</span>&gt;
<button class="modal-open" id="SortSymbol_21_1" title="a definition with multiple references" data-urls="#SortSymbol line 28_12, 29_12, 30_12, 31_13, 32_13">SortSymbol</button>.<span class="cons_Constructor"><span id="Iter_21_12" title="a definition with no references">Iter</span></span> = &lt;&lt;<a href="../../sorts/Sorts.sdf3/#Sort_10_3" id="Sort_21_21" title="a reference to a single-file definition">Sort</a>&gt;<span class="cons_String">+</span>&gt;
<button class="modal-open" id="SortSymbol_22_1" title="a definition with multiple references" data-urls="#SortSymbol line 28_12, 29_12, 30_12, 31_13, 32_13">SortSymbol</button>.<span class="cons_Constructor"><span id="IterStar_22_12" title="a definition with no references">IterStar</span></span> = &lt;&lt;<a href="../../sorts/Sorts.sdf3/#Sort_10_3" id="Sort_22_25" title="a reference to a single-file definition">Sort</a>&gt;<span class="cons_String">*</span>&gt;
<button class="modal-open" id="SortSymbol_23_1" title="a definition with multiple references" data-urls="#SortSymbol line 28_12, 29_12, 30_12, 31_13, 32_13">SortSymbol</button>.<span class="cons_Constructor"><span id="IterSep_23_12" title="a definition with no references">IterSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="../../sorts/Sorts.sdf3/#Sort_10_3" id="Sort_23_25" title="a reference to a single-file definition">Sort</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_23_32" title="a definition with no references">sep</span></span>:<a href="#Separator_25_1" id="Separator_23_36" title="a reference to a single-file definition">Separator</a>&gt;<span class="cons_String">}+</span>&gt;
<button class="modal-open" id="SortSymbol_24_1" title="a definition with multiple references" data-urls="#SortSymbol line 28_12, 29_12, 30_12, 31_13, 32_13">SortSymbol</button>.<span class="cons_Constructor"><span id="IterStarSep_24_12" title="a definition with no references">IterStarSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="../../sorts/Sorts.sdf3/#Sort_10_3" id="Sort_24_29" title="a reference to a single-file definition">Sort</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_24_36" title="a definition with no references">sep</span></span>:<a href="#Separator_25_1" id="Separator_24_40" title="a reference to a single-file definition">Separator</a>&gt;<span class="cons_String">}*</span>&gt;
<button class="modal-open" id="Separator_25_1" title="a definition with multiple references" data-urls="#Separator line 15_34, 16_38, 23_36, 24_40, 31_30, 32_30">Separator</button>.<span class="cons_Constructor"><span id="Lit_25_11" title="a definition with no references">Lit</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3/#StrCon_12_5" id="StrCon_25_19" title="a reference to a single-file definition">StrCon</a>&gt;&gt;


<button class="modal-open" id="Symbol_28_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button> = &lt;&lt;<a href="#SortSymbol_20_1" id="SortSymbol_28_12" title="a reference to a single-file definition">SortSymbol</a>&gt;<span class="cons_String">?</span>&gt; {<span class="keyword">reject</span>}
<button class="modal-open" id="Symbol_29_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button> = &lt;&lt;<a href="#SortSymbol_20_1" id="SortSymbol_29_12" title="a reference to a single-file definition">SortSymbol</a>&gt;<span class="cons_String">+</span>&gt; {<span class="keyword">reject</span>}
<button class="modal-open" id="Symbol_30_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button> = &lt;&lt;<a href="#SortSymbol_20_1" id="SortSymbol_30_12" title="a reference to a single-file definition">SortSymbol</a>&gt;<span class="cons_String">*</span>&gt; {<span class="keyword">reject</span>}
<button class="modal-open" id="Symbol_31_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button> = &lt;<span class="cons_String">{</span>&lt;<a href="#SortSymbol_20_1" id="SortSymbol_31_13" title="a reference to a single-file definition">SortSymbol</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_31_26" title="a definition with no references">sep</span></span>:<a href="#Separator_25_1" id="Separator_31_30" title="a reference to a single-file definition">Separator</a>&gt;<span class="cons_String">}+</span>&gt; {<span class="keyword">reject</span>}
<button class="modal-open" id="Symbol_32_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button> = &lt;<span class="cons_String">{</span>&lt;<a href="#SortSymbol_20_1" id="SortSymbol_32_13" title="a reference to a single-file definition">SortSymbol</a>&gt; &lt;<span class="cons_Unquoted"><span id="sep_32_26" title="a definition with no references">sep</span></span>:<a href="#Separator_25_1" id="Separator_32_30" title="a reference to a single-file definition">Separator</a>&gt;<span class="cons_String">}*</span>&gt; {<span class="keyword">reject</span>}



<span class="layout">//Symbol.Func = &lt;(&lt;arguments:Symbols&gt; =\&gt; &lt;results:Symbol&gt;)&gt;</span>
<span class="layout">//"left":Symbol "|" "right":Symbol              - &gt; Symbol {right,cons("alt")}</span>
<button class="modal-open" id="Symbol_38_1" title="a definition with multiple references" data-urls="#Symbol line 8_27, 8_41, 12_16, 13_17, 14_21, 15_21, 16_25, 38_16, 38_27, 43_2, 44_2, 45_2, 46_2, 47_2">Symbol</button>.<span class="cons_Constructor"><button class="modal-open" id="Alt_38_8" title="a definition with multiple references" data-urls="#Alt line 46_9; ../../sorts/Sorts.sdf3/#Alt line 50_89">Alt</button></span> = &lt;&lt;<a href="#Symbol_8_1" id="Symbol_38_16" title="a reference to a single-file definition">Symbol</a>&gt; <span class="cons_String">|</span> &lt;<a href="#Symbol_8_1" id="Symbol_38_27" title="a reference to a single-file definition">Symbol</a>&gt;&gt; {<span class="keyword">right</span>}
<span class="layout">// "(" "left":Symbol "-&gt;" "right":Symbol ")"     -&gt; Symbol {cons("strategy")}</span>
<span class="layout">//Symbol.Strategy = &lt;(&lt;Symbol&gt; -\&gt; &lt;Symbol&gt; )&gt;</span>
 
<span class="keyword">context-free priorities</span> 
{<a href="#Symbol_8_1" id="Symbol_43_2" title="a reference to a single-file definition">Symbol</a>.<span class="cons_Constructor"><a href="#Opt_12_8" id="Opt_43_9" title="a reference to a single-file definition">Opt</a></span>
 <a href="#Symbol_8_1" id="Symbol_44_2" title="a reference to a single-file definition">Symbol</a>.<span class="cons_Constructor"><a href="#IterStar_14_8" id="IterStar_44_9" title="a reference to a single-file definition">IterStar</a></span>
 <a href="#Symbol_8_1" id="Symbol_45_2" title="a reference to a single-file definition">Symbol</a>.<span class="cons_Constructor"><a href="#Iter_13_8" id="Iter_45_9" title="a reference to a single-file definition">Iter</a></span>} &gt;
 <a href="#Symbol_8_1" id="Symbol_46_2" title="a reference to a single-file definition">Symbol</a>.<span class="cons_Constructor"><a href="#Alt_38_8" id="Alt_46_9" title="a reference to a single-file definition">Alt</a></span> &gt;
 <a href="#Symbol_8_1" id="Symbol_47_2" title="a reference to a single-file definition">Symbol</a>.<span class="cons_Constructor"><a href="../../labels/Labels.sdf3/#Label_11_8" id="Label_47_9" title="a reference to a single-file definition">Label</a></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
