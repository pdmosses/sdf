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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2.sdf3#priority/Priority_115_132" id="priority/Priority_7_24" title="Referenced at ../../sdf2-core/Sdf2.sdf3 line 8">priority/Priority</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_34_47" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> <a href="../../constants/NatCon.sdf3#constants/NatCon_7_23" id="constants/NatCon_48_64" title="Defined at ../../constants/NatCon.sdf3 line 1">constants/NatCon</a> <a href="../../TemplateLang.sdf3#TemplateLang_7_19" id="TemplateLang_65_77" title="Defined at ../../TemplateLang.sdf3 line 1">TemplateLang</a>
 
<span class="keyword">context-free syntax</span>

<a href="#Associativity_883_896" id="Associativity_101_114" title="Referenced at line 33; ../../TemplateLang.sdf3 line 46; ../../sdf2-core/Sdf2.sdf3 line 62">Associativity</a>.<span class="cons_Constructor"><span id="Left_115_119" title="Not referenced locally, nor via imports">Left</span></span> = &lt;<span class="cons_String">left</span>&gt;
<a href="#Associativity_883_896" id="Associativity_129_142" title="Referenced at line 33; ../../TemplateLang.sdf3 line 46; ../../sdf2-core/Sdf2.sdf3 line 62">Associativity</a>.<span class="cons_Constructor"><span id="Right_143_148" title="Not referenced locally, nor via imports">Right</span></span> = &lt;<span class="cons_String">right</span>&gt;
<a href="#Associativity_883_896" id="Associativity_159_172" title="Referenced at line 33; ../../TemplateLang.sdf3 line 46; ../../sdf2-core/Sdf2.sdf3 line 62">Associativity</a>.<span class="cons_Constructor"><span id="NonAssoc_173_181" title="Not referenced locally, nor via imports">NonAssoc</span></span> = &lt;<span class="cons_String">non-assoc</span>&gt;
<a href="#Associativity_883_896" id="Associativity_196_209" title="Referenced at line 33; ../../TemplateLang.sdf3 line 46; ../../sdf2-core/Sdf2.sdf3 line 62">Associativity</a>.<span class="cons_Constructor"><span id="Assoc_210_215" title="Not referenced locally, nor via imports">Assoc</span></span> = &lt;<span class="cons_String">assoc</span>&gt;
<a href="#Associativity_883_896" id="Associativity_226_239" title="Referenced at line 33; ../../TemplateLang.sdf3 line 46; ../../sdf2-core/Sdf2.sdf3 line 62">Associativity</a>.<span class="cons_Constructor"><span id="NonNested_240_249" title="Not referenced locally, nor via imports">NonNested</span></span> = &lt;<span class="cons_String">non-nested</span>&gt;



<a href="#ArgumentIndicator_360_377" id="ArgumentIndicator_268_285" title="Referenced at line 16">ArgumentIndicator</a>.<span class="cons_Constructor"><span id="Default_286_293" title="Not referenced locally, nor via imports">Default</span></span> = &lt;\&lt;&lt;<span class="cons_Unquoted"><span id="arguments_300_309" title="Not referenced locally, nor via imports">arguments</span></span>:{<a href="../../constants/NatCon.sdf3#NatCon_44_50" id="NatCon_311_317" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a> <span class="cons_Lit">","</span>}+&gt;\&gt;&gt;
<a href="#Group_899_904" id="Group_328_333" title="Referenced at line 33">Group</a>.<span class="cons_Constructor"><span id="WithArguments_334_347" title="Not referenced locally, nor via imports">WithArguments</span></span> = &lt;&lt;<a href="#Group_328_333" id="Group_352_357" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt; &lt;<a href="#ArgumentIndicator_268_285" id="ArgumentIndicator_360_377" title="Defined at line 15">ArgumentIndicator</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
<a href="#Group_899_904" id="Group_392_397" title="Referenced at line 33">Group</a>.<span class="cons_Constructor"><span id="NonTransitive_398_411" title="Not referenced locally, nor via imports">NonTransitive</span></span> = &lt;&lt;<a href="#Group_328_333" id="Group_416_421" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt;<span class="cons_String">.</span>&gt; {<span class="keyword">non-assoc</span>}

