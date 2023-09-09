---
title: Regular.sdf3
---

# `Regular.sdf3`

:simple-github: [metaborg/sdf/org.metaborg.meta.lang.template/syntax/regular/Regular.sdf3]

[metaborg/sdf/org.metaborg.meta.lang.template/syntax/regular/Regular.sdf3]: https://github.com/metaborg/sdf/blob/master/org.metaborg.meta.lang.template/syntax/regular/Regular.sdf3 "The source file on GitHub"

<div class="TemplateLang"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sorts/Sorts.sdf3#regular/Regular_70_85" id="regular/Regular_7_22" title="Referenced at ../../sorts/Sorts.sdf3 line 6">regular/Regular</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_32_45" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> <a href="../../constants/IntCon.sdf3#constants/IntCon_7_23" id="constants/IntCon_46_62" title="Defined at ../../constants/IntCon.sdf3 line 1">constants/IntCon</a> <a href="../../symbols/Symbols.sdf3#symbols/Symbols_7_22" id="symbols/Symbols_63_78" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a> <a href="../../constants/StrCon.sdf3#constants/StrCon_7_23" id="constants/StrCon_79_95" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a> <a href="../../labels/Labels.sdf3#labels/Labels_7_20" id="labels/Labels_96_109" title="Defined at ../../labels/Labels.sdf3 line 1">labels/Labels</a> <a href="../../sorts/Sorts.sdf3#sorts/Sorts_7_18" id="sorts/Sorts_110_121" title="Defined at ../../sorts/Sorts.sdf3 line 1">sorts/Sorts</a>
 
<span class="keyword">context-free syntax</span> 

<span class="layout">// Symbol.Empty = &lt;()&gt;</span>
<a href="#Symbol_1296_1302" id="Symbol_169_175" title="Referenced at  line 47">Symbol</a>.<span class="cons_Constructor"><span id="Sequence_176_184" title="Not referenced locally or via imports">Sequence</span></span> = &lt;<span class="cons_String">(</span>&lt;<span id="head_190_194" title="Not referenced locally or via imports">head</span>:<a href="#Symbol_169_175" id="Symbol_195_201" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt; &lt;<span id="tail_204_208" title="Not referenced locally or via imports">tail</span>:<a href="#Symbol_169_175" id="Symbol_209_215" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>+&gt;<span class="cons_String">)</span>&gt;
<span class="layout">// Symbol.Tuple = &lt;\&lt;&lt;head:Symbol&gt; , &lt;rest:Symbol+; separator=","&gt;\&gt;&gt;</span>


<a href="#Symbol_1296_1302" id="Symbol_292_298" title="Referenced at  line 47">Symbol</a>.<span class="cons_Constructor"><a href="#Opt_1244_1247" id="Opt_299_302" title="Referenced at  line 43">Opt</a></span> = &lt;&lt;<a href="#Symbol_169_175" id="Symbol_307_313" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt;<span class="cons_String">?</span>&gt;
<a href="#Symbol_1296_1302" id="Symbol_317_323" title="Referenced at  line 47">Symbol</a>.<span class="cons_Constructor"><a href="#Iter_1273_1277" id="Iter_324_328" title="Referenced at  line 45">Iter</a></span> = &lt;&lt;<a href="#Symbol_169_175" id="Symbol_333_339" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt;<span class="cons_String">+</span>&gt;
<a href="#Symbol_1296_1302" id="Symbol_343_349" title="Referenced at  line 47">Symbol</a>.<span class="cons_Constructor"><a href="#IterStar_1256_1264" id="IterStar_350_358" title="Referenced at  line 44">IterStar</a></span> = &lt;&lt;<a href="#Symbol_169_175" id="Symbol_363_369" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt;<span class="cons_String">*</span>&gt;
<a href="#Symbol_1296_1302" id="Symbol_373_379" title="Referenced at  line 47">Symbol</a>.<span class="cons_Constructor"><span id="IterSep_380_387" title="Not referenced locally or via imports">IterSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#Symbol_169_175" id="Symbol_393_399" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt; &lt;<span id="sep_402_405" title="Not referenced locally or via imports">sep</span>:<a href="#Separator_663_672" id="Separator_406_415" title="Defined at  line 25">Separator</a>&gt;<span class="cons_String">}+</span>&gt;
<a href="#Symbol_1296_1302" id="Symbol_420_426" title="Referenced at  line 47">Symbol</a>.<span class="cons_Constructor"><span id="IterStarSep_427_438" title="Not referenced locally or via imports">IterStarSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#Symbol_169_175" id="Symbol_444_450" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt; &lt;<span id="sep_453_456" title="Not referenced locally or via imports">sep</span>:<a href="#Separator_663_672" id="Separator_457_466" title="Defined at  line 25">Separator</a>&gt;<span class="cons_String">}*</span>&gt;



