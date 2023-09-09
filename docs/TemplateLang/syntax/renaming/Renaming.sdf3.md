---
title: Renaming.sdf3
---

# `Renaming.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/renaming/Renaming.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/renaming/Renaming.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/renaming/Renaming.sdf3 "The source file on GitHub"

<div class="TemplateLang"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../modules/Modules.sdf3#renaming/Renaming_55_72" id="renaming/Renaming_7_24" title="Referenced at ../../modules/Modules.sdf3 line 4">renaming/Renaming</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_34_47" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> <a href="../../symbols/Symbols.sdf3#symbols/Symbols_7_22" id="symbols/Symbols_48_63" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a>
 
<span class="keyword">context-free syntax</span>

<span id="Renamings_87_96" title="Not referenced locally, nor via imports">Renamings</span>.<span class="cons_Constructor"><span id="Renamings_97_106" title="Not referenced locally, nor via imports">Renamings</span></span> = &lt;<span class="cons_String">[</span>&lt;<span id="list_112_116" title="Not referenced locally, nor via imports">list</span>:<a href="#Renaming_130_138" id="Renaming_117_125" title="Defined at line 8, 9">Renaming</a>*&gt;<span class="cons_String">]</span>&gt;
<a href="#Renaming_117_125" id="Renaming_130_138" title="Referenced at line 7">Renaming</a>.<span class="cons_Constructor"><span id="Symbol_139_145" title="Not referenced locally, nor via imports">Symbol</span></span> = &lt;&lt;<span id="from_150_154" title="Not referenced locally, nor via imports">from</span>:<a href="../../symbols/Symbols.sdf3#Symbol_71_77" id="Symbol_155_161" title="Defined at ../../symbols/Symbols.sdf3 line 7">Symbol</a>&gt; <span class="cons_String">=</span>\&gt; &lt;<span id="to_168_170" title="Not referenced locally, nor via imports">to</span>:<a href="../../symbols/Symbols.sdf3#Symbol_71_77" id="Symbol_171_177" title="Defined at ../../symbols/Symbols.sdf3 line 7">Symbol</a>&gt;&gt;
<a href="#Renaming_117_125" id="Renaming_180_188" title="Referenced at line 7">Renaming</a>.<span class="cons_Constructor"><span id="Production_189_199" title="Not referenced locally, nor via imports">Production</span></span> = &lt;&lt;<span id="from-prod_204_213" title="Not referenced locally, nor via imports">from-prod</span>:<a href="../../kernel/Kernel.sdf3#Production_1533_1543" id="Production_214_224" title="Defined at ../../kernel/Kernel.sdf3 line 50">Production</a>&gt; <span class="cons_String">=</span>\&gt; &lt;<span id="to-prod_231_238" title="Not referenced locally, nor via imports">to-prod</span>:<a href="../../kernel/Kernel.sdf3#Production_1533_1543" id="Production_239_249" title="Defined at ../../kernel/Kernel.sdf3 line 50">Production</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>