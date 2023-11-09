---
title: Labels.sdf3
hide:
  - toc
---

# `Labels.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/labels/Labels.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/labels/Labels.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/labels/Labels.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="labels/Labels_1_8" title="Multi-file references" data-urls="../../TemplateLang.sdf3/#labels/Labels_7_3 line 7; ../../regular/Regular.sdf3/#labels/Labels_3_73 line 3; ../../sdf2-core/Sdf2-Syntax.sdf3/#labels/Labels_13_9 line 13">labels/Labels</button>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_1_8" id="kernel/Kernel_3_9" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> 
        <a href="../../constants/StrCon.sdf3/#constants/StrCon_1_8" id="constants/StrCon_4_9" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>
        <a href="../../constants/IdentifierCon.sdf3/#constants/IdentifierCon_1_8" id="constants/IdentifierCon_5_9" title="Defined at ../../constants/IdentifierCon.sdf3 line 1">constants/IdentifierCon</a>
 
<span class="keyword">context-free syntax</span>

<a href="#Label_11_18" id="Label_9_1" title="Referenced at line 11">Label</a>.<span class="cons_Constructor"><span id="Quoted_9_7" title="Not referenced">Quoted</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3/#StrCon_12_5" id="StrCon_9_18" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;
<a href="#Label_11_18" id="Label_10_1" title="Referenced at line 11">Label</a>.<span class="cons_Constructor"><span id="Unquoted_10_7" title="Not referenced">Unquoted</span></span> = &lt;&lt;<a href="../../constants/IdentifierCon.sdf3/#IdCon_6_1" id="IdCon_10_20" title="Defined at ../../constants/IdentifierCon.sdf3 line 6">IdCon</a>&gt;&gt;
<a href="#Symbol_11_26" id="Symbol_11_1" title="Referenced at line 11">Symbol</a>.<span class="cons_Constructor"><a href="../../regular/Regular.sdf3/#Label_47_9" id="Label_11_8" title="Referenced at ../../regular/Regular.sdf3 line 47">Label</a></span> = &lt;&lt;<a href="#Label_9_1" id="Label_11_18" title="Defined at line 9, 10">Label</a>&gt;<span class="cons_String">:</span>&lt;<a href="#Symbol_11_1" id="Symbol_11_26" title="Defined at line 11">Symbol</a>&gt;&gt;
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
