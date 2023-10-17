---
title: section.stx
hide:
  - toc
---

# `section.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/section/section.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/section/section.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/section/section.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../grammar.stx/#statix/section/section_42_64" id="statix/section/section_7_29" title="Referenced at ../grammar.stx line 5; ../template.stx line 5; ../../main.stx line 8; ../../module.stx line 5"><span class="token sort_Id">statix/section/section</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Section_87_94" id="Section_50_57" title="Referenced at line 9; ../grammar.stx line 12; ../template.stx line 16, 96; ../../module.stx line 13"><span class="token sort_Id">Section</span></a></span>

<span class="keyword">rules</span>

  <a href="#sectionOK_113_122" id="sectionOK_68_77" title="Referenced at line 10; ../grammar.stx line 18; ../template.stx line 46, 103"><span class="token sort_Id">sectionOK</span></a><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Section_50_57" id="Section_87_94" title="Defined at line 5"><span class="token sort_Id">Section</span></a></span>
  <a href="../../module.stx/#sectionsOK_686_696" id="sectionsOK_97_107" title="Referenced at ../../module.stx line 29"><span class="token sort_Id">sectionsOK</span></a> <span class="keyword">maps</span> <a href="#sectionOK_68_77" id="sectionOK_113_122" title="Defined at line 9"><span class="token sort_Id">sectionOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>