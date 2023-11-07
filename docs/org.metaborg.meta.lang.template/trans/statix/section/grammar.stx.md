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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/section/grammar_0_7" title="Multi-file references" data-urls="../priority.stx/#statix/section/grammar_5_3 ../restriction.stx/#statix/section/grammar_5_3 ../sort.stx/#statix/section/grammar_5_3 ../start_symbol.stx/#statix/section/grammar_5_3 ../syntax.stx/#statix/section/grammar_5_3 ../../main.stx/#statix/section/grammar_9_3"><span class="token sort_Id">statix/section/grammar</span></button>

<span class="keyword">imports</span>

  <a href="../section.stx/#statix/section/section_0_7" id="statix/section/section_4_2" title="Defined at ../section.stx line 1"><span class="token sort_Id">statix/section/section</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Grammar_8_8" title="Multi-file references" data-urls="#Grammar_12_18 ../priority.stx/#Grammar_12_48 ../restriction.stx/#Grammar_11_52 ../sort.stx/#Grammar_11_33 ../start_symbol.stx/#Grammar_11_47 ../syntax.stx/#Grammar_17_57"><span class="token sort_Id">Grammar</span></button></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#SDFSection_17_15" id="SDFSection_11_4" title="Referenced at line 18"><span class="token sort_Id">SDFSection</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Grammar_8_8" id="Grammar_11_17" title="Defined at line 9"><span class="token sort_Id">Grammar</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../section.stx/#Section_4_8" id="Section_11_28" title="Defined at ../section.stx line 5"><span class="token sort_Id">Section</span></a></span></span>

<span class="keyword">rules</span>

  <button class="modal-open" id="grammarOK_15_2" title="Multi-file references" data-urls="#grammarOK_18_40 ../priority.stx/#grammarOK_38_3 ../restriction.stx/#grammarOK_22_3 ../sort.stx/#grammarOK_20_3 ../start_symbol.stx/#grammarOK_17_3 ../syntax.stx/#grammarOK_44_3"><span class="token sort_Id">grammarOK</span></button><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Grammar_8_8" id="Grammar_15_21" title="Defined at line 9"><span class="token sort_Id">Grammar</span></a></span>

  <a href="../section.stx/#sectionOK_8_2" id="sectionOK_17_2" title="Defined at ../section.stx line 9"><span class="token sort_Id">sectionOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_49" id="s_17_12" title="Referenced at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#SDFSection_11_4" id="SDFSection_17_15" title="Defined at line 12"><span class="token sort_Id">SDFSection</span></a><span class="operator">(</span><span class="cons_Var"><a href="#grammar_17_52" id="grammar_17_26" title="Referenced at line 18"><span class="token sort_Id">grammar</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#grammarOK_15_2" id="grammarOK_17_39" title="Defined at line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_17_12" id="s_17_49" title="Defined at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#grammar_17_26" id="grammar_17_52" title="Defined at line 18"><span class="token sort_Id">grammar</span></a></span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
