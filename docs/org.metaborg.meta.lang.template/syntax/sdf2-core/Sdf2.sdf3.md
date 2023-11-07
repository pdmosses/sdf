---
title: Sdf2.sdf3
hide:
  - toc
---

# `Sdf2.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/sdf2-core/Sdf2.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/sdf2-core/Sdf2.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/sdf2-core/Sdf2.sdf3 "The source file on GitHub"

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
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="sdf2-core/Sdf2_1_8" title="Multi-file references" data-urls="../SDF.sdf3/#sdf2-core/Sdf2_2_9 ../../TemplateLang.sdf3/#sdf2-core/Sdf2_3_3">sdf2-core/Sdf2</button>

<span class="keyword">imports</span> 
  <a href="../../aterms/Aterms.sdf3/#aterms/Aterms_0_7" id="aterms/Aterms_4_3" title="Defined at ../../aterms/Aterms.sdf3 line 1">aterms/Aterms</a>
  <a href="../Sdf2-Syntax.sdf3/#sdf2-core/Sdf2-Syntax_0_7" id="sdf2-core/Sdf2-Syntax_5_3" title="Defined at ../Sdf2-Syntax.sdf3 line 1">sdf2-core/Sdf2-Syntax</a> 
  <a href="../../constants/StrCon.sdf3/#constants/StrCon_0_7" id="constants/StrCon_6_3" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a> 
  <a href="../../constants/NatCon.sdf3/#constants/NatCon_0_7" id="constants/NatCon_7_3" title="Defined at ../../constants/NatCon.sdf3 line 1">constants/NatCon</a> 
  <a href="../../priority/Priority.sdf3/#priority/Priority_0_7" id="priority/Priority_8_3" title="Defined at ../../priority/Priority.sdf3 line 1">priority/Priority</a> 
  <a href="../../characterclass/Character.sdf3/#characterclass/Character_0_7" id="characterclass/Character_9_3" title="Defined at ../../characterclass/Character.sdf3 line 1">characterclass/Character</a> 
  <a href="../../modules/Modules.sdf3/#modules/Modules_0_7" id="modules/Modules_10_3" title="Defined at ../../modules/Modules.sdf3 line 1">modules/Modules</a>
  <a href="../../layout-constraints/Layout-Constraints.sdf3/#layout-constraints/Layout-Constraints_0_7" id="layout-constraints/Layout-Constraints_11_3" title="Defined at ../../layout-constraints/Layout-Constraints.sdf3 line 1">layout-constraints/Layout-Constraints</a>

<span class="keyword">context-free start-symbols</span>
    <a href="../../modules/Modules.sdf3/#Module_20_1" id="Module_14_5" title="Defined at ../../modules/Modules.sdf3 line 21">Module</a>

<span class="keyword">lexical syntax</span>
          <a href="#Sort_82_4" id="Sort_17_4" title="Referenced at line 83">Sort</a> = <span class="cons_Lit">"LAYOUT"</span> {<span class="keyword">reject</span>}
 
