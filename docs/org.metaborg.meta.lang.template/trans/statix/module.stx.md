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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/module_0_7" title="Multi-file references" data-urls="../main.stx/#statix/module_7_3 ../name.stx/#statix/module_5_3"><span class="token sort_Id">statix/module</span></button>

<span class="keyword">imports</span>

  <a href="../section/section.stx/#statix/section/section_0_7" id="statix/section/section_4_2" title="Defined at ../section/section.stx line 1"><span class="token sort_Id">statix/section/section</span></a>
  <a href="../name.stx/#statix/name_0_7" id="statix/name_5_2" title="Defined at ../name.stx line 1"><span class="token sort_Id">statix/name</span></a>
  <a href="../type.stx/#statix/type_0_7" id="statix/type_6_2" title="Defined at ../type.stx line 1"><span class="token sort_Id">statix/type</span></a>
  <a href="../symbol.stx/#statix/symbol_0_7" id="statix/symbol_7_2" title="Defined at ../symbol.stx line 1"><span class="token sort_Id">statix/symbol</span></a>

<span class="keyword">signature</span> <span class="layout">// Declarations</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="Module_11_8" title="Multi-file references" data-urls="#Module_13_63 ../main.stx/#Module_28_19"><span class="token sort_Id">Module</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Module_23_20" id="Module_12_4" title="Referenced at line 24"><span class="token sort_Id">Module</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleName_14_8" id="ModuleName_12_13" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#ImpSection_61_8" id="ImpSection_12_31" title="Defined at line 62"><span class="token sort_Id">ImpSection</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../section/section.stx/#Section_4_8" id="Section_12_50" title="Defined at ../section/section.stx line 5"><span class="token sort_Id">Section</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Module_11_8" id="Module_12_62" title="Defined at line 12"><span class="token sort_Id">Module</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#ModuleName_12_13" id="ModuleName_14_8" title="Referenced at line 13, 16, 17, 31, 37, 43, 56, 66"><span class="token sort_Id">ModuleName</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Unparameterized_56_17" id="Unparameterized_15_4" title="Referenced at line 57"><span class="token sort_Id">Unparameterized</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleId_18_8" id="ModuleId_15_22" title="Defined at line 19"><span class="token sort_Id">ModuleId</span></a></span>                <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#ModuleName_14_8" id="ModuleName_15_49" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span></span>
    <span class="cons_OpDecl"><a href="#Parameterized_31_18" id="Parameterized_16_4" title="Referenced at line 32, 58"><span class="token sort_Id">Parameterized</span></a>   <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleId_18_8" id="ModuleId_16_22" title="Defined at line 19"><span class="token sort_Id">ModuleId</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="../symbol.stx/#Symbol_10_8" id="Symbol_16_38" title="Defined at ../symbol.stx line 11"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#ModuleName_14_8" id="ModuleName_16_49" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="ModuleId_18_8" title="Multi-file references" data-urls="#ModuleId_16_23 ../name.stx/#ModuleId_10_19"><span class="token sort_Id">ModuleId</span></button></span> <span class="layout">// Use module identifiers as-is.</span>

