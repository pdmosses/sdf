---
title: IdentifierCon.sdf3
---

# `IdentifierCon.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/constants/IdentifierCon.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/constants/IdentifierCon.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/constants/IdentifierCon.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../literals/Literals.sdf3#constants/IdentifierCon_69_92" id="constants/IdentifierCon_7_30" title="Referenced at ../../literals/Literals.sdf3 line 5">constants/IdentifierCon</a>

<span class="keyword">lexical syntax</span>
 
<span class="layout">//head:[A-Za-z] tail:[A-Za-z\_\-0-9]* -&gt; IdCon {cons("default")}</span>
<a href="../../aterms/Aterms.sdf3#IdCon_185_190" id="IdCon_114_119" title="Referenced at ../../aterms/Aterms.sdf3 line 10; line 10; ../../labels/Labels.sdf3 line 10; ../../layout-constraints/Layout-Constraints.sdf3 line 24; ../../literals/Literals.sdf3 line 19; ../../TemplateLang.sdf3 line 95">IdCon</a>.<span class="cons_Constructor"><span id="Default_120_127" title="Not referenced locally, nor via imports">Default</span></span> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>][<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>\_\-<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]*

<span class="keyword">lexical restrictions</span>

<a href="#IdCon_114_119" id="IdCon_178_183" title="Defined at line 6">IdCon</a> -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>\_\-<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]
</code></pre></td></tr></tbody></table></div>