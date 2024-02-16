---
title: Comments.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="layout/Comments_1_8" title="a definition with multiple references" data-urls="../../grammar/Grammars.sdf3/#layout/Comments line 3_9; ../../symbols/Symbols.sdf3/#layout/Comments line 3_9">layout/Comments</button>

<span class="keyword">imports</span>
  <a href="../Whitespace.sdf3/#layout/Whitespace_1_8" id="layout/Whitespace_4_3" title="a reference to a single-file definition">layout/Whitespace</a>
 
<span class="keyword">lexical syntax</span>
        <span class="keyword">LAYOUT</span> = <span class="cons_Lit">"%%"</span> <span class="cons_Unquoted"><span id="line_7_16" title="a definition with no references">line</span></span>:~[\n\r]* <a href="#LayoutNewlineAlt_8_2" id="LayoutNewlineAlt_7_30" title="a reference to a single-file definition">LayoutNewlineAlt</a>        {<span class="cons_Unquoted">category</span>(<span class="cons_Quoted">"Comment"</span>)}
        <button class="modal-open" id="LayoutNewlineAlt_8_2" title="a definition with multiple references" data-urls="#LayoutNewlineAlt line 7_30, 15_28">LayoutNewlineAlt</button> = [\n\r]
        <button class="modal-open" id="LayoutNewlineAlt_9_2" title="a definition with multiple references" data-urls="#LayoutNewlineAlt line 7_30, 15_28">LayoutNewlineAlt</button> = <a href="#EOF_16_5" id="EOF_9_21" title="a reference to a single-file definition">EOF</a>
    <span class="keyword">LAYOUT</span> = <span class="cons_Lit">"%"</span> <span class="cons_Unquoted"><span id="content_10_18" title="a definition with no references">content</span></span>:~[\%\n\r]+ <span class="cons_Lit">"%"</span>        {<span class="cons_Unquoted">category</span>(<span class="cons_Quoted">"Comment"</span>)}
    <span class="keyword">LAYOUT</span> = <span class="cons_Lit">"/*"</span> <a href="#LayoutCommentAlt_12_5" id="LayoutCommentAlt_11_19" title="a reference to a single-file definition">LayoutCommentAlt</a>* <span class="cons_Lit">"*/"</span> 
    <a href="#LayoutCommentAlt_11_19" id="LayoutCommentAlt_12_5" title="a definition with a single reference">LayoutCommentAlt</a> = ~[\*]
    <a href="#LayoutCommentAlt_11_19" id="LayoutCommentAlt_13_5" title="a definition with a single reference">LayoutCommentAlt</a> = <a href="#CommentChar_14_5" id="CommentChar_13_24" title="a reference to a single-file definition">CommentChar</a>
    <button class="modal-open" id="CommentChar_14_5" title="a definition with multiple references" data-urls="#CommentChar line 13_24, 20_5">CommentChar</button> = [\*]
    <span class="keyword">LAYOUT</span> = <span class="cons_Lit">"//"</span> ~[\n\r]* <a href="#LayoutNewlineAlt_8_2" id="LayoutNewlineAlt_15_28" title="a reference to a single-file definition">LayoutNewlineAlt</a>
    <button class="modal-open" id="EOF_16_5" title="a definition with multiple references" data-urls="#EOF line 9_21, 24_5">EOF</button> = 
    
<span class="keyword">lexical restrictions</span>

    <a href="#CommentChar_14_5" id="CommentChar_20_5" title="a reference to a single-file definition">CommentChar</a>   -/- [\/]

    <span class="layout">%% EOF may not be followed by any char</span>

    <a href="#EOF_16_5" id="EOF_24_5" title="a reference to a single-file definition">EOF</a>           -/- ~[]          
       

<span class="keyword">context-free restrictions</span> 
    <span class="keyword">LAYOUT</span>? -/- [\%]
    <span class="keyword">LAYOUT</span>? -/- [\ \t\n\r]
    <span class="keyword">LAYOUT</span>? -/- [\/].[\/]
    <span class="keyword">LAYOUT</span>? -/- [\/].[\*]
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
