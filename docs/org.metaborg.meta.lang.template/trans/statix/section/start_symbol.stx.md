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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../main.stx/#statix/section/start_symbol_12_3" id="statix/section/start_symbol_1_8" title="Referenced at ../../main.stx line 12"><span class="token sort_Id">statix/section/start_symbol</span></a>

<span class="keyword">imports</span>

  <a href="../grammar.stx/#statix/section/grammar_1_8" id="statix/section/grammar_5_3" title="Defined at ../grammar.stx line 1"><span class="token sort_Id">statix/section/grammar</span></a>
  <a href="../../symbol.stx/#statix/symbol_1_8" id="statix/symbol_6_3" title="Defined at ../../symbol.stx line 1"><span class="token sort_Id">statix/symbol</span></a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#KernelStartSymbols_17_16" id="KernelStartSymbols_11_5" title="Referenced at line 17"><span class="token sort_Id">KernelStartSymbols</span></a>      <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_11_9" id="Symbol_11_36" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_9_9" id="Grammar_11_47" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#LexicalStartSymbols_18_16" id="LexicalStartSymbols_12_5" title="Referenced at line 18"><span class="token sort_Id">LexicalStartSymbols</span></a>     <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_11_9" id="Symbol_12_36" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_9_9" id="Grammar_12_47" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#ContextFreeStartSymbols_19_16" id="ContextFreeStartSymbols_13_5" title="Referenced at line 19"><span class="token sort_Id">ContextFreeStartSymbols</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_11_9" id="Symbol_13_36" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_9_9" id="Grammar_13_47" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>

<span class="keyword">rules</span>

  <a href="../grammar.stx/#grammarOK_16_3" id="grammarOK_17_3" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_68" id="s_17_13" title="Referenced at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#KernelStartSymbols_11_5" id="KernelStartSymbols_17_16" title="Defined at line 11"><span class="token sort_Id">KernelStartSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_17_71" id="symbols_17_35" title="Referenced at line 17"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span></span><span class="operator">)</span>      <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_77_3" id="typesOfSymbols_17_53" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_13" id="s_17_68" title="Defined at line 17"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_17_35" id="symbols_17_71" title="Defined at line 17"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="../grammar.stx/#grammarOK_16_3" id="grammarOK_18_3" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_68" id="s_18_13" title="Referenced at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#LexicalStartSymbols_12_5" id="LexicalStartSymbols_18_16" title="Defined at line 12"><span class="token sort_Id">LexicalStartSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_18_71" id="symbols_18_36" title="Referenced at line 18"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span></span><span class="operator">)</span>     <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_77_3" id="typesOfSymbols_18_53" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_13" id="s_18_68" title="Defined at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_18_36" id="symbols_18_71" title="Defined at line 18"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="../grammar.stx/#grammarOK_16_3" id="grammarOK_19_3" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_19_68" id="s_19_13" title="Referenced at line 19"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#ContextFreeStartSymbols_13_5" id="ContextFreeStartSymbols_19_16" title="Defined at line 13"><span class="token sort_Id">ContextFreeStartSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_19_71" id="symbols_19_40" title="Referenced at line 19"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span></span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_77_3" id="typesOfSymbols_19_53" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_19_13" id="s_19_68" title="Defined at line 19"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_19_40" id="symbols_19_71" title="Defined at line 19"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
