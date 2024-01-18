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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../main.stx/#statix/section/restriction_15_3" id="statix/section/restriction_1_8" title="Referenced at ../../main.stx line 15"><span class="token sort_Id">statix/section/restriction</span></a>

<span class="keyword">imports</span>

  <a href="../grammar.stx/#statix/section/grammar_1_8" id="statix/section/grammar_5_3" title="Defined at ../grammar.stx line 1"><span class="token sort_Id">statix/section/grammar</span></a>
  <a href="../../symbol.stx/#statix/symbol_1_8" id="statix/symbol_6_3" title="Defined at ../../symbol.stx line 1"><span class="token sort_Id">statix/symbol</span></a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Restrictions_22_16" id="Restrictions_11_5" title="Referenced at line 22"><span class="token sort_Id">Restrictions</span></a>            <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Restriction_15_9" id="Restriction_11_36" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_9_9" id="Grammar_11_52" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#LexicalRestrictions_23_16" id="LexicalRestrictions_12_5" title="Referenced at line 23"><span class="token sort_Id">LexicalRestrictions</span></a>     <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Restriction_15_9" id="Restriction_12_36" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_9_9" id="Grammar_12_52" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#ContextFreeRestrictions_24_16" id="ContextFreeRestrictions_13_5" title="Referenced at line 24"><span class="token sort_Id">ContextFreeRestrictions</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Restriction_15_9" id="Restriction_13_36" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_9_9" id="Grammar_13_52" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Restriction_11_36" id="Restriction_15_9" title="Referenced at line 11, 12, 13, 16, 26"><span class="token sort_Id">Restriction</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Follow_27_20" id="Follow_16_5" title="Referenced at line 27"><span class="token sort_Id">Follow</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_11_9" id="Symbol_16_19" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Lookaheads_18_9" id="Lookaheads_16_29" title="Defined at line 18"><span class="token sort_Id">Lookaheads</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Restriction_15_9" id="Restriction_16_43" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Lookaheads_16_29" id="Lookaheads_18_9" title="Referenced at line 16"><span class="token sort_Id">Lookaheads</span></a></span>

<span class="keyword">rules</span>

  <a href="../grammar.stx/#grammarOK_16_3" id="grammarOK_22_3" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_22_73" id="s_22_13" title="Referenced at line 22"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Restrictions_11_5" id="Restrictions_22_16" title="Defined at line 11"><span class="token sort_Id">Restrictions</span></a><span class="operator">(</span><span class="cons_Var"><a href="#restrictions_22_76" id="restrictions_22_29" title="Referenced at line 22"><span class="token sort_Id">restrictions</span></a></span><span class="operator">)</span></span><span class="operator">)</span>            <span class="operator">:-</span> <a href="#restrictionsOK_28_3" id="restrictionsOK_22_58" title="Defined at line 28"><span class="token sort_Id">restrictionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_22_13" id="s_22_73" title="Defined at line 22"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#restrictions_22_29" id="restrictions_22_76" title="Defined at line 22"><span class="token sort_Id">restrictions</span></a></span><span class="operator">).</span>
  <a href="../grammar.stx/#grammarOK_16_3" id="grammarOK_23_3" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_23_73" id="s_23_13" title="Referenced at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#LexicalRestrictions_12_5" id="LexicalRestrictions_23_16" title="Defined at line 12"><span class="token sort_Id">LexicalRestrictions</span></a><span class="operator">(</span><span class="cons_Var"><a href="#restrictions_23_76" id="restrictions_23_36" title="Referenced at line 23"><span class="token sort_Id">restrictions</span></a></span><span class="operator">)</span></span><span class="operator">)</span>     <span class="operator">:-</span> <a href="#restrictionsOK_28_3" id="restrictionsOK_23_58" title="Defined at line 28"><span class="token sort_Id">restrictionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_23_13" id="s_23_73" title="Defined at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#restrictions_23_36" id="restrictions_23_76" title="Defined at line 23"><span class="token sort_Id">restrictions</span></a></span><span class="operator">).</span>
  <a href="../grammar.stx/#grammarOK_16_3" id="grammarOK_24_3" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_24_73" id="s_24_13" title="Referenced at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#ContextFreeRestrictions_13_5" id="ContextFreeRestrictions_24_16" title="Defined at line 13"><span class="token sort_Id">ContextFreeRestrictions</span></a><span class="operator">(</span><span class="cons_Var"><a href="#restrictions_24_76" id="restrictions_24_40" title="Referenced at line 24"><span class="token sort_Id">restrictions</span></a></span><span class="operator">)</span></span><span class="operator">)</span> <span class="operator">:-</span> <a href="#restrictionsOK_28_3" id="restrictionsOK_24_58" title="Defined at line 28"><span class="token sort_Id">restrictionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_24_13" id="s_24_73" title="Defined at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#restrictions_24_40" id="restrictions_24_76" title="Defined at line 24"><span class="token sort_Id">restrictions</span></a></span><span class="operator">).</span>

  <a href="#restrictionOK_27_3" id="restrictionOK_26_3" title="Referenced at line 27, 28"><span class="token sort_Id">restrictionOK</span></a><span class="operator">:</span> <span class="cons_ScopeSort"><span class="keyword">scope</span></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Restriction_15_9" id="Restriction_26_26" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span>
  <a href="#restrictionOK_26_3" id="restrictionOK_27_3" title="Defined at line 26"><span class="token sort_Id">restrictionOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_27_58" id="s_27_17" title="Referenced at line 27"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Follow_16_5" id="Follow_27_20" title="Defined at line 16"><span class="token sort_Id">Follow</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_27_61" id="symbols_27_27" title="Referenced at line 27"><span class="token sort_Id">symbols</span></a></span><span class="operator">,</span> <span class="operator">_)</span></span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_77_3" id="typesOfSymbols_27_43" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_27_17" id="s_27_58" title="Defined at line 27"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_27_27" id="symbols_27_61" title="Defined at line 27"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#restrictionsOK_22_58" id="restrictionsOK_28_3" title="Referenced at line 22, 23, 24"><span class="token sort_Id">restrictionsOK</span></a> <span class="keyword">maps</span> <a href="#restrictionOK_26_3" id="restrictionOK_28_23" title="Defined at line 26"><span class="token sort_Id">restrictionOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
