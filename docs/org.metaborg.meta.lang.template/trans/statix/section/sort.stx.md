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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../main.stx/#statix/section/sort_12_2" id="statix/section/sort_0_7" title="Referenced at ../../main.stx line 13"><span class="token sort_Id">statix/section/sort</span></a>

<span class="keyword">imports</span>

  <a href="../grammar.stx/#statix/section/grammar_0_7" id="statix/section/grammar_4_2" title="Defined at ../grammar.stx line 1"><span class="token sort_Id">statix/section/grammar</span></a>
  <a href="../../sort.stx/#statix/sort_0_7" id="statix/sort_5_2" title="Defined at ../../sort.stx line 1"><span class="token sort_Id">statix/sort</span></a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Sorts_19_15" id="Sorts_10_4" title="Referenced at line 20"><span class="token sort_Id">Sorts</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#DeclSymbol_12_8" id="DeclSymbol_10_17" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_8_8" id="Grammar_10_32" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#DeclSymbol_10_17" id="DeclSymbol_12_8" title="Referenced at line 11, 14, 15, 16, 22"><span class="token sort_Id">DeclSymbol</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#DeclSort_22_18" id="DeclSort_13_4" title="Referenced at line 23"><span class="token sort_Id">DeclSort</span></a>    <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_12_8" id="DeclSymbol_13_28" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span></span>
    <span class="cons_OpDecl"><a href="#DeclSortLex_23_18" id="DeclSortLex_14_4" title="Referenced at line 24"><span class="token sort_Id">DeclSortLex</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_12_8" id="DeclSymbol_14_28" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span></span>
    <span class="cons_OpDecl"><a href="#DeclSortVar_24_18" id="DeclSortVar_15_4" title="Referenced at line 25"><span class="token sort_Id">DeclSortVar</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_12_8" id="DeclSymbol_15_28" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span></span>

<span class="keyword">rules</span>

  <a href="../grammar.stx/#grammarOK_15_2" id="grammarOK_19_2" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_19_52" id="s_19_12" title="Referenced at line 20"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Sorts_10_4" id="Sorts_19_15" title="Defined at line 11"><span class="token sort_Id">Sorts</span></a><span class="operator">(</span><span class="cons_Var"><a href="#declSymbols_19_55" id="declSymbols_19_21" title="Referenced at line 20"><span class="token sort_Id">declSymbols</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#declSymbolsOK_25_2" id="declSymbolsOK_19_38" title="Defined at line 26"><span class="token sort_Id">declSymbolsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_19_12" id="s_19_52" title="Defined at line 20"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#declSymbols_19_21" id="declSymbols_19_55" title="Defined at line 20"><span class="token sort_Id">declSymbols</span></a></span><span class="operator">).</span>

  <a href="#declSymbolOK_22_2" id="declSymbolOK_21_2" title="Referenced at line 23, 24, 25, 26"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#DeclSymbol_12_8" id="DeclSymbol_21_24" title="Defined at line 13"><span class="token sort_Id">DeclSymbol</span></a></span>
  <a href="#declSymbolOK_21_2" id="declSymbolOK_22_2" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_22_52" id="s_22_15" title="Referenced at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#DeclSort_13_4" id="DeclSort_22_18" title="Defined at line 14"><span class="token sort_Id">DeclSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_22_55" id="name_22_27" title="Referenced at line 23"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span>    <span class="operator">:-</span> <a href="../../sort.stx/#declareSort_20_2" id="declareSort_22_40" title="Defined at ../../sort.stx line 21"><span class="token sort_Id">declareSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_22_15" id="s_22_52" title="Defined at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_22_27" id="name_22_55" title="Defined at line 23"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../../sort.stx/#CONTEXTFREE_11_4" id="CONTEXTFREE_22_61" title="Defined at ../../sort.stx line 12"><span class="token sort_Id">CONTEXTFREE</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#declSymbolOK_21_2" id="declSymbolOK_23_2" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_23_52" id="s_23_15" title="Referenced at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#DeclSortLex_14_4" id="DeclSortLex_23_18" title="Defined at line 15"><span class="token sort_Id">DeclSortLex</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_23_55" id="name_23_30" title="Referenced at line 24"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../sort.stx/#declareSort_20_2" id="declareSort_23_40" title="Defined at ../../sort.stx line 21"><span class="token sort_Id">declareSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_23_15" id="s_23_52" title="Defined at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_23_30" id="name_23_55" title="Defined at line 24"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../../sort.stx/#LEXICAL_12_4" id="LEXICAL_23_61" title="Defined at ../../sort.stx line 13"><span class="token sort_Id">LEXICAL</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#declSymbolOK_21_2" id="declSymbolOK_24_2" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_24_52" id="s_24_15" title="Referenced at line 25"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#DeclSortVar_15_4" id="DeclSortVar_24_18" title="Defined at line 16"><span class="token sort_Id">DeclSortVar</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_24_55" id="name_24_30" title="Referenced at line 25"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../sort.stx/#declareSort_20_2" id="declareSort_24_40" title="Defined at ../../sort.stx line 21"><span class="token sort_Id">declareSort</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_24_15" id="s_24_52" title="Defined at line 25"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_24_30" id="name_24_55" title="Defined at line 25"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../../sort.stx/#VAR_13_4" id="VAR_24_61" title="Defined at ../../sort.stx line 14"><span class="token sort_Id">VAR</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#declSymbolsOK_19_38" id="declSymbolsOK_25_2" title="Referenced at line 20"><span class="token sort_Id">declSymbolsOK</span></a> <span class="keyword">maps</span> <a href="#declSymbolOK_21_2" id="declSymbolOK_25_21" title="Defined at line 22"><span class="token sort_Id">declSymbolOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
