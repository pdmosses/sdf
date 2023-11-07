---
title: Kernel.sdf3
hide:
  - toc
---

# `Kernel.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/kernel/Kernel.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/kernel/Kernel.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/kernel/Kernel.sdf3 "The source file on GitHub"

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
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="kernel/Kernel_1_8" title="Multi-file references" data-urls="../../TemplateLang.sdf3/#kernel/Kernel_9_3 ../../aliases/Aliases.sdf3/#kernel/Kernel_3_9 ../../basic/Basic.sdf3/#kernel/Kernel_3_9 ../../characterclass/CC.sdf3/#kernel/Kernel_4_9 ../../labels/Labels.sdf3/#kernel/Kernel_3_9 ../../lifting/Lifting.sdf3/#kernel/Kernel_3_9 ../../literals/Literals.sdf3/#kernel/Kernel_3_9 ../../modules/Modules.sdf3/#kernel/Kernel_3_9 ../../priority/Priority.sdf3/#kernel/Kernel_3_9 ../../regular/Regular.sdf3/#kernel/Kernel_3_9 ../../renaming/Renaming.sdf3/#kernel/Kernel_3_9 ../../sdf2-core/Sdf2-Syntax.sdf3/#kernel/Kernel_3_9 ../../sorts/Sorts.sdf3/#kernel/Kernel_3_9 ../../symbols/Start-Symbols.sdf3/#kernel/Kernel_3_9">kernel/Kernel</button>

<span class="keyword">imports</span> <a href="../../aterms/Aterms.sdf3/#aterms/Aterms_0_7" id="aterms/Aterms_3_9" title="Defined at ../../aterms/Aterms.sdf3 line 1">aterms/Aterms</a> 
        <a href="../../symbols/Symbols.sdf3/#symbols/Symbols_0_7" id="symbols/Symbols_4_9" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a> 
        <a href="../../grammar/Grammars.sdf3/#grammar/Grammars_0_7" id="grammar/Grammars_5_9" title="Defined at ../../grammar/Grammars.sdf3 line 1">grammar/Grammars</a>
        <a href="../../constants/StrCon.sdf3/#constants/StrCon_0_7" id="constants/StrCon_6_9" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>
        <a href="../../priority/Priority.sdf3/#priority/Priority_0_7" id="priority/Priority_7_9" title="Defined at ../../priority/Priority.sdf3 line 1">priority/Priority</a>
        <a href="../../layout-constraints/Layout-Constraints.sdf3/#layout-constraints/Layout-Constraints_0_7" id="layout-constraints/Layout-Constraints_8_9" title="Defined at ../../layout-constraints/Layout-Constraints.sdf3 line 1">layout-constraints/Layout-Constraints</a>
 
<span class="keyword">context-free syntax</span>

<a href="#ATermAttribute_12_19" id="ATermAttribute_12_1" title="Referenced at line 13">ATermAttribute</a>.<span class="cons_Constructor"><span id="Default_12_16" title="Not referenced locally, nor via imports">Default</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="aterm_12_28" title="Not referenced locally, nor via imports">aterm</span></span>:<a href="../../aterms/Aterms.sdf3/#ATerm_13_1" id="ATerm_12_34" title="Defined at ../../aterms/Aterms.sdf3 line 14, 15, 16, 17, 18, 19, 20">ATerm</a>&gt;&gt;
<a href="#Attribute_14_28" id="Attribute_13_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Term_13_11" title="Not referenced locally, nor via imports">Term</span></span> = &lt;&lt;<a href="#ATermAttribute_11_0" id="ATermAttribute_13_20" title="Defined at line 12">ATermAttribute</a>&gt;&gt;