<span class="keyword">rules</span>

  <button class="modal-open" id="moduleOK_22_2" title="Multi-file references" data-urls="#moduleOK_24_3 ../main.stx/#moduleOK_29_19"><span class="token sort_Id">moduleOK</span></button> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Module_11_8" id="Module_22_21" title="Defined at line 12"><span class="token sort_Id">Module</span></a></span>
  <a href="#moduleOK_22_2" id="moduleOK_23_2" title="Defined at line 23"><span class="token sort_Id">moduleOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sGlobal_24_24" id="sGlobal_23_11" title="Referenced at line 25, 26"><span class="token sort_Id">sGlobal</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Module_12_4" id="Module_23_20" title="Defined at line 13"><span class="token sort_Id">Module</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_25_33" id="name_23_27" title="Referenced at line 26, 27"><span class="token sort_Id">name</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#importSections_27_27" id="importSections_23_33" title="Referenced at line 28"><span class="token sort_Id">importSections</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#sections_28_21" id="sections_23_49" title="Referenced at line 29"><span class="token sort_Id">sections</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#sMod_24_8" id="sMod_23_64" title="Referenced at line 25, 26, 27, 28, 29"><span class="token sort_Id">sMod</span></a></span><span class="operator">}</span>
    <span class="keyword">new</span> <span class="cons_Var"><a href="#sMod_23_64" id="sMod_24_8" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#sMod_23_64" id="sMod_24_14" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span> <span class="operator">-</span><span class="cons_Label"><a href="../name.stx/#P_15_11" id="P_24_20" title="Defined at ../name.stx line 16"><span class="token sort_Id">P</span></a></span><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#sGlobal_23_11" id="sGlobal_24_24" title="Defined at line 24"><span class="token sort_Id">sGlobal</span></a></span><span class="operator">,</span>
    <a href="#declareModule_36_2" id="declareModule_25_4" title="Defined at line 37"><span class="token sort_Id">declareModule</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sGlobal_23_11" id="sGlobal_25_18" title="Defined at line 24"><span class="token sort_Id">sGlobal</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#sMod_23_64" id="sMod_25_27" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_23_27" id="name_25_33" title="Defined at line 24"><span class="token sort_Id">name</span></a></span><span class="operator">),</span>
    <a href="#moduleNameOK_30_2" id="moduleNameOK_26_4" title="Defined at line 31"><span class="token sort_Id">moduleNameOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sMod_23_64" id="sMod_26_17" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_23_27" id="name_26_23" title="Defined at line 24"><span class="token sort_Id">name</span></a></span><span class="operator">),</span>
    <a href="#importSectionsOK_71_2" id="importSectionsOK_27_4" title="Defined at line 72"><span class="token sort_Id">importSectionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sMod_23_64" id="sMod_27_21" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#importSections_23_33" id="importSections_27_27" title="Defined at line 24"><span class="token sort_Id">importSections</span></a></span><span class="operator">),</span>
    <a href="../section/section.stx/#sectionsOK_9_2" id="sectionsOK_28_4" title="Defined at ../section/section.stx line 10"><span class="token sort_Id">sectionsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sMod_23_64" id="sMod_28_15" title="Defined at line 24"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#sections_23_49" id="sections_28_21" title="Defined at line 24"><span class="token sort_Id">sections</span></a></span><span class="operator">).</span>

  <a href="#moduleNameOK_26_4" id="moduleNameOK_30_2" title="Referenced at line 27, 32, 33"><span class="token sort_Id">moduleNameOK</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#ModuleName_14_8" id="ModuleName_30_25" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span>
  <a href="#moduleNameOK_30_2" id="moduleNameOK_31_2" title="Defined at line 31"><span class="token sort_Id">moduleNameOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_31_63" id="s_31_15" title="Referenced at line 32"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Parameterized_16_4" id="Parameterized_31_18" title="Defined at line 17"><span class="token sort_Id">Parameterized</span></a><span class="operator">(_,</span> <span class="cons_Var"><a href="#symbols_31_66" id="symbols_31_35" title="Referenced at line 32"><span class="token sort_Id">symbols</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="../symbol.stx/#typesOfSymbols_76_2" id="typesOfSymbols_31_48" title="Defined at ../symbol.stx line 77"><span class="token sort_Id">typesOfSymbols</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_31_15" id="s_31_63" title="Defined at line 32"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#symbols_31_35" id="symbols_31_66" title="Defined at line 32"><span class="token sort_Id">symbols</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="operator">_.</span>
  <a href="#moduleNameOK_30_2" id="moduleNameOK_32_2" title="Defined at line 31"><span class="token sort_Id">moduleNameOK</span></a><span class="operator">(</span><span class="cons_Var"><span id="s_32_15" title="Not referenced locally, nor via imports"><span class="token sort_Id">s</span></span></span><span class="operator">,</span> <span class="operator">_).</span>

<span class="keyword">rules</span>

  <a href="#declareModule_25_4" id="declareModule_36_2" title="Referenced at line 26, 38"><span class="token sort_Id">declareModule</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#ModuleName_14_8" id="ModuleName_36_34" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span>
  <a href="#declareModule_36_2" id="declareModule_37_2" title="Defined at line 37"><span class="token sort_Id">declareModule</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sGlobal_39_4" id="sGlobal_37_16" title="Referenced at line 40, 41"><span class="token sort_Id">sGlobal</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#sMod_39_46" id="sMod_37_25" title="Referenced at line 40"><span class="token sort_Id">sMod</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_38_19" id="name_37_31" title="Referenced at line 39"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#id_38_28" id="id_37_41" title="Referenced at line 39, 40, 41"><span class="token sort_Id">id</span></a></span><span class="operator">}</span>
    <a href="#idOfModuleName_55_2" id="idOfModuleName_38_4" title="Defined at line 56"><span class="token sort_Id">idOfModuleName</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_37_31" id="name_38_19" title="Defined at line 38"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#id_37_41" id="id_38_28" title="Defined at line 38"><span class="token sort_Id">id</span></a></span><span class="operator">,</span>
    <span class="token sort_Id">sGlobal</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Module</span><span class="operator">{</span><span class="token sort_Id">id</span><span class="operator">}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="../type.stx/#typeOfDecl_16_4" id="typeOfDecl_39_31" title="Defined at ../type.stx line 17"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="cons_Op"><a href="../type.stx/#MOD_13_4" id="MOD_39_42" title="Defined at ../type.stx line 14"><span class="token sort_Id">MOD</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sMod_37_25" id="sMod_39_46" title="Defined at line 38"><span class="token sort_Id">sMod</span></a></span>)</span><span class="operator">,</span>
    <span class="cons_StxOccurrence"><a href="../name.stx/#Module_9_4" id="Module_40_4" title="Defined at ../name.stx line 10"><span class="token sort_Id">Module</span></a><span class="operator">{</span><span class="cons_Var"><a href="#id_37_41" id="id_40_11" title="Defined at line 38"><span class="token sort_Id">id</span></a></span>}</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#sGlobal_37_16" id="sGlobal_40_18" title="Defined at line 38"><span class="token sort_Id">sGlobal</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[(_,</span> <span class="operator">(_))]</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Duplicate definition of module </span><span class="operator">[</span><span class="cons_Var"><a href="#id_37_41" id="id_40_83" title="Defined at line 38"><span class="token sort_Id">id</span></a></span><span class="operator">]]@</span><span class="cons_Var"><a href="#id_37_41" id="id_40_88" title="Defined at line 38"><span class="token sort_Id">id</span></a></span><span class="operator">.</span>

  <a href="#typeOfModule_43_2" id="typeOfModule_42_2" title="Referenced at line 44, 76"><span class="token sort_Id">typeOfModule</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#ModuleName_14_8" id="ModuleName_42_25" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../type.stx/#TYPE_4_8" id="TYPE_42_39" title="Defined at ../type.stx line 5"><span class="token sort_Id">TYPE</span></a></span>
  <a href="#typeOfModule_42_2" id="typeOfModule_43_2" title="Defined at line 43"><span class="token sort_Id">typeOfModule</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_45_32" id="s_43_15" title="Referenced at line 46"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_44_19" id="name_43_18" title="Referenced at line 45"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><a href="#Tmod_46_46" id="Tmod_43_26" title="Referenced at line 47"><span class="token sort_Id">Tmod</span></a></span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#id_44_28" id="id_43_35" title="Referenced at line 45, 46, 47"><span class="token sort_Id">id</span></a></span> <span class="cons_Var"><a href="#paths_45_38" id="paths_43_38" title="Referenced at line 46, 47"><span class="token sort_Id">paths</span></a></span><span class="operator">}</span>
    <a href="#idOfModuleName_55_2" id="idOfModuleName_44_4" title="Defined at line 56"><span class="token sort_Id">idOfModuleName</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_43_18" id="name_44_19" title="Defined at line 44"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#id_43_35" id="id_44_28" title="Defined at line 44"><span class="token sort_Id">id</span></a></span><span class="operator">,</span>
    <span class="cons_Label"><a href="../type.stx/#typeOfDecl_16_4" id="typeOfDecl_45_4" title="Defined at ../type.stx line 17"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="keyword">of</span> <span class="cons_StxOccurrence"><a href="../name.stx/#Module_16_12" id="Module_45_18" title="Defined at ../name.stx line 17"><span class="token sort_Id">Module</span></a><span class="operator">{</span><span class="cons_Var"><a href="#id_43_35" id="id_45_25" title="Defined at line 44"><span class="token sort_Id">id</span></a></span>}</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_43_15" id="s_45_32" title="Defined at line 44"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="cons_Var"><a href="#paths_43_38" id="paths_45_38" title="Defined at line 44"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span>
    <a href="#resolveModules_48_2" id="resolveModules_46_4" title="Defined at line 49"><span class="token sort_Id">resolveModules</span></a><span class="operator">(</span><span class="cons_Var"><a href="#id_43_35" id="id_46_19" title="Defined at line 44"><span class="token sort_Id">id</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#paths_43_38" id="paths_46_23" title="Defined at line 44"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_5_4" id="NON_EMPTY_46_30" title="Defined at ../util.stx line 6"><span class="token sort_Id">NON_EMPTY</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#Tmod_43_26" id="Tmod_46_46" title="Defined at line 44"><span class="token sort_Id">Tmod</span></a></span><span class="operator">.</span>

  <a href="#resolveModules_46_4" id="resolveModules_48_2" title="Referenced at line 47, 50, 52, 53, 54"><span class="token sort_Id">resolveModules</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleId_18_8" id="ModuleId_48_19" title="Defined at line 19"><span class="token sort_Id">ModuleId</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="operator">(</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../type.stx/#TYPE_4_8" id="TYPE_48_57" title="Defined at ../type.stx line 5"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)))</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../util.stx/#EMPTINESS_4_8" id="EMPTINESS_48_67" title="Defined at ../util.stx line 5"><span class="token sort_Id">EMPTINESS</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../type.stx/#TYPE_4_8" id="TYPE_48_80" title="Defined at ../type.stx line 5"><span class="token sort_Id">TYPE</span></a></span>
  <a href="#resolveModules_48_2" id="resolveModules_49_2" title="Defined at line 49"><span class="token sort_Id">resolveModules</span></a><span class="operator">(</span><span class="cons_Var"><a href="#id_50_5" id="id_49_17" title="Referenced at line 51, 52"><span class="token sort_Id">id</span></a></span><span class="operator">,</span> <span class="operator">[(_,</span> <span class="operator">(</span><span class="cons_StxOccurrence"><a href="../name.stx/#Module_9_4" id="Module_49_27" title="Defined at ../name.stx line 10"><span class="token sort_Id">Module</span></a><span class="operator">{</span><span class="cons_Var"><a href="#id'_50_15" id="id'_49_34" title="Referenced at line 51"><span class="token sort_Id">id'</span></a></span>}</span><span class="operator">,</span> <span class="cons_Var">Tmod</span><span class="operator">))|</span><span class="cons_Var"><a href="#paths_51_23" id="paths_49_47" title="Referenced at line 52"><span class="token sort_Id">paths</span></a></span><span class="operator">],</span> <span class="operator">_)</span> <span class="operator">=</span> <span class="cons_Var"><a href="#Tmod_51_48" id="Tmod_49_60" title="Referenced at line 52"><span class="token sort_Id">Tmod</span></a></span> <span class="operator">:-</span>
    <span class="operator">@</span><span class="cons_Var"><a href="#id_49_17" id="id_50_5" title="Defined at line 50"><span class="token sort_Id">id</span></a></span><span class="operator">.</span><span class="keyword">ref</span> <span class="operator">+=</span> <span class="cons_Var"><a href="#id'_49_34" id="id'_50_15" title="Defined at line 50"><span class="token sort_Id">id'</span></a></span><span class="operator">,</span>
    <a href="#resolveModules_48_2" id="resolveModules_51_4" title="Defined at line 49"><span class="token sort_Id">resolveModules</span></a><span class="operator">(</span><span class="cons_Var"><a href="#id_49_17" id="id_51_19" title="Defined at line 50"><span class="token sort_Id">id</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#paths_49_47" id="paths_51_23" title="Defined at line 50"><span class="token sort_Id">paths</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_6_4" id="MAYBE_EMPTY_51_30" title="Defined at ../util.stx line 7"><span class="token sort_Id">MAYBE_EMPTY</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#Tmod_49_60" id="Tmod_51_48" title="Defined at line 50"><span class="token sort_Id">Tmod</span></a></span><span class="operator">.</span>
  <a href="#resolveModules_48_2" id="resolveModules_52_2" title="Defined at line 49"><span class="token sort_Id">resolveModules</span></a><span class="operator">(</span><span class="cons_Var"><a href="#id_52_71" id="id_52_17" title="Referenced at line 53"><span class="token sort_Id">id</span></a></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#NON_EMPTY_5_4" id="NON_EMPTY_52_25" title="Defined at ../util.stx line 6"><span class="token sort_Id">NON_EMPTY</span></a>()</span><span class="operator">)</span>   <span class="operator">=</span> <span class="operator">_</span> <span class="operator">:-</span> <span class="keyword">false</span> <span class="operator">|</span> <span class="keyword">error</span> <span class="operator">$[</span><span class="cons_Text">Module </span><span class="operator">[</span><span class="cons_Var"><a href="#id_52_17" id="id_52_71" title="Defined at line 53"><span class="token sort_Id">id</span></a></span><span class="operator">]</span><span class="cons_Text"> is not defined</span><span class="operator">]@</span><span class="cons_Var"><a href="#id_52_17" id="id_52_91" title="Defined at line 53"><span class="token sort_Id">id</span></a></span><span class="operator">.</span>
  <a href="#resolveModules_48_2" id="resolveModules_53_2" title="Defined at line 49"><span class="token sort_Id">resolveModules</span></a><span class="operator">(</span><span class="cons_Var"><span id="id_53_17" title="Not referenced locally, nor via imports"><span class="token sort_Id">id</span></span></span><span class="operator">,</span> <span class="operator">[],</span> <span class="cons_Op"><a href="../util.stx/#MAYBE_EMPTY_6_4" id="MAYBE_EMPTY_53_25" title="Defined at ../util.stx line 7"><span class="token sort_Id">MAYBE_EMPTY</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">_.</span>

  <a href="#idOfModuleName_38_4" id="idOfModuleName_55_2" title="Referenced at line 39, 45, 57, 58"><span class="token sort_Id">idOfModuleName</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleName_14_8" id="ModuleName_55_19" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#ModuleId_18_8" id="ModuleId_55_33" title="Defined at line 19"><span class="token sort_Id">ModuleId</span></a></span>
  <a href="#idOfModuleName_55_2" id="idOfModuleName_56_2" title="Defined at line 56"><span class="token sort_Id">idOfModuleName</span></a><span class="operator">(</span><span class="cons_Op"><a href="#Unparameterized_15_4" id="Unparameterized_56_17" title="Defined at line 16"><span class="token sort_Id">Unparameterized</span></a><span class="operator">(</span><span class="cons_Var"><span id="id_56_33" title="Not referenced locally, nor via imports"><span class="token sort_Id">id</span></span></span>)</span><span class="operator">)</span>  <span class="operator">=</span> <span class="cons_Var">id</span><span class="operator">.</span>
  <a href="#idOfModuleName_55_2" id="idOfModuleName_57_2" title="Defined at line 56"><span class="token sort_Id">idOfModuleName</span></a><span class="operator">(</span><span class="cons_Op"><a href="#Parameterized_16_4" id="Parameterized_57_17" title="Defined at line 17"><span class="token sort_Id">Parameterized</span></a><span class="operator">(</span><span class="cons_Var"><span id="id_57_31" title="Not referenced locally, nor via imports"><span class="token sort_Id">id</span></span></span>, _)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var">id</span><span class="operator">.</span>

<span class="keyword">signature</span> <span class="layout">// Imports</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#ImpSection_12_31" id="ImpSection_61_8" title="Referenced at line 13, 63, 70"><span class="token sort_Id">ImpSection</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Imports_70_21" id="Imports_62_4" title="Referenced at line 71"><span class="token sort_Id">Imports</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Import_64_8" id="Import_62_19" title="Defined at line 65"><span class="token sort_Id">Import</span></a></span><span class="operator">)</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#ImpSection_61_8" id="ImpSection_62_30" title="Defined at line 62"><span class="token sort_Id">ImpSection</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Import_62_19" id="Import_64_8" title="Referenced at line 63, 66, 74"><span class="token sort_Id">Import</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Module_74_14" id="Module_65_4" title="Referenced at line 75"><span class="token sort_Id">Module</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ModuleName_14_8" id="ModuleName_65_13" title="Defined at line 15"><span class="token sort_Id">ModuleName</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Import_64_8" id="Import_65_27" title="Defined at line 65"><span class="token sort_Id">Import</span></a></span></span>

<span class="keyword">rules</span>

  <a href="#importSectionOK_70_2" id="importSectionOK_69_2" title="Referenced at line 71, 72"><span class="token sort_Id">importSectionOK</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#ImpSection_61_8" id="ImpSection_69_28" title="Defined at line 62"><span class="token sort_Id">ImpSection</span></a></span>
  <a href="#importSectionOK_69_2" id="importSectionOK_70_2" title="Defined at line 70"><span class="token sort_Id">importSectionOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_70_52" id="s_70_18" title="Referenced at line 71"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Imports_62_4" id="Imports_70_21" title="Defined at line 63"><span class="token sort_Id">Imports</span></a><span class="operator">(</span><span class="cons_Var"><a href="#imports_70_55" id="imports_70_29" title="Referenced at line 71"><span class="keyword">imports</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <a href="#importsOK_77_2" id="importsOK_70_42" title="Defined at line 78"><span class="token sort_Id">importsOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_70_18" id="s_70_52" title="Defined at line 71"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#imports_70_29" id="imports_70_55" title="Defined at line 71"><span class="keyword">imports</span></a></span><span class="operator">).</span>
  <a href="#importSectionsOK_27_4" id="importSectionsOK_71_2" title="Referenced at line 28"><span class="token sort_Id">importSectionsOK</span></a> <span class="keyword">maps</span> <a href="#importSectionOK_69_2" id="importSectionOK_71_24" title="Defined at line 70"><span class="token sort_Id">importSectionOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

  <a href="#importOK_74_2" id="importOK_73_2" title="Referenced at line 75, 78"><span class="token sort_Id">importOK</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Import_64_8" id="Import_73_21" title="Defined at line 65"><span class="token sort_Id">Import</span></a></span>
  <a href="#importOK_73_2" id="importOK_74_2" title="Defined at line 74"><span class="token sort_Id">importOK</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_75_17" id="s_74_11" title="Referenced at line 76, 77"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Module_65_4" id="Module_74_14" title="Defined at line 66"><span class="token sort_Id">Module</span></a><span class="operator">(</span><span class="cons_Var"><a href="#name_75_20" id="name_74_21" title="Referenced at line 76"><span class="token sort_Id">name</span></a></span>)</span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#sMod_75_33" id="sMod_74_32" title="Referenced at line 76, 77"><span class="token sort_Id">sMod</span></a></span><span class="operator">}</span>
    <a href="#typeOfModule_42_2" id="typeOfModule_75_4" title="Defined at line 43"><span class="token sort_Id">typeOfModule</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_74_11" id="s_75_17" title="Defined at line 75"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#name_74_21" id="name_75_20" title="Defined at line 75"><span class="token sort_Id">name</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Op"><a href="../type.stx/#MOD_13_4" id="MOD_75_29" title="Defined at ../type.stx line 14"><span class="token sort_Id">MOD</span></a><span class="operator">(</span><span class="cons_Var"><a href="#sMod_74_32" id="sMod_75_33" title="Defined at line 75"><span class="token sort_Id">sMod</span></a></span>)</span><span class="operator">,</span>
    <span class="cons_Var"><a href="#s_74_11" id="s_76_4" title="Defined at line 75"><span class="token sort_Id">s</span></a></span> <span class="operator">-</span><span class="cons_Label"><a href="../name.stx/#I_15_13" id="I_76_7" title="Defined at ../name.stx line 16"><span class="token sort_Id">I</span></a></span><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#sMod_74_32" id="sMod_76_11" title="Defined at line 75"><span class="token sort_Id">sMod</span></a></span><span class="operator">.</span>
  <a href="#importsOK_70_42" id="importsOK_77_2" title="Referenced at line 71"><span class="token sort_Id">importsOK</span></a> <span class="keyword">maps</span> <a href="#importOK_73_2" id="importOK_77_17" title="Defined at line 74"><span class="token sort_Id">importOK</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*))</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
