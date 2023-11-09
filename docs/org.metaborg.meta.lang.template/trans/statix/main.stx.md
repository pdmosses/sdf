---
title: main.stx
hide:
  - toc
---

# `main.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/main.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/main.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/main.stx "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/main_1_8" title="Not referenced"><span class="token sort_Id">statix/main</span></span>

<span class="keyword">imports</span>

  <a href="../name.stx/#statix/name_1_8" id="statix/name_5_3" title="Defined at ../name.stx line 1"><span class="token sort_Id">statix/name</span></a>
  <a href="../type.stx/#statix/type_1_8" id="statix/type_6_3" title="Defined at ../type.stx line 1"><span class="token sort_Id">statix/type</span></a>
  <a href="../module.stx/#statix/module_1_8" id="statix/module_7_3" title="Defined at ../module.stx line 1"><span class="token sort_Id">statix/module</span></a>
  <a href="../section/section.stx/#statix/section/section_1_8" id="statix/section/section_8_3" title="Defined at ../section/section.stx line 1"><span class="token sort_Id">statix/section/section</span></a>
  <a href="../section/grammar.stx/#statix/section/grammar_1_8" id="statix/section/grammar_9_3" title="Defined at ../section/grammar.stx line 1"><span class="token sort_Id">statix/section/grammar</span></a>
  <a href="../section/template.stx/#statix/section/template_1_8" id="statix/section/template_10_3" title="Defined at ../section/template.stx line 1"><span class="token sort_Id">statix/section/template</span></a>
  <a href="../section/syntax.stx/#statix/section/syntax_1_8" id="statix/section/syntax_11_3" title="Defined at ../section/syntax.stx line 1"><span class="token sort_Id">statix/section/syntax</span></a>
  <a href="../section/start_symbol.stx/#statix/section/start_symbol_1_8" id="statix/section/start_symbol_12_3" title="Defined at ../section/start_symbol.stx line 1"><span class="token sort_Id">statix/section/start_symbol</span></a>
  <a href="../section/sort.stx/#statix/section/sort_1_8" id="statix/section/sort_13_3" title="Defined at ../section/sort.stx line 1"><span class="token sort_Id">statix/section/sort</span></a>
  <a href="../section/priority.stx/#statix/section/priority_1_8" id="statix/section/priority_14_3" title="Defined at ../section/priority.stx line 1"><span class="token sort_Id">statix/section/priority</span></a>
  <a href="../section/restriction.stx/#statix/section/restriction_1_8" id="statix/section/restriction_15_3" title="Defined at ../section/restriction.stx line 1"><span class="token sort_Id">statix/section/restriction</span></a>
  <a href="../production.stx/#statix/production_1_8" id="statix/production_16_3" title="Defined at ../production.stx line 1"><span class="token sort_Id">statix/production</span></a>
  <a href="../sort_cons.stx/#statix/sort_cons_1_8" id="statix/sort_cons_17_3" title="Defined at ../sort_cons.stx line 1"><span class="token sort_Id">statix/sort_cons</span></a>
  <a href="../symbol.stx/#statix/symbol_1_8" id="statix/symbol_18_3" title="Defined at ../symbol.stx line 1"><span class="token sort_Id">statix/symbol</span></a>
  <a href="../attribute.stx/#statix/attribute_1_8" id="statix/attribute_19_3" title="Defined at ../attribute.stx line 1"><span class="token sort_Id">statix/attribute</span></a>
  <a href="../label.stx/#statix/label_1_8" id="statix/label_20_3" title="Defined at ../label.stx line 1"><span class="token sort_Id">statix/label</span></a>
  <a href="../util.stx/#statix/util_1_8" id="statix/util_21_3" title="Defined at ../util.stx line 1"><span class="token sort_Id">statix/util</span></a>

<span class="keyword">rules</span>

  <a href="#projectOK_26_3" id="projectOK_25_3" title="Referenced at line 26"><span class="token sort_Id">projectOK</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span>
  <a href="#projectOK_25_3" id="projectOK_26_3" title="Defined at line 25"><span class="token sort_Id">projectOK</span></a><span class="operator">(</span><span class="cons_Var"><span id="s_26_13" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">).</span>

  <a href="#fileOK_29_3" id="fileOK_28_3" title="Referenced at line 29"><span class="token sort_Id">fileOK</span></a><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../module.stx/#Module_12_9" id="Module_28_19" title="Defined at ../module.stx line 12"><span class="token sort_Id">Module</span></a></span>
  <a href="#fileOK_28_3" id="fileOK_29_3" title="Defined at line 28"><span class="token sort_Id">fileOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_29_28" id="s_29_10" title="Referenced at line 29"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#m_29_31" id="m_29_13" title="Referenced at line 29"><span class="token sort_Id">m</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <a href="../module.stx/#moduleOK_23_3" id="moduleOK_29_19" title="Defined at ../module.stx line 23"><span class="token sort_Id">moduleOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_29_10" id="s_29_28" title="Defined at line 29"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#m_29_13" id="m_29_31" title="Defined at line 29"><span class="token sort_Id">m</span></a></span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
