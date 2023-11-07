---
title: Aterms.sdf3
hide:
  - toc
---

# `Aterms.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/aterms/Aterms.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/aterms/Aterms.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/aterms/Aterms.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="aterms/Aterms_1_8" title="Multi-file references" data-urls="../../kernel/Kernel.sdf3/#aterms/Aterms_3_9 ../../sdf2-core/Sdf2.sdf3/#aterms/Aterms_4_3">aterms/Aterms</button>
 
<span class="keyword">imports</span> <a href="../../constants/IntCon.sdf3/#constants/IntCon_0_7" id="constants/IntCon_3_9" title="Defined at ../../constants/IntCon.sdf3 line 1">constants/IntCon</a>
                <a href="../../constants/RealCon.sdf3/#constants/RealCon_0_7" id="constants/RealCon_4_3" title="Defined at ../../constants/RealCon.sdf3 line 1">constants/RealCon</a>
                <a href="../../constants/StrCon.sdf3/#constants/StrCon_0_7" id="constants/StrCon_5_3" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>
        <a href="../../constants/IdentifierCon.sdf3/#constants/IdentifierCon_0_7" id="constants/IdentifierCon_6_9" title="Defined at ../../constants/IdentifierCon.sdf3 line 1">constants/IdentifierCon</a>

<span class="keyword">context-free syntax</span>
        <a href="#AFun_15_15" id="AFun_9_2" title="Referenced at line 16, 17">AFun</a>.<span class="cons_Constructor"><span id="Quoted_9_7" title="Not referenced locally, nor via imports">Quoted</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3/#StrCon_11_4" id="StrCon_9_18" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;
        <a href="#AFun_15_15" id="AFun_10_2" title="Referenced at line 16, 17">AFun</a>.<span class="cons_Constructor"><span id="Unquoted_10_7" title="Not referenced locally, nor via imports">Unquoted</span></span> = &lt;&lt;<a href="../../constants/IdentifierCon.sdf3/#IdCon_5_0" id="IdCon_10_20" title="Defined at ../../constants/IdentifierCon.sdf3 line 6">IdCon</a>&gt;&gt;


<span class="keyword">context-free syntax</span>
        <button class="modal-open" id="ATerm_14_2" title="Multi-file references" data-urls="#ATerm_17_25 ../../kernel/Kernel.sdf3/#ATerm_12_34 ../../sdf2-core/Sdf2.sdf3/#ATerm_76_31">ATerm</button>.<span class="cons_Constructor"><span id="Int_14_8" title="Not referenced locally, nor via imports">Int</span></span> = &lt;&lt;<a href="../../constants/IntCon.sdf3/#IntCon_7_1" id="IntCon_14_16" title="Defined at ../../constants/IntCon.sdf3 line 8, 11, 13">IntCon</a>&gt;&gt;
        <button class="modal-open" id="ATerm_15_2" title="Multi-file references" data-urls="#ATerm_17_25 ../../kernel/Kernel.sdf3/#ATerm_12_34 ../../sdf2-core/Sdf2.sdf3/#ATerm_76_31">ATerm</button>.<span class="cons_Constructor"><span id="Real_15_8" title="Not referenced locally, nor via imports">Real</span></span> = &lt;&lt;<a href="../../constants/RealCon.sdf3/#RealCon_9_1" id="RealCon_15_17" title="Defined at ../../constants/RealCon.sdf3 line 10">RealCon</a>&gt;&gt;
        <button class="modal-open" id="ATerm_16_2" title="Multi-file references" data-urls="#ATerm_17_25 ../../kernel/Kernel.sdf3/#ATerm_12_34 ../../sdf2-core/Sdf2.sdf3/#ATerm_76_31">ATerm</button>.<span class="cons_Constructor"><span id="Fun_16_8" title="Not referenced locally, nor via imports">Fun</span></span> = &lt;&lt;<a href="#AFun_8_1" id="AFun_16_16" title="Defined at line 9, 10">AFun</a>&gt;&gt;
        <button class="modal-open" id="ATerm_17_2" title="Multi-file references" data-urls="#ATerm_17_25 ../../kernel/Kernel.sdf3/#ATerm_12_34 ../../sdf2-core/Sdf2.sdf3/#ATerm_76_31">ATerm</button>.<span class="cons_Constructor"><span id="Appl_17_8" title="Not referenced locally, nor via imports">Appl</span></span> = &lt;&lt;<a href="#AFun_8_1" id="AFun_17_17" title="Defined at line 9, 10">AFun</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#ATerm_13_1" id="ATerm_17_25" title="Defined at line 14, 15, 16, 17, 18, 19, 20">ATerm</a> <span class="cons_Lit">","</span>}+&gt;<span class="cons_String">)</span>&gt;
        <button class="modal-open" id="ATerm_18_2" title="Multi-file references" data-urls="#ATerm_17_25 ../../kernel/Kernel.sdf3/#ATerm_12_34 ../../sdf2-core/Sdf2.sdf3/#ATerm_76_31">ATerm</button>.<span class="cons_Constructor"><span id="Placeholder_18_8" title="Not referenced locally, nor via imports">Placeholder</span></span> = &lt;\&lt;&lt;<a href="#ATerm_13_1" id="ATerm_18_26" title="Defined at line 14, 15, 16, 17, 18, 19, 20">ATerm</a>&gt;\&gt;&gt;
        <button class="modal-open" id="ATerm_19_2" title="Multi-file references" data-urls="#ATerm_17_25 ../../kernel/Kernel.sdf3/#ATerm_12_34 ../../sdf2-core/Sdf2.sdf3/#ATerm_76_31">ATerm</button>.<span class="cons_Constructor"><span id="List_19_8" title="Not referenced locally, nor via imports">List</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#ATerm_13_1" id="ATerm_19_19" title="Defined at line 14, 15, 16, 17, 18, 19, 20">ATerm</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">]</span>&gt;
        <button class="modal-open" id="ATerm_20_2" title="Multi-file references" data-urls="#ATerm_17_25 ../../kernel/Kernel.sdf3/#ATerm_12_34 ../../sdf2-core/Sdf2.sdf3/#ATerm_76_31">ATerm</button>.<span class="cons_Constructor"><span id="Annotated_20_8" title="Not referenced locally, nor via imports">Annotated</span></span> = &lt;&lt;<a href="#ATerm_13_1" id="ATerm_20_22" title="Defined at line 14, 15, 16, 17, 18, 19, 20">ATerm</a>&gt;&lt;<a href="#Annotation_22_1" id="Annotation_20_29" title="Defined at line 23">Annotation</a>&gt;&gt;

<span class="keyword">context-free syntax</span>
        <a href="#Annotation_19_28" id="Annotation_23_2" title="Referenced at line 20">Annotation</a>.<span class="cons_Constructor"><span id="Default_23_13" title="Not referenced locally, nor via imports">Default</span></span> = &lt;<span class="cons_String">{</span>&lt;{<a href="#ATerm_13_1" id="ATerm_23_27" title="Defined at line 14, 15, 16, 17, 18, 19, 20">ATerm</a> <span class="cons_Lit">","</span>}+&gt;<span class="cons_String">}</span>&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
