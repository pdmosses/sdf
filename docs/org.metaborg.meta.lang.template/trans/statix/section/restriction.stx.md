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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../main.stx/#statix/section/restriction_253_279" id="statix/section/restriction_7_33" title="Referenced at ../../main.stx line 15"><span class="token sort_Id">statix/section/restriction</span></a>

<span class="keyword">imports</span>

  <a href="../grammar.stx/#statix/section/grammar_7_29" id="statix/section/grammar_46_68" title="Defined at ../grammar.stx line 1"><span class="token sort_Id">statix/section/grammar</span></a>
  <a href="../../symbol.stx/#statix/symbol_7_20" id="statix/symbol_71_84" title="Defined at ../../symbol.stx line 1"><span class="token sort_Id">statix/symbol</span></a>

<span class="keyword">signature</span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Restrictions_420_432" id="Restrictions_116_128" title="Referenced at line 22"><span class="token sort_Id">Restrictions</span></a>            <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Restriction_298_309" id="Restriction_147_158" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_85_92" id="Grammar_163_170" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#LexicalRestrictions_510_529" id="LexicalRestrictions_175_194" title="Referenced at line 23"><span class="token sort_Id">LexicalRestrictions</span></a>     <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Restriction_298_309" id="Restriction_206_217" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_85_92" id="Grammar_222_229" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>
    <span class="cons_OpDecl"><a href="#ContextFreeRestrictions_600_623" id="ContextFreeRestrictions_234_257" title="Referenced at line 24"><span class="token sort_Id">ContextFreeRestrictions</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Restriction_298_309" id="Restriction_265_276" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../grammar.stx/#Grammar_85_92" id="Grammar_281_288" title="Defined at ../grammar.stx line 9"><span class="token sort_Id">Grammar</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Restriction_147_158" id="Restriction_298_309" title="Referenced at line 11, 12, 13, 16, 26"><span class="token sort_Id">Restriction</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Follow_732_738" id="Follow_327_333" title="Referenced at line 27"><span class="token sort_Id">Follow</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../../symbol.stx/#Symbol_94_100" id="Symbol_341_347" title="Defined at ../../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Lookaheads_386_396" id="Lookaheads_351_361" title="Defined at line 18"><span class="token sort_Id">Lookaheads</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Restriction_298_309" id="Restriction_365_376" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Lookaheads_351_361" id="Lookaheads_386_396" title="Referenced at line 16"><span class="token sort_Id">Lookaheads</span></a></span>

<span class="keyword">rules</span>

  <a href="../grammar.stx/#grammarOK_155_164" id="grammarOK_407_416" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_477_478" id="s_417_418" title="Referenced at line 22"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Restrictions_116_128" id="Restrictions_420_432" title="Defined at line 11"><span class="token sort_Id">Restrictions</span></a><span class="operator">(</span><span class="cons_Var"><a href="#restrictions_480_492" id="restrictions_433_445" title="Referenced at line 22"><span class="token sort_Id">restrictions</span></a></span>)</span><span class="operator">)</span>            <span class="operator">:-</span> <a href="#restrictionsOK_790_804" id="restrictionsOK_462_476" title="Defined at line 28"><span class="token sort_Id">restrictionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_417_418" id="s_477_478" title="Defined at line 22"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#restrictions_433_445" id="restrictions_480_492" title="Defined at line 22"><span class="token sort_Id">restrictions</span></a></span><span class="operator">).</span>
  <a href="../grammar.stx/#grammarOK_155_164" id="grammarOK_497_506" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_567_568" id="s_507_508" title="Referenced at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#LexicalRestrictions_175_194" id="LexicalRestrictions_510_529" title="Defined at line 12"><span class="token sort_Id">LexicalRestrictions</span></a><span class="operator">(</span><span class="cons_Var"><a href="#restrictions_570_582" id="restrictions_530_542" title="Referenced at line 23"><span class="token sort_Id">restrictions</span></a></span>)</span><span class="operator">)</span>     <span class="operator">:-</span> <a href="#restrictionsOK_790_804" id="restrictionsOK_552_566" title="Defined at line 28"><span class="token sort_Id">restrictionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_507_508" id="s_567_568" title="Defined at line 23"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#restrictions_530_542" id="restrictions_570_582" title="Defined at line 23"><span class="token sort_Id">restrictions</span></a></span><span class="operator">).</span>
  <a href="../grammar.stx/#grammarOK_155_164" id="grammarOK_587_596" title="Defined at ../grammar.stx line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_657_658" id="s_597_598" title="Referenced at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#ContextFreeRestrictions_234_257" id="ContextFreeRestrictions_600_623" title="Defined at line 13"><span class="token sort_Id">ContextFreeRestrictions</span></a><span class="operator">(</span><span class="cons_Var"><a href="#restrictions_660_672" id="restrictions_624_636" title="Referenced at line 24"><span class="token sort_Id">restrictions</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#restrictionsOK_790_804" id="restrictionsOK_642_656" title="Defined at line 28"><span class="token sort_Id">restrictionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_597_598" id="s_657_658" title="Defined at line 24"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#restrictions_624_636" id="restrictions_660_672" title="Defined at line 24"><span class="token sort_Id">restrictions</span></a></span><span class="operator">).</span>

  <a href="#restrictionOK_715_728" id="restrictionOK_678_691" title="Referenced at line 27, 28"><span class="token sort_Id">restrictionOK</span></a><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Restriction_298_309" id="Restriction_701_712" title="Defined at line 15"><span class="token sort_Id">Restriction</span></a></span>
  <a href="#restrictionOK_678_691" id="restrictionOK_715_728" title="Defined at line 26"><span class="token sort_Id">restrictionOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_770_771" id="s_729_730" title="Referenced at line 27"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Follow_327_333" id="Follow_732_738" title="Defined at line 16"><span class="token sort_Id">Follow</span></a><span class="operator">(</span><span class="cons_Var"><a href="#symbols_773_780" id="symbols_739_746" title="Referenced at line 27"><span class="token sort_Id">symbols</span></a></span>, _)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../../symbol.stx/#typesOfSymbols_2424_2438" id="typesOfSymbols_755_769" title="Defined at ../../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_729_730" id="s_770_771" title="Defined at line 27"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_739_746" id="symbols_773_780" title="Defined at line 27"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#restrictionsOK_462_476" id="restrictionsOK_790_804" title="Referenced at line 22, 23, 24"><span class="token sort_Id">restrictionsOK</span></a> <span class="keyword">maps</span> <a href="#restrictionOK_678_691" id="restrictionOK_810_823" title="Defined at line 26"><span class="token sort_Id">restrictionOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>