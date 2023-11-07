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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../main.stx/#statix/section/start_symbol_11_2" id="statix/section/start_symbol_0_7" title="Referenced at ../../main.stx line 12"><span class="token sort_Id">statix/section/start_symbol</span></a>

<span class="keyword">imports</span>

  <a href="../grammar.stx/#statix/section/grammar_0_7" id="statix/section/grammar_4_2" title="Defined at ../grammar.stx line 1"><span class="token sort_Id">statix/section/grammar</span></a>
  <a href="../../symbol.stx/#statix/symbol_0_7" id="statix/symbol_5_2" title="Defined at ../../symbol.stx line 1"><span class="token sort_Id">statix/symbol</span></a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#KernelStartSymbols_16_15" id="KernelStartSymbols_10_4" title="Referenced at line 17"><span class="token sort_Id">KernelStartSymbols</span></a>      <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_10_8" id="Symbol_10_35" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_8_8" id="Grammar_10_46" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#LexicalStartSymbols_17_15" id="LexicalStartSymbols_11_4" title="Referenced at line 18"><span class="token sort_Id">LexicalStartSymbols</span></a>     <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_10_8" id="Symbol_11_35" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_8_8" id="Grammar_11_46" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#ContextFreeStartSymbols_18_15" id="ContextFreeStartSymbols_12_4" title="Referenced at line 19"><span class="token sort_Id">ContextFreeStartSymbols</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_10_8" id="Symbol_12_35" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_8_8" id="Grammar_12_46" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>

<span class="keyword">rules</span>

  <a href="../grammar.stx/#grammarOK_15_2" id="grammarOK_16_2" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_16_67" id="s_16_12" title="Referenced at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#KernelStartSymbols_10_4" id="KernelStartSymbols_16_15" title="Defined at line 11"><span class="token sort_Id">KernelStartSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_16_70" id="symbols_16_34" title="Referenced at line 17"><span class="token sort_Id">symbols</span></a></span>)</span><span class="operator">)</span>      <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_76_2" id="typesOfSymbols_16_52" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_16_12" id="s_16_67" title="Defined at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_16_34" id="symbols_16_70" title="Defined at line 17"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="../grammar.stx/#grammarOK_15_2" id="grammarOK_17_2" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_67" id="s_17_12" title="Referenced at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#LexicalStartSymbols_11_4" id="LexicalStartSymbols_17_15" title="Defined at line 12"><span class="token sort_Id">LexicalStartSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_17_70" id="symbols_17_35" title="Referenced at line 18"><span class="token sort_Id">symbols</span></a></span>)</span><span class="operator">)</span>     <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_76_2" id="typesOfSymbols_17_52" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_12" id="s_17_67" title="Defined at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_17_35" id="symbols_17_70" title="Defined at line 18"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="../grammar.stx/#grammarOK_15_2" id="grammarOK_18_2" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_67" id="s_18_12" title="Referenced at line 19"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#ContextFreeStartSymbols_12_4" id="ContextFreeStartSymbols_18_15" title="Defined at line 13"><span class="token sort_Id">ContextFreeStartSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_18_70" id="symbols_18_39" title="Referenced at line 19"><span class="token sort_Id">symbols</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_76_2" id="typesOfSymbols_18_52" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_12" id="s_18_67" title="Defined at line 19"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_18_39" id="symbols_18_70" title="Defined at line 19"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
