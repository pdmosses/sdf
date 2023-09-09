---
title: Grammars.sdf3
---

# `Grammars.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/grammar/Grammars.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/grammar/Grammars.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/grammar/Grammars.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../kernel/Kernel.sdf3#grammar/Grammars_78_94" id="grammar/Grammars_7_23" title="Referenced at ../../kernel/Kernel.sdf3 line 5">grammar/Grammars</a>

<span class="keyword">imports</span> <a href="../../layout/Comments.sdf3#layout/Comments_7_22" id="layout/Comments_33_48" title="Defined at ../../layout/Comments.sdf3 line 1">layout/Comments</a>
 
<span class="keyword">context-free syntax</span>

<span class="layout">//Grammar.Empty = &lt;(/)&gt;</span>
<span class="layout">//"left":Grammar "right":Grammar -&gt; Grammar  {assoc,cons("conc-grammars")}</span>
<span class="layout">//Grammar.ConcGrammars = &lt;&lt;Grammar&gt; &lt;Grammar&gt;&gt; {assoc} IGNORED RULE</span>
<span class="layout">//Grammar = &lt;(&lt;Grammar&gt;)&gt; {bracket}</span>

</code></pre></td></tr></tbody></table></div>