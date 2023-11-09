---
title: Sdf2-Syntax.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Sdf2.sdf3/#sdf2-core/Sdf2-Syntax_5_3" id="sdf2-core/Sdf2-Syntax_1_8" title="Referenced at ../Sdf2.sdf3 line 5">sdf2-core/Sdf2-Syntax</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_1_8" id="kernel/Kernel_3_9" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a>
        <a href="../../basic/Basic.sdf3/#basic/Basic_1_8" id="basic/Basic_4_9" title="Defined at ../../basic/Basic.sdf3 line 1">basic/Basic</a>
        <a href="../../modules/Modules.sdf3/#modules/Modules_1_8" id="modules/Modules_5_9" title="Defined at ../../modules/Modules.sdf3 line 1">modules/Modules</a>
        <a href="../../regular/Regular.sdf3/#regular/Regular_1_8" id="regular/Regular_6_9" title="Defined at ../../regular/Regular.sdf3 line 1">regular/Regular</a>
        <a href="../../lifting/Lifting.sdf3/#lifting/Lifting_1_8" id="lifting/Lifting_7_9" title="Defined at ../../lifting/Lifting.sdf3 line 1">lifting/Lifting</a>
        <a href="../../priority/Priority.sdf3/#priority/Priority_1_8" id="priority/Priority_8_9" title="Defined at ../../priority/Priority.sdf3 line 1">priority/Priority</a>
        <a href="../../characterclass/CC.sdf3/#characterclass/CC_1_8" id="characterclass/CC_9_9" title="Defined at ../../characterclass/CC.sdf3 line 1">characterclass/CC</a>
        <a href="../../sorts/Sorts.sdf3/#sorts/Sorts_1_8" id="sorts/Sorts_10_9" title="Defined at ../../sorts/Sorts.sdf3 line 1">sorts/Sorts</a>
        <a href="../../symbols/Start-Symbols.sdf3/#symbols/Start-Symbols_1_8" id="symbols/Start-Symbols_11_9" title="Defined at ../../symbols/Start-Symbols.sdf3 line 1">symbols/Start-Symbols</a>
        <a href="../../literals/Literals.sdf3/#literals/Literals_1_8" id="literals/Literals_12_9" title="Defined at ../../literals/Literals.sdf3 line 1">literals/Literals</a>
        <a href="../../labels/Labels.sdf3/#labels/Labels_1_8" id="labels/Labels_13_9" title="Defined at ../../labels/Labels.sdf3 line 1">labels/Labels</a>
        <a href="../../restrictions/Restrictions.sdf3/#restrictions/Restrictions_1_8" id="restrictions/Restrictions_14_9" title="Defined at ../../restrictions/Restrictions.sdf3 line 1">restrictions/Restrictions</a>
        <a href="../../aliases/Aliases.sdf3/#aliases/Aliases_1_8" id="aliases/Aliases_15_9" title="Defined at ../../aliases/Aliases.sdf3 line 1">aliases/Aliases</a>

<span class="keyword">context-free syntax</span>

<a href="../Sdf2.sdf3/#Symbol_59_37" id="Symbol_19_1" title="Referenced at ../Sdf2.sdf3 line 59">Symbol</a>.<span class="cons_Constructor"><span id="Start_19_8" title="Not referenced">Start</span></span> = &lt;\&lt;<span class="cons_String">START</span>\&gt;&gt;
<a href="../Sdf2.sdf3/#Symbol_59_37" id="Symbol_20_1" title="Referenced at ../Sdf2.sdf3 line 59">Symbol</a>.<span class="cons_Constructor"><span id="FileStart_20_8" title="Not referenced">FileStart</span></span> = &lt;\&lt;<span class="cons_String">Start</span>\&gt;&gt;
<a href="../Sdf2.sdf3/#Symbol_59_37" id="Symbol_21_1" title="Referenced at ../Sdf2.sdf3 line 59">Symbol</a>.<span class="cons_Constructor"><span id="EOF_21_8" title="Not referenced">EOF</span></span> = &lt;\&lt;<span class="cons_String">EOF</span>\&gt;&gt;

<span id="Grammar_23_1" title="Not referenced">Grammar</span>.<span class="cons_Constructor"><span id="LexicalPriorities_23_9" title="Not referenced">LexicalPriorities</span></span> = &lt;
        <span class="cons_String">lexical</span> <span class="cons_String">priorities</span> 

                &lt;<a href="../../priority/Priority.sdf3/#Priorities_35_1" id="Priorities_26_4" title="Defined at ../../priority/Priority.sdf3 line 35">Priorities</a>&gt;
                
        &gt;

<span id="Grammar_30_1" title="Not referenced">Grammar</span>.<span class="cons_Constructor"><span id="ContextFreePriorities_30_9" title="Not referenced">ContextFreePriorities</span></span> = &lt;
        <span class="cons_String">context-free</span> <span class="cons_String">priorities</span>
        
                &lt;<a href="../../priority/Priority.sdf3/#Priorities_35_1" id="Priorities_33_4" title="Defined at ../../priority/Priority.sdf3 line 35">Priorities</a>&gt;
        
        &gt;
        
<span id="Grammar_37_1" title="Not referenced">Grammar</span>.<span class="cons_Constructor"><span id="LexicalRestrictions_37_9" title="Not referenced">LexicalRestrictions</span></span> = &lt;
        <span class="cons_String">lexical</span> <span class="cons_String">restrictions</span>
        
                &lt;<a href="../../restrictions/Restrictions.sdf3/#Restrictions_22_1" id="Restrictions_40_4" title="Defined at ../../restrictions/Restrictions.sdf3 line 22">Restrictions</a>&gt;
        
        &gt;

<span id="Grammar_44_1" title="Not referenced">Grammar</span>.<span class="cons_Constructor"><span id="ContextFreeRestrictions_44_9" title="Not referenced">ContextFreeRestrictions</span></span> = &lt;
        <span class="cons_String">context-free</span> <span class="cons_String">restrictions</span>
        
                &lt;<a href="../../restrictions/Restrictions.sdf3/#Restrictions_22_1" id="Restrictions_47_4" title="Defined at ../../restrictions/Restrictions.sdf3 line 22">Restrictions</a>&gt;
        
        &gt;

<span class="layout">//SDF.Definition = &lt;definition &lt;Definition&gt;&gt; IGNORED PRODUCTION</span>


</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
