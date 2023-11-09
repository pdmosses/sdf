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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../main.stx/#statix/section/sort_13_3" id="statix/section/sort_1_8" title="Referenced at ../../main.stx line 13"><span class="token sort_Id">statix/section/sort</span></a>

<span class="keyword">imports</span>

  <a href="../grammar.stx/#statix/section/grammar_1_8" id="statix/section/grammar_5_3" title="Defined at ../grammar.stx line 1"><span class="token sort_Id">statix/section/grammar</span></a>
  <a href="../../sort.stx/#statix/sort_1_8" id="statix/sort_6_3" title="Defined at ../../sort.stx line 1"><span class="token sort_Id">statix/sort</span></a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Sorts_20_16" id="Sorts_11_5" title="Referenced at line 20"><span class="token sort_Id">Sorts</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#DeclSymbol_13_9" id="DeclSymbol_11_18" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_9_9" id="Grammar_11_33" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#DeclSymbol_11_18" id="DeclSymbol_13_9" title="Referenced at line 11, 14, 15, 16, 22"><span class="token sort_Id">DeclSymbol</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#DeclSort_23_19" id="DeclSort_14_5" title="Referenced at line 23"><span class="token sort_Id">DeclSort</span></a>    <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_13_9" id="DeclSymbol_14_29" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span></span>
    <span class="cons_OpDecl"><a href="#DeclSortLex_24_19" id="DeclSortLex_15_5" title="Referenced at line 24"><span class="token sort_Id">DeclSortLex</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_13_9" id="DeclSymbol_15_29" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span></span>
    <span class="cons_OpDecl"><a href="#DeclSortVar_25_19" id="DeclSortVar_16_5" title="Referenced at line 25"><span class="token sort_Id">DeclSortVar</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_13_9" id="DeclSymbol_16_29" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span></span>

<span class="keyword">rules</span>

  <a href="../grammar.stx/#grammarOK_16_3" id="grammarOK_20_3" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_20_53" id="s_20_13" title="Referenced at line 20"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Sorts_11_5" id="Sorts_20_16" title="Defined at line 11"><span class="token sort_Id">Sorts</span></a><span class="operator">(</span><span class="cons_Var"><a href="#declSymbols_20_56" id="declSymbols_20_22" title="Referenced at line 20"><span class="token sort_Id">declSymbols</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#declSymbolsOK_26_3" id="declSymbolsOK_20_39" title="Defined at line 26"><span class="token sort_Id">declSymbolsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_20_13" id="s_20_53" title="Defined at line 20"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#declSymbols_20_22" id="declSymbols_20_56" title="Defined at line 20"><span class="token sort_Id">declSymbols</span></a></span><span class="operator">).</span>

  <a href="#declSymbolOK_23_3" id="declSymbolOK_22_3" title="Referenced at line 23, 24, 25, 26"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_13_9" id="DeclSymbol_22_25" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span>
  <a href="#declSymbolOK_22_3" id="declSymbolOK_23_3" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_23_53" id="s_23_16" title="Referenced at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#DeclSort_14_5" id="DeclSort_23_19" title="Defined at line 14"><span class="token sort_Id">DeclSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_23_56" id="name_23_28" title="Referenced at line 23"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span>    <span class="operator">:-</span> <a href="../../sort.stx/#declareSort_21_3" id="declareSort_23_41" title="Defined at ../../sort.stx line 21"><span class="token sort_Id">declareSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_23_16" id="s_23_53" title="Defined at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_23_28" id="name_23_56" title="Defined at line 23"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../../sort.stx/#CONTEXTFREE_12_5" id="CONTEXTFREE_23_62" title="Defined at ../../sort.stx line 12"><span class="token sort_Id">CONTEXTFREE</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#declSymbolOK_22_3" id="declSymbolOK_24_3" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_24_53" id="s_24_16" title="Referenced at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#DeclSortLex_15_5" id="DeclSortLex_24_19" title="Defined at line 15"><span class="token sort_Id">DeclSortLex</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_24_56" id="name_24_31" title="Referenced at line 24"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../sort.stx/#declareSort_21_3" id="declareSort_24_41" title="Defined at ../../sort.stx line 21"><span class="token sort_Id">declareSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_24_16" id="s_24_53" title="Defined at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_24_31" id="name_24_56" title="Defined at line 24"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../../sort.stx/#LEXICAL_13_5" id="LEXICAL_24_62" title="Defined at ../../sort.stx line 13"><span class="token sort_Id">LEXICAL</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#declSymbolOK_22_3" id="declSymbolOK_25_3" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_25_53" id="s_25_16" title="Referenced at line 25"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#DeclSortVar_16_5" id="DeclSortVar_25_19" title="Defined at line 16"><span class="token sort_Id">DeclSortVar</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_25_56" id="name_25_31" title="Referenced at line 25"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../sort.stx/#declareSort_21_3" id="declareSort_25_41" title="Defined at ../../sort.stx line 21"><span class="token sort_Id">declareSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_25_16" id="s_25_53" title="Defined at line 25"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_25_31" id="name_25_56" title="Defined at line 25"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../../sort.stx/#VAR_14_5" id="VAR_25_62" title="Defined at ../../sort.stx line 14"><span class="token sort_Id">VAR</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#declSymbolsOK_20_39" id="declSymbolsOK_26_3" title="Referenced at line 20"><span class="token sort_Id">declSymbolsOK</span></a> <span class="keyword">maps</span> <a href="#declSymbolOK_22_3" id="declSymbolOK_26_22" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
