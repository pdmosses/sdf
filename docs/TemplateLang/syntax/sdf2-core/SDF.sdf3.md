---
title: SDF.sdf3
---

# `SDF.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/sdf2-core/SDF.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/sdf2-core/SDF.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/sdf2-core/SDF.sdf3 "The source file on GitHub"

<div class="TemplateLang"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
<td class="code"><pre><code><span class="keyword">module</span> <span id="sdf2-core/SDF_7_20" title="Not referenced locally, nor via imports">sdf2-core/SDF</span>
<span class="keyword">imports</span> <a href="../Sdf2.sdf3#sdf2-core/Sdf2_7_21" id="sdf2-core/Sdf2_29_43" title="Defined at ../Sdf2.sdf3 line 1">sdf2-core/Sdf2</a> <a href="../../modules/Modules.sdf3#modules/Modules_7_22" id="modules/Modules_44_59" title="Defined at ../../modules/Modules.sdf3 line 1">modules/Modules</a>

<span class="keyword">context-free syntax</span>
<a href="#Group_105_110" id="Group_81_86" title="Referenced at line 5">Group</a>.<span class="cons_Constructor"><span id="NonTransitive_87_100" title="Not referenced locally, nor via imports">NonTransitive</span></span> = &lt;&lt;<a href="#Group_81_86" id="Group_105_110" title="Defined at line 5">Group</a>&gt;<span class="cons_String">.</span>&gt; {<span class="keyword">non-assoc</span>}

<span class="layout">%% HACK</span>
<span class="layout">//  context-free syntax</span>
<span class="layout">//  Group "." -&gt; Group {non-assoc,cons("non-transitive")}</span>
 
</code></pre></td></tr></tbody></table></div>