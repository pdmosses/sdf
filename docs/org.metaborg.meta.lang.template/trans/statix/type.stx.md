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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/type_0_7" title="Multi-file references" data-urls="../cons.stx/#statix/type_6_3 ../main.stx/#statix/type_6_3 ../module.stx/#statix/type_7_3 ../production.stx/#statix/type_5_3 ../sort.stx/#statix/type_6_3 ../sort_cons.stx/#statix/type_6_3 ../symbol.stx/#statix/type_5_3 ../section/syntax.stx/#statix/type_8_3 ../section/template.stx/#statix/type_7_3"><span class="token sort_Id">statix/type</span></button>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="TYPE_4_8" title="Multi-file references" data-urls="#TYPE_6_37 ../cons.stx/#TYPE_11_37 ../module.stx/#TYPE_43_40 ../production.stx/#TYPE_11_26 ../sort.stx/#TYPE_21_47 ../sort_cons.stx/#TYPE_32_33 ../symbol.stx/#TYPE_36_35 ../section/syntax.stx/#TYPE_69_49 ../section/template.stx/#TYPE_48_59"><span class="token sort_Id">TYPE</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../sort.stx/#SORT_22_13" id="SORT_5_4" title="Referenced at ../sort.stx line 23"><span class="token sort_Id">SORT</span></a>     <span class="operator">:</span> <span class="cons_OccurrenceSort">occurrence</span>        <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_5_36" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../symbol.stx/#SEQ_54_47" id="SEQ_6_4" title="Referenced at ../symbol.stx line 55"><span class="token sort_Id">SEQ</span></a>      <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_6_15" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_6_27" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_6_36" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../symbol.stx/#OPT_57_33" id="OPT_7_4" title="Referenced at ../symbol.stx line 58"><span class="token sort_Id">OPT</span></a>      <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_7_15" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span>              <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_7_36" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../symbol.stx/#ITER_59_34" id="ITER_8_4" title="Referenced at ../symbol.stx line 60, 62, 64, 66"><span class="token sort_Id">ITER</span></a>     <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_8_15" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span>              <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_8_36" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../symbol.stx/#ALT_67_43" id="ALT_9_4" title="Referenced at ../symbol.stx line 68"><span class="token sort_Id">ALT</span></a>      <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_9_15" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_9_22" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span>       <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_9_36" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../symbol.stx/#TERMINAL_71_34" id="TERMINAL_10_4" title="Referenced at ../symbol.stx line 72, 73, 74, 75"><span class="token sort_Id">TERMINAL</span></a> <span class="operator">:</span>                      <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_10_36" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../cons.stx/#PROD_12_13" id="PROD_11_4" title="Referenced at ../cons.stx line 13, 39"><span class="token sort_Id">PROD</span></a>     <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_11_20" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_11_28" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_11_36" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><button class="modal-open" id="INJ_12_4" title="Multi-file references" data-urls="../section/syntax.stx/#INJ_74_14 ../section/template.stx/#INJ_53_14"><span class="token sort_Id">INJ</span></button>      <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_12_20" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_12_28" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_12_36" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="../module.stx/#MOD_39_42" id="MOD_13_4" title="Referenced at ../module.stx line 40, 76"><span class="token sort_Id">MOD</span></a>      <span class="operator">:</span> <span class="cons_ScopeSort">scope</span>             <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_13_36" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span></span>

  <span class="keyword">relations</span>
    <span class="cons_Label"><button class="modal-open" id="typeOfDecl_16_4" title="Multi-file references" data-urls="../cons.stx/#typeOfDecl_14_33 ../module.stx/#typeOfDecl_40_32 ../sort.stx/#typeOfDecl_24_26"><span class="token sort_Id">typeOfDecl</span></button></span> <span class="operator">:</span> <span class="cons_OccurrenceSort">occurrence</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_16_31" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span>

