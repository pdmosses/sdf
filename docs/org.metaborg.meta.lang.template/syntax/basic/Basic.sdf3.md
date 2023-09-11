---
title: Basic.sdf3
---

# `Basic.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/basic/Basic.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/basic/Basic.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/basic/Basic.sdf3 "The source file on GitHub"

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
60
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sorts/Sorts.sdf3#basic/Basic_58_69" id="basic/Basic_7_18" title="Referenced at ../../sorts/Sorts.sdf3 line 5">basic/Basic</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_28_41" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a>
                <a href="../../sorts/Sorts.sdf3#sorts/Sorts_7_18" id="sorts/Sorts_44_55" title="Defined at ../../sorts/Sorts.sdf3 line 1">sorts/Sorts</a>
                <a href="../../TemplateLang.sdf3#TemplateLang_7_19" id="TemplateLang_58_70" title="Defined at ../../TemplateLang.sdf3 line 1">TemplateLang</a>

<span class="keyword">context-free syntax</span>
 
<span id="Grammar_94_101" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="Lexical_102_109" title="Not referenced locally, nor via imports">Lexical</span></span> = &lt;
        <span class="cons_String">lexical</span> <span class="cons_String">syntax</span>
        
                &lt;<a href="../../kernel/Kernel.sdf3#Productions_1641_1652" id="Productions_135_146" title="Defined at ../../kernel/Kernel.sdf3 line 52">Productions</a>&gt;
        
        &gt;
<span id="Grammar_153_160" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="Contextfree_161_172" title="Not referenced locally, nor via imports">Contextfree</span></span> = &lt;
        <span class="cons_String">context-free</span> <span class="cons_String">syntax</span>
        
                &lt;<a href="../../kernel/Kernel.sdf3#Productions_1641_1652" id="Productions_203_214" title="Defined at ../../kernel/Kernel.sdf3 line 52">Productions</a>&gt;
        
        &gt;
<span id="Grammar_221_228" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="Variables_229_238" title="Not referenced locally, nor via imports">Variables</span></span> = &lt;
        <span class="cons_String">variables</span>
        
                &lt;<a href="../../kernel/Kernel.sdf3#Productions_1641_1652" id="Productions_259_270" title="Defined at ../../kernel/Kernel.sdf3 line 52">Productions</a>&gt;
        
        &gt;
