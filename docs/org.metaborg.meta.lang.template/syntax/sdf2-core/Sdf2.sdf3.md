---
title: Sdf2.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../SDF.sdf3#sdf2-core/Sdf2_29_43" id="sdf2-core/Sdf2_7_21" title="Referenced at ../SDF.sdf3 line 2">sdf2-core/Sdf2</a>

<span class="keyword">imports</span> 
  <a href="../../aterms/Aterms.sdf3#aterms/Aterms_7_20" id="aterms/Aterms_34_47" title="Defined at ../../aterms/Aterms.sdf3 line 1">aterms/Aterms</a>
  <a href="../Sdf2-Syntax.sdf3#sdf2-core/Sdf2-Syntax_7_28" id="sdf2-core/Sdf2-Syntax_50_71" title="Defined at ../Sdf2-Syntax.sdf3 line 1">sdf2-core/Sdf2-Syntax</a> 
  <a href="../../constants/StrCon.sdf3#constants/StrCon_7_23" id="constants/StrCon_75_91" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a> 
  <a href="../../constants/NatCon.sdf3#constants/NatCon_7_23" id="constants/NatCon_95_111" title="Defined at ../../constants/NatCon.sdf3 line 1">constants/NatCon</a> 
  <a href="../../priority/Priority.sdf3#priority/Priority_7_24" id="priority/Priority_115_132" title="Defined at ../../priority/Priority.sdf3 line 1">priority/Priority</a> 
  <a href="../../characterclass/Character.sdf3#characterclass/Character_7_31" id="characterclass/Character_136_160" title="Defined at ../../characterclass/Character.sdf3 line 1">characterclass/Character</a> 
  <a href="../../modules/Modules.sdf3#modules/Modules_7_22" id="modules/Modules_164_179" title="Defined at ../../modules/Modules.sdf3 line 1">modules/Modules</a>
  <a href="../../layout-constraints/Layout-Constraints.sdf3#layout-constraints/Layout-Constraints_7_44" id="layout-constraints/Layout-Constraints_182_219" title="Defined at ../../layout-constraints/Layout-Constraints.sdf3 line 1">layout-constraints/Layout-Constraints</a>

<span class="keyword">context-free start-symbols</span>
    <a href="../../modules/Modules.sdf3#Module_534_540" id="Module_252_258" title="Defined at ../../modules/Modules.sdf3 line 21">Module</a>

<span class="keyword">lexical syntax</span>
          <a href="#Sort_2655_2659" id="Sort_278_282" title="Referenced at line 83">Sort</a> = <span class="cons_Lit">"LAYOUT"</span> {<span class="keyword">reject</span>}
 
