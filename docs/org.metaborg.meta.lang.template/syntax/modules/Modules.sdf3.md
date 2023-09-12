---
title: Modules.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2.sdf3#modules/Modules_164_179" id="modules/Modules_7_22" title="Referenced at ../../sdf2-core/Sdf2.sdf3 line 10">modules/Modules</a>

<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_32_45" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> 
        <a href="../../renaming/Renaming.sdf3#renaming/Renaming_7_24" id="renaming/Renaming_55_72" title="Defined at ../../renaming/Renaming.sdf3 line 1">renaming/Renaming</a>
        <a href="../../symbols/Symbols.sdf3#symbols/Symbols_7_22" id="symbols/Symbols_81_96" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a>
 
<span class="keyword">lexical syntax</span>
    <span class="layout">//letters:[A-Za-z0-9\_\-]+ -&gt; ModuleWord  {cons("word")}</span>
        <a href="#ModuleWord_1243_1253" id="ModuleWord_176_186" title="Referenced at line 53">ModuleWord</a>.<span class="cons_Constructor"><span id="Word_187_191" title="Not referenced locally, nor via imports">Word</span></span> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-]+
        
    <a href="#ModuleId_1278_1286" id="ModuleId_217_225" title="Referenced at line 54">ModuleId</a>.<span class="cons_Constructor"><span id="Leaf_226_230" title="Not referenced locally, nor via imports">Leaf</span></span> =  <a href="#ModuleWord_176_186" id="ModuleWord_234_244" title="Defined at line 9">ModuleWord</a>
    <span class="layout">//sep:"/" basename:ModuleId            -&gt; ModuleId  {cons("root")}</span>
    <a href="#ModuleId_1278_1286" id="ModuleId_320_328" title="Referenced at line 54">ModuleId</a>.<span class="cons_Constructor"><span id="Root_329_333" title="Not referenced locally, nor via imports">Root</span></span> = <span class="cons_Lit">"/"</span> <a href="#ModuleId_217_225" id="ModuleId_340_348" title="Defined at line 11, 13, 15">ModuleId</a>
    <span class="layout">//dirname:ModuleWord sep:"/" basename:ModuleId -&gt; ModuleId  {cons("path")}</span>
    <a href="#ModuleId_1278_1286" id="ModuleId_432_440" title="Referenced at line 54">ModuleId</a>.<span class="cons_Constructor"><span id="Path_441_445" title="Not referenced locally, nor via imports">Path</span></span> = <a href="#ModuleWord_176_186" id="ModuleWord_448_458" title="Defined at line 9">ModuleWord</a> <span class="cons_Lit">"/"</span> <a href="#ModuleId_217_225" id="ModuleId_463_471" title="Defined at line 11, 13, 15">ModuleId</a>
    

