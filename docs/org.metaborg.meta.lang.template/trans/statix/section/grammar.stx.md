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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/section/grammar_1_8" title="a definition with multiple references" data-urls="../priority.stx/#statix/section/grammar line 5_3; ../restriction.stx/#statix/section/grammar line 5_3; ../sort.stx/#statix/section/grammar line 5_3; ../start_symbol.stx/#statix/section/grammar line 5_3; ../syntax.stx/#statix/section/grammar line 5_3; ../../main.stx/#statix/section/grammar line 9_3"><span class="token sort_Id">statix/section/grammar</span></button>

<span class="keyword">imports</span>

  <a href="../section.stx/#statix/section/section_1_8" id="statix/section/section_5_3" title="a reference to a single-file definition"><span class="token sort_Id">statix/section/section</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Grammar_9_9" title="a definition with multiple references" data-urls="#Grammar line 12_18, 16_22; ../priority.stx/#Grammar line 12_48, 13_48, 14_48; ../restriction.stx/#Grammar line 11_52, 12_52, 13_52; ../sort.stx/#Grammar line 11_33; ../start_symbol.stx/#Grammar line 11_47, 12_47, 13_47; ../syntax.stx/#Grammar line 17_57, 18_57, 19_57, 20_57, 21_57, 22_57, 23_57, 24_57, 25_57, 26_57"><span class="token sort_Id">Grammar</span></button></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#SDFSection_18_16" id="SDFSection_12_5" title="a definition with a single reference"><span class="token sort_Id">SDFSection</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Grammar_9_9" id="Grammar_12_18" title="a reference to a single-file definition"><span class="token sort_Id">Grammar</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../section.stx/#Section_5_9" id="Section_12_29" title="a reference to a single-file definition"><span class="token sort_Id">Section</span></a></span></span>

<span class="keyword">rules</span>

  <button class="modal-open" id="grammarOK_16_3" title="a definition with multiple references" data-urls="#grammarOK line 18_40; ../priority.stx/#grammarOK line 38_3, 39_3, 40_3; ../restriction.stx/#grammarOK line 22_3, 23_3, 24_3; ../sort.stx/#grammarOK line 20_3; ../start_symbol.stx/#grammarOK line 17_3, 18_3, 19_3; ../syntax.stx/#grammarOK line 44_3, 45_3, 46_3, 47_3, 48_3, 49_3, 50_3, 51_3, 52_3, 53_3"><span class="token sort_Id">grammarOK</span></button><span class="operator">:</span> <span class="cons_ScopeSort"><span class="keyword">scope</span></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Grammar_9_9" id="Grammar_16_22" title="a reference to a single-file definition"><span class="token sort_Id">Grammar</span></a></span>

  <a href="../section.stx/#sectionOK_9_3" id="sectionOK_18_3" title="a reference to a single-file definition"><span class="token sort_Id">sectionOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_50" id="s_18_13" title="a definition with a single reference"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#SDFSection_12_5" id="SDFSection_18_16" title="a reference to a single-file definition"><span class="token sort_Id">SDFSection</span></a><span class="operator">(</span><span class="cons_Var"><a href="#grammar_18_53" id="grammar_18_27" title="a definition with a single reference"><span class="token sort_Id">grammar</span></a></span><span class="operator">)</span></span><span class="operator">)</span> <span class="operator">:-</span> <a href="#grammarOK_16_3" id="grammarOK_18_40" title="a reference to a single-file definition"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_18_13" id="s_18_50" title="a reference to a single-file definition"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#grammar_18_27" id="grammar_18_53" title="a reference to a single-file definition"><span class="token sort_Id">grammar</span></a></span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
