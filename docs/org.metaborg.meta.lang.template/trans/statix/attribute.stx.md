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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/attribute_1_8" title="Multi-file references" data-urls="../main.stx/#statix/attribute_19_3 line 19; ../production.stx/#statix/attribute_6_3 line 6; ../section/syntax.stx/#statix/attribute_12_3 line 12; ../section/template.stx/#statix/attribute_11_3 line 11"><span class="token sort_Id">statix/attribute</span></button>

<span class="keyword">imports</span>

  <a href="../util.stx/#statix/util_1_8" id="statix/util_5_3" title="Defined at ../util.stx line 1"><span class="token sort_Id">statix/util</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Attributes_9_9" title="Multi-file references" data-urls="#Attributes_10_34 line 10, 11, 19, 22; ../production.stx/#Attributes_11_33 line 11; ../section/syntax.stx/#Attributes_29_36 line 29, 36, 37; ../section/template.stx/#Attributes_19_57 line 19, 20, 99"><span class="token sort_Id">Attributes</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Attrs_23_14" id="Attrs_10_5" title="Referenced at line 23"><span class="token sort_Id">Attrs</span></a>   <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_10_20" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Attributes_9_9" id="Attributes_10_34" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span></span>
    <span class="cons_OpDecl"><a href="#NoAttrs_24_14" id="NoAttrs_11_5" title="Referenced at line 24"><span class="token sort_Id">NoAttrs</span></a> <span class="operator">:</span>                    <span class="cons_SimpleSort"><a href="#Attributes_9_9" id="Attributes_11_34" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Attribute_10_20" id="Attribute_13_9" title="Referenced at line 10, 14, 15, 19, 22, 26"><span class="token sort_Id">Attribute</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><span id="Reject_14_5" title="Not referenced"><span class="token sort_Id">Reject</span></span>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_14_15" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span></span>
    <span class="cons_OpDecl"><span id="Bracket_15_5" title="Not referenced"><span class="token sort_Id">Bracket</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_15_15" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span></span>

<span class="keyword">rules</span>

  <a href="#hasAttribute_20_3" id="hasAttribute_19_3" title="Referenced at line 20"><span class="token sort_Id">hasAttribute</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_19_17" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Attributes_9_9" id="Attributes_19_29" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../util.stx/#BOOL_11_9" id="BOOL_19_43" title="Defined at ../util.stx line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#hasAttribute_19_3" id="hasAttribute_20_3" title="Defined at line 19"><span class="token sort_Id">hasAttribute</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_20_16" title="Not referenced"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="cons_Var">attrs</span><span class="operator">)</span> <span class="operator">=</span> <a href="#hasAttributeInList_26_3" id="hasAttributeInList_20_31" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var">attr</span><span class="operator">,</span> <a href="#attributes_22_3" id="attributes_20_56" title="Defined at line 22"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Var"><span id="attrs_20_67" title="Not referenced"><span class="token sort_Id">attrs</span></span></span><span class="operator">)).</span>

  <a href="#attributes_20_56" id="attributes_22_3" title="Referenced at line 20, 23, 24"><span class="token sort_Id">attributes</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attributes_9_9" id="Attributes_22_15" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_22_34" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span>
  <a href="#attributes_22_3" id="attributes_23_3" title="Defined at line 22"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Op"><a href="#Attrs_10_5" id="Attrs_23_14" title="Defined at line 10"><span class="token sort_Id">Attrs</span></a><span class="operator">(</span><span class="cons_Var"><span id="attributes_23_20" title="Not referenced"><span class="token sort_Id">attributes</span></span></span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var">attributes</span><span class="operator">.</span>
  <a href="#attributes_22_3" id="attributes_24_3" title="Defined at line 22"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Op"><a href="#NoAttrs_11_5" id="NoAttrs_24_14" title="Defined at line 11"><span class="token sort_Id">NoAttrs</span></a>()</span><span class="operator">)</span>         <span class="operator">=</span> <span class="operator">[].</span>

  <a href="#hasAttributeInList_20_31" id="hasAttributeInList_26_3" title="Referenced at line 20, 27, 28, 29"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_26_23" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_26_40" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../util.stx/#BOOL_11_9" id="BOOL_26_54" title="Defined at ../util.stx line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#hasAttributeInList_26_3" id="hasAttributeInList_27_3" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_27_22" title="Not referenced"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var">attr</span><span class="operator">|_])</span> <span class="operator">=</span> <span class="cons_Op"><a href="../util.stx/#TRUE_12_5" id="TRUE_27_40" title="Defined at ../util.stx line 12"><span class="token sort_Id">TRUE</span></a>()</span><span class="operator">.</span>
  <a href="#hasAttributeInList_26_3" id="hasAttributeInList_28_3" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var">attr</span><span class="operator">,</span> <span class="operator">[_</span>   <span class="operator">|</span><span class="cons_Var">s</span><span class="operator">])</span> <span class="operator">=</span> <a href="#hasAttributeInList_26_3" id="hasAttributeInList_28_40" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_28_59" title="Not referenced"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="s_28_65" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">).</span>
  <a href="#hasAttributeInList_26_3" id="hasAttributeInList_29_3" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_29_22" title="Not referenced"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="operator">[</span>      <span class="operator">])</span> <span class="operator">=</span> <span class="cons_Op"><a href="../util.stx/#FALSE_13_5" id="FALSE_29_40" title="Defined at ../util.stx line 13"><span class="token sort_Id">FALSE</span></a>()</span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
