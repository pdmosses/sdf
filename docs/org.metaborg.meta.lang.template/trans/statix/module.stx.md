---
title: module.stx
hide:
  - toc
---

# `module.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/module.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/module.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/module.stx "The source file on GitHub"

<div class="stx"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/module_1_8" title="Multi-file references" data-urls="../main.stx/#statix/module_7_3 line 7; ../name.stx/#statix/module_5_3 line 5"><span class="token sort_Id">statix/module</span></button>

<span class="keyword">imports</span>

  <a href="../section/section.stx/#statix/section/section_1_8" id="statix/section/section_5_3" title="Defined at ../section/section.stx line 1"><span class="token sort_Id">statix/section/section</span></a>
  <a href="../name.stx/#statix/name_1_8" id="statix/name_6_3" title="Defined at ../name.stx line 1"><span class="token sort_Id">statix/name</span></a>
  <a href="../type.stx/#statix/type_1_8" id="statix/type_7_3" title="Defined at ../type.stx line 1"><span class="token sort_Id">statix/type</span></a>
  <a href="../symbol.stx/#statix/symbol_1_8" id="statix/symbol_8_3" title="Defined at ../symbol.stx line 1"><span class="token sort_Id">statix/symbol</span></a>

<span class="keyword">signature</span> <span class="layout">// Declarations</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Module_12_9" title="Multi-file references" data-urls="#Module_13_63 line 13, 23; ../main.stx/#Module_28_19 line 28"><span class="token sort_Id">Module</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Module_24_21" id="Module_13_5" title="Referenced at line 24"><span class="token sort_Id">Module</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleName_15_9" id="ModuleName_13_14" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#ImpSection_62_9" id="ImpSection_13_32" title="Defined at line 62"><span class="token sort_Id">ImpSection</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../section/section.stx/#Section_5_9" id="Section_13_51" title="Defined at ../section/section.stx line 5"><span class="token sort_Id">Section</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Module_12_9" id="Module_13_63" title="Defined at line 12"><span class="token sort_Id">Module</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#ModuleName_13_14" id="ModuleName_15_9" title="Referenced at line 13, 16, 17, 31, 37, 43, 56, 66"><span class="token sort_Id">ModuleName</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Unparameterized_57_18" id="Unparameterized_16_5" title="Referenced at line 57"><span class="token sort_Id">Unparameterized</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleId_19_9" id="ModuleId_16_23" title="Defined at line 19"><span class="token sort_Id">ModuleId</span></a></span>                <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#ModuleName_15_9" id="ModuleName_16_50" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span></span>
    <span class="cons_OpDecl"><a href="#Parameterized_32_19" id="Parameterized_17_5" title="Referenced at line 32, 58"><span class="token sort_Id">Parameterized</span></a>   <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleId_19_9" id="ModuleId_17_23" title="Defined at line 19"><span class="token sort_Id">ModuleId</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../symbol.stx/#Symbol_11_9" id="Symbol_17_39" title="Defined at ../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#ModuleName_15_9" id="ModuleName_17_50" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="ModuleId_19_9" title="Multi-file references" data-urls="#ModuleId_16_23 line 16, 17, 49, 56; ../name.stx/#ModuleId_10_19 line 10"><span class="token sort_Id">ModuleId</span></button></span> <span class="layout">// Use module identifiers as-is.</span>

