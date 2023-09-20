---
title: Comments.sdf3
---

# `Comments.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/layout/Comments.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/layout/Comments.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/layout/Comments.sdf3 "The source file on GitHub"

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
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../symbols/Symbols.sdf3#layout/Comments_32_47" id="layout/Comments_7_22" title="Referenced at ../../symbols/Symbols.sdf3 line 3">layout/Comments</a>

<span class="keyword">imports</span>
  <a href="../Whitespace.sdf3#layout/Whitespace_7_24" id="layout/Whitespace_34_51" title="Defined at ../Whitespace.sdf3 line 1">layout/Whitespace</a>
 
<span class="keyword">lexical syntax</span>
        <span class="keyword">LAYOUT</span> = <span class="cons_Lit">"%%"</span> <span class="cons_Unquoted"><span id="line_84_88" title="Not referenced locally, nor via imports">line</span></span>:~[\n\r]* <a href="#LayoutNewlineAlt_138_154" id="LayoutNewlineAlt_98_114" title="Defined at line 8, 9">LayoutNewlineAlt</a>        {<span class="cons_Unquoted">category</span>(<span class="cons_Quoted">"Comment"</span>)}
        <a href="#LayoutNewlineAlt_406_422" id="LayoutNewlineAlt_138_154" title="Referenced at line 15">LayoutNewlineAlt</a> = [\n\r]
        <a href="#LayoutNewlineAlt_406_422" id="LayoutNewlineAlt_165_181" title="Referenced at line 15">LayoutNewlineAlt</a> = <a href="#EOF_427_430" id="EOF_184_187" title="Defined at line 16">EOF</a>
    <span class="keyword">LAYOUT</span> = <span class="cons_Lit">"%"</span> <span class="cons_Unquoted"><span id="content_205_212" title="Not referenced locally, nor via imports">content</span></span>:~[\%\n\r]+ <span class="cons_Lit">"%"</span>        {<span class="cons_Unquoted">category</span>(<span class="cons_Quoted">"Comment"</span>)}
    <span class="keyword">LAYOUT</span> = <span class="cons_Lit">"/*"</span> <a href="#LayoutCommentAlt_296_312" id="LayoutCommentAlt_268_284" title="Defined at line 12, 13">LayoutCommentAlt</a>* <span class="cons_Lit">"*/"</span> 
    <a href="#LayoutCommentAlt_268_284" id="LayoutCommentAlt_296_312" title="Referenced at line 11">LayoutCommentAlt</a> = ~[\*]
    <a href="#LayoutCommentAlt_268_284" id="LayoutCommentAlt_325_341" title="Referenced at line 11">LayoutCommentAlt</a> = <a href="#CommentChar_360_371" id="CommentChar_344_355" title="Defined at line 14">CommentChar</a>
    <a href="#CommentChar_465_476" id="CommentChar_360_371" title="Referenced at line 20">CommentChar</a> = [\*]
    <span class="keyword">LAYOUT</span> = <span class="cons_Lit">"//"</span> ~[\n\r]* <a href="#LayoutNewlineAlt_138_154" id="LayoutNewlineAlt_406_422" title="Defined at line 8, 9">LayoutNewlineAlt</a>
    <a href="#EOF_537_540" id="EOF_427_430" title="Referenced at line 24">EOF</a> = 
    
<span class="keyword">lexical restrictions</span>

    <a href="#CommentChar_360_371" id="CommentChar_465_476" title="Defined at line 14">CommentChar</a>   -/- [\/]

    <span class="layout">%% EOF may not be followed by any char</span>

    <a href="#EOF_427_430" id="EOF_537_540" title="Defined at line 16">EOF</a>           -/- ~[]          
       

<span class="keyword">context-free restrictions</span> 
    <span class="keyword">LAYOUT</span>? -/- [\%]
    <span class="keyword">LAYOUT</span>? -/- [\ \t\n\r]
    <span class="keyword">LAYOUT</span>? -/- [\/].[\/]
    <span class="keyword">LAYOUT</span>? -/- [\/].[\*]
</code></pre></td></tr></tbody></table></div>