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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="aterms/Aterms_1_8" title="a definition with multiple references" data-urls="../../kernel/Kernel.sdf3/#aterms/Aterms line 3_9; ../../sdf2-core/Sdf2.sdf3/#aterms/Aterms line 4_3">aterms/Aterms</button>
 
<span class="keyword">imports</span> <a href="../../constants/IntCon.sdf3/#constants/IntCon_1_8" id="constants/IntCon_3_9" title="a reference to a single-file definition">constants/IntCon</a>
                <a href="../../constants/RealCon.sdf3/#constants/RealCon_1_8" id="constants/RealCon_4_3" title="a reference to a single-file definition">constants/RealCon</a>
                <a href="../../constants/StrCon.sdf3/#constants/StrCon_1_8" id="constants/StrCon_5_3" title="a reference to a single-file definition">constants/StrCon</a>
        <a href="../../constants/IdentifierCon.sdf3/#constants/IdentifierCon_1_8" id="constants/IdentifierCon_6_9" title="a reference to a single-file definition">constants/IdentifierCon</a>

<span class="keyword">context-free syntax</span>
        <button class="modal-open" id="AFun_9_2" title="a definition with multiple references" data-urls="#AFun line 16_16, 17_17">AFun</button>.<span class="cons_Constructor"><span id="Quoted_9_7" title="a definition with no references">Quoted</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3/#StrCon_12_5" id="StrCon_9_18" title="a reference to a single-file definition">StrCon</a>&gt;&gt;
        <button class="modal-open" id="AFun_10_2" title="a definition with multiple references" data-urls="#AFun line 16_16, 17_17">AFun</button>.<span class="cons_Constructor"><span id="Unquoted_10_7" title="a definition with no references">Unquoted</span></span> = &lt;&lt;<a href="../../constants/IdentifierCon.sdf3/#IdCon_6_1" id="IdCon_10_20" title="a reference to a single-file definition">IdCon</a>&gt;&gt;


<span class="keyword">context-free syntax</span>
        <button class="modal-open" id="ATerm_14_2" title="a definition with multiple references" data-urls="#ATerm line 17_25, 18_26, 19_19, 20_22, 23_27; ../../kernel/Kernel.sdf3/#ATerm line 12_34; ../../sdf2-core/Sdf2.sdf3/#ATerm line 76_31">ATerm</button>.<span class="cons_Constructor"><span id="Int_14_8" title="a definition with no references">Int</span></span> = &lt;&lt;<a href="../../constants/IntCon.sdf3/#IntCon_8_2" id="IntCon_14_16" title="a reference to a single-file definition">IntCon</a>&gt;&gt;
        <button class="modal-open" id="ATerm_15_2" title="a definition with multiple references" data-urls="#ATerm line 17_25, 18_26, 19_19, 20_22, 23_27; ../../kernel/Kernel.sdf3/#ATerm line 12_34; ../../sdf2-core/Sdf2.sdf3/#ATerm line 76_31">ATerm</button>.<span class="cons_Constructor"><span id="Real_15_8" title="a definition with no references">Real</span></span> = &lt;&lt;<a href="../../constants/RealCon.sdf3/#RealCon_10_2" id="RealCon_15_17" title="a reference to a single-file definition">RealCon</a>&gt;&gt;
        <button class="modal-open" id="ATerm_16_2" title="a definition with multiple references" data-urls="#ATerm line 17_25, 18_26, 19_19, 20_22, 23_27; ../../kernel/Kernel.sdf3/#ATerm line 12_34; ../../sdf2-core/Sdf2.sdf3/#ATerm line 76_31">ATerm</button>.<span class="cons_Constructor"><span id="Fun_16_8" title="a definition with no references">Fun</span></span> = &lt;&lt;<a href="#AFun_9_2" id="AFun_16_16" title="a reference to a single-file definition">AFun</a>&gt;&gt;
        <button class="modal-open" id="ATerm_17_2" title="a definition with multiple references" data-urls="#ATerm line 17_25, 18_26, 19_19, 20_22, 23_27; ../../kernel/Kernel.sdf3/#ATerm line 12_34; ../../sdf2-core/Sdf2.sdf3/#ATerm line 76_31">ATerm</button>.<span class="cons_Constructor"><span id="Appl_17_8" title="a definition with no references">Appl</span></span> = &lt;&lt;<a href="#AFun_9_2" id="AFun_17_17" title="a reference to a single-file definition">AFun</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#ATerm_14_2" id="ATerm_17_25" title="a reference to a single-file definition">ATerm</a> <span class="cons_Lit">","</span>}+&gt;<span class="cons_String">)</span>&gt;
        <button class="modal-open" id="ATerm_18_2" title="a definition with multiple references" data-urls="#ATerm line 17_25, 18_26, 19_19, 20_22, 23_27; ../../kernel/Kernel.sdf3/#ATerm line 12_34; ../../sdf2-core/Sdf2.sdf3/#ATerm line 76_31">ATerm</button>.<span class="cons_Constructor"><span id="Placeholder_18_8" title="a definition with no references">Placeholder</span></span> = &lt;\&lt;&lt;<a href="#ATerm_14_2" id="ATerm_18_26" title="a reference to a single-file definition">ATerm</a>&gt;\&gt;&gt;
        <button class="modal-open" id="ATerm_19_2" title="a definition with multiple references" data-urls="#ATerm line 17_25, 18_26, 19_19, 20_22, 23_27; ../../kernel/Kernel.sdf3/#ATerm line 12_34; ../../sdf2-core/Sdf2.sdf3/#ATerm line 76_31">ATerm</button>.<span class="cons_Constructor"><span id="List_19_8" title="a definition with no references">List</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#ATerm_14_2" id="ATerm_19_19" title="a reference to a single-file definition">ATerm</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">]</span>&gt;
        <button class="modal-open" id="ATerm_20_2" title="a definition with multiple references" data-urls="#ATerm line 17_25, 18_26, 19_19, 20_22, 23_27; ../../kernel/Kernel.sdf3/#ATerm line 12_34; ../../sdf2-core/Sdf2.sdf3/#ATerm line 76_31">ATerm</button>.<span class="cons_Constructor"><span id="Annotated_20_8" title="a definition with no references">Annotated</span></span> = &lt;&lt;<a href="#ATerm_14_2" id="ATerm_20_22" title="a reference to a single-file definition">ATerm</a>&gt;&lt;<a href="#Annotation_23_2" id="Annotation_20_29" title="a reference to a single-file definition">Annotation</a>&gt;&gt;

<span class="keyword">context-free syntax</span>
        <a href="#Annotation_20_29" id="Annotation_23_2" title="a definition with a single reference">Annotation</a>.<span class="cons_Constructor"><span id="Default_23_13" title="a definition with no references">Default</span></span> = &lt;<span class="cons_String">{</span>&lt;{<a href="#ATerm_14_2" id="ATerm_23_27" title="a reference to a single-file definition">ATerm</a> <span class="cons_Lit">","</span>}+&gt;<span class="cons_String">}</span>&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