<span class="keyword">rules</span>

  <button class="modal-open" id="moduleOK_23_3" title="Multi-file references" data-urls="#moduleOK_24_3 line 24; ../main.stx/#moduleOK_29_19 line 29"><span class="token sort_Id">moduleOK</span></button> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Module_12_9" id="Module_23_22" title="Defined at line 12"><span class="token sort_Id">Module</span></a></span>
  <a href="#moduleOK_23_3" id="moduleOK_24_3" title="Defined at line 23"><span class="token sort_Id">moduleOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sGlobal_25_25" id="sGlobal_24_12" title="Referenced at line 25, 26"><span class="token sort_Id">sGlobal</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Module_13_5" id="Module_24_21" title="Defined at line 13"><span class="token sort_Id">Module</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_26_34" id="name_24_28" title="Referenced at line 26, 27"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#importSections_28_28" id="importSections_24_34" title="Referenced at line 28"><span class="token sort_Id">importSections</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#sections_29_22" id="sections_24_50" title="Referenced at line 29"><span class="token sort_Id">sections</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#sMod_25_9" id="sMod_24_65" title="Referenced at line 25, 26, 27, 28, 29"><span class="token sort_Id">sMod</span></a></span><span class="operator">}</span>
    <span class="keyword">new</span> <span class="cons_Var"><a href="#sMod_24_65" id="sMod_25_9" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#sMod_24_65" id="sMod_25_15" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span> <span class="operator">-</span><span class="cons_Label"><a href="../name.stx/#P_16_12" id="P_25_21" title="Defined at ../name.stx line 16"><span class="token sort_Id">P</span></a></span><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#sGlobal_24_12" id="sGlobal_25_25" title="Defined at line 24"><span class="token sort_Id">sGlobal</span></a></span><span class="operator">,</span>
    <a href="#declareModule_37_3" id="declareModule_26_5" title="Defined at line 37"><span class="token sort_Id">declareModule</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sGlobal_24_12" id="sGlobal_26_19" title="Defined at line 24"><span class="token sort_Id">sGlobal</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#sMod_24_65" id="sMod_26_28" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_24_28" id="name_26_34" title="Defined at line 24"><span class="token sort_Id">name</span></a></span><span class="operator">),</span>
    <a href="#moduleNameOK_31_3" id="moduleNameOK_27_5" title="Defined at line 31"><span class="token sort_Id">moduleNameOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sMod_24_65" id="sMod_27_18" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_24_28" id="name_27_24" title="Defined at line 24"><span class="token sort_Id">name</span></a></span><span class="operator">),</span>
    <a href="#importSectionsOK_72_3" id="importSectionsOK_28_5" title="Defined at line 72"><span class="token sort_Id">importSectionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sMod_24_65" id="sMod_28_22" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#importSections_24_34" id="importSections_28_28" title="Defined at line 24"><span class="token sort_Id">importSections</span></a></span><span class="operator">),</span>
    <a href="../section/section.stx/#sectionsOK_10_3" id="sectionsOK_29_5" title="Defined at ../section/section.stx line 10"><span class="token sort_Id">sectionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sMod_24_65" id="sMod_29_16" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#sections_24_50" id="sections_29_22" title="Defined at line 24"><span class="token sort_Id">sections</span></a></span><span class="operator">).</span>

  <a href="#moduleNameOK_27_5" id="moduleNameOK_31_3" title="Referenced at line 27, 32, 33"><span class="token sort_Id">moduleNameOK</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#ModuleName_15_9" id="ModuleName_31_26" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span>
  <a href="#moduleNameOK_31_3" id="moduleNameOK_32_3" title="Defined at line 31"><span class="token sort_Id">moduleNameOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_32_64" id="s_32_16" title="Referenced at line 32"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Parameterized_17_5" id="Parameterized_32_19" title="Defined at line 17"><span class="token sort_Id">Parameterized</span></a><span class="operator">(_,</span> <span class="cons_Var"><a href="#symbols_32_67" id="symbols_32_36" title="Referenced at line 32"><span class="token sort_Id">symbols</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../symbol.stx/#typesOfSymbols_77_3" id="typesOfSymbols_32_49" title="Defined at ../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_32_16" id="s_32_64" title="Defined at line 32"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_32_36" id="symbols_32_67" title="Defined at line 32"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#moduleNameOK_31_3" id="moduleNameOK_33_3" title="Defined at line 31"><span class="token sort_Id">moduleNameOK</span></a><span class="operator">(</span><span class="cons_Var"><span id="s_33_16" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">,</span> <span class="operator">_).</span>

<span class="keyword">rules</span>

  <a href="#declareModule_26_5" id="declareModule_37_3" title="Referenced at line 26, 38"><span class="token sort_Id">declareModule</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#ModuleName_15_9" id="ModuleName_37_35" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span>
  <a href="#declareModule_37_3" id="declareModule_38_3" title="Defined at line 37"><span class="token sort_Id">declareModule</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sGlobal_40_5" id="sGlobal_38_17" title="Referenced at line 40, 41"><span class="token sort_Id">sGlobal</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#sMod_40_47" id="sMod_38_26" title="Referenced at line 40"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_39_20" id="name_38_32" title="Referenced at line 39"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#id_39_29" id="id_38_42" title="Referenced at line 39, 40, 41"><span class="token sort_Id">id</span></a></span><span class="operator">}</span>
    <a href="#idOfModuleName_56_3" id="idOfModuleName_39_5" title="Defined at line 56"><span class="token sort_Id">idOfModuleName</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_38_32" id="name_39_20" title="Defined at line 38"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#id_38_42" id="id_39_29" title="Defined at line 38"><span class="token sort_Id">id</span></a></span><span class="operator">,</span>
    <span class="token sort_Id">sGlobal</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Module</span><span class="operator">{</span><span class="token sort_Id">id</span><span class="operator">}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="../type.stx/#typeOfDecl_17_5" id="typeOfDecl_40_32" title="Defined at ../type.stx line 17"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="cons_Op"><a href="../type.stx/#MOD_14_5" id="MOD_40_43" title="Defined at ../type.stx line 14"><span class="token sort_Id">MOD</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sMod_38_26" id="sMod_40_47" title="Defined at line 38"><span class="token sort_Id">sMod</span></a></span>)</span><span class="operator">,</span>
    <span class="cons_StxOccurrence"><a href="../name.stx/#Module_10_5" id="Module_41_5" title="Defined at ../name.stx line 10"><span class="token sort_Id">Module</span></a><span class="operator">{</span><span class="cons_Var"><a href="#id_38_42" id="id_41_12" title="Defined at line 38"><span class="token sort_Id">id</span></a></span>}</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#sGlobal_38_17" id="sGlobal_41_19" title="Defined at line 38"><span class="token sort_Id">sGlobal</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[(_,</span> <span class="operator">(_))]</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Duplicate definition of module </span><span class="operator">[</span><span class="cons_Var"><a href="#id_38_42" id="id_41_84" title="Defined at line 38"><span class="token sort_Id">id</span></a></span><span class="operator">]]@</span><span class="cons_Var"><a href="#id_38_42" id="id_41_89" title="Defined at line 38"><span class="token sort_Id">id</span></a></span><span class="operator">.</span>

  <a href="#typeOfModule_44_3" id="typeOfModule_43_3" title="Referenced at line 44, 76"><span class="token sort_Id">typeOfModule</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#ModuleName_15_9" id="ModuleName_43_26" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../type.stx/#TYPE_5_9" id="TYPE_43_40" title="Defined at ../type.stx line 5"><span class="token sort_Id">TYPE</span></a></span>
  <a href="#typeOfModule_43_3" id="typeOfModule_44_3" title="Defined at line 43"><span class="token sort_Id">typeOfModule</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_46_33" id="s_44_16" title="Referenced at line 46"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_45_20" id="name_44_19" title="Referenced at line 45"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><a href="#Tmod_47_47" id="Tmod_44_27" title="Referenced at line 47"><span class="token sort_Id">Tmod</span></a></span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#id_45_29" id="id_44_36" title="Referenced at line 45, 46, 47"><span class="token sort_Id">id</span></a></span> <span class="cons_Var"><a href="#paths_46_39" id="paths_44_39" title="Referenced at line 46, 47"><span class="token sort_Id">paths</span></a></span><span class="operator">}</span>
    <a href="#idOfModuleName_56_3" id="idOfModuleName_45_5" title="Defined at line 56"><span class="token sort_Id">idOfModuleName</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_44_19" id="name_45_20" title="Defined at line 44"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#id_44_36" id="id_45_29" title="Defined at line 44"><span class="token sort_Id">id</span></a></span><span class="operator">,</span>
    <span class="cons_Label"><a href="../type.stx/#typeOfDecl_17_5" id="typeOfDecl_46_5" title="Defined at ../type.stx line 17"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="keyword">of</span> <span class="cons_StxOccurrence"><a href="../name.stx/#Module_17_13" id="Module_46_19" title="Defined at ../name.stx line 17"><span class="token sort_Id">Module</span></a><span class="operator">{</span><span class="cons_Var"><a href="#id_44_36" id="id_46_26" title="Defined at line 44"><span class="token sort_Id">id</span></a></span>}</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_44_16" id="s_46_33" title="Defined at line 44"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="cons_Var"><a href="#paths_44_39" id="paths_46_39" title="Defined at line 44"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span>
    <a href="#resolveModules_49_3" id="resolveModules_47_5" title="Defined at line 49"><span class="token sort_Id">resolveModules</span></a><span class="operator">(</span><span class="cons_Var"><a href="#id_44_36" id="id_47_20" title="Defined at line 44"><span class="token sort_Id">id</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#paths_44_39" id="paths_47_24" title="Defined at line 44"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_6_5" id="NON_EMPTY_47_31" title="Defined at ../util.stx line 6"><span class="token sort_Id">NON_EMPTY</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#Tmod_44_27" id="Tmod_47_47" title="Defined at line 44"><span class="token sort_Id">Tmod</span></a></span><span class="operator">.</span>

  <a href="#resolveModules_47_5" id="resolveModules_49_3" title="Referenced at line 47, 50, 52, 53, 54"><span class="token sort_Id">resolveModules</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleId_19_9" id="ModuleId_49_20" title="Defined at line 19"><span class="token sort_Id">ModuleId</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="operator">(</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../type.stx/#TYPE_5_9" id="TYPE_49_58" title="Defined at ../type.stx line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)))</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../util.stx/#EMPTINESS_5_9" id="EMPTINESS_49_68" title="Defined at ../util.stx line 5"><span class="token sort_Id">EMPTINESS</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../type.stx/#TYPE_5_9" id="TYPE_49_81" title="Defined at ../type.stx line 5"><span class="token sort_Id">TYPE</span></a></span>
  <a href="#resolveModules_49_3" id="resolveModules_50_3" title="Defined at line 49"><span class="token sort_Id">resolveModules</span></a><span class="operator">(</span><span class="cons_Var"><a href="#id_51_6" id="id_50_18" title="Referenced at line 51, 52"><span class="token sort_Id">id</span></a></span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="operator">(</span><span class="cons_StxOccurrence"><a href="../name.stx/#Module_10_5" id="Module_50_28" title="Defined at ../name.stx line 10"><span class="token sort_Id">Module</span></a><span class="operator">{</span><span class="cons_Var"><a href="#id'_51_16" id="id'_50_35" title="Referenced at line 51"><span class="token sort_Id">id'</span></a></span>}</span><span class="operator">,</span> <span class="cons_Var">Tmod</span><span class="operator">))|</span><span class="cons_Var"><a href="#paths_52_24" id="paths_50_48" title="Referenced at line 52"><span class="token sort_Id">paths</span></a></span><span class="operator">],</span> <span class="operator">_)</span> <span class="operator">=</span> <span class="cons_Var"><a href="#Tmod_52_49" id="Tmod_50_61" title="Referenced at line 52"><span class="token sort_Id">Tmod</span></a></span> <span class="operator">:-</span>
    <span class="operator">@</span><span class="cons_Var"><a href="#id_50_18" id="id_51_6" title="Defined at line 50"><span class="token sort_Id">id</span></a></span><span class="operator">.</span><span class="keyword">ref</span> <span class="operator">+=</span> <span class="cons_Var"><a href="#id'_50_35" id="id'_51_16" title="Defined at line 50"><span class="token sort_Id">id'</span></a></span><span class="operator">,</span>
    <a href="#resolveModules_49_3" id="resolveModules_52_5" title="Defined at line 49"><span class="token sort_Id">resolveModules</span></a><span class="operator">(</span><span class="cons_Var"><a href="#id_50_18" id="id_52_20" title="Defined at line 50"><span class="token sort_Id">id</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#paths_50_48" id="paths_52_24" title="Defined at line 50"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_7_5" id="MAYBE_EMPTY_52_31" title="Defined at ../util.stx line 7"><span class="token sort_Id">MAYBE_EMPTY</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#Tmod_50_61" id="Tmod_52_49" title="Defined at line 50"><span class="token sort_Id">Tmod</span></a></span><span class="operator">.</span>
  <a href="#resolveModules_49_3" id="resolveModules_53_3" title="Defined at line 49"><span class="token sort_Id">resolveModules</span></a><span class="operator">(</span><span class="cons_Var"><a href="#id_53_72" id="id_53_18" title="Referenced at line 53"><span class="token sort_Id">id</span></a></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_6_5" id="NON_EMPTY_53_26" title="Defined at ../util.stx line 6"><span class="token sort_Id">NON_EMPTY</span></a>()</span><span class="operator">)</span>   <span class="operator">=</span> <span class="operator">_</span> <span class="operator">:-</span> <span class="keyword">false</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Module </span><span class="operator">[</span><span class="cons_Var"><a href="#id_53_18" id="id_53_72" title="Defined at line 53"><span class="token sort_Id">id</span></a></span><span class="operator">]</span><span class="cons_Text"> is not defined</span><span class="operator">]@</span><span class="cons_Var"><a href="#id_53_18" id="id_53_92" title="Defined at line 53"><span class="token sort_Id">id</span></a></span><span class="operator">.</span>
  <a href="#resolveModules_49_3" id="resolveModules_54_3" title="Defined at line 49"><span class="token sort_Id">resolveModules</span></a><span class="operator">(</span><span class="cons_Var"><span id="id_54_18" title="Not referenced"><span class="token sort_Id">id</span></span></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_7_5" id="MAYBE_EMPTY_54_26" title="Defined at ../util.stx line 7"><span class="token sort_Id">MAYBE_EMPTY</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">_.</span>

  <a href="#idOfModuleName_39_5" id="idOfModuleName_56_3" title="Referenced at line 39, 45, 57, 58"><span class="token sort_Id">idOfModuleName</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleName_15_9" id="ModuleName_56_20" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#ModuleId_19_9" id="ModuleId_56_34" title="Defined at line 19"><span class="token sort_Id">ModuleId</span></a></span>
  <a href="#idOfModuleName_56_3" id="idOfModuleName_57_3" title="Defined at line 56"><span class="token sort_Id">idOfModuleName</span></a><span class="operator">(</span><span class="cons_Op"><a href="#Unparameterized_16_5" id="Unparameterized_57_18" title="Defined at line 16"><span class="token sort_Id">Unparameterized</span></a><span class="operator">(</span><span class="cons_Var">id</span>)</span><span class="operator">)</span>  <span class="operator">=</span> <span class="cons_Var"><span id="id_57_42" title="Not referenced"><span class="token sort_Id">id</span></span></span><span class="operator">.</span>
  <a href="#idOfModuleName_56_3" id="idOfModuleName_58_3" title="Defined at line 56"><span class="token sort_Id">idOfModuleName</span></a><span class="operator">(</span><span class="cons_Op"><a href="#Parameterized_17_5" id="Parameterized_58_18" title="Defined at line 17"><span class="token sort_Id">Parameterized</span></a><span class="operator">(</span><span class="cons_Var"><span id="id_58_32" title="Not referenced"><span class="token sort_Id">id</span></span></span>, _)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var">id</span><span class="operator">.</span>

<span class="keyword">signature</span> <span class="layout">// Imports</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#ImpSection_13_32" id="ImpSection_62_9" title="Referenced at line 13, 63, 70"><span class="token sort_Id">ImpSection</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Imports_71_22" id="Imports_63_5" title="Referenced at line 71"><span class="token sort_Id">Imports</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Import_65_9" id="Import_63_20" title="Defined at line 65"><span class="token sort_Id">Import</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#ImpSection_62_9" id="ImpSection_63_31" title="Defined at line 62"><span class="token sort_Id">ImpSection</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Import_63_20" id="Import_65_9" title="Referenced at line 63, 66, 74"><span class="token sort_Id">Import</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Module_75_15" id="Module_66_5" title="Referenced at line 75"><span class="token sort_Id">Module</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleName_15_9" id="ModuleName_66_14" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Import_65_9" id="Import_66_28" title="Defined at line 65"><span class="token sort_Id">Import</span></a></span></span>

<span class="keyword">rules</span>

  <a href="#importSectionOK_71_3" id="importSectionOK_70_3" title="Referenced at line 71, 72"><span class="token sort_Id">importSectionOK</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#ImpSection_62_9" id="ImpSection_70_29" title="Defined at line 62"><span class="token sort_Id">ImpSection</span></a></span>
  <a href="#importSectionOK_70_3" id="importSectionOK_71_3" title="Defined at line 70"><span class="token sort_Id">importSectionOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_71_53" id="s_71_19" title="Referenced at line 71"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Imports_63_5" id="Imports_71_22" title="Defined at line 63"><span class="token sort_Id">Imports</span></a><span class="operator">(</span><span class="cons_Var"><a href="#imports_71_56" id="imports_71_30" title="Referenced at line 71"><span class="keyword">imports</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#importsOK_78_3" id="importsOK_71_43" title="Defined at line 78"><span class="token sort_Id">importsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_71_19" id="s_71_53" title="Defined at line 71"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#imports_71_30" id="imports_71_56" title="Defined at line 71"><span class="keyword">imports</span></a></span><span class="operator">).</span>
  <a href="#importSectionsOK_28_5" id="importSectionsOK_72_3" title="Referenced at line 28"><span class="token sort_Id">importSectionsOK</span></a> <span class="keyword">maps</span> <a href="#importSectionOK_70_3" id="importSectionOK_72_25" title="Defined at line 70"><span class="token sort_Id">importSectionOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

  <a href="#importOK_75_3" id="importOK_74_3" title="Referenced at line 75, 78"><span class="token sort_Id">importOK</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Import_65_9" id="Import_74_22" title="Defined at line 65"><span class="token sort_Id">Import</span></a></span>
  <a href="#importOK_74_3" id="importOK_75_3" title="Defined at line 74"><span class="token sort_Id">importOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_76_18" id="s_75_12" title="Referenced at line 76, 77"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Module_66_5" id="Module_75_15" title="Defined at line 66"><span class="token sort_Id">Module</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_76_21" id="name_75_22" title="Referenced at line 76"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#sMod_76_34" id="sMod_75_33" title="Referenced at line 76, 77"><span class="token sort_Id">sMod</span></a></span><span class="operator">}</span>
    <a href="#typeOfModule_43_3" id="typeOfModule_76_5" title="Defined at line 43"><span class="token sort_Id">typeOfModule</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_75_12" id="s_76_18" title="Defined at line 75"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_75_22" id="name_76_21" title="Defined at line 75"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Op"><a href="../type.stx/#MOD_14_5" id="MOD_76_30" title="Defined at ../type.stx line 14"><span class="token sort_Id">MOD</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sMod_75_33" id="sMod_76_34" title="Defined at line 75"><span class="token sort_Id">sMod</span></a></span>)</span><span class="operator">,</span>
    <span class="cons_Var"><a href="#s_75_12" id="s_77_5" title="Defined at line 75"><span class="token sort_Id">s</span></a></span> <span class="operator">-</span><span class="cons_Label"><a href="../name.stx/#I_16_14" id="I_77_8" title="Defined at ../name.stx line 16"><span class="token sort_Id">I</span></a></span><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#sMod_75_33" id="sMod_77_12" title="Defined at line 75"><span class="token sort_Id">sMod</span></a></span><span class="operator">.</span>
  <a href="#importsOK_71_43" id="importsOK_78_3" title="Referenced at line 71"><span class="token sort_Id">importsOK</span></a> <span class="keyword">maps</span> <a href="#importOK_74_3" id="importOK_78_18" title="Defined at line 74"><span class="token sort_Id">importOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