<a href="#SortSymbol_858_868" id="SortSymbol_474_484" title="Referenced at  line 32">SortSymbol</a>.<span class="cons_Constructor"><span id="Opt_485_488" title="Not referenced locally or via imports">Opt</span></span> = &lt;&lt;<a href="../../sorts/Sorts.sdf3#Sort_146_150" id="Sort_493_497" title="Defined at ../../sorts/Sorts.sdf3 line 10, 12">Sort</a>&gt;<span class="cons_String">?</span>&gt;
<a href="#SortSymbol_858_868" id="SortSymbol_501_511" title="Referenced at  line 32">SortSymbol</a>.<span class="cons_Constructor"><span id="Iter_512_516" title="Not referenced locally or via imports">Iter</span></span> = &lt;&lt;<a href="../../sorts/Sorts.sdf3#Sort_146_150" id="Sort_521_525" title="Defined at ../../sorts/Sorts.sdf3 line 10, 12">Sort</a>&gt;<span class="cons_String">+</span>&gt;
<a href="#SortSymbol_858_868" id="SortSymbol_529_539" title="Referenced at  line 32">SortSymbol</a>.<span class="cons_Constructor"><span id="IterStar_540_548" title="Not referenced locally or via imports">IterStar</span></span> = &lt;&lt;<a href="../../sorts/Sorts.sdf3#Sort_146_150" id="Sort_553_557" title="Defined at ../../sorts/Sorts.sdf3 line 10, 12">Sort</a>&gt;<span class="cons_String">*</span>&gt;
<a href="#SortSymbol_858_868" id="SortSymbol_561_571" title="Referenced at  line 32">SortSymbol</a>.<span class="cons_Constructor"><span id="IterSep_572_579" title="Not referenced locally or via imports">IterSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="../../sorts/Sorts.sdf3#Sort_146_150" id="Sort_585_589" title="Defined at ../../sorts/Sorts.sdf3 line 10, 12">Sort</a>&gt; &lt;<span id="sep_592_595" title="Not referenced locally or via imports">sep</span>:<a href="#Separator_663_672" id="Separator_596_605" title="Defined at  line 25">Separator</a>&gt;<span class="cons_String">}+</span>&gt;
<a href="#SortSymbol_858_868" id="SortSymbol_610_620" title="Referenced at  line 32">SortSymbol</a>.<span class="cons_Constructor"><span id="IterStarSep_621_632" title="Not referenced locally or via imports">IterStarSep</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="../../sorts/Sorts.sdf3#Sort_146_150" id="Sort_638_642" title="Defined at ../../sorts/Sorts.sdf3 line 10, 12">Sort</a>&gt; &lt;<span id="sep_645_648" title="Not referenced locally or via imports">sep</span>:<a href="#Separator_663_672" id="Separator_649_658" title="Defined at  line 25">Separator</a>&gt;<span class="cons_String">}*</span>&gt;
<a href="#Separator_875_884" id="Separator_663_672" title="Referenced at  line 32">Separator</a>.<span class="cons_Constructor"><span id="Lit_673_676" title="Not referenced locally or via imports">Lit</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_681_687" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;


