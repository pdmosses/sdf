---
title: attribute.stx
hide:
  - toc
---

# `attribute.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/attribute.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/attribute.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/attribute.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/attribute_0_7" title="Multi-file references" data-urls="../main.stx/#statix/attribute_19_3 ../production.stx/#statix/attribute_6_3 ../section/syntax.stx/#statix/attribute_12_3 ../section/template.stx/#statix/attribute_11_3"><span class="token sort_Id">statix/attribute</span></button>

<span class="keyword">imports</span>

  <a href="../util.stx/#statix/util_0_7" id="statix/util_4_2" title="Defined at ../util.stx line 1"><span class="token sort_Id">statix/util</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Attributes_8_8" title="Multi-file references" data-urls="#Attributes_10_34 ../production.stx/#Attributes_11_33 ../section/syntax.stx/#Attributes_29_36 ../section/template.stx/#Attributes_19_57"><span class="token sort_Id">Attributes</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Attrs_22_13" id="Attrs_9_4" title="Referenced at line 23"><span class="token sort_Id">Attrs</span></a>   <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_12_8" id="Attribute_9_19" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Attributes_8_8" id="Attributes_9_33" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span></span>
    <span class="cons_OpDecl"><a href="#NoAttrs_23_13" id="NoAttrs_10_4" title="Referenced at line 24"><span class="token sort_Id">NoAttrs</span></a> <span class="operator">:</span>                    <span class="cons_SimpleSort"><a href="#Attributes_8_8" id="Attributes_10_33" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Attribute_9_19" id="Attribute_12_8" title="Referenced at line 10, 14, 15, 19, 22, 26"><span class="token sort_Id">Attribute</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><span id="Reject_13_4" title="Not referenced locally, nor via imports"><span class="token sort_Id">Reject</span></span>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_12_8" id="Attribute_13_14" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span></span>
    <span class="cons_OpDecl"><span id="Bracket_14_4" title="Not referenced locally, nor via imports"><span class="token sort_Id">Bracket</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_12_8" id="Attribute_14_14" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span></span>

<span class="keyword">rules</span>

  <a href="#hasAttribute_19_2" id="hasAttribute_18_2" title="Referenced at line 20"><span class="token sort_Id">hasAttribute</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_12_8" id="Attribute_18_16" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Attributes_8_8" id="Attributes_18_28" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../util.stx/#BOOL_10_8" id="BOOL_18_42" title="Defined at ../util.stx line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#hasAttribute_18_2" id="hasAttribute_19_2" title="Defined at line 19"><span class="token sort_Id">hasAttribute</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_19_15" title="Not referenced locally, nor via imports"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="cons_Var">attrs</span><span class="operator">)</span> <span class="operator">=</span> <a href="#hasAttributeInList_25_2" id="hasAttributeInList_19_30" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var">attr</span><span class="operator">,</span> <a href="#attributes_21_2" id="attributes_19_55" title="Defined at line 22"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Var"><span id="attrs_19_66" title="Not referenced locally, nor via imports"><span class="token sort_Id">attrs</span></span></span><span class="operator">)).</span>

  <a href="#attributes_19_55" id="attributes_21_2" title="Referenced at line 20, 23, 24"><span class="token sort_Id">attributes</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attributes_8_8" id="Attributes_21_14" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_12_8" id="Attribute_21_33" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span>
  <a href="#attributes_21_2" id="attributes_22_2" title="Defined at line 22"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Op"><a href="#Attrs_9_4" id="Attrs_22_13" title="Defined at line 10"><span class="token sort_Id">Attrs</span></a><span class="operator">(</span><span class="cons_Var"><span id="attributes_22_19" title="Not referenced locally, nor via imports"><span class="token sort_Id">attributes</span></span></span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var">attributes</span><span class="operator">.</span>
  <a href="#attributes_21_2" id="attributes_23_2" title="Defined at line 22"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Op"><a href="#NoAttrs_10_4" id="NoAttrs_23_13" title="Defined at line 11"><span class="token sort_Id">NoAttrs</span></a>()</span><span class="operator">)</span>         <span class="operator">=</span> <span class="operator">[].</span>

  <a href="#hasAttributeInList_19_30" id="hasAttributeInList_25_2" title="Referenced at line 20, 27, 28, 29"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_12_8" id="Attribute_25_22" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_12_8" id="Attribute_25_39" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../util.stx/#BOOL_10_8" id="BOOL_25_53" title="Defined at ../util.stx line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#hasAttributeInList_25_2" id="hasAttributeInList_26_2" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_26_21" title="Not referenced locally, nor via imports"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var">attr</span><span class="operator">|_])</span> <span class="operator">=</span> <span class="cons_Op"><a href="../util.stx/#TRUE_11_4" id="TRUE_26_39" title="Defined at ../util.stx line 12"><span class="token sort_Id">TRUE</span></a>()</span><span class="operator">.</span>
  <a href="#hasAttributeInList_25_2" id="hasAttributeInList_27_2" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_27_21" title="Not referenced locally, nor via imports"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="operator">[_</span>   <span class="operator">|</span><span class="cons_Var"><span id="s_27_33" title="Not referenced locally, nor via imports"><span class="token sort_Id">s</span></span></span><span class="operator">])</span> <span class="operator">=</span> <a href="#hasAttributeInList_25_2" id="hasAttributeInList_27_39" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var">attr</span><span class="operator">,</span> <span class="cons_Var">s</span><span class="operator">).</span>
  <a href="#hasAttributeInList_25_2" id="hasAttributeInList_28_2" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_28_21" title="Not referenced locally, nor via imports"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="operator">[</span>      <span class="operator">])</span> <span class="operator">=</span> <span class="cons_Op"><a href="../util.stx/#FALSE_12_4" id="FALSE_28_39" title="Defined at ../util.stx line 13"><span class="token sort_Id">FALSE</span></a>()</span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
