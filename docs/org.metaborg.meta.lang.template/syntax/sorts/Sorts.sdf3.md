---
title: Sorts.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2-Syntax.sdf3#sorts/Sorts_204_215" id="sorts/Sorts_7_18" title="Referenced at ../../sdf2-core/Sdf2-Syntax.sdf3 line 10">sorts/Sorts</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_28_41" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a>
<a href="../../symbols/Symbols.sdf3#symbols/Symbols_7_22" id="symbols/Symbols_42_57" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a>
<a href="../../basic/Basic.sdf3#basic/Basic_7_18" id="basic/Basic_58_69" title="Defined at ../../basic/Basic.sdf3 line 1">basic/Basic</a>
<a href="../../regular/Regular.sdf3#regular/Regular_7_22" id="regular/Regular_70_85" title="Defined at ../../regular/Regular.sdf3 line 1">regular/Regular</a>

<span class="keyword">lexical syntax</span>
  <span class="layout">//head:[A-Z] -&gt; Sort {cons("one-char")}</span>
  <a href="#Sort_1064_1068" id="Sort_146_150" title="Referenced at line 46; ../../regular/Regular.sdf3 line 24">Sort</a>.<span class="cons_Constructor"><span id="OneChar_151_158" title="Not referenced locally, nor via imports">OneChar</span></span> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>]
  <span class="layout">//head:[A-Z] middle:[A-Za-z0-9\_\-]* last:[A-Za-z0-9] -&gt; Sort {cons("more-chars")}</span>
  <a href="#Sort_1064_1068" id="Sort_254_258" title="Referenced at line 46; ../../regular/Regular.sdf3 line 24">Sort</a>.<span class="cons_Constructor"><span id="MoreChars_259_268" title="Not referenced locally, nor via imports">MoreChars</span></span> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-]* [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]

