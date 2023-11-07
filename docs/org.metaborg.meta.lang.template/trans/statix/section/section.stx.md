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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/section/section_0_7" title="Multi-file references" data-urls="../grammar.stx/#statix/section/section_5_3 ../template.stx/#statix/section/section_5_3 ../../main.stx/#statix/section/section_8_3 ../../module.stx/#statix/section/section_5_3"><span class="token sort_Id">statix/section/section</span></button>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Section_4_8" title="Multi-file references" data-urls="#Section_9_22 ../grammar.stx/#Section_12_29 ../template.stx/#Section_16_51 ../../module.stx/#Section_13_51"><span class="token sort_Id">Section</span></button></span>

<span class="keyword">rules</span>

  <button class="modal-open" id="sectionOK_8_2" title="Multi-file references" data-urls="#sectionOK_10_19 ../grammar.stx/#sectionOK_18_3 ../template.stx/#sectionOK_46_3"><span class="token sort_Id">sectionOK</span></button><span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Section_4_8" id="Section_8_21" title="Defined at line 5"><span class="token sort_Id">Section</span></a></span>
  <a href="../../module.stx/#sectionsOK_28_4" id="sectionsOK_9_2" title="Referenced at ../../module.stx line 29"><span class="token sort_Id">sectionsOK</span></a> <span class="keyword">maps</span> <a href="#sectionOK_8_2" id="sectionOK_9_18" title="Defined at line 9"><span class="token sort_Id">sectionOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
