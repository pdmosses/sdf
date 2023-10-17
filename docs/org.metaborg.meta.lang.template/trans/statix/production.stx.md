---
title: production.stx
hide:
  - toc
---

# `production.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/production.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/production.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/production.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.stx/#statix/production_282_299" id="statix/production_7_24" title="Referenced at ../main.stx line 16; ../section/syntax.stx line 11; ../section/template.stx line 10"><span class="token sort_Id">statix/production</span></a>

<span class="keyword">imports</span>

  <a href="../type.stx/#statix/type_7_18" id="statix/type_37_48" title="Defined at ../type.stx line 1"><span class="token sort_Id">statix/type</span></a>
  <a href="../attribute.stx/#statix/attribute_7_23" id="statix/attribute_51_67" title="Defined at ../attribute.stx line 1"><span class="token sort_Id">statix/attribute</span></a>
  <a href="../sort_cons.stx/#statix/sort_cons_7_23" id="statix/sort_cons_70_86" title="Defined at ../sort_cons.stx line 1"><span class="token sort_Id">statix/sort_cons</span></a>

<span class="keyword">rules</span>

  <a href="#injectionProductionOK_433_454" id="injectionProductionOK_97_118" title="Referenced at line 15; ../section/syntax.stx line 75; ../section/template.stx line 54"><span class="token sort_Id">injectionProductionOK</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="../type.stx/#TYPE_39_43" id="TYPE_120_124" title="Defined at ../type.stx line 5"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../attribute.stx/#Attributes_68_78" id="Attributes_127_137" title="Defined at ../attribute.stx line 9"><span class="token sort_Id">Attributes</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../sort_cons.stx/#SymbolDef_296_305" id="SymbolDef_140_149" title="Defined at ../sort_cons.stx line 20"><span class="token sort_Id">SymbolDef</span></a></span>
  <span class="layout">// Disabled for now: produces spurious errors in some cases.</span>
  <span class="layout">//injectionProductionOK(PROD([_, _|_], SORT(_)), attrs, loc) :-</span>
  <span class="layout">//  try { hasAttribute(Reject(), attrs) == TRUE() } | warning $[Missing constructor name: the generated pretty printer might not work properly] @loc.</span>
  <a href="#injectionProductionOK_97_118" id="injectionProductionOK_433_454" title="Defined at line 11"><span class="token sort_Id">injectionProductionOK</span></a><span class="operator">(_,</span> <span class="operator">_,</span> <span class="operator">_).</span>

  <span class="layout">// TODO: error: Missing bracket attribute or constructor name</span>
  <span class="layout">// - LHS must be a single sort (injection)</span>
  <span class="layout">// - RHS must be in the form of '(' Sort ')'</span>
  <span class="layout">// - attributes must NOT contain Bracket() nor Reject()</span>

  <span class="layout">// TODO: warning: Illegal use of the {bracket} attribute</span>
  <span class="layout">// - HS must be a single sort (injection)</span>
  <span class="layout">// - RHS must NOT be in the form of '(' Sort ')'</span>
  <span class="layout">// - attributes must contain Bracket()</span>
  <span class="layout">// - attributes must NOT contain Reject()</span>

  <span class="layout">// TODO: warning: Illegal use of the {bracket} attribute</span>
  <span class="layout">// - LHS must be a sort + constructor (not an injection)</span>
  <span class="layout">// - attributes must contain Bracket()</span>
  <span class="layout">// - attributes must NOT contain Reject()</span>

</code></pre></td></tr></tbody></table></div>