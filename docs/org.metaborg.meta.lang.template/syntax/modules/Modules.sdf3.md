---
title: Modules.sdf3
hide:
  - toc
---

# `Modules.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/modules/Modules.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/modules/Modules.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/modules/Modules.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="modules/Modules_1_8" title="Multi-file references" data-urls="../../TemplateLang.sdf3/#modules/Modules_13_3 line 13; ../../sdf2-core/SDF.sdf3/#modules/Modules_2_24 line 2; ../../sdf2-core/Sdf2-Syntax.sdf3/#modules/Modules_5_9 line 5; ../../sdf2-core/Sdf2.sdf3/#modules/Modules_10_3 line 10">modules/Modules</button>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_1_8" id="kernel/Kernel_3_9" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> 
        <a href="../../renaming/Renaming.sdf3/#renaming/Renaming_1_8" id="renaming/Renaming_4_9" title="Defined at ../../renaming/Renaming.sdf3 line 1">renaming/Renaming</a>
        <a href="../../symbols/Symbols.sdf3/#symbols/Symbols_1_8" id="symbols/Symbols_5_9" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a>
 
<span class="keyword">lexical syntax</span>
    <span class="layout">//letters:[A-Za-z0-9\_\-]+ -&gt; ModuleWord  {cons("word")}</span>
        <a href="#ModuleWord_11_22" id="ModuleWord_9_2" title="Referenced at line 11, 15, 53">ModuleWord</a>.<span class="cons_Constructor"><span id="Word_9_13" title="Not referenced">Word</span></span> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-]+
        
    <a href="#ModuleId_13_25" id="ModuleId_11_5" title="Referenced at line 13, 15, 35, 36, 54">ModuleId</a>.<span class="cons_Constructor"><span id="Leaf_11_14" title="Not referenced">Leaf</span></span> =  <a href="#ModuleWord_9_2" id="ModuleWord_11_22" title="Defined at line 9">ModuleWord</a>
    <span class="layout">//sep:"/" basename:ModuleId            -&gt; ModuleId  {cons("root")}</span>
    <a href="#ModuleId_13_25" id="ModuleId_13_5" title="Referenced at line 13, 15, 35, 36, 54">ModuleId</a>.<span class="cons_Constructor"><span id="Root_13_14" title="Not referenced">Root</span></span> = <span class="cons_Lit">"/"</span> <a href="#ModuleId_11_5" id="ModuleId_13_25" title="Defined at line 11, 13, 15">ModuleId</a>
    <span class="layout">//dirname:ModuleWord sep:"/" basename:ModuleId -&gt; ModuleId  {cons("path")}</span>
    <a href="#ModuleId_13_25" id="ModuleId_15_5" title="Referenced at line 13, 15, 35, 36, 54">ModuleId</a>.<span class="cons_Constructor"><span id="Path_15_14" title="Not referenced">Path</span></span> = <a href="#ModuleWord_9_2" id="ModuleWord_15_21" title="Defined at line 9">ModuleWord</a> <span class="cons_Lit">"/"</span> <a href="#ModuleId_11_5" id="ModuleId_15_36" title="Defined at line 11, 13, 15">ModuleId</a>
    

