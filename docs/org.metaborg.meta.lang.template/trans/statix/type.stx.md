---
title: type.stx
hide:
  - toc
---

# `type.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/type.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/type.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/type.stx "The source file on GitHub"

<div class="stx"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../cons.stx/#statix/type_46_57" id="statix/type_7_18" title="Referenced at ../cons.stx line 6; ../main.stx line 6; ../module.stx line 7; ../production.stx line 5; ../sort.stx line 6; ../sort_cons.stx line 6; ../symbol.stx line 5; ../section/syntax.stx line 8; ../section/template.stx line 7"><span class="token sort_Id">statix/type</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#TYPE_93_97" id="TYPE_39_43" title="Referenced at line 6, 7, 7, 7, 8, 8, 9, 9, 10, 10, 10, 11, 12, 12, 12, 13, 13, 13, 14, 17, 21, 21, 26, 26, 31, 31, 31, 35, 35; ../cons.stx line 11, 11, 11, 19, 25, 25, 32, 32, 38, 38, 38; ../module.stx line 43, 49, 49; ../production.stx line 11; ../sort.stx line 21, 28, 34, 34; ../sort_cons.stx line 32, 32, 37, 44; ../symbol.stx line 36; ../section/syntax.stx line 69; ../section/template.stx line 48, 63, 72, 78, 85, 90"><span class="token sort_Id">TYPE</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../sort.stx/#SORT_367_371" id="SORT_61_65" title="Referenced at ../sort.stx line 23"><span class="token sort_Id">SORT</span></a>     <span class="operator">:</span> <span class="cons_OccurrenceSort">occurrence</span>        <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_93_97" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../symbol.stx/#SEQ_1607_1610" id="SEQ_102_105" title="Referenced at ../symbol.stx line 55"><span class="token sort_Id">SEQ</span></a>      <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_113_117" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_125_129" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_134_138" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../symbol.stx/#OPT_1726_1729" id="OPT_143_146" title="Referenced at ../symbol.stx line 58"><span class="token sort_Id">OPT</span></a>      <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_154_158" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span>              <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_175_179" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../symbol.stx/#ITER_1804_1808" id="ITER_184_188" title="Referenced at ../symbol.stx line 60, 62, 64, 66"><span class="token sort_Id">ITER</span></a>     <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_195_199" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span>              <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_216_220" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../symbol.stx/#ALT_2149_2152" id="ALT_225_228" title="Referenced at ../symbol.stx line 68"><span class="token sort_Id">ALT</span></a>      <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_236_240" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_243_247" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span>       <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_257_261" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../symbol.stx/#TERMINAL_2271_2279" id="TERMINAL_266_274" title="Referenced at ../symbol.stx line 72, 73, 74, 75"><span class="token sort_Id">TERMINAL</span></a> <span class="operator">:</span>                      <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_298_302" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../cons.stx/#PROD_262_266" id="PROD_307_311" title="Referenced at ../cons.stx line 13, 39"><span class="token sort_Id">PROD</span></a>     <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_323_327" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_331_335" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_339_343" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../section/syntax.stx/#INJ_3401_3404" id="INJ_348_351" title="Referenced at ../section/syntax.stx line 74; ../section/template.stx line 53"><span class="token sort_Id">INJ</span></a>      <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_364_368" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_372_376" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_380_384" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../module.stx/#MOD_1026_1029" id="MOD_389_392" title="Referenced at ../module.stx line 40, 76"><span class="token sort_Id">MOD</span></a>      <span class="operator">:</span> <span class="cons_ScopeSort">scope</span>             <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_421_425" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>

  <span class="keyword">relations</span>
    <span class="cons_Label"><a href="../cons.stx/#typeOfDecl_317_327" id="typeOfDecl_443_453" title="Referenced at ../cons.stx line 14, 15, 21, 34; ../module.stx line 40, 46; ../sort.stx line 24, 30"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="operator">:</span> <span class="cons_OccurrenceSort">occurrence</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_470_474" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span>

