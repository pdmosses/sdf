---
title: grammar.stx
hide:
  - toc
---

# `grammar.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/section/grammar.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/section/grammar.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/section/grammar.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/section/grammar_1_8" title="Multi-file references" data-urls="../priority.stx/#statix/section/grammar_5_3 line 5; ../restriction.stx/#statix/section/grammar_5_3 line 5; ../sort.stx/#statix/section/grammar_5_3 line 5; ../start_symbol.stx/#statix/section/grammar_5_3 line 5; ../syntax.stx/#statix/section/grammar_5_3 line 5; ../../main.stx/#statix/section/grammar_9_3 line 9"><span class="token sort_Id">statix/section/grammar</span></button>

<span class="keyword">imports</span>

  <a href="../section.stx/#statix/section/section_1_8" id="statix/section/section_5_3" title="Defined at ../section.stx line 1"><span class="token sort_Id">statix/section/section</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Grammar_9_9" title="Multi-file references" data-urls="#Grammar_12_18 line 12, 16; ../priority.stx/#Grammar_12_48 line 12, 13, 14; ../restriction.stx/#Grammar_11_52 line 11, 12, 13; ../sort.stx/#Grammar_11_33 line 11; ../start_symbol.stx/#Grammar_11_47 line 11, 12, 13; ../syntax.stx/#Grammar_17_57 line 17, 18, 19, 20, 21, 22, 23, 24, 25, 26"><span class="token sort_Id">Grammar</span></button></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#SDFSection_18_16" id="SDFSection_12_5" title="Referenced at line 18"><span class="token sort_Id">SDFSection</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Grammar_9_9" id="Grammar_12_18" title="Defined at line 9"><span class="token sort_Id">Grammar</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../section.stx/#Section_5_9" id="Section_12_29" title="Defined at ../section.stx line 5"><span class="token sort_Id">Section</span></a></span></span>

<span class="keyword">rules</span>

  <button class="modal-open" id="grammarOK_16_3" title="Multi-file references" data-urls="#grammarOK_18_40 line 18; ../priority.stx/#grammarOK_38_3 line 38, 39, 40; ../restriction.stx/#grammarOK_22_3 line 22, 23, 24; ../sort.stx/#grammarOK_20_3 line 20; ../start_symbol.stx/#grammarOK_17_3 line 17, 18, 19; ../syntax.stx/#grammarOK_44_3 line 44, 45, 46, 47, 48, 49, 50, 51, 52, 53"><span class="token sort_Id">grammarOK</span></button><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Grammar_9_9" id="Grammar_16_22" title="Defined at line 9"><span class="token sort_Id">Grammar</span></a></span>

  <a href="../section.stx/#sectionOK_9_3" id="sectionOK_18_3" title="Defined at ../section.stx line 9"><span class="token sort_Id">sectionOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_50" id="s_18_13" title="Referenced at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#SDFSection_12_5" id="SDFSection_18_16" title="Defined at line 12"><span class="token sort_Id">SDFSection</span></a><span class="operator">(</span><span class="cons_Var"><a href="#grammar_18_53" id="grammar_18_27" title="Referenced at line 18"><span class="token sort_Id">grammar</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#grammarOK_16_3" id="grammarOK_18_40" title="Defined at line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_13" id="s_18_50" title="Defined at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#grammar_18_27" id="grammar_18_53" title="Defined at line 18"><span class="token sort_Id">grammar</span></a></span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
