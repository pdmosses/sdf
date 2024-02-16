---
title: SDF.sdf3
hide:
  - toc
---

# `SDF.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/sdf2-core/SDF.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/sdf2-core/SDF.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/sdf2-core/SDF.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
<td class="code"><pre><code><span class="keyword">module</span> <span id="sdf2-core/SDF_1_8" title="a definition with no references">sdf2-core/SDF</span>
<span class="keyword">imports</span> <a href="../Sdf2.sdf3/#sdf2-core/Sdf2_1_8" id="sdf2-core/Sdf2_2_9" title="a reference to a single-file definition">sdf2-core/Sdf2</a> <a href="../../modules/Modules.sdf3/#modules/Modules_1_8" id="modules/Modules_2_24" title="a reference to a single-file definition">modules/Modules</a>

<span class="keyword">context-free syntax</span>
<a href="#Group_5_25" id="Group_5_1" title="a definition with a single reference">Group</a>.<span class="cons_Constructor"><span id="NonTransitive_5_7" title="a definition with no references">NonTransitive</span></span> = &lt;&lt;<a href="#Group_5_1" id="Group_5_25" title="a reference to a single-file definition">Group</a>&gt;<span class="cons_String">.</span>&gt; {<span class="keyword">non-assoc</span>}

<span class="layout">%% HACK</span>
<span class="layout">//  context-free syntax</span>
<span class="layout">//  Group "." -&gt; Group {non-assoc,cons("non-transitive")}</span>
 
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
