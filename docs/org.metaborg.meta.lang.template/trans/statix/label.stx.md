---
title: label.stx
hide:
  - toc
---

# `label.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/label.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/label.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/label.stx "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.stx/#statix/label_356_368" id="statix/label_7_19" title="Referenced at ../main.stx line 20; ../symbol.stx line 7"><span class="token sort_Id">statix/label</span></a>

<span class="keyword">imports</span>
  
  <a href="../name.stx/#statix/name_7_18" id="statix/name_34_45" title="Defined at ../name.stx line 1"><span class="token sort_Id">statix/name</span></a>
  <a href="../util.stx/#statix/util_7_18" id="statix/util_48_59" title="Defined at ../util.stx line 1"><span class="token sort_Id">statix/util</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Label_124_129" id="Label_80_85" title="Referenced at line 11, 12, 16; ../symbol.stx line 18"><span class="token sort_Id">Label</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Quoted_207_213" id="Quoted_103_109" title="Referenced at line 17"><span class="token sort_Id">Quoted</span></a>   <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Label_80_85" id="Label_124_129" title="Defined at line 10"><span class="token sort_Id">Label</span></a></span></span>
    <span class="cons_OpDecl"><a href="#Unquoted_262_270" id="Unquoted_134_142" title="Referenced at line 18"><span class="token sort_Id">Unquoted</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Label_80_85" id="Label_155_160" title="Defined at line 10"><span class="token sort_Id">Label</span></a></span></span>

<span class="keyword">rules</span>

  <a href="#labelOK_196_203" id="labelOK_171_178" title="Referenced at line 17, 18; ../symbol.stx line 53"><span class="token sort_Id">labelOK</span></a><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Label_80_85" id="Label_188_193" title="Defined at line 10"><span class="token sort_Id">Label</span></a></span>
  <a href="#labelOK_171_178" id="labelOK_196_203" title="Defined at line 16"><span class="token sort_Id">labelOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_239_240" id="s_204_205" title="Referenced at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Quoted_103_109" id="Quoted_207_213" title="Defined at line 11"><span class="token sort_Id">Quoted</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_242_246" id="name_214_218" title="Referenced at line 17"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span>   <span class="operator">:-</span> <a href="#declareLabel_343_355" id="declareLabel_226_238" title="Defined at line 22"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_204_205" id="s_239_240" title="Defined at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_214_218" id="name_242_246" title="Defined at line 17"><span class="token sort_Id">name</span></a></span><span class="operator">).</span>
  <a href="#labelOK_171_178" id="labelOK_251_258" title="Defined at line 16"><span class="token sort_Id">labelOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_294_295" id="s_259_260" title="Referenced at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Unquoted_134_142" id="Unquoted_262_270" title="Defined at line 12"><span class="token sort_Id">Unquoted</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_297_301" id="name_271_275" title="Referenced at line 18"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#declareLabel_343_355" id="declareLabel_281_293" title="Defined at line 22"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_259_260" id="s_294_295" title="Defined at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_271_275" id="name_297_301" title="Defined at line 18"><span class="token sort_Id">name</span></a></span><span class="operator">).</span>

