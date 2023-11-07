---
title: Priority.sdf3
hide:
  - toc
---

# `Priority.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/priority/Priority.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/priority/Priority.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/priority/Priority.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="priority/Priority_1_8" title="Multi-file references" data-urls="../../TemplateLang.sdf3/#priority/Priority_11_3 ../../kernel/Kernel.sdf3/#priority/Priority_7_9 ../../sdf2-core/Sdf2-Syntax.sdf3/#priority/Priority_8_9 ../../sdf2-core/Sdf2.sdf3/#priority/Priority_8_3">priority/Priority</button>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_0_7" id="kernel/Kernel_3_9" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> <a href="../../constants/NatCon.sdf3/#constants/NatCon_0_7" id="constants/NatCon_3_23" title="Defined at ../../constants/NatCon.sdf3 line 1">constants/NatCon</a> <a href="../../TemplateLang.sdf3/#TemplateLang_0_7" id="TemplateLang_3_40" title="Defined at ../../TemplateLang.sdf3 line 1">TemplateLang</a>
 
<span class="keyword">context-free syntax</span>

<button class="modal-open" id="Associativity_7_1" title="Multi-file references" data-urls="#Associativity_22_4 ../../TemplateLang.sdf3/#Associativity_46_4 ../../kernel/Kernel.sdf3/#Associativity_32_21 ../../sdf2-core/Sdf2.sdf3/#Associativity_61_15">Associativity</button>.<span class="cons_Constructor"><span id="Left_7_15" title="Not referenced locally, nor via imports">Left</span></span> = &lt;<span class="cons_String">left</span>&gt;
<button class="modal-open" id="Associativity_8_1" title="Multi-file references" data-urls="#Associativity_22_4 ../../TemplateLang.sdf3/#Associativity_46_4 ../../kernel/Kernel.sdf3/#Associativity_32_21 ../../sdf2-core/Sdf2.sdf3/#Associativity_61_15">Associativity</button>.<span class="cons_Constructor"><span id="Right_8_15" title="Not referenced locally, nor via imports">Right</span></span> = &lt;<span class="cons_String">right</span>&gt;
<button class="modal-open" id="Associativity_9_1" title="Multi-file references" data-urls="#Associativity_22_4 ../../TemplateLang.sdf3/#Associativity_46_4 ../../kernel/Kernel.sdf3/#Associativity_32_21 ../../sdf2-core/Sdf2.sdf3/#Associativity_61_15">Associativity</button>.<span class="cons_Constructor"><span id="NonAssoc_9_15" title="Not referenced locally, nor via imports">NonAssoc</span></span> = &lt;<span class="cons_String">non-assoc</span>&gt;
<button class="modal-open" id="Associativity_10_1" title="Multi-file references" data-urls="#Associativity_22_4 ../../TemplateLang.sdf3/#Associativity_46_4 ../../kernel/Kernel.sdf3/#Associativity_32_21 ../../sdf2-core/Sdf2.sdf3/#Associativity_61_15">Associativity</button>.<span class="cons_Constructor"><span id="Assoc_10_15" title="Not referenced locally, nor via imports">Assoc</span></span> = &lt;<span class="cons_String">assoc</span>&gt;
<button class="modal-open" id="Associativity_11_1" title="Multi-file references" data-urls="#Associativity_22_4 ../../TemplateLang.sdf3/#Associativity_46_4 ../../kernel/Kernel.sdf3/#Associativity_32_21 ../../sdf2-core/Sdf2.sdf3/#Associativity_61_15">Associativity</button>.<span class="cons_Constructor"><span id="NonNested_11_15" title="Not referenced locally, nor via imports">NonNested</span></span> = &lt;<span class="cons_String">non-nested</span>&gt;



<a href="#ArgumentIndicator_15_32" id="ArgumentIndicator_15_1" title="Referenced at line 16">ArgumentIndicator</a>.<span class="cons_Constructor"><span id="Default_15_19" title="Not referenced locally, nor via imports">Default</span></span> = &lt;\&lt;&lt;<span class="cons_Unquoted"><span id="arguments_15_33" title="Not referenced locally, nor via imports">arguments</span></span>:{<a href="../../constants/NatCon.sdf3/#NatCon_4_1" id="NatCon_15_44" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a> <span class="cons_Lit">","</span>}+&gt;\&gt;&gt;
<a href="#Group_15_24" id="Group_16_1" title="Referenced at line 16, 17, 31, 33">Group</a>.<span class="cons_Constructor"><span id="WithArguments_16_7" title="Not referenced locally, nor via imports">WithArguments</span></span> = &lt;&lt;<a href="#Group_15_0" id="Group_16_25" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt; &lt;<a href="#ArgumentIndicator_14_0" id="ArgumentIndicator_16_33" title="Defined at line 15">ArgumentIndicator</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
<a href="#Group_15_24" id="Group_17_1" title="Referenced at line 16, 17, 31, 33">Group</a>.<span class="cons_Constructor"><span id="NonTransitive_17_7" title="Not referenced locally, nor via imports">NonTransitive</span></span> = &lt;&lt;<a href="#Group_15_0" id="Group_17_25" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt;<span class="cons_String">.</span>&gt; {<span class="keyword">non-assoc</span>}