<span class="keyword">context-free syntax</span>
<a href="#Symbol_1194_1200" id="Symbol_327_333" title="Referenced at line 50">Symbol</a>.<span class="cons_Constructor"><span id="Sort_334_338" title="Not referenced locally, nor via imports">Sort</span></span> = &lt;&lt;<a href="#Sort_146_150" id="Sort_343_347" title="Defined at line 10, 12">Sort</a>&gt;&gt;
<a href="#Symbol_1194_1200" id="Symbol_350_356" title="Referenced at line 50">Symbol</a>.<span class="cons_Constructor"><span id="ParameterizedSort_357_374" title="Not referenced locally, nor via imports">ParameterizedSort</span></span> = &lt;&lt;<a href="#Sort_146_150" id="Sort_379_383" title="Defined at line 10, 12">Sort</a>&gt; <span class="cons_String">[[</span>&lt;<span id="parameters_388_398" title="Not referenced locally, nor via imports">parameters</span>:{<a href="#Symbol_327_333" id="Symbol_400_406" title="Defined at line 15, 16">Symbol</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">]]</span>&gt;
<a href="#SymbolDef_1142_1151" id="SymbolDef_418_427" title="Referenced at line 50; ../../TemplateLang.sdf3 line 97">SymbolDef</a>.<span class="cons_Constructor"><span id="SortDef_428_435" title="Not referenced locally, nor via imports">SortDef</span></span> = &lt;&lt;<a href="#Sort_146_150" id="Sort_440_444" title="Defined at line 10, 12">Sort</a>&gt;&gt; {<span class="keyword">prefer</span>}
<a href="#SymbolDef_1142_1151" id="SymbolDef_456_465" title="Referenced at line 50; ../../TemplateLang.sdf3 line 97">SymbolDef</a>.<span class="cons_Constructor"><a href="#Cf_1125_1127" id="Cf_466_468" title="Referenced at line 50">Cf</a></span>      = &lt;&lt;<a href="#SymbolDef_418_427" id="SymbolDef_478_487" title="Defined at line 17, 18, 19, 20">SymbolDef</a>&gt;<span class="cons_String">-CF</span>&gt; {<span class="keyword">prefer</span>}
<a href="#SymbolDef_1142_1151" id="SymbolDef_502_511" title="Referenced at line 50; ../../TemplateLang.sdf3 line 97">SymbolDef</a>.<span class="cons_Constructor"><a href="#Lex_1138_1141" id="Lex_512_515" title="Referenced at line 50">Lex</a></span>     = &lt;&lt;<a href="#SymbolDef_418_427" id="SymbolDef_524_533" title="Defined at line 17, 18, 19, 20">SymbolDef</a>&gt;<span class="cons_String">-LEX</span>&gt; {<span class="keyword">prefer</span>}
<a href="#SymbolDef_1142_1151" id="SymbolDef_549_558" title="Referenced at line 50; ../../TemplateLang.sdf3 line 97">SymbolDef</a>.<span class="cons_Constructor"><a href="#Var_1152_1155" id="Var_559_562" title="Referenced at line 50">Var</a></span>     = &lt;&lt;<a href="#SymbolDef_418_427" id="SymbolDef_571_580" title="Defined at line 17, 18, 19, 20">SymbolDef</a>&gt;<span class="cons_String">-VAR</span>&gt; {<span class="keyword">prefer</span>}

<a href="#DeclSort_811_819" id="DeclSort_597_605" title="Referenced at line 29">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSort_606_614" title="Not referenced locally, nor via imports">DeclSort</span></span>    = &lt;&lt;<a href="#Sort_146_150" id="Sort_622_626" title="Defined at line 10, 12">Sort</a>&gt;&gt;     <span class="layout">// context-free</span>
<a href="#DeclSort_811_819" id="DeclSort_649_657" title="Referenced at line 29">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSortCf_658_668" title="Not referenced locally, nor via imports">DeclSortCf</span></span>  = &lt;&lt;<a href="#Sort_146_150" id="Sort_674_678" title="Defined at line 10, 12">Sort</a>&gt;<span class="cons_String">-CF</span>&gt;  <span class="layout">// desugared to DeclSort</span>
<a href="#DeclSort_811_819" id="DeclSort_710_718" title="Referenced at line 29">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSortLex_719_730" title="Not referenced locally, nor via imports">DeclSortLex</span></span> = &lt;&lt;<a href="#Sort_146_150" id="Sort_735_739" title="Defined at line 10, 12">Sort</a>&gt;<span class="cons_String">-LEX</span>&gt;
<a href="#DeclSort_811_819" id="DeclSort_746_754" title="Referenced at line 29">DeclSort</a>.<span class="cons_Constructor"><span id="DeclSortVar_755_766" title="Not referenced locally, nor via imports">DeclSortVar</span></span> = &lt;&lt;<a href="#Sort_146_150" id="Sort_771_775" title="Defined at line 10, 12">Sort</a>&gt;<span class="cons_String">-VAR</span>&gt;


<span id="Grammar_784_791" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="Sorts_792_797" title="Not referenced locally, nor via imports">Sorts</span></span> = &lt;
  <span class="cons_String">sorts</span> &lt;<a href="#DeclSort_597_605" id="DeclSort_811_819" title="Defined at line 22, 23, 24, 25">DeclSort</a>*&gt;

    &gt;
<span id="Grammar_829_836" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="LexSorts_837_845" title="Not referenced locally, nor via imports">LexSorts</span></span> = /* <span class="keyword">desugared</span> */ &lt;
  <span class="cons_String">lexical</span> <span class="cons_String">sorts</span> &lt;<a href="#Sort_146_150" id="Sort_883_887" title="Defined at line 10, 12">Sort</a>*&gt;

    &gt;
<span id="Grammar_897_904" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="CfSorts_905_912" title="Not referenced locally, nor via imports">CfSorts</span></span> = /* <span class="keyword">desugared</span> */ &lt;
  <span class="cons_String">context-free</span> <span class="cons_String">sorts</span> &lt;<a href="#Sort_146_150" id="Sort_955_959" title="Defined at line 10, 12">Sort</a>*&gt;

    &gt;
<span id="Grammar_969_976" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="VarSorts_977_985" title="Not referenced locally, nor via imports">VarSorts</span></span> = /* <span class="keyword">desugared</span> */ &lt;
  <span class="cons_String">variable</span> <span class="cons_String">sorts</span> &lt;<a href="#Sort_146_150" id="Sort_1024_1028" title="Defined at line 10, 12">Sort</a>*&gt;

    &gt;

<span class="keyword">lexical restrictions</span>
    <a href="#Sort_146_150" id="Sort_1064_1068" title="Defined at line 10, 12">Sort</a> -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]

<span class="keyword">context-free priorities</span>

{ <a href="#SymbolDef_418_427" id="SymbolDef_1115_1124" title="Defined at line 17, 18, 19, 20">SymbolDef</a>.<span class="cons_Constructor"><a href="#Cf_466_468" id="Cf_1125_1127" title="Defined at line 18">Cf</a></span> <a href="#SymbolDef_418_427" id="SymbolDef_1128_1137" title="Defined at line 17, 18, 19, 20">SymbolDef</a>.<span class="cons_Constructor"><a href="#Lex_512_515" id="Lex_1138_1141" title="Defined at line 19">Lex</a></span> <a href="#SymbolDef_418_427" id="SymbolDef_1142_1151" title="Defined at line 17, 18, 19, 20">SymbolDef</a>.<span class="cons_Constructor"><a href="#Var_559_562" id="Var_1152_1155" title="Defined at line 20">Var</a></span> <a href="#Symbol_327_333" id="Symbol_1156_1162" title="Defined at line 15, 16">Symbol</a>.<span class="cons_Constructor"><a href="../../basic/Basic.sdf3#Cf_564_566" id="Cf_1163_1165" title="Defined at ../../basic/Basic.sdf3 line 48">Cf</a></span> <a href="#Symbol_327_333" id="Symbol_1166_1172" title="Defined at line 15, 16">Symbol</a>.<span class="cons_Constructor"><a href="../../basic/Basic.sdf3#Lex_590_593" id="Lex_1173_1176" title="Defined at ../../basic/Basic.sdf3 line 49">Lex</a></span> <a href="#Symbol_327_333" id="Symbol_1177_1183" title="Defined at line 15, 16">Symbol</a>.<span class="cons_Constructor"><a href="../../basic/Basic.sdf3#Varsym_618_624" id="Varsym_1184_1190" title="Defined at ../../basic/Basic.sdf3 line 50">Varsym</a></span>} &gt; <a href="#Symbol_327_333" id="Symbol_1194_1200" title="Defined at line 15, 16">Symbol</a>.<span class="cons_Constructor"><a href="../../regular/Regular.sdf3#Alt_1048_1051" id="Alt_1201_1204" title="Defined at ../../regular/Regular.sdf3 line 38">Alt</a></span>

</code></pre></td></tr></tbody></table></div>