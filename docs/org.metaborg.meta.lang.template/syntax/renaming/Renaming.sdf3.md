---
title: Renaming.sdf3
hide:
  - toc
---

# `Renaming.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/renaming/Renaming.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/renaming/Renaming.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/renaming/Renaming.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../modules/Modules.sdf3/#renaming/Renaming_3_8" id="renaming/Renaming_1_8" title="Referenced at ../../modules/Modules.sdf3 line 4">renaming/Renaming</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_0_7" id="kernel/Kernel_3_9" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> <a href="../../symbols/Symbols.sdf3/#symbols/Symbols_0_7" id="symbols/Symbols_3_23" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a>
 
<span class="keyword">context-free syntax</span>

<span id="Renamings_7_1" title="Not referenced locally, nor via imports">Renamings</span>.<span class="cons_Constructor"><span id="Renamings_7_11" title="Not referenced locally, nor via imports">Renamings</span></span> = &lt;<span class="cons_String">[</span>&lt;<span class="cons_Unquoted"><span id="list_7_26" title="Not referenced locally, nor via imports">list</span></span>:<a href="#Renaming_7_0" id="Renaming_7_31" title="Defined at line 8, 9">Renaming</a>*&gt;<span class="cons_String">]</span>&gt;
<a href="#Renaming_6_30" id="Renaming_8_1" title="Referenced at line 7">Renaming</a>.<span class="cons_Constructor"><span id="Symbol_8_10" title="Not referenced locally, nor via imports">Symbol</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="from_8_21" title="Not referenced locally, nor via imports">from</span></span>:<a href="../../symbols/Symbols.sdf3/#Symbol_6_0" id="Symbol_8_26" title="Defined at ../../symbols/Symbols.sdf3 line 7">Symbol</a>&gt; <span class="cons_String">=</span>\&gt; &lt;<span class="cons_Unquoted"><span id="to_8_39" title="Not referenced locally, nor via imports">to</span></span>:<a href="../../symbols/Symbols.sdf3/#Symbol_6_0" id="Symbol_8_42" title="Defined at ../../symbols/Symbols.sdf3 line 7">Symbol</a>&gt;&gt;
<a href="#Renaming_6_30" id="Renaming_9_1" title="Referenced at line 7">Renaming</a>.<span class="cons_Constructor"><span id="Production_9_10" title="Not referenced locally, nor via imports">Production</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="from-prod_9_25" title="Not referenced locally, nor via imports">from-prod</span></span>:<a href="../../kernel/Kernel.sdf3/#Production_49_0" id="Production_9_35" title="Defined at ../../kernel/Kernel.sdf3 line 50">Production</a>&gt; <span class="cons_String">=</span>\&gt; &lt;<span class="cons_Unquoted"><span id="to-prod_9_52" title="Not referenced locally, nor via imports">to-prod</span></span>:<a href="../../kernel/Kernel.sdf3/#Production_49_0" id="Production_9_60" title="Defined at ../../kernel/Kernel.sdf3 line 50">Production</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
