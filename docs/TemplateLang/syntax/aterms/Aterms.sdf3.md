---
title: Aterms.sdf3
---

# `Aterms.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/aterms/Aterms.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/aterms/Aterms.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/aterms/Aterms.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2.sdf3#aterms/Aterms_34_47" id="aterms/Aterms_7_20" title="Referenced at ../../sdf2-core/Sdf2.sdf3 line 4">aterms/Aterms</a>
 
<span class="keyword">imports</span> <a href="../../constants/IntCon.sdf3#constants/IntCon_7_23" id="constants/IntCon_31_47" title="Defined at ../../constants/IntCon.sdf3 line 1">constants/IntCon</a>
                <a href="../../constants/RealCon.sdf3#constants/RealCon_7_24" id="constants/RealCon_50_67" title="Defined at ../../constants/RealCon.sdf3 line 1">constants/RealCon</a>
                <a href="../../constants/StrCon.sdf3#constants/StrCon_7_23" id="constants/StrCon_70_86" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>
        <a href="../../constants/IdentifierCon.sdf3#constants/IdentifierCon_7_30" id="constants/IdentifierCon_95_118" title="Defined at ../../constants/IdentifierCon.sdf3 line 1">constants/IdentifierCon</a>

<span class="keyword">context-free syntax</span>
        <a href="#AFun_303_307" id="AFun_141_145" title="Referenced at line 17">AFun</a>.<span class="cons_Constructor"><span id="Quoted_146_152" title="Not referenced locally, nor via imports">Quoted</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_157_163" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;
        <a href="#AFun_303_307" id="AFun_167_171" title="Referenced at line 17">AFun</a>.<span class="cons_Constructor"><span id="Unquoted_172_180" title="Not referenced locally, nor via imports">Unquoted</span></span> = &lt;&lt;<a href="../../constants/IdentifierCon.sdf3#IdCon_114_119" id="IdCon_185_190" title="Defined at ../../constants/IdentifierCon.sdf3 line 6">IdCon</a>&gt;&gt;


<span class="keyword">context-free syntax</span>
        <a href="#ATerm_482_487" id="ATerm_216_221" title="Referenced at line 23; ../../kernel/Kernel.sdf3 line 12; ../../sdf2-core/Sdf2.sdf3 line 76">ATerm</a>.<span class="cons_Constructor"><span id="Int_222_225" title="Not referenced locally, nor via imports">Int</span></span> = &lt;&lt;<a href="../../constants/IntCon.sdf3#IntCon_93_99" id="IntCon_230_236" title="Defined at ../../constants/IntCon.sdf3 line 8, 11, 13">IntCon</a>&gt;&gt;
        <a href="#ATerm_482_487" id="ATerm_240_245" title="Referenced at line 23; ../../kernel/Kernel.sdf3 line 12; ../../sdf2-core/Sdf2.sdf3 line 76">ATerm</a>.<span class="cons_Constructor"><span id="Real_246_250" title="Not referenced locally, nor via imports">Real</span></span> = &lt;&lt;<a href="../../constants/RealCon.sdf3#RealCon_245_252" id="RealCon_255_262" title="Defined at ../../constants/RealCon.sdf3 line 10">RealCon</a>&gt;&gt;
        <a href="#ATerm_482_487" id="ATerm_266_271" title="Referenced at line 23; ../../kernel/Kernel.sdf3 line 12; ../../sdf2-core/Sdf2.sdf3 line 76">ATerm</a>.<span class="cons_Constructor"><span id="Fun_272_275" title="Not referenced locally, nor via imports">Fun</span></span> = &lt;&lt;<a href="#AFun_141_145" id="AFun_280_284" title="Defined at line 9, 10">AFun</a>&gt;&gt;
        <a href="#ATerm_482_487" id="ATerm_288_293" title="Referenced at line 23; ../../kernel/Kernel.sdf3 line 12; ../../sdf2-core/Sdf2.sdf3 line 76">ATerm</a>.<span class="cons_Constructor"><span id="Appl_294_298" title="Not referenced locally, nor via imports">Appl</span></span> = &lt;&lt;<a href="#AFun_141_145" id="AFun_303_307" title="Defined at line 9, 10">AFun</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#ATerm_216_221" id="ATerm_311_316" title="Defined at line 14, 15, 16, 17, 18, 19, 20">ATerm</a> <span class="cons_Lit">","</span>}+&gt;<span class="cons_String">)</span>&gt;
        <a href="#ATerm_482_487" id="ATerm_327_332" title="Referenced at line 23; ../../kernel/Kernel.sdf3 line 12; ../../sdf2-core/Sdf2.sdf3 line 76">ATerm</a>.<span class="cons_Constructor"><span id="Placeholder_333_344" title="Not referenced locally, nor via imports">Placeholder</span></span> = &lt;\&lt;&lt;<a href="#ATerm_216_221" id="ATerm_351_356" title="Defined at line 14, 15, 16, 17, 18, 19, 20">ATerm</a>&gt;\&gt;&gt;
        <a href="#ATerm_482_487" id="ATerm_362_367" title="Referenced at line 23; ../../kernel/Kernel.sdf3 line 12; ../../sdf2-core/Sdf2.sdf3 line 76">ATerm</a>.<span class="cons_Constructor"><span id="List_368_372" title="Not referenced locally, nor via imports">List</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#ATerm_216_221" id="ATerm_379_384" title="Defined at line 14, 15, 16, 17, 18, 19, 20">ATerm</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">]</span>&gt;
        <a href="#ATerm_482_487" id="ATerm_395_400" title="Referenced at line 23; ../../kernel/Kernel.sdf3 line 12; ../../sdf2-core/Sdf2.sdf3 line 76">ATerm</a>.<span class="cons_Constructor"><span id="Annotated_401_410" title="Not referenced locally, nor via imports">Annotated</span></span> = &lt;&lt;<a href="#ATerm_216_221" id="ATerm_415_420" title="Defined at line 14, 15, 16, 17, 18, 19, 20">ATerm</a>&gt;&lt;<a href="#Annotation_457_467" id="Annotation_422_432" title="Defined at line 23">Annotation</a>&gt;&gt;

<span class="keyword">context-free syntax</span>
        <a href="#Annotation_422_432" id="Annotation_457_467" title="Referenced at line 20">Annotation</a>.<span class="cons_Constructor"><span id="Default_468_475" title="Not referenced locally, nor via imports">Default</span></span> = &lt;<span class="cons_String">{</span>&lt;{<a href="#ATerm_216_221" id="ATerm_482_487" title="Defined at line 14, 15, 16, 17, 18, 19, 20">ATerm</a> <span class="cons_Lit">","</span>}+&gt;<span class="cons_String">}</span>&gt;

</code></pre></td></tr></tbody></table></div>