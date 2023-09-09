---
title: Labels.sdf3
---

# `Labels.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/labels/Labels.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/labels/Labels.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/labels/Labels.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2-Syntax.sdf3#labels/Labels_280_293" id="labels/Labels_7_20" title="Referenced at ../../sdf2-core/Sdf2-Syntax.sdf3 line 13">labels/Labels</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_30_43" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> 
        <a href="../../constants/StrCon.sdf3#constants/StrCon_7_23" id="constants/StrCon_53_69" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>
        <a href="../../constants/IdentifierCon.sdf3#constants/IdentifierCon_7_30" id="constants/IdentifierCon_78_101" title="Defined at ../../constants/IdentifierCon.sdf3 line 1">constants/IdentifierCon</a>
 
<span class="keyword">context-free syntax</span>

<a href="#Label_195_200" id="Label_125_130" title="Referenced at line 11">Label</a>.<span class="cons_Constructor"><span id="Quoted_131_137" title="Not referenced locally, nor via imports">Quoted</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_142_148" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;
<a href="#Label_195_200" id="Label_151_156" title="Referenced at line 11">Label</a>.<span class="cons_Constructor"><span id="Unquoted_157_165" title="Not referenced locally, nor via imports">Unquoted</span></span> = &lt;&lt;<a href="../../constants/IdentifierCon.sdf3#IdCon_114_119" id="IdCon_170_175" title="Defined at ../../constants/IdentifierCon.sdf3 line 6">IdCon</a>&gt;&gt;
<a href="#Symbol_203_209" id="Symbol_178_184" title="Referenced at line 11">Symbol</a>.<span class="cons_Constructor"><a href="../../regular/Regular.sdf3#Label_1303_1308" id="Label_185_190" title="Referenced at ../../regular/Regular.sdf3 line 47">Label</a></span> = &lt;&lt;<a href="#Label_125_130" id="Label_195_200" title="Defined at line 9, 10">Label</a>&gt;<span class="cons_String">:</span>&lt;<a href="#Symbol_178_184" id="Symbol_203_209" title="Defined at line 11">Symbol</a>&gt;&gt;
</code></pre></td></tr></tbody></table></div>