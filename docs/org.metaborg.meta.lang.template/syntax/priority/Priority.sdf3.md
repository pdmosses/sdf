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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="priority/Priority_1_8" title="Multi-file references" data-urls="../../TemplateLang.sdf3/#priority/Priority_11_3 line 11; ../../kernel/Kernel.sdf3/#priority/Priority_7_9 line 7; ../../sdf2-core/Sdf2-Syntax.sdf3/#priority/Priority_8_9 line 8; ../../sdf2-core/Sdf2.sdf3/#priority/Priority_8_3 line 8">priority/Priority</button>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_1_8" id="kernel/Kernel_3_9" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> <a href="../../constants/NatCon.sdf3/#constants/NatCon_1_8" id="constants/NatCon_3_23" title="Defined at ../../constants/NatCon.sdf3 line 1">constants/NatCon</a> <a href="../../TemplateLang.sdf3/#TemplateLang_1_8" id="TemplateLang_3_40" title="Defined at ../../TemplateLang.sdf3 line 1">TemplateLang</a>
 
<span class="keyword">context-free syntax</span>

<button class="modal-open" id="Associativity_7_1" title="Multi-file references" data-urls="#Associativity_22_4 line 22, 33; ../../TemplateLang.sdf3/#Associativity_46_4 line 46; ../../kernel/Kernel.sdf3/#Associativity_32_21 line 32; ../../sdf2-core/Sdf2.sdf3/#Associativity_61_15 line 61, 62">Associativity</button>.<span class="cons_Constructor"><span id="Left_7_15" title="Not referenced">Left</span></span> = &lt;<span class="cons_String">left</span>&gt;
<button class="modal-open" id="Associativity_8_1" title="Multi-file references" data-urls="#Associativity_22_4 line 22, 33; ../../TemplateLang.sdf3/#Associativity_46_4 line 46; ../../kernel/Kernel.sdf3/#Associativity_32_21 line 32; ../../sdf2-core/Sdf2.sdf3/#Associativity_61_15 line 61, 62">Associativity</button>.<span class="cons_Constructor"><span id="Right_8_15" title="Not referenced">Right</span></span> = &lt;<span class="cons_String">right</span>&gt;
<button class="modal-open" id="Associativity_9_1" title="Multi-file references" data-urls="#Associativity_22_4 line 22, 33; ../../TemplateLang.sdf3/#Associativity_46_4 line 46; ../../kernel/Kernel.sdf3/#Associativity_32_21 line 32; ../../sdf2-core/Sdf2.sdf3/#Associativity_61_15 line 61, 62">Associativity</button>.<span class="cons_Constructor"><span id="NonAssoc_9_15" title="Not referenced">NonAssoc</span></span> = &lt;<span class="cons_String">non-assoc</span>&gt;
<button class="modal-open" id="Associativity_10_1" title="Multi-file references" data-urls="#Associativity_22_4 line 22, 33; ../../TemplateLang.sdf3/#Associativity_46_4 line 46; ../../kernel/Kernel.sdf3/#Associativity_32_21 line 32; ../../sdf2-core/Sdf2.sdf3/#Associativity_61_15 line 61, 62">Associativity</button>.<span class="cons_Constructor"><span id="Assoc_10_15" title="Not referenced">Assoc</span></span> = &lt;<span class="cons_String">assoc</span>&gt;
<button class="modal-open" id="Associativity_11_1" title="Multi-file references" data-urls="#Associativity_22_4 line 22, 33; ../../TemplateLang.sdf3/#Associativity_46_4 line 46; ../../kernel/Kernel.sdf3/#Associativity_32_21 line 32; ../../sdf2-core/Sdf2.sdf3/#Associativity_61_15 line 61, 62">Associativity</button>.<span class="cons_Constructor"><span id="NonNested_11_15" title="Not referenced">NonNested</span></span> = &lt;<span class="cons_String">non-nested</span>&gt;



<a href="#ArgumentIndicator_16_33" id="ArgumentIndicator_15_1" title="Referenced at line 16">ArgumentIndicator</a>.<span class="cons_Constructor"><span id="Default_15_19" title="Not referenced">Default</span></span> = &lt;\&lt;&lt;<span class="cons_Unquoted"><span id="arguments_15_33" title="Not referenced">arguments</span></span>:{<a href="../../constants/NatCon.sdf3/#NatCon_5_2" id="NatCon_15_44" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a> <span class="cons_Lit">","</span>}+&gt;\&gt;&gt;
<a href="#Group_16_25" id="Group_16_1" title="Referenced at line 16, 17, 31, 33">Group</a>.<span class="cons_Constructor"><span id="WithArguments_16_7" title="Not referenced">WithArguments</span></span> = &lt;&lt;<a href="#Group_16_1" id="Group_16_25" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt; &lt;<a href="#ArgumentIndicator_15_1" id="ArgumentIndicator_16_33" title="Defined at line 15">ArgumentIndicator</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
<a href="#Group_16_25" id="Group_17_1" title="Referenced at line 16, 17, 31, 33">Group</a>.<span class="cons_Constructor"><span id="NonTransitive_17_7" title="Not referenced">NonTransitive</span></span> = &lt;&lt;<a href="#Group_16_1" id="Group_17_25" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt;<span class="cons_String">.</span>&gt; {<span class="keyword">non-assoc</span>}