<a href="#Symbol_1296_1302" id="Symbol_692_698" title="Referenced at  line 47">Symbol</a> = &lt;&lt;<a href="#SortSymbol_474_484" id="SortSymbol_703_713" title="Defined at  line 20, 21, 22, 23, 24">SortSymbol</a>&gt;<span class="cons_String">?</span>&gt; {<span class="keyword">reject</span>}
<a href="#Symbol_1296_1302" id="Symbol_726_732" title="Referenced at  line 47">Symbol</a> = &lt;&lt;<a href="#SortSymbol_474_484" id="SortSymbol_737_747" title="Defined at  line 20, 21, 22, 23, 24">SortSymbol</a>&gt;<span class="cons_String">+</span>&gt; {<span class="keyword">reject</span>}
<a href="#Symbol_1296_1302" id="Symbol_760_766" title="Referenced at  line 47">Symbol</a> = &lt;&lt;<a href="#SortSymbol_474_484" id="SortSymbol_771_781" title="Defined at  line 20, 21, 22, 23, 24">SortSymbol</a>&gt;<span class="cons_String">*</span>&gt; {<span class="keyword">reject</span>}
<a href="#Symbol_1296_1302" id="Symbol_794_800" title="Referenced at  line 47">Symbol</a> = &lt;<span class="cons_String">{</span>&lt;<a href="#SortSymbol_474_484" id="SortSymbol_806_816" title="Defined at  line 20, 21, 22, 23, 24">SortSymbol</a>&gt; &lt;<span id="sep_819_822" title="Not referenced locally or via imports">sep</span>:<a href="#Separator_663_672" id="Separator_823_832" title="Defined at  line 25">Separator</a>&gt;<span class="cons_String">}+</span>&gt; {<span class="keyword">reject</span>}
<a href="#Symbol_1296_1302" id="Symbol_846_852" title="Referenced at  line 47">Symbol</a> = &lt;<span class="cons_String">{</span>&lt;<a href="#SortSymbol_474_484" id="SortSymbol_858_868" title="Defined at  line 20, 21, 22, 23, 24">SortSymbol</a>&gt; &lt;<span id="sep_871_874" title="Not referenced locally or via imports">sep</span>:<a href="#Separator_663_672" id="Separator_875_884" title="Defined at  line 25">Separator</a>&gt;<span class="cons_String">}*</span>&gt; {<span class="keyword">reject</span>}



<span class="layout">//Symbol.Func = &lt;(&lt;arguments:Symbols&gt; =\&gt; &lt;results:Symbol&gt;)&gt;</span>
<span class="layout">//"left":Symbol "|" "right":Symbol              - &gt; Symbol {right,cons("alt")}</span>
<a href="#Symbol_1296_1302" id="Symbol_1041_1047" title="Referenced at  line 47">Symbol</a>.<span class="cons_Constructor"><a href="#Alt_1289_1292" id="Alt_1048_1051" title="Referenced at  line 46; ../../sorts/Sorts.sdf3 line 50">Alt</a></span> = &lt;&lt;<a href="#Symbol_169_175" id="Symbol_1056_1062" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt; <span class="cons_String">|</span> &lt;<a href="#Symbol_169_175" id="Symbol_1067_1073" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>&gt;&gt; {<span class="keyword">right</span>}
<span class="layout">// "(" "left":Symbol "-&gt;" "right":Symbol ")"     -&gt; Symbol {cons("strategy")}</span>
<span class="layout">//Symbol.Strategy = &lt;(&lt;Symbol&gt; -\&gt; &lt;Symbol&gt; )&gt;</span>
 
<span class="keyword">context-free priorities</span> 
{<a href="#Symbol_169_175" id="Symbol_1237_1243" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>.<span class="cons_Constructor"><a href="#Opt_299_302" id="Opt_1244_1247" title="Defined at  line 12">Opt</a></span>
 <a href="#Symbol_169_175" id="Symbol_1249_1255" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>.<span class="cons_Constructor"><a href="#IterStar_350_358" id="IterStar_1256_1264" title="Defined at  line 14">IterStar</a></span>
 <a href="#Symbol_169_175" id="Symbol_1266_1272" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>.<span class="cons_Constructor"><a href="#Iter_324_328" id="Iter_1273_1277" title="Defined at  line 13">Iter</a></span>} &gt;
 <a href="#Symbol_169_175" id="Symbol_1282_1288" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>.<span class="cons_Constructor"><a href="#Alt_1048_1051" id="Alt_1289_1292" title="Defined at  line 38">Alt</a></span> &gt;
 <a href="#Symbol_169_175" id="Symbol_1296_1302" title="Defined at  line 8, 12, 13, 14, 15, 16, 28, 29, 30, 31, 32, 38">Symbol</a>.<span class="cons_Constructor"><a href="../../labels/Labels.sdf3#Label_185_190" id="Label_1303_1308" title="Defined at ../../labels/Labels.sdf3 line 11">Label</a></span>
</code></pre></td></tr></tbody></table></div>