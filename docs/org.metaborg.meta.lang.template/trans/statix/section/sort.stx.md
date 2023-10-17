---
title: sort.stx
hide:
  - toc
---

# `sort.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/section/sort.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/section/sort.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/section/sort.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../main.stx/#statix/section/sort_205_224" id="statix/section/sort_7_26" title="Referenced at ../../main.stx line 13"><span class="token sort_Id">statix/section/sort</span></a>

<span class="keyword">imports</span>

  <a href="../grammar.stx/#statix/section/grammar_7_29" id="statix/section/grammar_39_61" title="Defined at ../grammar.stx line 1"><span class="token sort_Id">statix/section/grammar</span></a>
  <a href="../../sort.stx/#statix/sort_7_18" id="statix/sort_64_75" title="Defined at ../../sort.stx line 1"><span class="token sort_Id">statix/sort</span></a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Sorts_316_321" id="Sorts_107_112" title="Referenced at line 20"><span class="token sort_Id">Sorts</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#DeclSymbol_152_162" id="DeclSymbol_120_130" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_85_92" id="Grammar_135_142" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#DeclSymbol_120_130" id="DeclSymbol_152_162" title="Referenced at line 11, 14, 15, 16, 22"><span class="token sort_Id">DeclSymbol</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#DeclSort_424_432" id="DeclSort_180_188" title="Referenced at line 23"><span class="token sort_Id">DeclSort</span></a>    <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_152_162" id="DeclSymbol_204_214" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span></span>
    <span class="cons_OpDecl"><a href="#DeclSortLex_506_517" id="DeclSortLex_219_230" title="Referenced at line 24"><span class="token sort_Id">DeclSortLex</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_152_162" id="DeclSymbol_243_253" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span></span>
    <span class="cons_OpDecl"><a href="#DeclSortVar_584_595" id="DeclSortVar_258_269" title="Referenced at line 25"><span class="token sort_Id">DeclSortVar</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_152_162" id="DeclSymbol_282_292" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span></span>

<span class="keyword">rules</span>

  <a href="../grammar.stx/#grammarOK_155_164" id="grammarOK_303_312" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_353_354" id="s_313_314" title="Referenced at line 20"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Sorts_107_112" id="Sorts_316_321" title="Defined at line 11"><span class="token sort_Id">Sorts</span></a><span class="operator">(</span><span class="cons_Var"><a href="#declSymbols_356_367" id="declSymbols_322_333" title="Referenced at line 20"><span class="token sort_Id">declSymbols</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#declSymbolsOK_642_655" id="declSymbolsOK_339_352" title="Defined at line 26"><span class="token sort_Id">declSymbolsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_313_314" id="s_353_354" title="Defined at line 20"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#declSymbols_322_333" id="declSymbols_356_367" title="Defined at line 20"><span class="token sort_Id">declSymbols</span></a></span><span class="operator">).</span>

  <a href="#declSymbolOK_408_420" id="declSymbolOK_373_385" title="Referenced at line 23, 24, 25, 26"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_152_162" id="DeclSymbol_395_405" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span>
  <a href="#declSymbolOK_373_385" id="declSymbolOK_408_420" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_458_459" id="s_421_422" title="Referenced at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#DeclSort_180_188" id="DeclSort_424_432" title="Defined at line 14"><span class="token sort_Id">DeclSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_461_465" id="name_433_437" title="Referenced at line 23"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span>    <span class="operator">:-</span> <a href="../../sort.stx/#declareSort_265_276" id="declareSort_446_457" title="Defined at ../../sort.stx line 21"><span class="token sort_Id">declareSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_421_422" id="s_458_459" title="Defined at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_433_437" id="name_461_465" title="Defined at line 23"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../../sort.stx/#CONTEXTFREE_118_129" id="CONTEXTFREE_467_478" title="Defined at ../../sort.stx line 12"><span class="token sort_Id">CONTEXTFREE</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#declSymbolOK_373_385" id="declSymbolOK_490_502" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_540_541" id="s_503_504" title="Referenced at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#DeclSortLex_219_230" id="DeclSortLex_506_517" title="Defined at line 15"><span class="token sort_Id">DeclSortLex</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_543_547" id="name_518_522" title="Referenced at line 24"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../sort.stx/#declareSort_265_276" id="declareSort_528_539" title="Defined at ../../sort.stx line 21"><span class="token sort_Id">declareSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_503_504" id="s_540_541" title="Defined at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_518_522" id="name_543_547" title="Defined at line 24"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../../sort.stx/#LEXICAL_147_154" id="LEXICAL_549_556" title="Defined at ../../sort.stx line 13"><span class="token sort_Id">LEXICAL</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#declSymbolOK_373_385" id="declSymbolOK_568_580" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_618_619" id="s_581_582" title="Referenced at line 25"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#DeclSortVar_258_269" id="DeclSortVar_584_595" title="Defined at line 16"><span class="token sort_Id">DeclSortVar</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_621_625" id="name_596_600" title="Referenced at line 25"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../sort.stx/#declareSort_265_276" id="declareSort_606_617" title="Defined at ../../sort.stx line 21"><span class="token sort_Id">declareSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_581_582" id="s_618_619" title="Defined at line 25"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_596_600" id="name_621_625" title="Defined at line 25"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../../sort.stx/#VAR_176_179" id="VAR_627_630" title="Defined at ../../sort.stx line 14"><span class="token sort_Id">VAR</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#declSymbolsOK_339_352" id="declSymbolsOK_642_655" title="Referenced at line 20"><span class="token sort_Id">declSymbolsOK</span></a> <span class="keyword">maps</span> <a href="#declSymbolOK_373_385" id="declSymbolOK_661_673" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>