<a href="#Group_899_904" id="Group_438_443" title="Referenced at line 33">Group</a>.<span class="cons_Constructor"><span id="SimpleGroup_444_455" title="Not referenced locally, nor via imports">SimpleGroup</span></span> = &lt;&lt;<a href="#PriorityProduction_596_614" id="PriorityProduction_460_478" title="Defined at line 26, 27">PriorityProduction</a>&gt;&gt;
<a href="#Group_899_904" id="Group_481_486" title="Referenced at line 33">Group</a>.<span class="cons_Constructor"><span id="ProdsGroup_487_497" title="Not referenced locally, nor via imports">ProdsGroup</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#PriorityProductions_671_690" id="PriorityProductions_503_522" title="Defined at line 28">PriorityProductions</a>&gt;<span class="cons_String">}</span>&gt;
<a href="#Group_899_904" id="Group_526_531" title="Referenced at line 33">Group</a>.<span class="cons_Constructor"><span id="AssocGroup_532_542" title="Not referenced locally, nor via imports">AssocGroup</span></span> = &lt;
        <span class="cons_String">{</span>&lt;<a href="#Associativity_101_114" id="Associativity_550_563" title="Defined at line 7, 8, 9, 10, 11">Associativity</a>&gt;<span class="cons_String">:</span> 
                &lt;<a href="#PriorityProductions_671_690" id="PriorityProductions_570_589" title="Defined at line 28">PriorityProductions</a>&gt;<span class="cons_String">}</span>&gt; 


<a href="#PriorityProduction_701_719" id="PriorityProduction_596_614" title="Referenced at line 28">PriorityProduction</a> = &lt;&lt;<a href="../../TemplateLang.sdf3#SdfProduction_1702_1715" id="SdfProduction_619_632" title="Defined at ../../TemplateLang.sdf3 line 85, 86">SdfProduction</a>&gt;&gt;
<a href="#PriorityProduction_701_719" id="PriorityProduction_635_653" title="Referenced at line 28">PriorityProduction</a> = &lt;&lt;<a href="../../kernel/Kernel.sdf3#Production_1533_1543" id="Production_658_668" title="Defined at ../../kernel/Kernel.sdf3 line 50">Production</a>&gt;&gt;
<a href="#PriorityProductions_570_589" id="PriorityProductions_671_690" title="Referenced at line 23">PriorityProductions</a> = &lt;&lt;<span class="cons_Unquoted"><span id="list_695_699" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#PriorityProduction_596_614" id="PriorityProduction_701_719" title="Defined at line 26, 27">PriorityProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;


<a href="#Priority_929_937" id="Priority_731_739" title="Referenced at line 35">Priority</a>.<span class="cons_Constructor"><span id="Chain_740_745" title="Not referenced locally, nor via imports">Chain</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="list_750_754" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#Group_328_333" id="Group_756_761" title="Defined at line 16, 17, 19, 20, 21">Group</a> <span class="cons_Lit">" &gt; "</span>}+&gt;&gt;
<span class="layout">//"left":Group Associativity "right":Group             -&gt; Priority  {cons("assoc")}</span>
<a href="#Priority_929_937" id="Priority_856_864" title="Referenced at line 35">Priority</a>.<span class="cons_Constructor"><span id="Assoc_865_870" title="Not referenced locally, nor via imports">Assoc</span></span> = &lt;&lt;<a href="#Group_328_333" id="Group_875_880" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt; &lt;<a href="#Associativity_101_114" id="Associativity_883_896" title="Defined at line 7, 8, 9, 10, 11">Associativity</a>&gt; &lt;<a href="#Group_328_333" id="Group_899_904" title="Defined at line 16, 17, 19, 20, 21">Group</a>&gt;&gt;

<a href="#Priorities_988_998" id="Priorities_908_918" title="Referenced at line 39; ../../sdf2-core/Sdf2-Syntax.sdf3 line 33">Priorities</a> = &lt;&lt;<span class="cons_Unquoted"><span id="list_923_927" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#Priority_731_739" id="Priority_929_937" title="Defined at line 31, 33">Priority</a> <span class="cons_Lit">",\n"</span>}*&gt;&gt;
<span id="Grammar_948_955" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="Priorities_956_966" title="Not referenced locally, nor via imports">Priorities</span></span> = &lt;
        <span class="cons_String">priorities</span> 

                &lt;<a href="#Priorities_908_918" id="Priorities_988_998" title="Defined at line 35">Priorities</a>&gt;
                
                &gt;
</code></pre></td></tr></tbody></table></div>