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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/attribute_1_8" title="a definition with multiple references" data-urls="../main.stx/#statix/attribute line 19_3; ../production.stx/#statix/attribute line 6_3; ../section/syntax.stx/#statix/attribute line 12_3; ../section/template.stx/#statix/attribute line 11_3"><span class="token sort_Id">statix/attribute</span></button>

<span class="keyword">imports</span>

  <a href="../util.stx/#statix/util_1_8" id="statix/util_5_3" title="a reference to a single-file definition"><span class="token sort_Id">statix/util</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Attributes_9_9" title="a definition with multiple references" data-urls="#Attributes line 10_34, 11_34, 19_29, 22_15; ../production.stx/#Attributes line 11_33; ../section/syntax.stx/#Attributes line 29_36, 36_47, 37_47; ../section/template.stx/#Attributes line 19_57, 20_57, 99_37"><span class="token sort_Id">Attributes</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Attrs_23_14" id="Attrs_10_5" title="a definition with a single reference"><span class="token sort_Id">Attrs</span></a>   <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_10_20" title="a reference to a single-file definition"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Attributes_9_9" id="Attributes_10_34" title="a reference to a single-file definition"><span class="token sort_Id">Attributes</span></a></span></span>
    <span class="cons_OpDecl"><a href="#NoAttrs_24_14" id="NoAttrs_11_5" title="a definition with a single reference"><span class="token sort_Id">NoAttrs</span></a> <span class="operator">:</span>                    <span class="cons_SimpleSort"><a href="#Attributes_9_9" id="Attributes_11_34" title="a reference to a single-file definition"><span class="token sort_Id">Attributes</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Attribute_13_9" title="a definition with multiple references" data-urls="#Attribute line 10_20, 14_15, 15_15, 19_17, 22_34, 26_23, 26_40"><span class="token sort_Id">Attribute</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><span id="Reject_14_5" title="a definition with no references"><span class="token sort_Id">Reject</span></span>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_14_15" title="a reference to a single-file definition"><span class="token sort_Id">Attribute</span></a></span></span>
    <span class="cons_OpDecl"><span id="Bracket_15_5" title="a definition with no references"><span class="token sort_Id">Bracket</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_15_15" title="a reference to a single-file definition"><span class="token sort_Id">Attribute</span></a></span></span>

<span class="keyword">rules</span>

  <a href="#hasAttribute_20_3" id="hasAttribute_19_3" title="a definition with a single reference"><span class="token sort_Id">hasAttribute</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_19_17" title="a reference to a single-file definition"><span class="token sort_Id">Attribute</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Attributes_9_9" id="Attributes_19_29" title="a reference to a single-file definition"><span class="token sort_Id">Attributes</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../util.stx/#BOOL_11_9" id="BOOL_19_43" title="a reference to a single-file definition"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#hasAttribute_19_3" id="hasAttribute_20_3" title="a reference to a single-file definition"><span class="token sort_Id">hasAttribute</span></a><span class="operator">(</span><span class="cons_Var">attr</span><span class="operator">,</span> <span class="cons_Var"><span id="attrs_20_22" title="a definition with no references"><span class="token sort_Id">attrs</span></span></span><span class="operator">)</span> <span class="operator">=</span> <a href="#hasAttributeInList_26_3" id="hasAttributeInList_20_31" title="a reference to a single-file definition"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_20_50" title="a definition with no references"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <a href="#attributes_22_3" id="attributes_20_56" title="a reference to a single-file definition"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Var">attrs</span><span class="operator">)).</span>

  <button class="modal-open" id="attributes_22_3" title="a definition with multiple references" data-urls="#attributes line 20_56, 23_3, 24_3"><span class="token sort_Id">attributes</span></button><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attributes_9_9" id="Attributes_22_15" title="a reference to a single-file definition"><span class="token sort_Id">Attributes</span></a></span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_22_34" title="a reference to a single-file definition"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span>
  <a href="#attributes_22_3" id="attributes_23_3" title="a reference to a single-file definition"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Op"><a href="#Attrs_10_5" id="Attrs_23_14" title="a reference to a single-file definition"><span class="token sort_Id">Attrs</span></a><span class="operator">(</span><span class="cons_Var">attributes</span><span class="operator">)</span></span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><span id="attributes_23_35" title="a definition with no references"><span class="token sort_Id">attributes</span></span></span><span class="operator">.</span>
  <a href="#attributes_22_3" id="attributes_24_3" title="a reference to a single-file definition"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Op"><a href="#NoAttrs_11_5" id="NoAttrs_24_14" title="a reference to a single-file definition"><span class="token sort_Id">NoAttrs</span></a><span class="operator">()</span></span><span class="operator">)</span>         <span class="operator">=</span> <span class="operator">[].</span>

  <button class="modal-open" id="hasAttributeInList_26_3" title="a definition with multiple references" data-urls="#hasAttributeInList line 20_31, 27_3, 28_3, 28_40, 29_3"><span class="token sort_Id">hasAttributeInList</span></button><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_26_23" title="a reference to a single-file definition"><span class="token sort_Id">Attribute</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_13_9" id="Attribute_26_40" title="a reference to a single-file definition"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../util.stx/#BOOL_11_9" id="BOOL_26_54" title="a reference to a single-file definition"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#hasAttributeInList_26_3" id="hasAttributeInList_27_3" title="a reference to a single-file definition"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var">attr</span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var"><span id="attr_27_29" title="a definition with no references"><span class="token sort_Id">attr</span></span></span><span class="operator">|_])</span> <span class="operator">=</span> <span class="cons_Op"><a href="../util.stx/#TRUE_12_5" id="TRUE_27_40" title="a reference to a single-file definition"><span class="token sort_Id">TRUE</span></a><span class="operator">()</span></span><span class="operator">.</span>
  <a href="#hasAttributeInList_26_3" id="hasAttributeInList_28_3" title="a reference to a single-file definition"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_28_22" title="a definition with no references"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="operator">[_</span>   <span class="operator">|</span><span class="cons_Var">s</span><span class="operator">])</span> <span class="operator">=</span> <a href="#hasAttributeInList_26_3" id="hasAttributeInList_28_40" title="a reference to a single-file definition"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var">attr</span><span class="operator">,</span> <span class="cons_Var"><span id="s_28_65" title="a definition with no references"><span class="token sort_Id">s</span></span></span><span class="operator">).</span>
  <a href="#hasAttributeInList_26_3" id="hasAttributeInList_29_3" title="a reference to a single-file definition"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_29_22" title="a definition with no references"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="operator">[</span>      <span class="operator">])</span> <span class="operator">=</span> <span class="cons_Op"><a href="../util.stx/#FALSE_13_5" id="FALSE_29_40" title="a reference to a single-file definition"><span class="token sort_Id">FALSE</span></a><span class="operator">()</span></span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
