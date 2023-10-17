---
title: start_symbol.stx
hide:
  - toc
---

# `start_symbol.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/section/start_symbol.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/section/start_symbol.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/section/start_symbol.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../main.stx/#statix/section/start_symbol_175_202" id="statix/section/start_symbol_7_34" title="Referenced at ../../main.stx line 12"><span class="token sort_Id">statix/section/start_symbol</span></a>

<span class="keyword">imports</span>

  <a href="../grammar.stx/#statix/section/grammar_7_29" id="statix/section/grammar_47_69" title="Defined at ../grammar.stx line 1"><span class="token sort_Id">statix/section/grammar</span></a>
  <a href="../../symbol.stx/#statix/symbol_7_20" id="statix/symbol_72_85" title="Defined at ../../symbol.stx line 1"><span class="token sort_Id">statix/symbol</span></a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#KernelStartSymbols_298_316" id="KernelStartSymbols_117_135" title="Referenced at line 17"><span class="token sort_Id">KernelStartSymbols</span></a>      <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_94_100" id="Symbol_148_154" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_85_92" id="Grammar_159_166" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#LexicalStartSymbols_383_402" id="LexicalStartSymbols_171_190" title="Referenced at line 18"><span class="token sort_Id">LexicalStartSymbols</span></a>     <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_94_100" id="Symbol_202_208" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_85_92" id="Grammar_213_220" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#ContextFreeStartSymbols_468_491" id="ContextFreeStartSymbols_225_248" title="Referenced at line 19"><span class="token sort_Id">ContextFreeStartSymbols</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_94_100" id="Symbol_256_262" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_85_92" id="Grammar_267_274" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>

<span class="keyword">rules</span>

  <a href="../grammar.stx/#grammarOK_155_164" id="grammarOK_285_294" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_350_351" id="s_295_296" title="Referenced at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#KernelStartSymbols_117_135" id="KernelStartSymbols_298_316" title="Defined at line 11"><span class="token sort_Id">KernelStartSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_353_360" id="symbols_317_324" title="Referenced at line 17"><span class="token sort_Id">symbols</span></a></span>)</span><span class="operator">)</span>      <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_2424_2438" id="typesOfSymbols_335_349" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_295_296" id="s_350_351" title="Defined at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_317_324" id="symbols_353_360" title="Defined at line 17"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="../grammar.stx/#grammarOK_155_164" id="grammarOK_370_379" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_435_436" id="s_380_381" title="Referenced at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#LexicalStartSymbols_171_190" id="LexicalStartSymbols_383_402" title="Defined at line 12"><span class="token sort_Id">LexicalStartSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_438_445" id="symbols_403_410" title="Referenced at line 18"><span class="token sort_Id">symbols</span></a></span>)</span><span class="operator">)</span>     <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_2424_2438" id="typesOfSymbols_420_434" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_380_381" id="s_435_436" title="Defined at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_403_410" id="symbols_438_445" title="Defined at line 18"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="../grammar.stx/#grammarOK_155_164" id="grammarOK_455_464" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_520_521" id="s_465_466" title="Referenced at line 19"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#ContextFreeStartSymbols_225_248" id="ContextFreeStartSymbols_468_491" title="Defined at line 13"><span class="token sort_Id">ContextFreeStartSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_523_530" id="symbols_492_499" title="Referenced at line 19"><span class="token sort_Id">symbols</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_2424_2438" id="typesOfSymbols_505_519" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_465_466" id="s_520_521" title="Defined at line 19"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_492_499" id="symbols_523_530" title="Defined at line 19"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>

</code></pre></td></tr></tbody></table></div>