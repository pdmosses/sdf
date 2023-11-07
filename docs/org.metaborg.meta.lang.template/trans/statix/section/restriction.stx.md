---
title: restriction.stx
hide:
  - toc
---

# `restriction.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/section/restriction.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/section/restriction.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/section/restriction.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../main.stx/#statix/section/restriction_14_2" id="statix/section/restriction_0_7" title="Referenced at ../../main.stx line 15"><span class="token sort_Id">statix/section/restriction</span></a>

<span class="keyword">imports</span>

  <a href="../grammar.stx/#statix/section/grammar_0_7" id="statix/section/grammar_4_2" title="Defined at ../grammar.stx line 1"><span class="token sort_Id">statix/section/grammar</span></a>
  <a href="../../symbol.stx/#statix/symbol_0_7" id="statix/symbol_5_2" title="Defined at ../../symbol.stx line 1"><span class="token sort_Id">statix/symbol</span></a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Restrictions_21_15" id="Restrictions_10_4" title="Referenced at line 22"><span class="token sort_Id">Restrictions</span></a>            <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Restriction_14_8" id="Restriction_10_35" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_8_8" id="Grammar_10_51" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#LexicalRestrictions_22_15" id="LexicalRestrictions_11_4" title="Referenced at line 23"><span class="token sort_Id">LexicalRestrictions</span></a>     <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Restriction_14_8" id="Restriction_11_35" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_8_8" id="Grammar_11_51" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#ContextFreeRestrictions_23_15" id="ContextFreeRestrictions_12_4" title="Referenced at line 24"><span class="token sort_Id">ContextFreeRestrictions</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Restriction_14_8" id="Restriction_12_35" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_8_8" id="Grammar_12_51" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Restriction_10_35" id="Restriction_14_8" title="Referenced at line 11, 12, 13, 16, 26"><span class="token sort_Id">Restriction</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Follow_26_19" id="Follow_15_4" title="Referenced at line 27"><span class="token sort_Id">Follow</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_10_8" id="Symbol_15_18" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Lookaheads_17_8" id="Lookaheads_15_28" title="Defined at line 18"><span class="token sort_Id">Lookaheads</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Restriction_14_8" id="Restriction_15_42" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Lookaheads_15_28" id="Lookaheads_17_8" title="Referenced at line 16"><span class="token sort_Id">Lookaheads</span></a></span>

<span class="keyword">rules</span>

  <a href="../grammar.stx/#grammarOK_15_2" id="grammarOK_21_2" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_21_72" id="s_21_12" title="Referenced at line 22"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Restrictions_10_4" id="Restrictions_21_15" title="Defined at line 11"><span class="token sort_Id">Restrictions</span></a><span class="operator">(</span><span class="cons_Var"><a href="#restrictions_21_75" id="restrictions_21_28" title="Referenced at line 22"><span class="token sort_Id">restrictions</span></a></span>)</span><span class="operator">)</span>            <span class="operator">:-</span> <a href="#restrictionsOK_27_2" id="restrictionsOK_21_57" title="Defined at line 28"><span class="token sort_Id">restrictionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_21_12" id="s_21_72" title="Defined at line 22"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#restrictions_21_28" id="restrictions_21_75" title="Defined at line 22"><span class="token sort_Id">restrictions</span></a></span><span class="operator">).</span>
  <a href="../grammar.stx/#grammarOK_15_2" id="grammarOK_22_2" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_22_72" id="s_22_12" title="Referenced at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#LexicalRestrictions_11_4" id="LexicalRestrictions_22_15" title="Defined at line 12"><span class="token sort_Id">LexicalRestrictions</span></a><span class="operator">(</span><span class="cons_Var"><a href="#restrictions_22_75" id="restrictions_22_35" title="Referenced at line 23"><span class="token sort_Id">restrictions</span></a></span>)</span><span class="operator">)</span>     <span class="operator">:-</span> <a href="#restrictionsOK_27_2" id="restrictionsOK_22_57" title="Defined at line 28"><span class="token sort_Id">restrictionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_22_12" id="s_22_72" title="Defined at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#restrictions_22_35" id="restrictions_22_75" title="Defined at line 23"><span class="token sort_Id">restrictions</span></a></span><span class="operator">).</span>
  <a href="../grammar.stx/#grammarOK_15_2" id="grammarOK_23_2" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_23_72" id="s_23_12" title="Referenced at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#ContextFreeRestrictions_12_4" id="ContextFreeRestrictions_23_15" title="Defined at line 13"><span class="token sort_Id">ContextFreeRestrictions</span></a><span class="operator">(</span><span class="cons_Var"><a href="#restrictions_23_75" id="restrictions_23_39" title="Referenced at line 24"><span class="token sort_Id">restrictions</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#restrictionsOK_27_2" id="restrictionsOK_23_57" title="Defined at line 28"><span class="token sort_Id">restrictionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_23_12" id="s_23_72" title="Defined at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#restrictions_23_39" id="restrictions_23_75" title="Defined at line 24"><span class="token sort_Id">restrictions</span></a></span><span class="operator">).</span>

  <a href="#restrictionOK_26_2" id="restrictionOK_25_2" title="Referenced at line 27, 28"><span class="token sort_Id">restrictionOK</span></a><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Restriction_14_8" id="Restriction_25_25" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span>
  <a href="#restrictionOK_25_2" id="restrictionOK_26_2" title="Defined at line 26"><span class="token sort_Id">restrictionOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_26_57" id="s_26_16" title="Referenced at line 27"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Follow_15_4" id="Follow_26_19" title="Defined at line 16"><span class="token sort_Id">Follow</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_26_60" id="symbols_26_26" title="Referenced at line 27"><span class="token sort_Id">symbols</span></a></span>, _)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_76_2" id="typesOfSymbols_26_42" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_26_16" id="s_26_57" title="Defined at line 27"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_26_26" id="symbols_26_60" title="Defined at line 27"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#restrictionsOK_21_57" id="restrictionsOK_27_2" title="Referenced at line 22, 23, 24"><span class="token sort_Id">restrictionsOK</span></a> <span class="keyword">maps</span> <a href="#restrictionOK_25_2" id="restrictionOK_27_22" title="Defined at line 26"><span class="token sort_Id">restrictionOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
