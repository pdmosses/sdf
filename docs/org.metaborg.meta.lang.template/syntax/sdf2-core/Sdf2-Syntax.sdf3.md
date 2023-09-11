---
title: Sdf2-Syntax.sdf3
---

# `Sdf2-Syntax.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/sdf2-core/Sdf2-Syntax.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/sdf2-core/Sdf2-Syntax.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/sdf2-core/Sdf2-Syntax.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Sdf2.sdf3#sdf2-core/Sdf2-Syntax_50_71" id="sdf2-core/Sdf2-Syntax_7_28" title="Referenced at ../Sdf2.sdf3 line 5">sdf2-core/Sdf2-Syntax</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_38_51" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a>
        <a href="../../basic/Basic.sdf3#basic/Basic_7_18" id="basic/Basic_60_71" title="Defined at ../../basic/Basic.sdf3 line 1">basic/Basic</a>
        <a href="../../modules/Modules.sdf3#modules/Modules_7_22" id="modules/Modules_80_95" title="Defined at ../../modules/Modules.sdf3 line 1">modules/Modules</a>
        <a href="../../regular/Regular.sdf3#regular/Regular_7_22" id="regular/Regular_104_119" title="Defined at ../../regular/Regular.sdf3 line 1">regular/Regular</a>
        <a href="../../lifting/Lifting.sdf3#lifting/Lifting_7_22" id="lifting/Lifting_128_143" title="Defined at ../../lifting/Lifting.sdf3 line 1">lifting/Lifting</a>
        <a href="../../priority/Priority.sdf3#priority/Priority_7_24" id="priority/Priority_152_169" title="Defined at ../../priority/Priority.sdf3 line 1">priority/Priority</a>
        <a href="../../characterclass/CC.sdf3#characterclass/CC_7_24" id="characterclass/CC_178_195" title="Defined at ../../characterclass/CC.sdf3 line 1">characterclass/CC</a>
        <a href="../../sorts/Sorts.sdf3#sorts/Sorts_7_18" id="sorts/Sorts_204_215" title="Defined at ../../sorts/Sorts.sdf3 line 1">sorts/Sorts</a>
        <a href="../../symbols/Start-Symbols.sdf3#symbols/Start-Symbols_7_28" id="symbols/Start-Symbols_224_245" title="Defined at ../../symbols/Start-Symbols.sdf3 line 1">symbols/Start-Symbols</a>
        <a href="../../literals/Literals.sdf3#literals/Literals_7_24" id="literals/Literals_254_271" title="Defined at ../../literals/Literals.sdf3 line 1">literals/Literals</a>
        <a href="../../labels/Labels.sdf3#labels/Labels_7_20" id="labels/Labels_280_293" title="Defined at ../../labels/Labels.sdf3 line 1">labels/Labels</a>
        <a href="../../restrictions/Restrictions.sdf3#restrictions/Restrictions_7_32" id="restrictions/Restrictions_302_327" title="Defined at ../../restrictions/Restrictions.sdf3 line 1">restrictions/Restrictions</a>
        <a href="../../aliases/Aliases.sdf3#aliases/Aliases_7_22" id="aliases/Aliases_336_351" title="Defined at ../../aliases/Aliases.sdf3 line 1">aliases/Aliases</a>

<span class="keyword">context-free syntax</span>

<a href="../Sdf2.sdf3#Symbol_1680_1686" id="Symbol_374_380" title="Referenced at ../Sdf2.sdf3 line 59">Symbol</a>.<span class="cons_Constructor"><span id="Start_381_386" title="Not referenced locally, nor via imports">Start</span></span> = &lt;\&lt;<span class="cons_String">START</span>\&gt;&gt;
<a href="../Sdf2.sdf3#Symbol_1680_1686" id="Symbol_401_407" title="Referenced at ../Sdf2.sdf3 line 59">Symbol</a>.<span class="cons_Constructor"><span id="FileStart_408_417" title="Not referenced locally, nor via imports">FileStart</span></span> = &lt;\&lt;<span class="cons_String">Start</span>\&gt;&gt;
<a href="../Sdf2.sdf3#Symbol_1680_1686" id="Symbol_432_438" title="Referenced at ../Sdf2.sdf3 line 59">Symbol</a>.<span class="cons_Constructor"><span id="EOF_439_442" title="Not referenced locally, nor via imports">EOF</span></span> = &lt;\&lt;<span class="cons_String">EOF</span>\&gt;&gt;

<span id="Grammar_456_463" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="LexicalPriorities_464_481" title="Not referenced locally, nor via imports">LexicalPriorities</span></span> = &lt;
        <span class="cons_String">lexical</span> <span class="cons_String">priorities</span> 

                &lt;<a href="../../priority/Priority.sdf3#Priorities_908_918" id="Priorities_511_521" title="Defined at ../../priority/Priority.sdf3 line 35">Priorities</a>&gt;
                
        &gt;

<span id="Grammar_530_537" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="ContextFreePriorities_538_559" title="Not referenced locally, nor via imports">ContextFreePriorities</span></span> = &lt;
        <span class="cons_String">context-free</span> <span class="cons_String">priorities</span>
        
                &lt;<a href="../../priority/Priority.sdf3#Priorities_908_918" id="Priorities_594_604" title="Defined at ../../priority/Priority.sdf3 line 35">Priorities</a>&gt;
        
        &gt;
        
<span id="Grammar_613_620" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="LexicalRestrictions_621_640" title="Not referenced locally, nor via imports">LexicalRestrictions</span></span> = &lt;
        <span class="cons_String">lexical</span> <span class="cons_String">restrictions</span>
        
                &lt;<a href="../../restrictions/Restrictions.sdf3#Restrictions_605_617" id="Restrictions_672_684" title="Defined at ../../restrictions/Restrictions.sdf3 line 22">Restrictions</a>&gt;
        
        &gt;

<span id="Grammar_692_699" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="ContextFreeRestrictions_700_723" title="Not referenced locally, nor via imports">ContextFreeRestrictions</span></span> = &lt;
        <span class="cons_String">context-free</span> <span class="cons_String">restrictions</span>
        
                &lt;<a href="../../restrictions/Restrictions.sdf3#Restrictions_605_617" id="Restrictions_760_772" title="Defined at ../../restrictions/Restrictions.sdf3 line 22">Restrictions</a>&gt;
        
        &gt;

<span class="layout">//SDF.Definition = &lt;definition &lt;Definition&gt;&gt; IGNORED PRODUCTION</span>


</code></pre></td></tr></tbody></table></div>