<button class="modal-open" id="Attributes_15_1" title="Multi-file references" data-urls="#Attributes_50_51 ../../TemplateLang.sdf3/#Attributes_30_60">Attributes</button>.<span class="cons_Constructor"><span id="Attrs_15_12" title="Not referenced locally, nor via imports">Attrs</span></span> = &lt;<span class="cons_String">{</span>&lt;<span class="cons_Unquoted"><span id="list_15_23" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#Attribute_12_0" id="Attribute_15_29" title="Defined at line 13, 22, 23, 24, 27, 28, 29, 31, 32, 34, 36, 37, 38, 39, 41, 42, 45, 46, 47">Attribute</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span>&gt;
<button class="modal-open" id="Attributes_16_1" title="Multi-file references" data-urls="#Attributes_50_51 ../../TemplateLang.sdf3/#Attributes_30_60">Attributes</button>.<span class="cons_Constructor"><span id="NoAttrs_16_12" title="Not referenced locally, nor via imports">NoAttrs</span></span> = &lt;&gt;



<span class="layout">//special attributes that should show up in the parse table as attr</span>

<a href="#Attribute_14_28" id="Attribute_22_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Deprecated_22_11" title="Not referenced locally, nor via imports">Deprecated</span></span> = &lt;<span class="cons_String">deprecated(</span>&lt;<a href="../../constants/StrCon.sdf3/#StrCon_11_4" id="StrCon_22_37" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;<span class="cons_String">)</span>&gt; 
<a href="#Attribute_14_28" id="Attribute_23_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Constructor_23_11" title="Not referenced locally, nor via imports">Constructor</span></span> = &lt;<span class="cons_String">cons(</span>&lt;<a href="../../constants/StrCon.sdf3/#StrCon_11_4" id="StrCon_23_32" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("Use 'Sort.Cons' notation instead")}
<a href="#Attribute_14_28" id="Attribute_24_1" title="Referenced at line 15">Attribute</a> = &lt;&lt;<a href="#QuotedConstructor_24_0" id="QuotedConstructor_24_15" title="Defined at line 25">QuotedConstructor</a>&gt;&gt; {<span class="keyword">prefer</span>, <span class="keyword">deprecated</span>("Use 'Sort.Cons' notation instead") }
<a href="#QuotedConstructor_23_14" id="QuotedConstructor_25_1" title="Referenced at line 24">QuotedConstructor</a>.<span class="cons_Constructor"><span id="Constructor_25_19" title="Not referenced locally, nor via imports">Constructor</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3/#StrCon_11_4" id="StrCon_25_35" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;

<a href="#Attribute_14_28" id="Attribute_27_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Reject_27_11" title="Not referenced locally, nor via imports">Reject</span></span> = &lt;<span class="cons_String">reject</span>&gt;
<a href="#Attribute_14_28" id="Attribute_28_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Prefer_28_11" title="Not referenced locally, nor via imports">Prefer</span></span> = &lt;<span class="cons_String">prefer</span>&gt; {<span class="keyword">deprecated</span>("Prefer and avoid are deprecated and will be removed in a future version of SDF3")}
<a href="#Attribute_14_28" id="Attribute_29_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Avoid_29_11" title="Not referenced locally, nor via imports">Avoid</span></span> = &lt;<span class="cons_String">avoid</span>&gt; {<span class="keyword">deprecated</span>("Prefer and avoid are deprecated and will be removed in a future version of SDF3")}

<a href="#Attribute_14_28" id="Attribute_31_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Bracket_31_11" title="Not referenced locally, nor via imports">Bracket</span></span> = &lt;<span class="cons_String">bracket</span>&gt;
<a href="#Attribute_14_28" id="Attribute_32_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Assoc_32_11" title="Not referenced locally, nor via imports">Assoc</span></span> = &lt;&lt;<a href="../../priority/Priority.sdf3/#Associativity_6_0" id="Associativity_32_21" title="Defined at ../../priority/Priority.sdf3 line 7, 8, 9, 10, 11">Associativity</a>&gt;&gt;

<a href="#Attribute_14_28" id="Attribute_34_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="LayoutConstraint_34_11" title="Not referenced locally, nor via imports">LayoutConstraint</span></span> = &lt;<span class="cons_String">layout(</span>&lt;<a href="../../layout-constraints/Layout-Constraints.sdf3/#Constraint_14_2" id="Constraint_34_39" title="Defined at ../../layout-constraints/Layout-Constraints.sdf3 line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;<span class="cons_String">)</span>&gt;

<a href="#Attribute_14_28" id="Attribute_36_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="IgnoreLayout_36_11" title="Not referenced locally, nor via imports">IgnoreLayout</span></span> = &lt;<span class="cons_String">ignore-layout</span>&gt;
<a href="#Attribute_14_28" id="Attribute_37_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="EnforceNewLine_37_11" title="Not referenced locally, nor via imports">EnforceNewLine</span></span> = &lt;<span class="cons_String">enforce-newline</span>&gt;
<a href="#Attribute_14_28" id="Attribute_38_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="LongestMatch_38_11" title="Not referenced locally, nor via imports">LongestMatch</span></span> = &lt;<span class="cons_String">longest-match</span>&gt;
<a href="#Attribute_14_28" id="Attribute_39_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Recover_39_11" title="Not referenced locally, nor via imports">Recover</span></span>      = &lt;<span class="cons_String">recover</span>&gt;

<a href="#Attribute_14_28" id="Attribute_41_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="CaseInsensitive_41_11" title="Not referenced locally, nor via imports">CaseInsensitive</span></span> = &lt;<span class="cons_String">case-insensitive</span>&gt;
<a href="#Attribute_14_28" id="Attribute_42_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Deprecated_42_11" title="Not referenced locally, nor via imports">Deprecated</span></span> = &lt;<span class="cons_String">deprecated</span>&gt;  

<span class="layout">//new completion attributes</span>
<a href="#Attribute_14_28" id="Attribute_45_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Placeholder_45_11" title="Not referenced locally, nor via imports">Placeholder</span></span> = &lt;<span class="cons_String">placeholder</span>&gt; 
<a href="#Attribute_14_28" id="Attribute_46_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="PlaceholderInsertion_46_11" title="Not referenced locally, nor via imports">PlaceholderInsertion</span></span> = &lt;<span class="cons_String">placeholder-insertion</span>&gt; 
<a href="#Attribute_14_28" id="Attribute_47_1" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="LiteralCompletion_47_11" title="Not referenced locally, nor via imports">LiteralCompletion</span></span> = &lt;<span class="cons_String">literal-completion</span>&gt; 


<button class="modal-open" id="Production_50_1" title="Multi-file references" data-urls="#Production_52_23 ../../priority/Priority.sdf3/#Production_27_24 ../../renaming/Renaming.sdf3/#Production_9_35">Production</button>.<span class="cons_Constructor"><span id="Prod_50_12" title="Not referenced locally, nor via imports">Prod</span></span> = &lt;&lt;<a href="../../symbols/Symbols.sdf3/#Symbols_7_0" id="Symbols_50_21" title="Defined at ../../symbols/Symbols.sdf3 line 8">Symbols</a>&gt; <span class="cons_String">-</span>\&gt; &lt;<span class="cons_Unquoted"><span id="result_50_35" title="Not referenced locally, nor via imports">result</span></span>:<a href="../../symbols/Symbols.sdf3/#Symbol_6_0" id="Symbol_50_42" title="Defined at ../../symbols/Symbols.sdf3 line 7">Symbol</a>&gt; &lt;<a href="#Attributes_14_0" id="Attributes_50_51" title="Defined at line 15, 16">Attributes</a>&gt;&gt; {<span class="keyword">deprecated</span>("Use productive form instead")}

<button class="modal-open" id="Productions_52_1" title="Multi-file references" data-urls="#Productions_57_4 ../../basic/Basic.sdf3/#Productions_12_4">Productions</button> = &lt;&lt;<span class="cons_Unquoted"><span id="list_52_17" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#Production_49_0" id="Production_52_23" title="Defined at line 50">Production</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

<a href="../../modules/Modules.sdf3/#Grammar_32_27" id="Grammar_54_1" title="Referenced at ../../modules/Modules.sdf3 line 33">Grammar</a>.<span class="cons_Constructor"><span id="Syntax_54_9" title="Not referenced locally, nor via imports">Syntax</span></span> = &lt;
        <span class="cons_String">syntax</span> 

                &lt;<a href="#Productions_51_0" id="Productions_57_4" title="Defined at line 52">Productions</a>&gt;
                
                &gt;
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
