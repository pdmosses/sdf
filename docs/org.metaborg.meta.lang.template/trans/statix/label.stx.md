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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/label_1_8" title="Multi-file references" data-urls="../main.stx/#statix/label_20_3 line 20; ../symbol.stx/#statix/label_7_3 line 7"><span class="token sort_Id">statix/label</span></button>

<span class="keyword">imports</span>
  
  <a href="../name.stx/#statix/name_1_8" id="statix/name_5_3" title="Defined at ../name.stx line 1"><span class="token sort_Id">statix/name</span></a>
  <a href="../util.stx/#statix/util_1_8" id="statix/util_6_3" title="Defined at ../util.stx line 1"><span class="token sort_Id">statix/util</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Label_10_9" title="Multi-file references" data-urls="#Label_11_26 line 11, 12, 16; ../symbol.stx/#Label_18_19 line 18"><span class="token sort_Id">Label</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Quoted_17_14" id="Quoted_11_5" title="Referenced at line 17"><span class="token sort_Id">Quoted</span></a>   <span class="operator">:</span> <span class="cons_StringSort"><span class="keyword">string</span></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Label_10_9" id="Label_11_26" title="Defined at line 10"><span class="token sort_Id">Label</span></a></span></span>
    <span class="cons_OpDecl"><a href="#Unquoted_18_14" id="Unquoted_12_5" title="Referenced at line 18"><span class="token sort_Id">Unquoted</span></a> <span class="operator">:</span> <span class="cons_StringSort"><span class="keyword">string</span></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Label_10_9" id="Label_12_26" title="Defined at line 10"><span class="token sort_Id">Label</span></a></span></span>

<span class="keyword">rules</span>

  <button class="modal-open" id="labelOK_16_3" title="Multi-file references" data-urls="#labelOK_17_3 line 17, 18; ../symbol.stx/#labelOK_53_5 line 53"><span class="token sort_Id">labelOK</span></button><span class="operator">:</span> <span class="cons_ScopeSort"><span class="keyword">scope</span></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Label_10_9" id="Label_16_20" title="Defined at line 10"><span class="token sort_Id">Label</span></a></span>
  <a href="#labelOK_16_3" id="labelOK_17_3" title="Defined at line 16"><span class="token sort_Id">labelOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_46" id="s_17_11" title="Referenced at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Quoted_11_5" id="Quoted_17_14" title="Defined at line 11"><span class="token sort_Id">Quoted</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_17_49" id="name_17_21" title="Referenced at line 17"><span class="token sort_Id">name</span></a></span><span class="operator">)</span></span><span class="operator">)</span>   <span class="operator">:-</span> <a href="#declareLabel_22_3" id="declareLabel_17_33" title="Defined at line 22"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_11" id="s_17_46" title="Defined at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_17_21" id="name_17_49" title="Defined at line 17"><span class="token sort_Id">name</span></a></span><span class="operator">).</span>
  <a href="#labelOK_16_3" id="labelOK_18_3" title="Defined at line 16"><span class="token sort_Id">labelOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_46" id="s_18_11" title="Referenced at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Unquoted_12_5" id="Unquoted_18_14" title="Defined at line 12"><span class="token sort_Id">Unquoted</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_18_49" id="name_18_23" title="Referenced at line 18"><span class="token sort_Id">name</span></a></span><span class="operator">)</span></span><span class="operator">)</span> <span class="operator">:-</span> <a href="#declareLabel_22_3" id="declareLabel_18_33" title="Defined at line 22"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_11" id="s_18_46" title="Defined at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_18_23" id="name_18_49" title="Defined at line 18"><span class="token sort_Id">name</span></a></span><span class="operator">).</span>

