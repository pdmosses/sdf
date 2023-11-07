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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/label_0_7" title="Multi-file references" data-urls="../main.stx/#statix/label_20_3 ../symbol.stx/#statix/label_7_3"><span class="token sort_Id">statix/label</span></button>

<span class="keyword">imports</span>
  
  <a href="../name.stx/#statix/name_0_7" id="statix/name_4_2" title="Defined at ../name.stx line 1"><span class="token sort_Id">statix/name</span></a>
  <a href="../util.stx/#statix/util_0_7" id="statix/util_5_2" title="Defined at ../util.stx line 1"><span class="token sort_Id">statix/util</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Label_9_8" title="Multi-file references" data-urls="#Label_11_26 ../symbol.stx/#Label_18_19"><span class="token sort_Id">Label</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Quoted_16_13" id="Quoted_10_4" title="Referenced at line 17"><span class="token sort_Id">Quoted</span></a>   <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Label_9_8" id="Label_10_25" title="Defined at line 10"><span class="token sort_Id">Label</span></a></span></span>
    <span class="cons_OpDecl"><a href="#Unquoted_17_13" id="Unquoted_11_4" title="Referenced at line 18"><span class="token sort_Id">Unquoted</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Label_9_8" id="Label_11_25" title="Defined at line 10"><span class="token sort_Id">Label</span></a></span></span>

<span class="keyword">rules</span>

  <button class="modal-open" id="labelOK_15_2" title="Multi-file references" data-urls="#labelOK_17_3 ../symbol.stx/#labelOK_53_5"><span class="token sort_Id">labelOK</span></button><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Label_9_8" id="Label_15_19" title="Defined at line 10"><span class="token sort_Id">Label</span></a></span>
  <a href="#labelOK_15_2" id="labelOK_16_2" title="Defined at line 16"><span class="token sort_Id">labelOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_16_45" id="s_16_10" title="Referenced at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Quoted_10_4" id="Quoted_16_13" title="Defined at line 11"><span class="token sort_Id">Quoted</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_16_48" id="name_16_20" title="Referenced at line 17"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span>   <span class="operator">:-</span> <a href="#declareLabel_21_2" id="declareLabel_16_32" title="Defined at line 22"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_16_10" id="s_16_45" title="Defined at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_16_20" id="name_16_48" title="Defined at line 17"><span class="token sort_Id">name</span></a></span><span class="operator">).</span>
  <a href="#labelOK_15_2" id="labelOK_17_2" title="Defined at line 16"><span class="token sort_Id">labelOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_45" id="s_17_10" title="Referenced at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Unquoted_11_4" id="Unquoted_17_13" title="Defined at line 12"><span class="token sort_Id">Unquoted</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_17_48" id="name_17_22" title="Referenced at line 18"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#declareLabel_21_2" id="declareLabel_17_32" title="Defined at line 22"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_10" id="s_17_45" title="Defined at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_17_22" id="name_17_48" title="Defined at line 18"><span class="token sort_Id">name</span></a></span><span class="operator">).</span>