<span class="keyword">rules</span>

  <a href="#onlyOneOf_541_550" id="onlyOneOf_485_494" title="Referenced at line 22, 23, 23, 24; ../cons.stx line 16"><span class="token sort_Id">onlyOneOf</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_497_501" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="operator">(</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_531_535" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)))</span>
  <a href="#onlyOneOf_485_494" id="onlyOneOf_541_550" title="Defined at line 21"><span class="token sort_Id">onlyOneOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_585_587" id="ty_551_553" title="Referenced at line 22"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="operator">(_,</span> <span class="cons_Var">ty</span> <span class="operator">))|</span><span class="cons_Var"><a href="#ps_589_591" id="ps_570_572" title="Referenced at line 22"><span class="token sort_Id">ps</span></a></span><span class="operator">])</span> <span class="operator">:-</span> <a href="#noneOf_701_707" id="noneOf_578_584" title="Defined at line 26"><span class="token sort_Id">noneOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_551_553" id="ty_585_587" title="Defined at line 22"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#ps_570_572" id="ps_589_591" title="Defined at line 22"><span class="token sort_Id">ps</span></a></span><span class="operator">).</span>
  <a href="#onlyOneOf_485_494" id="onlyOneOf_596_605" title="Defined at line 21"><span class="token sort_Id">onlyOneOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_643_645" id="ty_606_608" title="Referenced at line 23"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="operator">(_,</span> <span class="cons_Var"><span id="ty'_619_622" title="Not referenced locally, nor via imports"><span class="token sort_Id">ty'</span></span></span><span class="operator">))|</span><span class="cons_Var"><a href="#ps_647_649" id="ps_625_627" title="Referenced at line 23"><span class="token sort_Id">ps</span></a></span><span class="operator">])</span> <span class="operator">:-</span> <a href="#onlyOneOf_485_494" id="onlyOneOf_633_642" title="Defined at line 21"><span class="token sort_Id">onlyOneOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_606_608" id="ty_643_645" title="Defined at line 23"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#ps_625_627" id="ps_647_649" title="Defined at line 23"><span class="token sort_Id">ps</span></a></span><span class="operator">).</span>
  <a href="#onlyOneOf_485_494" id="onlyOneOf_654_663" title="Defined at line 21"><span class="token sort_Id">onlyOneOf</span></a><span class="operator">(</span><span class="cons_Var"><span id="ty_664_666" title="Not referenced locally, nor via imports"><span class="token sort_Id">ty</span></span></span><span class="operator">,</span> <span class="operator">[])</span>                 <span class="operator">:-</span> <span class="keyword">false</span><span class="operator">.</span>

  <a href="#noneOf_578_584" id="noneOf_701_707" title="Referenced at line 22, 27, 28, 28, 29"><span class="token sort_Id">noneOf</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_710_714" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="operator">(</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_744_748" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)))</span>
  <a href="#noneOf_701_707" id="noneOf_754_760" title="Defined at line 26"><span class="token sort_Id">noneOf</span></a><span class="operator">(</span><span class="cons_Var">ty</span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="operator">(_,</span> <span class="cons_Var"><span id="ty_774_776" title="Not referenced locally, nor via imports"><span class="token sort_Id">ty</span></span></span> <span class="operator">))|</span><span class="cons_Var"><span id="ps_780_782" title="Not referenced locally, nor via imports"><span class="token sort_Id">ps</span></span></span><span class="operator">])</span> <span class="operator">:-</span> <span class="keyword">false</span><span class="operator">.</span>
  <a href="#noneOf_701_707" id="noneOf_797_803" title="Defined at line 26"><span class="token sort_Id">noneOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_838_840" id="ty_804_806" title="Referenced at line 28"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="operator">(_,</span> <span class="cons_Var"><span id="ty'_817_820" title="Not referenced locally, nor via imports"><span class="token sort_Id">ty'</span></span></span><span class="operator">))|</span><span class="cons_Var"><a href="#ps_842_844" id="ps_823_825" title="Referenced at line 28"><span class="token sort_Id">ps</span></a></span><span class="operator">])</span> <span class="operator">:-</span> <a href="#noneOf_701_707" id="noneOf_831_837" title="Defined at line 26"><span class="token sort_Id">noneOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_804_806" id="ty_838_840" title="Defined at line 28"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#ps_823_825" id="ps_842_844" title="Defined at line 28"><span class="token sort_Id">ps</span></a></span><span class="operator">).</span>
  <a href="#noneOf_701_707" id="noneOf_849_855" title="Defined at line 26"><span class="token sort_Id">noneOf</span></a><span class="operator">(</span><span class="cons_Var"><span id="ty_856_858" title="Not referenced locally, nor via imports"><span class="token sort_Id">ty</span></span></span><span class="operator">,</span> <span class="operator">[])</span>                 <span class="operator">:-</span> <span class="keyword">true</span><span class="operator">.</span>

  <a href="#appendTypes_946_957" id="appendTypes_892_903" title="Referenced at line 32, 32, 33, 36; ../section/template.stx line 66, 79"><span class="token sort_Id">appendTypes</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_911_915" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_924_928" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_938_942" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span>
  <a href="#appendTypes_892_903" id="appendTypes_946_957" title="Defined at line 31"><span class="token sort_Id">appendTypes</span></a><span class="operator">([</span><span class="cons_Var"><span id="t_959_960" title="Not referenced locally, nor via imports"><span class="token sort_Id">t</span></span></span><span class="operator">|</span><span class="cons_Var">ts</span><span class="operator">],</span> <span class="cons_Var"><span id="types_966_971" title="Not referenced locally, nor via imports"><span class="token sort_Id">types</span></span></span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">[</span><span class="cons_Var">t</span><span class="operator">|</span><a href="#appendTypes_892_903" id="appendTypes_978_989" title="Defined at line 31"><span class="token sort_Id">appendTypes</span></a><span class="operator">(</span><span class="cons_Var"><span id="ts_990_992" title="Not referenced locally, nor via imports"><span class="token sort_Id">ts</span></span></span><span class="operator">,</span> <span class="cons_Var">types</span><span class="operator">)].</span>
  <a href="#appendTypes_892_903" id="appendTypes_1005_1016" title="Defined at line 31"><span class="token sort_Id">appendTypes</span></a><span class="operator">([</span>    <span class="operator">],</span> <span class="cons_Var"><span id="types_1025_1030" title="Not referenced locally, nor via imports"><span class="token sort_Id">types</span></span></span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var">types</span><span class="operator">.</span>

  <a href="#flattenTypes_1092_1104" id="flattenTypes_1044_1056" title="Referenced at line 36, 36, 37; ../section/template.stx line 64, 65"><span class="token sort_Id">flattenTypes</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_1069_1073" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">))</span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_39_43" id="TYPE_1084_1088" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span>
  <a href="#flattenTypes_1044_1056" id="flattenTypes_1092_1104" title="Defined at line 35"><span class="token sort_Id">flattenTypes</span></a><span class="operator">([</span><span class="cons_Var"><span id="ts_1106_1108" title="Not referenced locally, nor via imports"><span class="token sort_Id">ts</span></span></span><span class="operator">|</span><span class="cons_Var">tts</span><span class="operator">])</span> <span class="operator">=</span> <a href="#appendTypes_892_903" id="appendTypes_1117_1128" title="Defined at line 31"><span class="token sort_Id">appendTypes</span></a><span class="operator">(</span><span class="cons_Var">ts</span><span class="operator">,</span> <a href="#flattenTypes_1044_1056" id="flattenTypes_1133_1145" title="Defined at line 35"><span class="token sort_Id">flattenTypes</span></a><span class="operator">(</span><span class="cons_Var"><span id="tts_1146_1149" title="Not referenced locally, nor via imports"><span class="token sort_Id">tts</span></span></span><span class="operator">)).</span>
  <a href="#flattenTypes_1044_1056" id="flattenTypes_1155_1167" title="Defined at line 35"><span class="token sort_Id">flattenTypes</span></a><span class="operator">([</span>      <span class="operator">])</span> <span class="operator">=</span> <span class="operator">[].</span>

</code></pre></td></tr></tbody></table></div>