---
title: Aliases.sdf3
hide:
  - toc
---

# `Aliases.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/aliases/Aliases.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/aliases/Aliases.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/aliases/Aliases.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2-Syntax.sdf3/#aliases/Aliases_15_9" id="aliases/Aliases_1_8" title="a definition with a single reference">aliases/Aliases</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_1_8" id="kernel/Kernel_3_9" title="a reference to a single-file definition">kernel/Kernel</a>
                <a href="../../symbols/Symbols.sdf3/#symbols/Symbols_1_8" id="symbols/Symbols_4_3" title="a reference to a single-file definition">symbols/Symbols</a>
  
<span class="layout">//context-free syntax </span>

<span class="layout">// HACK: incremental parsing annotation</span>
<span class="layout">// Symbols "-&gt;" result:Symbol Attributes -&gt; Production  {cons("prod"), incremental}</span>
<span class="layout">//Production.Prod = &lt;&lt;Symbols&gt; -\&gt; &lt;result:Symbol&gt; &lt;Attributes&gt; &gt; {incremental}</span>

         
<span class="keyword">context-free syntax</span>  

<span id="Grammar_15_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="Aliases_15_9" title="a definition with no references">Aliases</span></span> = &lt;
        <span class="cons_String">aliases</span> 
        
                &lt;<a href="#Aliases_23_1" id="Aliases_18_4" title="a reference to a single-file definition">Aliases</a>&gt;
                
        &gt;
        <span class="layout">//Symbol arrow:"-&gt;" alias:Symbol -&gt; Alias    {cons("alias")}</span>
<a href="#Alias_23_22" id="Alias_22_1" title="a definition with a single reference">Alias</a>.<span class="cons_Constructor"><span id="Alias_22_7" title="a definition with no references">Alias</span></span> = &lt;&lt;<a href="../../symbols/Symbols.sdf3/#Symbol_7_1" id="Symbol_22_17" title="a reference to a single-file definition">Symbol</a>&gt; <span class="cons_String">-</span>\&gt; &lt;<span class="cons_Unquoted"><span id="alias_22_30" title="a definition with no references">alias</span></span>:<a href="../../symbols/Symbols.sdf3/#Symbol_7_1" id="Symbol_22_36" title="a reference to a single-file definition">Symbol</a>&gt;&gt;
<a href="#Aliases_18_4" id="Aliases_23_1" title="a definition with a single reference">Aliases</a>     = &lt;&lt;<span class="cons_Unquoted"><span id="list_23_17" title="a definition with no references">list</span></span>:<a href="#Alias_22_1" id="Alias_23_22" title="a reference to a single-file definition">Alias</a>*&gt;&gt; 
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