<a href="#Group_16_25" id="Group_19_1" title="Referenced at line 16, 17, 31, 33">Group</a>.<span class="cons_Constructor"><span id="SimpleGroup_19_7" title="Not referenced">SimpleGroup</span></span> = &lt;&lt;<a href="#PriorityProduction_26_1" id="PriorityProduction_19_23" title="Defined at line 26, 27">PriorityProduction</a>&gt;&gt;
<a href="#Group_16_25" id="Group_20_1" title="Referenced at line 16, 17, 31, 33">Group</a>.<span class="cons_Constructor"><span id="ProdsGroup_20_7" title="Not referenced">ProdsGroup</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#PriorityProductions_28_1" id="PriorityProductions_20_23" title="Defined at line 28">PriorityProductions</a>&gt;<span class="cons_String">}</span>&gt;
<a href="#Group_16_25" id="Group_21_1" title="Referenced at line 16, 17, 31, 33">Group</a>.<span class="cons_Constructor"><span id="AssocGroup_21_7" title="Not referenced">AssocGroup</span></span> = &lt;
        <span class="cons_String">{</span>&lt;<a href="#Associativity_7_1" id="Associativity_22_4" title="Defined at line 7, 8, 9, 10, 11">Associativity</a>&gt;<span class="cons_String">:</span> 
                &lt;<a href="#PriorityProductions_28_1" id="PriorityProductions_23_4" title="Defined at line 28">PriorityProductions</a>&gt;<span class="cons_String">}</span>&gt; 


<a href="#PriorityProduction_19_23" id="PriorityProduction_26_1" title="Referenced at line 19, 28">PriorityProduction</a> = &lt;&lt;<a href="../../TemplateLang.sdf3/#SdfProduction_85_1" id="SdfProduction_26_24" title="Defined at ../../TemplateLang.sdf3 line 85, 86">SdfProduction</a>&gt;&gt;
<a href="#PriorityProduction_19_23" id="PriorityProduction_27_1" title="Referenced at line 19, 28">PriorityProduction</a> = &lt;&lt;<a href="../../kernel/Kernel.sdf3/#Production_50_1" id="Production_27_24" title="Defined at ../../kernel/Kernel.sdf3 line 50">Production</a>&gt;&gt;
<a href="#PriorityProductions_20_23" id="PriorityProductions_28_1" title="Referenced at line 20, 23">PriorityProductions</a> = &lt;&lt;<span class="cons_Unquoted"><span id="list_28_25" title="Not referenced">list</span></span>:{<a href="#PriorityProduction_26_1" id="PriorityProduction_28_31" title="Defined at line 26, 27">PriorityProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;


<a href="#Priority_35_22" id="Priority_31_1" title="Referenced at line 35">Priority</a>.<span class="cons_Constructor"><span id="Chain_31_10" title="Not referenced">Chain</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="list_31_20" title="Not referenced">list</span></span>:{<a href="#Group_16_1" id="Group_31_26" title="Defined at line 16, 17, 19, 20, 21">Group</a> <span class="cons_Lit">" &gt; "</span>}+&gt;&gt;
<span class="layout">//"left":Group Associativity "right":Group             -&gt; Priority  {cons("assoc")}</span>
<a href="#Priority_35_22" id="Priority_33_1" title="Referenced at line 35">Priority</a>.<span class="cons_Constructor"><span id="Assoc_33_10" title="Not referenced">Assoc</span></span> = &lt;&lt;<a href="#Group_16_1" id="Group_33_20" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt; &lt;<a href="#Associativity_7_1" id="Associativity_33_28" title="Defined at line 7, 8, 9, 10, 11">Associativity</a>&gt; &lt;<a href="#Group_16_1" id="Group_33_44" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt;&gt;

<button class="modal-open" id="Priorities_35_1" title="Multi-file references" data-urls="#Priorities_39_4 line 39; ../../sdf2-core/Sdf2-Syntax.sdf3/#Priorities_26_4 line 26, 33">Priorities</button> = &lt;&lt;<span class="cons_Unquoted"><span id="list_35_16" title="Not referenced">list</span></span>:{<a href="#Priority_31_1" id="Priority_35_22" title="Defined at line 31, 33">Priority</a> <span class="cons_Lit">",\n"</span>}*&gt;&gt;
<span id="Grammar_36_1" title="Not referenced">Grammar</span>.<span class="cons_Constructor"><span id="Priorities_36_9" title="Not referenced">Priorities</span></span> = &lt;
        <span class="cons_String">priorities</span> 

                &lt;<a href="#Priorities_35_1" id="Priorities_39_4" title="Defined at line 35">Priorities</a>&gt;
                
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
