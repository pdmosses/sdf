---
title: Whitespace.sdf3
hide:
  - toc
---

# `Whitespace.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/layout/Whitespace.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/layout/Whitespace.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/layout/Whitespace.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Comments.sdf3/#layout/Whitespace_34_51" id="layout/Whitespace_7_24" title="Referenced at ../Comments.sdf3 line 4; ../../constants/IntCon.sdf3 line 3">layout/Whitespace</a> 
    
<span class="keyword">lexical syntax</span>    
    <span class="keyword">LAYOUT</span> = [\ \t\n\r]

<span class="keyword">context-free restrictions</span>
    <span class="keyword">LAYOUT</span>? -/- [\ \t\n\r] 
</code></pre></td></tr></tbody></table></div>