<span class="keyword">rules</span> <span class="layout">// Label reusable predicates</span>

  <a href="#declareLabel_16_32" id="declareLabel_21_2" title="Referenced at line 17, 18, 23"><span class="token sort_Id">declareLabel</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_StringSort">string</span>
  <a href="#declareLabel_21_2" id="declareLabel_22_2" title="Defined at line 22"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_23_4" id="s_22_15" title="Referenced at line 24, 25"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_23_15" id="name_22_18" title="Referenced at line 24, 25"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="cons_StxOccurrence"><a href="../name.stx/#Label_12_4" id="Label_23_9" title="Defined at ../name.stx line 13"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_22_18" id="name_23_15" title="Defined at line 23"><span class="token sort_Id">name</span></a></span>}</span><span class="operator">,</span>
    <span class="cons_StxOccurrence"><a href="../name.stx/#Label_12_4" id="Label_24_4" title="Defined at ../name.stx line 13"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_22_18" id="name_24_10" title="Defined at line 23"><span class="token sort_Id">name</span></a></span>}</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_22_15" id="s_24_19" title="Defined at line 23"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[(_,</span> <span class="operator">(_))]</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Duplicate definition of label </span><span class="operator">[</span><span class="cons_Var"><a href="#name_22_18" id="name_24_77" title="Defined at line 23"><span class="token sort_Id">name</span></a></span><span class="operator">]]@</span><span class="cons_Var"><a href="#name_22_18" id="name_24_84" title="Defined at line 23"><span class="token sort_Id">name</span></a></span><span class="operator">.</span>

  <a href="#resolveLabel_27_2" id="resolveLabel_26_2" title="Referenced at line 28"><span class="token sort_Id">resolveLabel</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_StringSort">string</span>
  <a href="#resolveLabel_26_2" id="resolveLabel_27_2" title="Defined at line 27"><span class="token sort_Id">resolveLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_28_19" id="s_27_15" title="Referenced at line 29"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_28_10" id="name_27_18" title="Referenced at line 29, 30"><span class="token sort_Id">name</span></a></span><span class="operator">)</span>  <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#paths_28_25" id="paths_27_29" title="Referenced at line 29, 30"><span class="token sort_Id">paths</span></a></span><span class="operator">}</span>
    <span class="cons_StxOccurrence"><a href="../name.stx/#Label_19_12" id="Label_28_4" title="Defined at ../name.stx line 20"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_27_18" id="name_28_10" title="Defined at line 28"><span class="token sort_Id">name</span></a></span>}</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_27_15" id="s_28_19" title="Defined at line 28"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="cons_Var"><a href="#paths_27_29" id="paths_28_25" title="Defined at line 28"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span>
    <a href="#resolveLabels_31_2" id="resolveLabels_29_4" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_27_18" id="name_29_18" title="Defined at line 28"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#paths_27_29" id="paths_29_24" title="Defined at line 28"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_5_4" id="NON_EMPTY_29_31" title="Defined at ../util.stx line 6"><span class="token sort_Id">NON_EMPTY</span></a>()</span><span class="operator">).</span>

  <a href="#resolveLabels_29_4" id="resolveLabels_31_2" title="Referenced at line 30, 33, 35, 36, 37"><span class="token sort_Id">resolveLabels</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="cons_OccurrenceSort">occurrence</span><span class="operator">))</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../util.stx/#EMPTINESS_4_8" id="EMPTINESS_31_55" title="Defined at ../util.stx line 5"><span class="token sort_Id">EMPTINESS</span></a></span>
  <a href="#resolveLabels_31_2" id="resolveLabels_32_2" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_33_5" id="name_32_16" title="Referenced at line 34, 35"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="cons_StxOccurrence"><span class="operator">(</span><a href="../name.stx/#Label_12_4" id="Label_32_28" title="Defined at ../name.stx line 13"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name'_33_17" id="name'_32_34" title="Referenced at line 34"><span class="token sort_Id">name'</span></a></span>})</span><span class="operator">)|</span><span class="cons_Var"><a href="#labels_34_24" id="labels_32_43" title="Referenced at line 35"><span class="keyword">labels</span></a></span><span class="operator">],</span> <span class="operator">_)</span> <span class="operator">:-</span>
    <span class="operator">@</span><span class="cons_Var"><a href="#name_32_16" id="name_33_5" title="Defined at line 33"><span class="token sort_Id">name</span></a></span><span class="operator">.</span><span class="keyword">ref</span> <span class="operator">+=</span> <span class="cons_Var"><a href="#name'_32_34" id="name'_33_17" title="Defined at line 33"><span class="token sort_Id">name'</span></a></span><span class="operator">,</span>
    <a href="#resolveLabels_31_2" id="resolveLabels_34_4" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_32_16" id="name_34_18" title="Defined at line 33"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#labels_32_43" id="labels_34_24" title="Defined at line 33"><span class="keyword">labels</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_6_4" id="MAYBE_EMPTY_34_32" title="Defined at ../util.stx line 7"><span class="token sort_Id">MAYBE_EMPTY</span></a>()</span><span class="operator">).</span>
  <a href="#resolveLabels_31_2" id="resolveLabels_35_2" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_35_65" id="name_35_16" title="Referenced at line 36"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_5_4" id="NON_EMPTY_35_26" title="Defined at ../util.stx line 6"><span class="token sort_Id">NON_EMPTY</span></a>()</span><span class="operator">)</span> <span class="operator">:-</span> <span class="keyword">false</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Label </span><span class="operator">[</span><span class="cons_Var"><a href="#name_35_16" id="name_35_65" title="Defined at line 36"><span class="token sort_Id">name</span></a></span><span class="operator">]</span><span class="cons_Text"> is not defined</span><span class="operator">]@</span><span class="cons_Var"><a href="#name_35_16" id="name_35_87" title="Defined at line 36"><span class="token sort_Id">name</span></a></span><span class="operator">.</span>
  <a href="#resolveLabels_31_2" id="resolveLabels_36_2" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><span id="name_36_16" title="Not referenced locally, nor via imports"><span class="token sort_Id">name</span></span></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_6_4" id="MAYBE_EMPTY_36_26" title="Defined at ../util.stx line 7"><span class="token sort_Id">MAYBE_EMPTY</span></a>()</span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
