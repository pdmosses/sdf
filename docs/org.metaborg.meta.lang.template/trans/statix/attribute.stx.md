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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.stx/#statix/attribute_337_353" id="statix/attribute_7_23" title="Referenced at ../main.stx line 19; ../production.stx line 6; ../section/syntax.stx line 12; ../section/template.stx line 11"><span class="token sort_Id">statix/attribute</span></a>

<span class="keyword">imports</span>

  <a href="../util.stx/#statix/util_7_18" id="statix/util_36_47" title="Defined at ../util.stx line 1"><span class="token sort_Id">statix/util</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Attributes_125_135" id="Attributes_68_78" title="Referenced at line 10, 11, 19, 22; ../production.stx line 11; ../section/syntax.stx line 29, 36, 37; ../section/template.stx line 19, 20, 99"><span class="token sort_Id">Attributes</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Attrs_448_453" id="Attrs_96_101" title="Referenced at line 23"><span class="token sort_Id">Attrs</span></a>   <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_189_198" id="Attribute_111_120" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Attributes_68_78" id="Attributes_125_135" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span></span>
    <span class="cons_OpDecl"><a href="#NoAttrs_494_501" id="NoAttrs_140_147" title="Referenced at line 24"><span class="token sort_Id">NoAttrs</span></a> <span class="operator">:</span>                    <span class="cons_SimpleSort"><a href="#Attributes_68_78" id="Attributes_169_179" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Attribute_111_120" id="Attribute_189_198" title="Referenced at line 10, 14, 15, 19, 22, 26, 26"><span class="token sort_Id">Attribute</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><span id="Reject_216_222" title="Not referenced locally, nor via imports"><span class="token sort_Id">Reject</span></span>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_189_198" id="Attribute_226_235" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span></span>
    <span class="cons_OpDecl"><span id="Bracket_240_247" title="Not referenced locally, nor via imports"><span class="token sort_Id">Bracket</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_189_198" id="Attribute_250_259" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span></span>

<span class="keyword">rules</span>

  <a href="#hasAttribute_317_329" id="hasAttribute_270_282" title="Referenced at line 20"><span class="token sort_Id">hasAttribute</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_189_198" id="Attribute_284_293" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Attributes_68_78" id="Attributes_296_306" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../util.stx/#BOOL_138_142" id="BOOL_310_314" title="Defined at ../util.stx line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#hasAttribute_270_282" id="hasAttribute_317_329" title="Defined at line 19"><span class="token sort_Id">hasAttribute</span></a><span class="operator">(</span><span class="cons_Var">attr</span><span class="operator">,</span> <span class="cons_Var">attrs</span><span class="operator">)</span> <span class="operator">=</span> <a href="#hasAttributeInList_522_540" id="hasAttributeInList_345_363" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_364_368" title="Not referenced locally, nor via imports"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <a href="#attributes_393_403" id="attributes_370_380" title="Defined at line 22"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Var"><span id="attrs_381_386" title="Not referenced locally, nor via imports"><span class="token sort_Id">attrs</span></span></span><span class="operator">)).</span>

  <a href="#attributes_370_380" id="attributes_393_403" title="Referenced at line 20, 23, 24"><span class="token sort_Id">attributes</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attributes_68_78" id="Attributes_405_415" title="Defined at line 9"><span class="token sort_Id">Attributes</span></a></span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_189_198" id="Attribute_424_433" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span>
  <a href="#attributes_393_403" id="attributes_437_447" title="Defined at line 22"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Op"><a href="#Attrs_96_101" id="Attrs_448_453" title="Defined at line 10"><span class="token sort_Id">Attrs</span></a><span class="operator">(</span><span class="cons_Var">attributes</span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><span id="attributes_469_479" title="Not referenced locally, nor via imports"><span class="token sort_Id">attributes</span></span></span><span class="operator">.</span>
  <a href="#attributes_393_403" id="attributes_483_493" title="Defined at line 22"><span class="token sort_Id">attributes</span></a><span class="operator">(</span><span class="cons_Op"><a href="#NoAttrs_140_147" id="NoAttrs_494_501" title="Defined at line 11"><span class="token sort_Id">NoAttrs</span></a>()</span><span class="operator">)</span>         <span class="operator">=</span> <span class="operator">[].</span>

  <a href="#hasAttributeInList_345_363" id="hasAttributeInList_522_540" title="Referenced at line 20, 27, 28, 28, 29"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Attribute_189_198" id="Attribute_542_551" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Attribute_189_198" id="Attribute_559_568" title="Defined at line 13"><span class="token sort_Id">Attribute</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../util.stx/#BOOL_138_142" id="BOOL_573_577" title="Defined at ../util.stx line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#hasAttributeInList_522_540" id="hasAttributeInList_580_598" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_599_603" title="Not referenced locally, nor via imports"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var">attr</span><span class="operator">|_])</span> <span class="operator">=</span> <span class="cons_Op"><a href="../util.stx/#TRUE_160_164" id="TRUE_617_621" title="Defined at ../util.stx line 12"><span class="token sort_Id">TRUE</span></a>()</span><span class="operator">.</span>
  <a href="#hasAttributeInList_522_540" id="hasAttributeInList_627_645" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_646_650" title="Not referenced locally, nor via imports"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="operator">[_</span>   <span class="operator">|</span><span class="cons_Var"><span id="s_658_659" title="Not referenced locally, nor via imports"><span class="token sort_Id">s</span></span></span><span class="operator">])</span> <span class="operator">=</span> <a href="#hasAttributeInList_522_540" id="hasAttributeInList_664_682" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var">attr</span><span class="operator">,</span> <span class="cons_Var">s</span><span class="operator">).</span>
  <a href="#hasAttributeInList_522_540" id="hasAttributeInList_695_713" title="Defined at line 26"><span class="token sort_Id">hasAttributeInList</span></a><span class="operator">(</span><span class="cons_Var"><span id="attr_714_718" title="Not referenced locally, nor via imports"><span class="token sort_Id">attr</span></span></span><span class="operator">,</span> <span class="operator">[</span>      <span class="operator">])</span> <span class="operator">=</span> <span class="cons_Op"><a href="../util.stx/#FALSE_177_182" id="FALSE_732_737" title="Defined at ../util.stx line 13"><span class="token sort_Id">FALSE</span></a>()</span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>