<span class="keyword">context-free syntax</span>
    
    <a href="#ModuleName_78_26" id="ModuleName_21_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">aliases</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_22_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">lexical</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_23_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">priorities</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_24_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">context-free</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_25_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">definition</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_26_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">syntax</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_27_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">variables</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_28_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">module</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_29_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">imports</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_30_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">exports</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_31_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">hiddens</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_32_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">left</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_33_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">right</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_34_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">assoc</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_35_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">non-assoc</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_36_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">non-nested</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_37_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">bracket</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_38_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">sorts</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_39_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">restrictions</span>&gt; {<span class="keyword">reject</span>}
    
    <span class="layout">//restrictions from SDF3</span>
    <a href="#ModuleName_78_26" id="ModuleName_42_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">language</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_43_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">project</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_44_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">retain</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_45_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">with</span>&gt;  {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_46_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">unimports</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_47_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">overlays</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_48_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">rules</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_49_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">signature</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_50_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">strategies</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_51_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">attributes</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_52_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">template</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_53_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">templates</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_54_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">as</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_55_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">main</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_56_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">__default</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_78_26" id="ModuleName_57_5" title="Referenced at line 79, 104">ModuleName</a> = &lt;<span class="cons_String">__internal</span>&gt; {<span class="keyword">reject</span>}

    <a href="../../TemplateLang.sdf3/#Symbols_86_12" id="Symbols_59_5" title="Referenced at ../../TemplateLang.sdf3 line 87">Symbols</a> = &lt;&lt;<a href="../../constants/StrCon.sdf3/#StrCon_11_4" id="StrCon_59_17" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;<span class="cons_String">(</span>&lt;<span class="cons_Unquoted"><span id="arguments_59_26" title="Not referenced locally, nor via imports">arguments</span></span>:{<a href="../Sdf2-Syntax.sdf3/#Symbol_18_0" id="Symbol_59_37" title="Defined at ../Sdf2-Syntax.sdf3 line 19, 20, 21">Symbol</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">reject</span>}
    
    <span id="Label_61_5" title="Not referenced locally, nor via imports">Label</span> = &lt;&lt;<a href="../../priority/Priority.sdf3/#Associativity_6_0" id="Associativity_61_15" title="Defined at ../../priority/Priority.sdf3 line 7, 8, 9, 10, 11">Associativity</a>&gt;&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_62_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;&lt;<a href="../../priority/Priority.sdf3/#Associativity_6_0" id="Associativity_62_24" title="Defined at ../../priority/Priority.sdf3 line 7, 8, 9, 10, 11">Associativity</a>&gt;&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_63_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">reject</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_64_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">prefer</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_65_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">avoid</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_66_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">bracket</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_67_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">ignore-layout</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_68_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">deprecated</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_69_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">enforce-newline</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_70_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">longest-match</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_71_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">case-insensitive</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_72_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">placeholder</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_73_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">placeholder-insertion</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_74_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">literal-completion</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_75_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">layout(</span>&lt;<a href="../../layout-constraints/Layout-Constraints.sdf3/#Constraint_14_2" id="Constraint_75_31" title="Defined at ../../layout-constraints/Layout-Constraints.sdf3 line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_76_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">layout(</span>&lt;<a href="../../aterms/Aterms.sdf3/#ATerm_13_1" id="ATerm_76_31" title="Defined at ../../aterms/Aterms.sdf3 line 14, 15, 16, 17, 18, 19, 20">ATerm</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_77_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">deprecated(</span>&lt;<a href="../../constants/StrCon.sdf3/#StrCon_11_4" id="StrCon_77_35" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_78_5" title="Not referenced locally, nor via imports">ATermAttribute</span>.<span class="cons_Constructor"><span id="Constructor_78_20" title="Not referenced locally, nor via imports">Constructor</span></span> = &lt;<span class="cons_String">cons(</span>&lt;<a href="../../constants/StrCon.sdf3/#StrCon_11_4" id="StrCon_78_41" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;<span class="cons_String">)</span>&gt;{<span class="keyword">reject</span>}
    <span id="ATermAttribute_79_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">id(</span>&lt;<a href="#ModuleName_20_4" id="ModuleName_79_27" title="Defined at line 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57">ModuleName</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_80_5" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">recover</span>&gt; {<span class="keyword">reject</span>}

  <span class="keyword">restrictions</span>
    <a href="#Sort_16_3" id="Sort_83_5" title="Defined at line 17">Sort</a><span class="keyword">-CF</span>
    <span class="cons_Lit">"aliases"</span>
    <span class="cons_Lit">"lexical"</span>
    <span class="cons_Lit">"priorities"</span>
    <span class="cons_Lit">"context-free"</span>
    <span class="cons_Lit">"definition"</span>
    <span class="cons_Lit">"syntax"</span>
    <span class="cons_Lit">"variables"</span>
    <span class="cons_Lit">"module"</span>
    <span class="cons_Lit">"imports"</span>
    <span class="cons_Lit">"exports"</span>
    <span class="cons_Lit">"hiddens"</span>
    <span class="cons_Lit">"left"</span>
    <span class="cons_Lit">"right"</span>
    <span class="cons_Lit">"assoc"</span>
    <span class="cons_Lit">"non-assoc"</span>
    <span class="cons_Lit">"non-nested"</span>
    <span class="cons_Lit">"bracket"</span>
    <span class="cons_Lit">"sorts"</span>             -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]
    <a href="../../constants/NatCon.sdf3/#NatCon_4_1" id="NatCon_102_5" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a><span class="keyword">-CF</span>        -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]
    <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span>        -/- [\ \t\n\%]
    <a href="#ModuleName_20_4" id="ModuleName_104_5" title="Defined at line 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57">ModuleName</a><span class="keyword">-CF</span>    -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