<a href="#Group_15_24" id="Group_19_1" title="Referenced at line 16, 17, 31, 33">Group</a>.<span class="cons_Constructor"><span id="SimpleGroup_19_7" title="Not referenced locally, nor via imports">SimpleGroup</span></span> = &lt;&lt;<a href="#PriorityProduction_25_0" id="PriorityProduction_19_23" title="Defined at line 26, 27">PriorityProduction</a>&gt;&gt;
<a href="#Group_15_24" id="Group_20_1" title="Referenced at line 16, 17, 31, 33">Group</a>.<span class="cons_Constructor"><span id="ProdsGroup_20_7" title="Not referenced locally, nor via imports">ProdsGroup</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#PriorityProductions_27_0" id="PriorityProductions_20_23" title="Defined at line 28">PriorityProductions</a>&gt;<span class="cons_String">}</span>&gt;
<a href="#Group_15_24" id="Group_21_1" title="Referenced at line 16, 17, 31, 33">Group</a>.<span class="cons_Constructor"><span id="AssocGroup_21_7" title="Not referenced locally, nor via imports">AssocGroup</span></span> = &lt;
        <span class="cons_String">{</span>&lt;<a href="#Associativity_6_0" id="Associativity_22_4" title="Defined at line 7, 8, 9, 10, 11">Associativity</a>&gt;<span class="cons_String">:</span> 
                &lt;<a href="#PriorityProductions_27_0" id="PriorityProductions_23_4" title="Defined at line 28">PriorityProductions</a>&gt;<span class="cons_String">}</span>&gt; 


<a href="#PriorityProduction_18_22" id="PriorityProduction_26_1" title="Referenced at line 19, 28">PriorityProduction</a> = &lt;&lt;<a href="../../TemplateLang.sdf3/#SdfProduction_84_0" id="SdfProduction_26_24" title="Defined at ../../TemplateLang.sdf3 line 85, 86">SdfProduction</a>&gt;&gt;
<a href="#PriorityProduction_18_22" id="PriorityProduction_27_1" title="Referenced at line 19, 28">PriorityProduction</a> = &lt;&lt;<a href="../../kernel/Kernel.sdf3/#Production_49_0" id="Production_27_24" title="Defined at ../../kernel/Kernel.sdf3 line 50">Production</a>&gt;&gt;
<a href="#PriorityProductions_19_22" id="PriorityProductions_28_1" title="Referenced at line 20, 23">PriorityProductions</a> = &lt;&lt;<span class="cons_Unquoted"><span id="list_28_25" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#PriorityProduction_25_0" id="PriorityProduction_28_31" title="Defined at line 26, 27">PriorityProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;


<a href="#Priority_34_21" id="Priority_31_1" title="Referenced at line 35">Priority</a>.<span class="cons_Constructor"><span id="Chain_31_10" title="Not referenced locally, nor via imports">Chain</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="list_31_20" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#Group_15_0" id="Group_31_26" title="Defined at line 16, 17, 19, 20, 21">Group</a> <span class="cons_Lit">" &gt; "</span>}+&gt;&gt;
<span class="layout">//"left":Group Associativity "right":Group             -&gt; Priority  {cons("assoc")}</span>
<a href="#Priority_34_21" id="Priority_33_1" title="Referenced at line 35">Priority</a>.<span class="cons_Constructor"><span id="Assoc_33_10" title="Not referenced locally, nor via imports">Assoc</span></span> = &lt;&lt;<a href="#Group_15_0" id="Group_33_20" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt; &lt;<a href="#Associativity_6_0" id="Associativity_33_28" title="Defined at line 7, 8, 9, 10, 11">Associativity</a>&gt; &lt;<a href="#Group_15_0" id="Group_33_44" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt;&gt;

<button class="modal-open" id="Priorities_35_1" title="Multi-file references" data-urls="#Priorities_39_4 ../../sdf2-core/Sdf2-Syntax.sdf3/#Priorities_26_4">Priorities</button> = &lt;&lt;<span class="cons_Unquoted"><span id="list_35_16" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#Priority_30_0" id="Priority_35_22" title="Defined at line 31, 33">Priority</a> <span class="cons_Lit">",\n"</span>}*&gt;&gt;
<span id="Grammar_36_1" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="Priorities_36_9" title="Not referenced locally, nor via imports">Priorities</span></span> = &lt;
        <span class="cons_String">priorities</span> 

                &lt;<a href="#Priorities_34_0" id="Priorities_39_4" title="Defined at line 35">Priorities</a>&gt;
                
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
