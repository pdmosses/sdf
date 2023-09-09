---
title: Symbols.sdf3
---

# `Symbols.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/symbols/Symbols.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/symbols/Symbols.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/symbols/Symbols.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Start-Symbols.sdf3#symbols/Symbols_52_67" id="symbols/Symbols_7_22" title="Referenced at ../Start-Symbols.sdf3 line 4">symbols/Symbols</a>

<span class="keyword">imports</span> <a href="../../layout/Comments.sdf3#layout/Comments_7_22" id="layout/Comments_32_47" title="Defined at ../../layout/Comments.sdf3 line 1">layout/Comments</a>
 
<span class="keyword">context-free syntax</span>

<a href="../../aliases/Aliases.sdf3#Symbol_469_475" id="Symbol_71_77" title="Referenced at ../../aliases/Aliases.sdf3 line 22; ../../kernel/Kernel.sdf3 line 50; ../../renaming/Renaming.sdf3 line 8; ../../restrictions/Restrictions.sdf3 line 20; line 9">Symbol</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#Symbol_71_77" id="Symbol_83_89" title="Defined at line 7">Symbol</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
<a href="../../kernel/Kernel.sdf3#Symbols_1553_1560" id="Symbols_103_110" title="Referenced at ../../kernel/Kernel.sdf3 line 50; ../../modules/Modules.sdf3 line 36; ../Start-Symbols.sdf3 line 18">Symbols</a> = &lt;&lt;<span id="list_115_119" title="Not referenced locally, nor via imports">list</span>:<a href="#Symbol_71_77" id="Symbol_120_126" title="Defined at line 7">Symbol</a>*&gt;&gt;
<span id="SymbolDef_130_139" title="Not referenced locally, nor via imports">SymbolDef</span> = &lt;&lt;<a href="#Symbol_71_77" id="Symbol_144_150" title="Defined at line 7">Symbol</a>&gt;&gt;
</code></pre></td></tr></tbody></table></div>