<span class="keyword">context-free syntax</span>
        <span class="layout">//Definition = &lt;&lt;list:Module*&gt;&gt;</span>
        
        <a href="../../TemplateLang.sdf3#Module_307_313" id="Module_534_540" title="Referenced at ../../TemplateLang.sdf3 line 17; ../../sdf2-core/Sdf2.sdf3 line 14">Module</a>.<span class="cons_Constructor"><span id="Module_541_547" title="Not referenced locally, nor via imports">Module</span></span> = &lt;
        <span class="cons_String">module</span> &lt;<a href="#ModuleName_776_786" id="ModuleName_561_571" title="Defined at line 35, 36">ModuleName</a>&gt;
        
        &lt;<span id="list_577_581" title="Not referenced locally, nor via imports">list</span>:<a href="#ImpSection_923_933" id="ImpSection_582_592" title="Defined at line 40">ImpSection</a>*&gt;
        
        &lt;<a href="#Sections_700_708" id="Sections_599_607" title="Defined at line 31">Sections</a>&gt;&gt;
        
        <span class="layout">//Section.Exports = &lt;exports &lt;Grammar&gt;&gt;</span>
        <span class="layout">//Section.Hiddens = &lt;hiddens &lt;Grammar&gt;&gt;</span>
        
    <a href="#Sections_599_607" id="Sections_700_708" title="Referenced at line 26">Sections</a> = &lt;&lt;{<a href="#Section_740_747" id="Section_714_721" title="Defined at line 33">Section</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;
    
    <a href="#Section_714_721" id="Section_740_747" title="Referenced at line 31">Section</a>.<span class="cons_Constructor"><span id="SDFSection_748_758" title="Not referenced locally, nor via imports">SDFSection</span></span> = &lt;&lt;<a href="../../kernel/Kernel.sdf3#Grammar_1684_1691" id="Grammar_763_770" title="Defined at ../../kernel/Kernel.sdf3 line 54">Grammar</a>&gt;&gt;
        
        <a href="#ModuleName_1095_1105" id="ModuleName_776_786" title="Referenced at line 48">ModuleName</a>.<span class="cons_Constructor"><span id="Unparameterized_787_802" title="Not referenced locally, nor via imports">Unparameterized</span></span> = &lt;&lt;<a href="#ModuleId_217_225" id="ModuleId_807_815" title="Defined at line 11, 13, 15">ModuleId</a>&gt;&gt;
        <a href="#ModuleName_1095_1105" id="ModuleName_819_829" title="Referenced at line 48">ModuleName</a>.<span class="cons_Constructor"><span id="Parameterized_830_843" title="Not referenced locally, nor via imports">Parameterized</span></span> = &lt;&lt;<a href="#ModuleId_217_225" id="ModuleId_848_856" title="Defined at line 11, 13, 15">ModuleId</a>&gt; <span class="cons_String">[</span>&lt;<span id="params_860_866" title="Not referenced locally, nor via imports">params</span>:<a href="../../symbols/Symbols.sdf3#Symbols_103_110" id="Symbols_867_874" title="Defined at ../../symbols/Symbols.sdf3 line 8">Symbols</a>&gt;<span class="cons_String">]</span>&gt;
        
<span class="layout">//        Attribute.Id = &lt;id (&lt;ModuleName&gt;) &gt; </span>
        
        <a href="#ImpSection_582_592" id="ImpSection_923_933" title="Referenced at line 24">ImpSection</a>.<span class="cons_Constructor"><span id="Imports_934_941" title="Not referenced locally, nor via imports">Imports</span></span> = &lt;
        <span class="cons_String">imports</span> 
                &lt;<span id="list_959_963" title="Not referenced locally, nor via imports">list</span>:<a href="#Imports_1038_1045" id="Imports_964_971" title="Defined at line 46">Imports</a>&gt;&gt;
        
        <span class="layout">//Grammar.ImpSection = &lt;&lt;ImpSection&gt;&gt; IGNORED PRODUCTION</span>
         
        <a href="#Imports_964_971" id="Imports_1038_1045" title="Referenced at line 42">Imports</a> = &lt;&lt;<span id="list_1050_1054" title="Not referenced locally, nor via imports">list</span>:{<a href="#Import_1077_1083" id="Import_1056_1062" title="Defined at line 48">Import</a> <span class="cons_Lit">"\n\t"</span>}*&gt;&gt;
        
        <a href="#Import_1056_1062" id="Import_1077_1083" title="Referenced at line 46">Import</a>.<span class="cons_Constructor"><span id="Module_1084_1090" title="Not referenced locally, nor via imports">Module</span></span> = &lt;&lt;<a href="#ModuleName_776_786" id="ModuleName_1095_1105" title="Defined at line 35, 36">ModuleName</a>&gt;&gt;
        <span class="layout">//Import.RenamedModule = &lt;&lt;ModuleName&gt; &lt;Renamings&gt;&gt; IGNORED PRODUCTION</span>
        <span class="layout">//Import = &lt;(&lt;Import&gt;)&gt; {bracket}</span>

  <span class="keyword">lexical restrictions</span>
    <a href="#ModuleWord_176_186" id="ModuleWord_1243_1253" title="Defined at line 9">ModuleWord</a> -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-]
    <a href="#ModuleId_217_225" id="ModuleId_1278_1286" title="Defined at line 11, 13, 15">ModuleId</a> -/- [\/]

</code></pre></td></tr></tbody></table></div>