<span class="keyword">rules</span>

  <button class="modal-open" id="onlyOneOf_20_2" title="Multi-file references" data-urls="#onlyOneOf_22_3 ../cons.stx/#onlyOneOf_16_5"><span class="token sort_Id">onlyOneOf</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_20_14" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="operator">(</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_20_48" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)))</span>
  <a href="#onlyOneOf_20_2" id="onlyOneOf_21_2" title="Defined at line 21"><span class="token sort_Id">onlyOneOf</span></a><span class="operator">(</span><span class="cons_Var">ty</span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="operator">(_,</span> <span class="cons_Var"><a href="#ty_21_46" id="ty_21_25" title="Referenced at line 22"><span class="token sort_Id">ty</span></a></span> <span class="operator">))|</span><span class="cons_Var"><a href="#ps_21_50" id="ps_21_31" title="Referenced at line 22"><span class="token sort_Id">ps</span></a></span><span class="operator">])</span> <span class="operator">:-</span> <a href="#noneOf_25_2" id="noneOf_21_39" title="Defined at line 26"><span class="token sort_Id">noneOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_21_25" id="ty_21_46" title="Defined at line 22"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#ps_21_31" id="ps_21_50" title="Defined at line 22"><span class="token sort_Id">ps</span></a></span><span class="operator">).</span>
  <a href="#onlyOneOf_20_2" id="onlyOneOf_22_2" title="Defined at line 21"><span class="token sort_Id">onlyOneOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_22_49" id="ty_22_12" title="Referenced at line 23"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="operator">(_,</span> <span class="cons_Var"><span id="ty'_22_25" title="Not referenced locally, nor via imports"><span class="token sort_Id">ty'</span></span></span><span class="operator">))|</span><span class="cons_Var"><a href="#ps_22_53" id="ps_22_31" title="Referenced at line 23"><span class="token sort_Id">ps</span></a></span><span class="operator">])</span> <span class="operator">:-</span> <a href="#onlyOneOf_20_2" id="onlyOneOf_22_39" title="Defined at line 21"><span class="token sort_Id">onlyOneOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_22_12" id="ty_22_49" title="Defined at line 23"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#ps_22_31" id="ps_22_53" title="Defined at line 23"><span class="token sort_Id">ps</span></a></span><span class="operator">).</span>
  <a href="#onlyOneOf_20_2" id="onlyOneOf_23_2" title="Defined at line 21"><span class="token sort_Id">onlyOneOf</span></a><span class="operator">(</span><span class="cons_Var"><span id="ty_23_12" title="Not referenced locally, nor via imports"><span class="token sort_Id">ty</span></span></span><span class="operator">,</span> <span class="operator">[])</span>                 <span class="operator">:-</span> <span class="keyword">false</span><span class="operator">.</span>

  <a href="#noneOf_21_39" id="noneOf_25_2" title="Referenced at line 22, 27, 28, 29"><span class="token sort_Id">noneOf</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_25_11" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="operator">(</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_25_45" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)))</span>
  <a href="#noneOf_25_2" id="noneOf_26_2" title="Defined at line 26"><span class="token sort_Id">noneOf</span></a><span class="operator">(</span><span class="cons_Var">ty</span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="operator">(_,</span> <span class="cons_Var"><span id="ty_26_22" title="Not referenced locally, nor via imports"><span class="token sort_Id">ty</span></span></span> <span class="operator">))|</span><span class="cons_Var"><span id="ps_26_28" title="Not referenced locally, nor via imports"><span class="token sort_Id">ps</span></span></span><span class="operator">])</span> <span class="operator">:-</span> <span class="keyword">false</span><span class="operator">.</span>
  <a href="#noneOf_25_2" id="noneOf_27_2" title="Defined at line 26"><span class="token sort_Id">noneOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_27_43" id="ty_27_9" title="Referenced at line 28"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="operator">(_,</span> <span class="cons_Var"><span id="ty'_27_22" title="Not referenced locally, nor via imports"><span class="token sort_Id">ty'</span></span></span><span class="operator">))|</span><span class="cons_Var"><a href="#ps_27_47" id="ps_27_28" title="Referenced at line 28"><span class="token sort_Id">ps</span></a></span><span class="operator">])</span> <span class="operator">:-</span> <a href="#noneOf_25_2" id="noneOf_27_36" title="Defined at line 26"><span class="token sort_Id">noneOf</span></a><span class="operator">(</span><span class="cons_Var"><a href="#ty_27_9" id="ty_27_43" title="Defined at line 28"><span class="token sort_Id">ty</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#ps_27_28" id="ps_27_47" title="Defined at line 28"><span class="token sort_Id">ps</span></a></span><span class="operator">).</span>
  <a href="#noneOf_25_2" id="noneOf_28_2" title="Defined at line 26"><span class="token sort_Id">noneOf</span></a><span class="operator">(</span><span class="cons_Var"><span id="ty_28_9" title="Not referenced locally, nor via imports"><span class="token sort_Id">ty</span></span></span><span class="operator">,</span> <span class="operator">[])</span>                 <span class="operator">:-</span> <span class="keyword">true</span><span class="operator">.</span>

  <button class="modal-open" id="appendTypes_30_2" title="Multi-file references" data-urls="#appendTypes_32_3 ../section/template.stx/#appendTypes_66_51"><span class="token sort_Id">appendTypes</span></button> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_30_21" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_30_34" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_30_48" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span>
  <a href="#appendTypes_30_2" id="appendTypes_31_2" title="Defined at line 31"><span class="token sort_Id">appendTypes</span></a><span class="operator">([</span><span class="cons_Var"><span id="t_31_15" title="Not referenced locally, nor via imports"><span class="token sort_Id">t</span></span></span><span class="operator">|</span><span class="cons_Var">ts</span><span class="operator">],</span> <span class="cons_Var">types</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">[</span><span class="cons_Var">t</span><span class="operator">|</span><a href="#appendTypes_30_2" id="appendTypes_31_34" title="Defined at line 31"><span class="token sort_Id">appendTypes</span></a><span class="operator">(</span><span class="cons_Var"><span id="ts_31_46" title="Not referenced locally, nor via imports"><span class="token sort_Id">ts</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="types_31_50" title="Not referenced locally, nor via imports"><span class="token sort_Id">types</span></span></span><span class="operator">)].</span>
  <a href="#appendTypes_30_2" id="appendTypes_32_2" title="Defined at line 31"><span class="token sort_Id">appendTypes</span></a><span class="operator">([</span>    <span class="operator">],</span> <span class="cons_Var"><span id="types_32_22" title="Not referenced locally, nor via imports"><span class="token sort_Id">types</span></span></span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var">types</span><span class="operator">.</span>

  <button class="modal-open" id="flattenTypes_34_2" title="Multi-file references" data-urls="#flattenTypes_36_3 ../section/template.stx/#flattenTypes_64_51"><span class="token sort_Id">flattenTypes</span></button> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_34_27" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">))</span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#TYPE_4_8" id="TYPE_34_42" title="Defined at line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span>
  <a href="#flattenTypes_34_2" id="flattenTypes_35_2" title="Defined at line 35"><span class="token sort_Id">flattenTypes</span></a><span class="operator">([</span><span class="cons_Var">ts</span><span class="operator">|</span><span class="cons_Var">tts</span><span class="operator">])</span> <span class="operator">=</span> <a href="#appendTypes_30_2" id="appendTypes_35_27" title="Defined at line 31"><span class="token sort_Id">appendTypes</span></a><span class="operator">(</span><span class="cons_Var"><span id="ts_35_39" title="Not referenced locally, nor via imports"><span class="token sort_Id">ts</span></span></span><span class="operator">,</span> <a href="#flattenTypes_34_2" id="flattenTypes_35_43" title="Defined at line 35"><span class="token sort_Id">flattenTypes</span></a><span class="operator">(</span><span class="cons_Var"><span id="tts_35_56" title="Not referenced locally, nor via imports"><span class="token sort_Id">tts</span></span></span><span class="operator">)).</span>
  <a href="#flattenTypes_34_2" id="flattenTypes_36_2" title="Defined at line 35"><span class="token sort_Id">flattenTypes</span></a><span class="operator">([</span>      <span class="operator">])</span> <span class="operator">=</span> <span class="operator">[].</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