<span class="keyword">rules</span> <span class="layout">// Label reusable predicates</span>

  <a href="#declareLabel_17_33" id="declareLabel_22_3" title="Referenced at line 17, 18, 23"><span class="token sort_Id">declareLabel</span></a> <span class="operator">:</span> <span class="cons_ScopeSort"><span class="keyword">scope</span></span> <span class="operator">*</span> <span class="cons_StringSort"><span class="keyword">string</span></span>
  <a href="#declareLabel_22_3" id="declareLabel_23_3" title="Defined at line 22"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_24_5" id="s_23_16" title="Referenced at line 24, 25"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_24_16" id="name_23_19" title="Referenced at line 24, 25"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="cons_StxOccurrence"><a href="../name.stx/#Label_13_5" id="Label_24_10" title="Defined at ../name.stx line 13"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_23_19" id="name_24_16" title="Defined at line 23"><span class="token sort_Id">name</span></a></span><span class="operator">}</span></span><span class="operator">,</span>
    <span class="cons_StxOccurrence"><a href="../name.stx/#Label_13_5" id="Label_25_5" title="Defined at ../name.stx line 13"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_23_19" id="name_25_11" title="Defined at line 23"><span class="token sort_Id">name</span></a></span><span class="operator">}</span></span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_23_16" id="s_25_20" title="Defined at line 23"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[(_,</span> <span class="operator">(_))]</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Duplicate definition of label </span><span class="operator">[</span><span class="cons_Var"><a href="#name_23_19" id="name_25_78" title="Defined at line 23"><span class="token sort_Id">name</span></a></span><span class="operator">]]@</span><span class="cons_Var"><a href="#name_23_19" id="name_25_85" title="Defined at line 23"><span class="token sort_Id">name</span></a></span><span class="operator">.</span>

  <a href="#resolveLabel_28_3" id="resolveLabel_27_3" title="Referenced at line 28"><span class="token sort_Id">resolveLabel</span></a> <span class="operator">:</span> <span class="cons_ScopeSort"><span class="keyword">scope</span></span> <span class="operator">*</span> <span class="cons_StringSort"><span class="keyword">string</span></span>
  <a href="#resolveLabel_27_3" id="resolveLabel_28_3" title="Defined at line 27"><span class="token sort_Id">resolveLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_29_20" id="s_28_16" title="Referenced at line 29"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_29_11" id="name_28_19" title="Referenced at line 29, 30"><span class="token sort_Id">name</span></a></span><span class="operator">)</span>  <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#paths_29_26" id="paths_28_30" title="Referenced at line 29, 30"><span class="token sort_Id">paths</span></a></span><span class="operator">}</span>
    <span class="cons_StxOccurrence"><a href="../name.stx/#Label_20_13" id="Label_29_5" title="Defined at ../name.stx line 20"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_28_19" id="name_29_11" title="Defined at line 28"><span class="token sort_Id">name</span></a></span><span class="operator">}</span></span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_28_16" id="s_29_20" title="Defined at line 28"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="cons_Var"><a href="#paths_28_30" id="paths_29_26" title="Defined at line 28"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span>
    <a href="#resolveLabels_32_3" id="resolveLabels_30_5" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_28_19" id="name_30_19" title="Defined at line 28"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#paths_28_30" id="paths_30_25" title="Defined at line 28"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_6_5" id="NON_EMPTY_30_32" title="Defined at ../util.stx line 6"><span class="token sort_Id">NON_EMPTY</span></a><span class="operator">()</span></span><span class="operator">).</span>

  <a href="#resolveLabels_30_5" id="resolveLabels_32_3" title="Referenced at line 30, 33, 35, 36, 37"><span class="token sort_Id">resolveLabels</span></a> <span class="operator">:</span> <span class="cons_StringSort"><span class="keyword">string</span></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_PathSort"><span class="keyword">path</span></span> <span class="operator">*</span> <span class="cons_OccurrenceSort"><span class="keyword">occurrence</span></span><span class="operator">))</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../util.stx/#EMPTINESS_5_9" id="EMPTINESS_32_56" title="Defined at ../util.stx line 5"><span class="token sort_Id">EMPTINESS</span></a></span>
  <a href="#resolveLabels_32_3" id="resolveLabels_33_3" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_34_6" id="name_33_17" title="Referenced at line 34, 35"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="cons_StxOccurrence"><span class="operator">(</span><a href="../name.stx/#Label_13_5" id="Label_33_29" title="Defined at ../name.stx line 13"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name'_34_18" id="name'_33_35" title="Referenced at line 34"><span class="token sort_Id">name'</span></a></span><span class="operator">})</span></span><span class="operator">)|</span><span class="cons_Var"><a href="#labels_35_25" id="labels_33_44" title="Referenced at line 35"><span class="keyword">labels</span></a></span><span class="operator">],</span> <span class="operator">_)</span> <span class="operator">:-</span>
    <span class="operator">@</span><span class="cons_Var"><a href="#name_33_17" id="name_34_6" title="Defined at line 33"><span class="token sort_Id">name</span></a></span><span class="operator">.</span><span class="keyword">ref</span> <span class="operator">+=</span> <span class="cons_Var"><a href="#name'_33_35" id="name'_34_18" title="Defined at line 33"><span class="token sort_Id">name'</span></a></span><span class="operator">,</span>
    <a href="#resolveLabels_32_3" id="resolveLabels_35_5" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_33_17" id="name_35_19" title="Defined at line 33"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#labels_33_44" id="labels_35_25" title="Defined at line 33"><span class="keyword">labels</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_7_5" id="MAYBE_EMPTY_35_33" title="Defined at ../util.stx line 7"><span class="token sort_Id">MAYBE_EMPTY</span></a><span class="operator">()</span></span><span class="operator">).</span>
  <a href="#resolveLabels_32_3" id="resolveLabels_36_3" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_36_66" id="name_36_17" title="Referenced at line 36"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_6_5" id="NON_EMPTY_36_27" title="Defined at ../util.stx line 6"><span class="token sort_Id">NON_EMPTY</span></a><span class="operator">()</span></span><span class="operator">)</span> <span class="operator">:-</span> <span class="keyword">false</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Label </span><span class="operator">[</span><span class="cons_Var"><a href="#name_36_17" id="name_36_66" title="Defined at line 36"><span class="token sort_Id">name</span></a></span><span class="operator">]</span><span class="cons_Text"> is not defined</span><span class="operator">]@</span><span class="cons_Var"><a href="#name_36_17" id="name_36_88" title="Defined at line 36"><span class="token sort_Id">name</span></a></span><span class="operator">.</span>
  <a href="#resolveLabels_32_3" id="resolveLabels_37_3" title="Defined at line 32"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><span id="name_37_17" title="Not referenced"><span class="token sort_Id">name</span></span></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_7_5" id="MAYBE_EMPTY_37_27" title="Defined at ../util.stx line 7"><span class="token sort_Id">MAYBE_EMPTY</span></a><span class="operator">()</span></span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
