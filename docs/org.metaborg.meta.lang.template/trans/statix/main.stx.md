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
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/main_7_18" title="Not referenced locally, nor via imports"><span class="token sort_Id">statix/main</span></span>

<span class="keyword">imports</span>

  <a href="../name.stx/#statix/name_7_18" id="statix/name_31_42" title="Defined at ../name.stx line 1"><span class="token sort_Id">statix/name</span></a>
  <a href="../type.stx/#statix/type_7_18" id="statix/type_45_56" title="Defined at ../type.stx line 1"><span class="token sort_Id">statix/type</span></a>
  <a href="../module.stx/#statix/module_7_20" id="statix/module_59_72" title="Defined at ../module.stx line 1"><span class="token sort_Id">statix/module</span></a>
  <a href="../section/section.stx/#statix/section/section_7_29" id="statix/section/section_75_97" title="Defined at ../section/section.stx line 1"><span class="token sort_Id">statix/section/section</span></a>
  <a href="../section/grammar.stx/#statix/section/grammar_7_29" id="statix/section/grammar_100_122" title="Defined at ../section/grammar.stx line 1"><span class="token sort_Id">statix/section/grammar</span></a>
  <a href="../section/template.stx/#statix/section/template_7_30" id="statix/section/template_125_148" title="Defined at ../section/template.stx line 1"><span class="token sort_Id">statix/section/template</span></a>
  <a href="../section/syntax.stx/#statix/section/syntax_7_28" id="statix/section/syntax_151_172" title="Defined at ../section/syntax.stx line 1"><span class="token sort_Id">statix/section/syntax</span></a>
  <a href="../section/start_symbol.stx/#statix/section/start_symbol_7_34" id="statix/section/start_symbol_175_202" title="Defined at ../section/start_symbol.stx line 1"><span class="token sort_Id">statix/section/start_symbol</span></a>
  <a href="../section/sort.stx/#statix/section/sort_7_26" id="statix/section/sort_205_224" title="Defined at ../section/sort.stx line 1"><span class="token sort_Id">statix/section/sort</span></a>
  <a href="../section/priority.stx/#statix/section/priority_7_30" id="statix/section/priority_227_250" title="Defined at ../section/priority.stx line 1"><span class="token sort_Id">statix/section/priority</span></a>
  <a href="../section/restriction.stx/#statix/section/restriction_7_33" id="statix/section/restriction_253_279" title="Defined at ../section/restriction.stx line 1"><span class="token sort_Id">statix/section/restriction</span></a>
  <a href="../production.stx/#statix/production_7_24" id="statix/production_282_299" title="Defined at ../production.stx line 1"><span class="token sort_Id">statix/production</span></a>
  <a href="../sort_cons.stx/#statix/sort_cons_7_23" id="statix/sort_cons_302_318" title="Defined at ../sort_cons.stx line 1"><span class="token sort_Id">statix/sort_cons</span></a>
  <a href="../symbol.stx/#statix/symbol_7_20" id="statix/symbol_321_334" title="Defined at ../symbol.stx line 1"><span class="token sort_Id">statix/symbol</span></a>
  <a href="../attribute.stx/#statix/attribute_7_23" id="statix/attribute_337_353" title="Defined at ../attribute.stx line 1"><span class="token sort_Id">statix/attribute</span></a>
  <a href="../label.stx/#statix/label_7_19" id="statix/label_356_368" title="Defined at ../label.stx line 1"><span class="token sort_Id">statix/label</span></a>
  <a href="../util.stx/#statix/util_7_18" id="statix/util_371_382" title="Defined at ../util.stx line 1"><span class="token sort_Id">statix/util</span></a>

<span class="keyword">rules</span>

  <a href="#projectOK_413_422" id="projectOK_393_402" title="Referenced at line 26"><span class="token sort_Id">projectOK</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span>
  <a href="#projectOK_393_402" id="projectOK_413_422" title="Defined at line 25"><span class="token sort_Id">projectOK</span></a><span class="operator">(</span><span class="cons_Var"><span id="s_423_424" title="Not referenced locally, nor via imports"><span class="token sort_Id">s</span></span></span><span class="operator">).</span>

  <a href="#fileOK_455_461" id="fileOK_430_436" title="Referenced at line 29"><span class="token sort_Id">fileOK</span></a><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../module.stx/#Module_136_142" id="Module_446_452" title="Defined at ../module.stx line 12"><span class="token sort_Id">Module</span></a></span>
  <a href="#fileOK_430_436" id="fileOK_455_461" title="Defined at line 28"><span class="token sort_Id">fileOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_480_481" id="s_462_463" title="Referenced at line 29"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#m_483_484" id="m_465_466" title="Referenced at line 29"><span class="token sort_Id">m</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <a href="../module.stx/#moduleOK_439_447" id="moduleOK_471_479" title="Defined at ../module.stx line 23"><span class="token sort_Id">moduleOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_462_463" id="s_480_481" title="Defined at line 29"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#m_465_466" id="m_483_484" title="Defined at line 29"><span class="token sort_Id">m</span></a></span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>