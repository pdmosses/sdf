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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/section/section_1_8" title="a definition with multiple references" data-urls="../grammar.stx/#statix/section/section line 5_3; ../template.stx/#statix/section/section line 5_3; ../../main.stx/#statix/section/section line 8_3; ../../module.stx/#statix/section/section line 5_3"><span class="token sort_Id">statix/section/section</span></button>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Section_5_9" title="a definition with multiple references" data-urls="#Section line 9_22; ../grammar.stx/#Section line 12_29; ../template.stx/#Section line 16_51, 96_47; ../../module.stx/#Section line 13_51"><span class="token sort_Id">Section</span></button></span>

<span class="keyword">rules</span>

  <button class="modal-open" id="sectionOK_9_3" title="a definition with multiple references" data-urls="#sectionOK line 10_19; ../grammar.stx/#sectionOK line 18_3; ../template.stx/#sectionOK line 46_3, 103_3"><span class="token sort_Id">sectionOK</span></button><span class="operator">:</span> <span class="cons_ScopeSort"><span class="keyword">scope</span></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Section_5_9" id="Section_9_22" title="a reference to a single-file definition"><span class="token sort_Id">Section</span></a></span>
  <a href="../../module.stx/#sectionsOK_29_5" id="sectionsOK_10_3" title="a definition with a single reference"><span class="token sort_Id">sectionsOK</span></a> <span class="keyword">maps</span> <a href="#sectionOK_9_3" id="sectionOK_10_19" title="a reference to a single-file definition"><span class="token sort_Id">sectionOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