<span class="keyword">context-free syntax</span>
    
    <a href="#ModuleName_3024_3034" id="ModuleName_334_344" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">aliases</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_370_380" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">lexical</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_406_416" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">priorities</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_445_455" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">context-free</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_486_496" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">definition</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_525_535" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">syntax</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_560_570" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">variables</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_598_608" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">module</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_633_643" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">imports</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_669_679" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">exports</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_705_715" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">hiddens</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_741_751" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">left</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_774_784" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">right</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_808_818" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">assoc</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_842_852" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">non-assoc</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_880_890" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">non-nested</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_919_929" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">bracket</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_955_965" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">sorts</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_989_999" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">restrictions</span>&gt; {<span class="keyword">reject</span>}
    
    <span class="layout">//restrictions from SDF3</span>
    <a href="#ModuleName_3024_3034" id="ModuleName_1064_1074" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">language</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1101_1111" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">project</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1137_1147" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">retain</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1172_1182" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">with</span>&gt;  {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1206_1216" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">unimports</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1244_1254" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">overlays</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1281_1291" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">rules</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1315_1325" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">signature</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1353_1363" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">strategies</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1392_1402" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">attributes</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1431_1441" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">template</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1468_1478" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">templates</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1506_1516" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">as</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1537_1547" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">main</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1570_1580" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">__default</span>&gt; {<span class="keyword">reject</span>}
    <a href="#ModuleName_3024_3034" id="ModuleName_1608_1618" title="Referenced at line 104">ModuleName</a> = &lt;<span class="cons_String">__internal</span>&gt; {<span class="keyword">reject</span>}

    <a href="../../TemplateLang.sdf3#Symbols_1852_1859" id="Symbols_1648_1655" title="Referenced at ../../TemplateLang.sdf3 line 87">Symbols</a> = &lt;&lt;<a href="../../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_1660_1666" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;<span class="cons_String">(</span>&lt;<span class="cons_Unquoted"><span id="arguments_1669_1678" title="Not referenced locally, nor via imports">arguments</span></span>:{<a href="../Sdf2-Syntax.sdf3#Symbol_374_380" id="Symbol_1680_1686" title="Defined at ../Sdf2-Syntax.sdf3 line 19, 20, 21">Symbol</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">reject</span>}
    
    <span id="Label_1714_1719" title="Not referenced locally, nor via imports">Label</span> = &lt;&lt;<a href="../../priority/Priority.sdf3#Associativity_101_114" id="Associativity_1724_1737" title="Defined at ../../priority/Priority.sdf3 line 7, 8, 9, 10, 11">Associativity</a>&gt;&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_1753_1767" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;&lt;<a href="../../priority/Priority.sdf3#Associativity_101_114" id="Associativity_1772_1785" title="Defined at ../../priority/Priority.sdf3 line 7, 8, 9, 10, 11">Associativity</a>&gt;&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_1801_1815" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">reject</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_1840_1854" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">prefer</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_1879_1893" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">avoid</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_1917_1931" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">bracket</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_1957_1971" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">ignore-layout</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2003_2017" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">deprecated</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2046_2060" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">enforce-newline</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2094_2108" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">longest-match</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2140_2154" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">case-insensitive</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2189_2203" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">placeholder</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2233_2247" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">placeholder-insertion</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2287_2301" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">literal-completion</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2338_2352" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">layout(</span>&lt;<a href="../../layout-constraints/Layout-Constraints.sdf3#Constraint_187_197" id="Constraint_2364_2374" title="Defined at ../../layout-constraints/Layout-Constraints.sdf3 line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2391_2405" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">layout(</span>&lt;<a href="../../aterms/Aterms.sdf3#ATerm_216_221" id="ATerm_2417_2422" title="Defined at ../../aterms/Aterms.sdf3 line 14, 15, 16, 17, 18, 19, 20">ATerm</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2439_2453" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">deprecated(</span>&lt;<a href="../../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_2469_2475" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2492_2506" title="Not referenced locally, nor via imports">ATermAttribute</span>.<span class="cons_Constructor"><span id="Constructor_2507_2518" title="Not referenced locally, nor via imports">Constructor</span></span> = &lt;<span class="cons_String">cons(</span>&lt;<a href="../../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_2528_2534" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;<span class="cons_String">)</span>&gt;{<span class="keyword">reject</span>}
    <span id="ATermAttribute_2550_2564" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">id(</span>&lt;<a href="#ModuleName_334_344" id="ModuleName_2572_2582" title="Defined at line 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57">ModuleName</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">reject</span>}
    <span id="ATermAttribute_2599_2613" title="Not referenced locally, nor via imports">ATermAttribute</span> = &lt;<span class="cons_String">recover</span>&gt; {<span class="keyword">reject</span>}

  <span class="keyword">restrictions</span>
    <a href="#Sort_278_282" id="Sort_2655_2659" title="Defined at line 17">Sort</a><span class="keyword">-CF</span>
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
    <a href="../../constants/NatCon.sdf3#NatCon_44_50" id="NatCon_2956_2962" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a><span class="keyword">-CF</span>        -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]
    <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span>        -/- [\ \t\n\%]
    <a href="#ModuleName_334_344" id="ModuleName_3024_3034" title="Defined at line 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57">ModuleName</a><span class="keyword">-CF</span>    -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-]

</code></pre></td></tr></tbody></table></div>