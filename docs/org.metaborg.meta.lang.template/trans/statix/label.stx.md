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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/label_1_8" title="a definition with multiple references" data-urls="../main.stx/#statix/label line 20_3; ../symbol.stx/#statix/label line 7_3"><span class="token sort_Id">statix/label</span></button>

<span class="keyword">imports</span>
  
  <a href="../name.stx/#statix/name_1_8" id="statix/name_5_3" title="a reference to a single-file definition"><span class="token sort_Id">statix/name</span></a>
  <a href="../util.stx/#statix/util_1_8" id="statix/util_6_3" title="a reference to a single-file definition"><span class="token sort_Id">statix/util</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Label_10_9" title="a definition with multiple references" data-urls="#Label line 11_26, 12_26, 16_20; ../symbol.stx/#Label line 18_19"><span class="token sort_Id">Label</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Quoted_17_14" id="Quoted_11_5" title="a definition with a single reference"><span class="token sort_Id">Quoted</span></a>   <span class="operator">:</span> <span class="cons_StringSort"><span class="keyword">string</span></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Label_10_9" id="Label_11_26" title="a reference to a single-file definition"><span class="token sort_Id">Label</span></a></span></span>
    <span class="cons_OpDecl"><a href="#Unquoted_18_14" id="Unquoted_12_5" title="a definition with a single reference"><span class="token sort_Id">Unquoted</span></a> <span class="operator">:</span> <span class="cons_StringSort"><span class="keyword">string</span></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Label_10_9" id="Label_12_26" title="a reference to a single-file definition"><span class="token sort_Id">Label</span></a></span></span>

<span class="keyword">rules</span>

  <button class="modal-open" id="labelOK_16_3" title="a definition with multiple references" data-urls="#labelOK line 17_3, 18_3; ../symbol.stx/#labelOK line 53_5"><span class="token sort_Id">labelOK</span></button><span class="operator">:</span> <span class="cons_ScopeSort"><span class="keyword">scope</span></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Label_10_9" id="Label_16_20" title="a reference to a single-file definition"><span class="token sort_Id">Label</span></a></span>
  <a href="#labelOK_16_3" id="labelOK_17_3" title="a reference to a single-file definition"><span class="token sort_Id">labelOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_46" id="s_17_11" title="a definition with a single reference"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Quoted_11_5" id="Quoted_17_14" title="a reference to a single-file definition"><span class="token sort_Id">Quoted</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_17_49" id="name_17_21" title="a definition with a single reference"><span class="token sort_Id">name</span></a></span><span class="operator">)</span></span><span class="operator">)</span>   <span class="operator">:-</span> <a href="#declareLabel_22_3" id="declareLabel_17_33" title="a reference to a single-file definition"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_11" id="s_17_46" title="a reference to a single-file definition"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_17_21" id="name_17_49" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">).</span>
  <a href="#labelOK_16_3" id="labelOK_18_3" title="a reference to a single-file definition"><span class="token sort_Id">labelOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_46" id="s_18_11" title="a definition with a single reference"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Unquoted_12_5" id="Unquoted_18_14" title="a reference to a single-file definition"><span class="token sort_Id">Unquoted</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_18_49" id="name_18_23" title="a definition with a single reference"><span class="token sort_Id">name</span></a></span><span class="operator">)</span></span><span class="operator">)</span> <span class="operator">:-</span> <a href="#declareLabel_22_3" id="declareLabel_18_33" title="a reference to a single-file definition"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_11" id="s_18_46" title="a reference to a single-file definition"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_18_23" id="name_18_49" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">).</span>

