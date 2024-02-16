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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/production_1_8" title="a definition with multiple references" data-urls="../main.stx/#statix/production line 16_3; ../section/syntax.stx/#statix/production line 11_3; ../section/template.stx/#statix/production line 10_3"><span class="token sort_Id">statix/production</span></button>

<span class="keyword">imports</span>

  <a href="../type.stx/#statix/type_1_8" id="statix/type_5_3" title="a reference to a single-file definition"><span class="token sort_Id">statix/type</span></a>
  <a href="../attribute.stx/#statix/attribute_1_8" id="statix/attribute_6_3" title="a reference to a single-file definition"><span class="token sort_Id">statix/attribute</span></a>
  <a href="../sort_cons.stx/#statix/sort_cons_1_8" id="statix/sort_cons_7_3" title="a reference to a single-file definition"><span class="token sort_Id">statix/sort_cons</span></a>

<span class="keyword">rules</span>

  <button class="modal-open" id="injectionProductionOK_11_3" title="a definition with multiple references" data-urls="#injectionProductionOK line 15_3; ../section/syntax.stx/#injectionProductionOK line 75_5; ../section/template.stx/#injectionProductionOK line 54_5"><span class="token sort_Id">injectionProductionOK</span></button><span class="operator">:</span> <span class="cons_SimpleSort"><a href="../type.stx/#TYPE_5_9" id="TYPE_11_26" title="a reference to a single-file definition"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../attribute.stx/#Attributes_9_9" id="Attributes_11_33" title="a reference to a single-file definition"><span class="token sort_Id">Attributes</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../sort_cons.stx/#SymbolDef_20_9" id="SymbolDef_11_46" title="a reference to a single-file definition"><span class="token sort_Id">SymbolDef</span></a></span>
  <span class="layout">// Disabled for now: produces spurious errors in some cases.</span>
  <span class="layout">//injectionProductionOK(PROD([_, _|_], SORT(_)), attrs, loc) :-</span>
  <span class="layout">//  try { hasAttribute(Reject(), attrs) == TRUE() } | warning $[Missing constructor name: the generated pretty printer might not work properly] @loc.</span>
  <a href="#injectionProductionOK_11_3" id="injectionProductionOK_15_3" title="a reference to a single-file definition"><span class="token sort_Id">injectionProductionOK</span></a><span class="operator">(_,</span> <span class="operator">_,</span> <span class="operator">_).</span>

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

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
