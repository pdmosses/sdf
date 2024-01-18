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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/section/section_1_8" title="Multi-file references" data-urls="../grammar.stx/#statix/section/section_5_3 line 5; ../template.stx/#statix/section/section_5_3 line 5; ../../main.stx/#statix/section/section_8_3 line 8; ../../module.stx/#statix/section/section_5_3 line 5"><span class="token sort_Id">statix/section/section</span></button>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Section_5_9" title="Multi-file references" data-urls="#Section_9_22 line 9; ../grammar.stx/#Section_12_29 line 12; ../template.stx/#Section_16_51 line 16, 96; ../../module.stx/#Section_13_51 line 13"><span class="token sort_Id">Section</span></button></span>

<span class="keyword">rules</span>

  <button class="modal-open" id="sectionOK_9_3" title="Multi-file references" data-urls="#sectionOK_10_19 line 10; ../grammar.stx/#sectionOK_18_3 line 18; ../template.stx/#sectionOK_46_3 line 46, 103"><span class="token sort_Id">sectionOK</span></button><span class="operator">:</span> <span class="cons_ScopeSort"><span class="keyword">scope</span></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Section_5_9" id="Section_9_22" title="Defined at line 5"><span class="token sort_Id">Section</span></a></span>
  <a href="../../module.stx/#sectionsOK_29_5" id="sectionsOK_10_3" title="Referenced at ../../module.stx line 29"><span class="token sort_Id">sectionsOK</span></a> <span class="keyword">maps</span> <a href="#sectionOK_9_3" id="sectionOK_10_19" title="Defined at line 9"><span class="token sort_Id">sectionOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