<span class="keyword">rules</span> <span class="layout">// Label reusable predicates</span>

  <button class="modal-open" id="declareLabel_22_3" title="a definition with multiple references" data-urls="#declareLabel line 17_33, 18_33, 23_3"><span class="token sort_Id">declareLabel</span></button> <span class="operator">:</span> <span class="cons_ScopeSort"><span class="keyword">scope</span></span> <span class="operator">*</span> <span class="cons_StringSort"><span class="keyword">string</span></span>
  <a href="#declareLabel_22_3" id="declareLabel_23_3" title="a reference to a single-file definition"><span class="token sort_Id">declareLabel</span></a><span class="operator">(</span><span class="cons_Var"><button class="modal-open" id="s_23_16" title="a definition with multiple references" data-urls="#s line 24_5, 25_20"><span class="token sort_Id">s</span></button></span><span class="operator">,</span> <span class="cons_Var"><button class="modal-open" id="name_23_19" title="a definition with multiple references" data-urls="#name line 24_16, 25_11, 25_11, 25_11, 25_78, 25_85"><span class="token sort_Id">name</span></button></span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="cons_StxOccurrence"><a href="../name.stx/#Label_13_5" id="Label_24_10" title="a reference to a single-file definition"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_23_19" id="name_24_16" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">}</span></span><span class="operator">,</span>
    <span class="cons_StxOccurrence"><a href="../name.stx/#Label_13_5" id="Label_25_5" title="a reference to a single-file definition"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_23_19" id="name_25_11" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">}</span></span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_23_16" id="s_25_20" title="a reference to a single-file definition"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[(_,</span> <span class="operator">(_))]</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Duplicate definition of label </span><span class="operator">[</span><span class="cons_Var"><a href="#name_23_19" id="name_25_78" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">]]@</span><span class="cons_Var"><a href="#name_23_19" id="name_25_85" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">.</span>

  <a href="#resolveLabel_28_3" id="resolveLabel_27_3" title="a definition with a single reference"><span class="token sort_Id">resolveLabel</span></a> <span class="operator">:</span> <span class="cons_ScopeSort"><span class="keyword">scope</span></span> <span class="operator">*</span> <span class="cons_StringSort"><span class="keyword">string</span></span>
  <a href="#resolveLabel_27_3" id="resolveLabel_28_3" title="a reference to a single-file definition"><span class="token sort_Id">resolveLabel</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_29_20" id="s_28_16" title="a definition with a single reference"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><button class="modal-open" id="name_28_19" title="a definition with multiple references" data-urls="#name line 29_11, 29_11, 29_11, 30_19"><span class="token sort_Id">name</span></button></span><span class="operator">)</span>  <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><button class="modal-open" id="paths_28_30" title="a definition with multiple references" data-urls="#paths line 29_26, 30_25"><span class="token sort_Id">paths</span></button></span><span class="operator">}</span>
    <span class="cons_StxOccurrence"><a href="../name.stx/#Label_20_13" id="Label_29_5" title="a reference to a single-file definition"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name_28_19" id="name_29_11" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">}</span></span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_28_16" id="s_29_20" title="a reference to a single-file definition"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="cons_Var"><a href="#paths_28_30" id="paths_29_26" title="a reference to a single-file definition"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span>
    <a href="#resolveLabels_32_3" id="resolveLabels_30_5" title="a reference to a single-file definition"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_28_19" id="name_30_19" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#paths_28_30" id="paths_30_25" title="a reference to a single-file definition"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_6_5" id="NON_EMPTY_30_32" title="a reference to a single-file definition"><span class="token sort_Id">NON_EMPTY</span></a><span class="operator">()</span></span><span class="operator">).</span>

  <button class="modal-open" id="resolveLabels_32_3" title="a definition with multiple references" data-urls="#resolveLabels line 30_5, 33_3, 35_5, 36_3, 37_3"><span class="token sort_Id">resolveLabels</span></button> <span class="operator">:</span> <span class="cons_StringSort"><span class="keyword">string</span></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_PathSort"><span class="keyword">path</span></span> <span class="operator">*</span> <span class="cons_OccurrenceSort"><span class="keyword">occurrence</span></span><span class="operator">))</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../util.stx/#EMPTINESS_5_9" id="EMPTINESS_32_56" title="a reference to a single-file definition"><span class="token sort_Id">EMPTINESS</span></a></span>
  <a href="#resolveLabels_32_3" id="resolveLabels_33_3" title="a reference to a single-file definition"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><button class="modal-open" id="name_33_17" title="a definition with multiple references" data-urls="#name line 34_6, 35_19"><span class="token sort_Id">name</span></button></span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="cons_StxOccurrence"><span class="operator">(</span><a href="../name.stx/#Label_13_5" id="Label_33_29" title="a reference to a single-file definition"><span class="token sort_Id">Label</span></a><span class="operator">{</span><span class="cons_Var"><a href="#name'_34_18" id="name'_33_35" title="a definition with a single reference"><span class="token sort_Id">name'</span></a></span><span class="operator">})</span></span><span class="operator">)|</span><span class="cons_Var"><a href="#labels_35_25" id="labels_33_44" title="a definition with a single reference"><span class="keyword">labels</span></a></span><span class="operator">],</span> <span class="operator">_)</span> <span class="operator">:-</span>
    <span class="operator">@</span><span class="cons_Var"><a href="#name_33_17" id="name_34_6" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">.</span><span class="keyword">ref</span> <span class="operator">+=</span> <span class="cons_Var"><a href="#name'_33_35" id="name'_34_18" title="a reference to a single-file definition"><span class="token sort_Id">name'</span></a></span><span class="operator">,</span>
    <a href="#resolveLabels_32_3" id="resolveLabels_35_5" title="a reference to a single-file definition"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_33_17" id="name_35_19" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#labels_33_44" id="labels_35_25" title="a reference to a single-file definition"><span class="keyword">labels</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_7_5" id="MAYBE_EMPTY_35_33" title="a reference to a single-file definition"><span class="token sort_Id">MAYBE_EMPTY</span></a><span class="operator">()</span></span><span class="operator">).</span>
  <a href="#resolveLabels_32_3" id="resolveLabels_36_3" title="a reference to a single-file definition"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><button class="modal-open" id="name_36_17" title="a definition with multiple references" data-urls="#name line 36_66, 36_88"><span class="token sort_Id">name</span></button></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_6_5" id="NON_EMPTY_36_27" title="a reference to a single-file definition"><span class="token sort_Id">NON_EMPTY</span></a><span class="operator">()</span></span><span class="operator">)</span> <span class="operator">:-</span> <span class="keyword">false</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Label </span><span class="operator">[</span><span class="cons_Var"><a href="#name_36_17" id="name_36_66" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">]</span><span class="cons_Text"> is not defined</span><span class="operator">]@</span><span class="cons_Var"><a href="#name_36_17" id="name_36_88" title="a reference to a single-file definition"><span class="token sort_Id">name</span></a></span><span class="operator">.</span>
  <a href="#resolveLabels_32_3" id="resolveLabels_37_3" title="a reference to a single-file definition"><span class="token sort_Id">resolveLabels</span></a><span class="operator">(</span><span class="cons_Var"><span id="name_37_17" title="a definition with no references"><span class="token sort_Id">name</span></span></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_7_5" id="MAYBE_EMPTY_37_27" title="a reference to a single-file definition"><span class="token sort_Id">MAYBE_EMPTY</span></a><span class="operator">()</span></span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