<span class="keyword">context-free syntax</span>
        <span class="layout">//Definition = &lt;&lt;list:Module*&gt;&gt;</span>
        
        <button class="modal-open" id="Module_21_2" title="Multi-file references" data-urls="../../TemplateLang.sdf3/#Module_17_5 line 17; ../../sdf2-core/Sdf2.sdf3/#Module_14_5 line 14">Module</button>.<span class="cons_Constructor"><span id="Module_21_9" title="Not referenced">Module</span></span> = &lt;
        <span class="cons_String">module</span> &lt;<a href="#ModuleName_35_2" id="ModuleName_22_10" title="Defined at line 35, 36">ModuleName</a>&gt;
        
        &lt;<span class="cons_Unquoted"><span id="list_24_3" title="Not referenced">list</span></span>:<a href="#ImpSection_40_2" id="ImpSection_24_8" title="Defined at line 40">ImpSection</a>*&gt;
        
        &lt;<a href="#Sections_31_5" id="Sections_26_3" title="Defined at line 31">Sections</a>&gt;&gt;
        
        <span class="layout">//Section.Exports = &lt;exports &lt;Grammar&gt;&gt;</span>
        <span class="layout">//Section.Hiddens = &lt;hiddens &lt;Grammar&gt;&gt;</span>
        
    <a href="#Sections_26_3" id="Sections_31_5" title="Referenced at line 26">Sections</a> = &lt;&lt;{<a href="#Section_33_5" id="Section_31_19" title="Defined at line 33">Section</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;
    
    <a href="#Section_31_19" id="Section_33_5" title="Referenced at line 31">Section</a>.<span class="cons_Constructor"><span id="SDFSection_33_13" title="Not referenced">SDFSection</span></span> = &lt;&lt;<a href="../../kernel/Kernel.sdf3/#Grammar_54_1" id="Grammar_33_28" title="Defined at ../../kernel/Kernel.sdf3 line 54">Grammar</a>&gt;&gt;
        
        <a href="#ModuleName_22_10" id="ModuleName_35_2" title="Referenced at line 22, 48">ModuleName</a>.<span class="cons_Constructor"><span id="Unparameterized_35_13" title="Not referenced">Unparameterized</span></span> = &lt;&lt;<a href="#ModuleId_11_5" id="ModuleId_35_33" title="Defined at line 11, 13, 15">ModuleId</a>&gt;&gt;
        <a href="#ModuleName_22_10" id="ModuleName_36_2" title="Referenced at line 22, 48">ModuleName</a>.<span class="cons_Constructor"><span id="Parameterized_36_13" title="Not referenced">Parameterized</span></span> = &lt;&lt;<a href="#ModuleId_11_5" id="ModuleId_36_31" title="Defined at line 11, 13, 15">ModuleId</a>&gt; <span class="cons_String">[</span>&lt;<span class="cons_Unquoted"><span id="params_36_43" title="Not referenced">params</span></span>:<a href="../../symbols/Symbols.sdf3/#Symbols_8_1" id="Symbols_36_50" title="Defined at ../../symbols/Symbols.sdf3 line 8">Symbols</a>&gt;<span class="cons_String">]</span>&gt;
        
<span class="layout">//        Attribute.Id = &lt;id (&lt;ModuleName&gt;) &gt; </span>
        
        <a href="#ImpSection_24_8" id="ImpSection_40_2" title="Referenced at line 24">ImpSection</a>.<span class="cons_Constructor"><span id="Imports_40_13" title="Not referenced">Imports</span></span> = &lt;
        <span class="cons_String">imports</span> 
                &lt;<span class="cons_Unquoted"><span id="list_42_4" title="Not referenced">list</span></span>:<a href="#Imports_46_2" id="Imports_42_9" title="Defined at line 46">Imports</a>&gt;&gt;
        
        <span class="layout">//Grammar.ImpSection = &lt;&lt;ImpSection&gt;&gt; IGNORED PRODUCTION</span>
         
        <a href="#Imports_42_9" id="Imports_46_2" title="Referenced at line 42">Imports</a> = &lt;&lt;<span class="cons_Unquoted"><span id="list_46_14" title="Not referenced">list</span></span>:{<a href="#Import_48_2" id="Import_46_20" title="Defined at line 48">Import</a> <span class="cons_Lit">"\n\t"</span>}*&gt;&gt;
        
        <a href="#Import_46_20" id="Import_48_2" title="Referenced at line 46">Import</a>.<span class="cons_Constructor"><span id="Module_48_9" title="Not referenced">Module</span></span> = &lt;&lt;<a href="#ModuleName_35_2" id="ModuleName_48_20" title="Defined at line 35, 36">ModuleName</a>&gt;&gt;
        <span class="layout">//Import.RenamedModule = &lt;&lt;ModuleName&gt; &lt;Renamings&gt;&gt; IGNORED PRODUCTION</span>
        <span class="layout">//Import = &lt;(&lt;Import&gt;)&gt; {bracket}</span>

  <span class="keyword">lexical restrictions</span>
    <a href="#ModuleWord_9_2" id="ModuleWord_53_5" title="Defined at line 9">ModuleWord</a> -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-]
    <a href="#ModuleId_11_5" id="ModuleId_54_5" title="Defined at line 11, 13, 15">ModuleId</a> -/- [\/]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