<span id="Grammar_277_284" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="VariablesProductive_285_304" title="Not referenced locally, nor via imports">VariablesProductive</span></span> = &lt;
    <span class="cons_String">variables</span>
    
            &lt;{<a href="../../TemplateLang.sdf3#SdfProduction_1702_1715" id="SdfProduction_335_348" title="Defined at ../../TemplateLang.sdf3 line 85, 86">SdfProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;
            
    &gt;        {<span class="keyword">prefer</span>}
        
<span id="Grammar_380_387" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="LexVariables_388_400" title="Not referenced locally, nor via imports">LexVariables</span></span> = &lt;
        <span class="cons_String">lexical</span> <span class="cons_String">variables</span>
        
                &lt;<a href="../../kernel/Kernel.sdf3#Productions_1641_1652" id="Productions_429_440" title="Defined at ../../kernel/Kernel.sdf3 line 52">Productions</a>&gt;
        
        &gt;
        
<span id="Grammar_449_456" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="LexVariablesProductive_457_479" title="Not referenced locally, nor via imports">LexVariablesProductive</span></span> = &lt;
    <span class="cons_String">lexical</span> <span class="cons_String">variables</span>
    
            &lt;{<a href="../../TemplateLang.sdf3#SdfProduction_1702_1715" id="SdfProduction_518_531" title="Defined at ../../TemplateLang.sdf3 line 85, 86">SdfProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;

    &gt; {<span class="keyword">prefer</span>}

<a href="#Symbol_629_635" id="Symbol_557_563" title="Referenced at line 50; ../../TemplateLang.sdf3 line 106">Symbol</a>.<span class="cons_Constructor"><a href="../../sorts/Sorts.sdf3#Cf_1163_1165" id="Cf_564_566" title="Referenced at ../../sorts/Sorts.sdf3 line 50">Cf</a></span> = &lt;&lt;<a href="#Symbol_557_563" id="Symbol_571_577" title="Defined at line 48, 49, 50, 51">Symbol</a>&gt;<span class="cons_String">-CF</span>&gt;
<a href="#Symbol_629_635" id="Symbol_583_589" title="Referenced at line 50; ../../TemplateLang.sdf3 line 106">Symbol</a>.<span class="cons_Constructor"><a href="../../sorts/Sorts.sdf3#Lex_1173_1176" id="Lex_590_593" title="Referenced at ../../sorts/Sorts.sdf3 line 50">Lex</a></span> = &lt;&lt;<a href="#Symbol_557_563" id="Symbol_598_604" title="Defined at line 48, 49, 50, 51">Symbol</a>&gt;<span class="cons_String">-LEX</span>&gt;
<a href="#Symbol_629_635" id="Symbol_611_617" title="Referenced at line 50; ../../TemplateLang.sdf3 line 106">Symbol</a>.<span class="cons_Constructor"><a href="../../sorts/Sorts.sdf3#Varsym_1184_1190" id="Varsym_618_624" title="Referenced at ../../sorts/Sorts.sdf3 line 50">Varsym</a></span> = &lt;&lt;<a href="#Symbol_557_563" id="Symbol_629_635" title="Defined at line 48, 49, 50, 51">Symbol</a>&gt;<span class="cons_String">-VAR</span>&gt;
<a href="#Symbol_629_635" id="Symbol_642_648" title="Referenced at line 50; ../../TemplateLang.sdf3 line 106">Symbol</a>.<span class="cons_Constructor"><span id="Layout_649_655" title="Not referenced locally, nor via imports">Layout</span></span> = &lt;<span class="cons_String">LAYOUT</span>&gt;  

<span class="keyword">lexical syntax</span>

<a href="#Sort_748_752" id="Sort_686_690" title="Referenced at line 57">Sort</a> = <a href="#Sort_686_690" id="Sort_693_697" title="Defined at line 55, 56, 57, 58, 59, 60">Sort</a> <span class="cons_Lit">"-LEX"</span> {<span class="keyword">reject</span>}
<a href="#Sort_748_752" id="Sort_714_718" title="Referenced at line 57">Sort</a> = <a href="#Sort_686_690" id="Sort_721_725" title="Defined at line 55, 56, 57, 58, 59, 60">Sort</a> <span class="cons_Lit">"-CF"</span> {<span class="keyword">reject</span>}
<a href="#Sort_748_752" id="Sort_741_745" title="Referenced at line 57">Sort</a> = <a href="#Sort_686_690" id="Sort_748_752" title="Defined at line 55, 56, 57, 58, 59, 60">Sort</a> <span class="cons_Lit">"-VAR"</span> {<span class="keyword">reject</span>}
<a href="#Sort_748_752" id="Sort_769_773" title="Referenced at line 57">Sort</a> = <span class="cons_Lit">"LAYOUT"</span> <span class="cons_Lit">"-LEX"</span> {<span class="keyword">reject</span>}
<a href="#Sort_748_752" id="Sort_801_805" title="Referenced at line 57">Sort</a> = <span class="cons_Lit">"LAYOUT"</span> <span class="cons_Lit">"-CF"</span> {<span class="keyword">reject</span>}
<a href="#Sort_748_752" id="Sort_832_836" title="Referenced at line 57">Sort</a> = <span class="cons_Lit">"LAYOUT"</span> <span class="cons_Lit">"-VAR"</span> {<span class="keyword">reject</span>}







</code></pre></td></tr></tbody></table></div>