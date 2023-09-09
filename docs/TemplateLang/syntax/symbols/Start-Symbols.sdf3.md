---
title: Start-Symbols.sdf3
---

# `Start-Symbols.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/symbols/Start-Symbols.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/symbols/Start-Symbols.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/symbols/Start-Symbols.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2-Syntax.sdf3#symbols/Start-Symbols_224_245" id="symbols/Start-Symbols_7_28" title="Referenced at ../../sdf2-core/Sdf2-Syntax.sdf3 line 11">symbols/Start-Symbols</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_38_51" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a>
<a href="../Symbols.sdf3#symbols/Symbols_7_22" id="symbols/Symbols_52_67" title="Defined at ../Symbols.sdf3 line 1">symbols/Symbols</a>

<span class="keyword">context-free syntax</span>
<span id="Grammar_89_96" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="KernelStartSymbols_97_115" title="Not referenced locally, nor via imports">KernelStartSymbols</span></span> = &lt;
  <span class="cons_String">start-symbols</span> &lt;<a href="../Symbols.sdf3#Symbols_103_110" id="Symbols_137_144" title="Defined at ../Symbols.sdf3 line 8">Symbols</a>&gt;

  &gt;

<span id="Grammar_152_159" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="LexicalStartSymbols_160_179" title="Not referenced locally, nor via imports">LexicalStartSymbols</span></span> = &lt;
  <span class="cons_String">lexical</span> <span class="cons_String">start-symbols</span> &lt;<a href="../Symbols.sdf3#Symbols_103_110" id="Symbols_209_216" title="Defined at ../Symbols.sdf3 line 8">Symbols</a>&gt;

  &gt;

<span id="Grammar_224_231" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="ContextFreeStartSymbols_232_255" title="Not referenced locally, nor via imports">ContextFreeStartSymbols</span></span> = &lt;
  <span class="cons_String">context-free</span> <span class="cons_String">start-symbols</span> &lt;<a href="../Symbols.sdf3#Symbols_103_110" id="Symbols_290_297" title="Defined at ../Symbols.sdf3 line 8">Symbols</a>&gt;

  &gt;

</code></pre></td></tr></tbody></table></div>