<span class="keyword">rules</span> <span class="layout">// Label reusable predicates</span>

  <a href="#declareLabel_226_238" id="declareLabel_343_355" title="Referenced at line 17, 18, 23"><span class="token sort_Id">declareLabel</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_StringSort">string</span>
  <a href="#declareLabel_343_355" id="declareLabel_375_387" title="Defined at line 22"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_404_405" id="s_388_389" title="Referenced at line 24, 25"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_415_419" id="name_391_395" title="Referenced at line 24, 25, 25, 25, 25, 25"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="cons_StxOccurrence"><a href="../name.stx/#Label_151_156" id="Label_409_414" title="Defined at ../name.stx line 13"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_391_395" id="name_415_419" title="Defined at line 23"><span class="token sort_Id">name</span></a></span>}</span><span class="operator">,</span>
    <span class="cons_StxOccurrence"><a href="../name.stx/#Label_151_156" id="Label_426_431" title="Defined at ../name.stx line 13"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_391_395" id="name_432_436" title="Defined at line 23"><span class="token sort_Id">name</span></a></span>}</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_388_389" id="s_441_442" title="Defined at line 23"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[(_,</span> <span class="operator">(_))]</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Duplicate definition of label </span><span class="operator">[</span><span class="cons_Var"><a href="#name_391_395" id="name_499_503" title="Defined at line 23"><span class="token sort_Id">name</span></a></span><span class="operator">]]@</span><span class="cons_Var"><a href="#name_391_395" id="name_506_510" title="Defined at line 23"><span class="token sort_Id">name</span></a></span><span class="operator">.</span>

  <a href="#resolveLabel_547_559" id="resolveLabel_515_527" title="Referenced at line 28"><span class="token sort_Id">resolveLabel</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_StringSort">string</span>
  <a href="#resolveLabel_515_527" id="resolveLabel_547_559" title="Defined at line 27"><span class="token sort_Id">resolveLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_600_601" id="s_560_561" title="Referenced at line 29"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_591_595" id="name_563_567" title="Referenced at line 29, 29, 29, 30"><span class="token sort_Id">name</span></a></span><span class="operator">)</span>  <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#paths_606_611" id="paths_574_579" title="Referenced at line 29, 30"><span class="token sort_Id">paths</span></a></span><span class="operator">}</span>
    <span class="cons_StxOccurrence"><a href="../name.stx/#Label_348_353" id="Label_585_590" title="Defined at ../name.stx line 20"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_563_567" id="name_591_595" title="Defined at line 28"><span class="token sort_Id">name</span></a></span>}</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_560_561" id="s_600_601" title="Defined at line 28"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="cons_Var"><a href="#paths_574_579" id="paths_606_611" title="Defined at line 28"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span>
    <a href="#resolveLabels_661_674" id="resolveLabels_617_630" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_563_567" id="name_631_635" title="Defined at line 28"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#paths_574_579" id="paths_637_642" title="Defined at line 28"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_66_75" id="NON_EMPTY_644_653" title="Defined at ../util.stx line 6"><span class="token sort_Id">NON_EMPTY</span></a>()</span><span class="operator">).</span>

  <a href="#resolveLabels_617_630" id="resolveLabels_661_674" title="Referenced at line 30, 33, 35, 36, 37"><span class="token sort_Id">resolveLabels</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="cons_OccurrenceSort">occurrence</span><span class="operator">))</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../util.stx/#EMPTINESS_39_48" id="EMPTINESS_714_723" title="Defined at ../util.stx line 5"><span class="token sort_Id">EMPTINESS</span></a></span>
  <a href="#resolveLabels_661_674" id="resolveLabels_726_739" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_787_791" id="name_740_744" title="Referenced at line 34, 35"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="cons_StxOccurrence"><span class="operator">(</span><a href="../name.stx/#Label_151_156" id="Label_752_757" title="Defined at ../name.stx line 13"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name'_799_804" id="name'_758_763" title="Referenced at line 34"><span class="token sort_Id">name'</span></a></span>})</span><span class="operator">)|</span><span class="cons_Var"><a href="#labels_830_836" id="labels_767_773" title="Referenced at line 35"><span class="keyword">labels</span></a></span><span class="operator">],</span> <span class="operator">_)</span> <span class="operator">:-</span>
    <span class="operator">@</span><span class="cons_Var"><a href="#name_740_744" id="name_787_791" title="Defined at line 33"><span class="token sort_Id">name</span></a></span><span class="operator">.</span><span class="keyword">ref</span> <span class="operator">+=</span> <span class="cons_Var"><a href="#name'_758_763" id="name'_799_804" title="Defined at line 33"><span class="token sort_Id">name'</span></a></span><span class="operator">,</span>
    <a href="#resolveLabels_661_674" id="resolveLabels_810_823" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_740_744" id="name_824_828" title="Defined at line 33"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#labels_767_773" id="labels_830_836" title="Defined at line 33"><span class="keyword">labels</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_94_105" id="MAYBE_EMPTY_838_849" title="Defined at ../util.stx line 7"><span class="token sort_Id">MAYBE_EMPTY</span></a>()</span><span class="operator">).</span>
  <a href="#resolveLabels_661_674" id="resolveLabels_856_869" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_919_923" id="name_870_874" title="Referenced at line 36, 36"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_66_75" id="NON_EMPTY_880_889" title="Defined at ../util.stx line 6"><span class="token sort_Id">NON_EMPTY</span></a>()</span><span class="operator">)</span> <span class="operator">:-</span> <span class="keyword">false</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Label </span><span class="operator">[</span><span class="cons_Var"><a href="#name_870_874" id="name_919_923" title="Defined at line 36"><span class="token sort_Id">name</span></a></span><span class="operator">]</span><span class="cons_Text"> is not defined</span><span class="operator">]@</span><span class="cons_Var"><a href="#name_870_874" id="name_941_945" title="Defined at line 36"><span class="token sort_Id">name</span></a></span><span class="operator">.</span>
  <a href="#resolveLabels_661_674" id="resolveLabels_949_962" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><span id="name_963_967" title="Not referenced locally, nor via imports"><span class="token sort_Id">name</span></span></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_94_105" id="MAYBE_EMPTY_973_984" title="Defined at ../util.stx line 7"><span class="token sort_Id">MAYBE_EMPTY</span></a>()</span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>