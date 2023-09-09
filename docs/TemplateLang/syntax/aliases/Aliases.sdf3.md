---
title: Aliases.sdf3
---

# `Aliases.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/aliases/Aliases.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/aliases/Aliases.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/aliases/Aliases.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2-Syntax.sdf3#aliases/Aliases_336_351" id="aliases/Aliases_7_22" title="Referenced at ../../sdf2-core/Sdf2-Syntax.sdf3 line 15">aliases/Aliases</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_32_45" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a>
                <a href="../../symbols/Symbols.sdf3#symbols/Symbols_7_22" id="symbols/Symbols_48_63" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a>
  
<span class="layout">//context-free syntax </span>

<span class="layout">// HACK: incremental parsing annotation</span>
<span class="layout">// Symbols "-&gt;" result:Symbol Attributes -&gt; Production  {cons("prod"), incremental}</span>
<span class="layout">//Production.Prod = &lt;&lt;Symbols&gt; -\&gt; &lt;result:Symbol&gt; &lt;Attributes&gt; &gt; {incremental}</span>

         
<span class="keyword">context-free syntax</span>  

<span id="Grammar_322_329" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="Aliases_330_337" title="Not referenced locally, nor via imports">Aliases</span></span> = &lt;
        <span class="cons_String">aliases</span> 
        
                &lt;<a href="#Aliases_478_485" id="Aliases_357_364" title="Defined at line 23">Aliases</a>&gt;
                
        &gt;
        <span class="layout">//Symbol arrow:"-&gt;" alias:Symbol -&gt; Alias    {cons("alias")}</span>
<a href="#Alias_499_504" id="Alias_434_439" title="Referenced at line 23">Alias</a>.<span class="cons_Constructor"><span id="Alias_440_445" title="Not referenced locally, nor via imports">Alias</span></span> = &lt;&lt;<a href="../../symbols/Symbols.sdf3#Symbol_71_77" id="Symbol_450_456" title="Defined at ../../symbols/Symbols.sdf3 line 7">Symbol</a>&gt; <span class="cons_String">-</span>\&gt; &lt;<span id="alias_463_468" title="Not referenced locally, nor via imports">alias</span>:<a href="../../symbols/Symbols.sdf3#Symbol_71_77" id="Symbol_469_475" title="Defined at ../../symbols/Symbols.sdf3 line 7">Symbol</a>&gt;&gt;
<a href="#Aliases_357_364" id="Aliases_478_485" title="Referenced at line 18">Aliases</a>     = &lt;&lt;<span id="list_494_498" title="Not referenced locally, nor via imports">list</span>:<a href="#Alias_434_439" id="Alias_499_504" title="Defined at line 22">Alias</a>*&gt;&gt; 
</code></pre></td></tr></tbody></table></div>