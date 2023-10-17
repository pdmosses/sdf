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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../priority.stx/#statix/section/grammar_43_65" id="statix/section/grammar_7_29" title="Referenced at ../priority.stx line 5; ../restriction.stx line 5; ../sort.stx line 5; ../start_symbol.stx line 5; ../syntax.stx line 5; ../../main.stx line 9"><span class="token sort_Id">statix/section/grammar</span></a>

<span class="keyword">imports</span>

  <a href="../section.stx/#statix/section/section_7_29" id="statix/section/section_42_64" title="Defined at ../section.stx line 1"><span class="token sort_Id">statix/section/section</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Grammar_126_133" id="Grammar_85_92" title="Referenced at line 12, 16; ../priority.stx line 12, 13, 14; ../restriction.stx line 11, 12, 13; ../sort.stx line 11; ../start_symbol.stx line 11, 12, 13; ../syntax.stx line 17, 18, 19, 20, 21, 22, 23, 24, 25, 26"><span class="token sort_Id">Grammar</span></a></span>

  <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#SDFSection_198_208" id="SDFSection_113_123" title="Referenced at line 18"><span class="token sort_Id">SDFSection</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Grammar_85_92" id="Grammar_126_133" title="Defined at line 9"><span class="token sort_Id">Grammar</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../section.stx/#Section_50_57" id="Section_137_144" title="Defined at ../section.stx line 5"><span class="token sort_Id">Section</span></a></span></span>

<span class="keyword">rules</span>

  <a href="#grammarOK_222_231" id="grammarOK_155_164" title="Referenced at line 18; ../priority.stx line 38, 39, 40; ../restriction.stx line 22, 23, 24; ../sort.stx line 20; ../start_symbol.stx line 17, 18, 19; ../syntax.stx line 44, 45, 46, 47, 48, 49, 50, 51, 52, 53"><span class="token sort_Id">grammarOK</span></a><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Grammar_85_92" id="Grammar_174_181" title="Defined at line 9"><span class="token sort_Id">Grammar</span></a></span>

  <a href="../section.stx/#sectionOK_68_77" id="sectionOK_185_194" title="Defined at ../section.stx line 9"><span class="token sort_Id">sectionOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_232_233" id="s_195_196" title="Referenced at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#SDFSection_113_123" id="SDFSection_198_208" title="Defined at line 12"><span class="token sort_Id">SDFSection</span></a><span class="operator">(</span><span class="cons_Var"><a href="#grammar_235_242" id="grammar_209_216" title="Referenced at line 18"><span class="token sort_Id">grammar</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#grammarOK_155_164" id="grammarOK_222_231" title="Defined at line 16"><span class="token sort_Id">grammarOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_195_196" id="s_232_233" title="Defined at line 18"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#grammar_209_216" id="grammar_235_242" title="Defined at line 18"><span class="token sort_Id">grammar</span></a></span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>