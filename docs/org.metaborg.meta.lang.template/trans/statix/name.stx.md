---
title: name.stx
hide:
  - toc
---

# `name.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/name.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/name.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/name.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../cons.stx/#statix/name_32_43" id="statix/name_7_18" title="Referenced at ../cons.stx line 5; ../label.stx line 5; ../main.stx line 5; ../module.stx line 6; ../sort.stx line 5; ../sort_cons.stx line 5; ../section/syntax.stx line 7; ../section/template.stx line 6"><span class="token sort_Id">statix/name</span></a>

<span class="keyword">imports</span>

  <a href="../module.stx/#statix/module_7_20" id="statix/module_31_44" title="Defined at ../module.stx line 1"><span class="token sort_Id">statix/module</span></a>

<span class="keyword">signature</span>

  <span class="keyword">namespaces</span>
    <span class="cons_NsDecl"><a href="#Module_218_224" id="Module_74_80" title="Referenced at line 17; ../module.stx line 40, 40, 41, 41, 41, 46, 46, 46, 50"><span class="token sort_Id">Module</span></a>      <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../module.stx/#ModuleId_387_395" id="ModuleId_88_96" title="Defined at ../module.stx line 19"><span class="token sort_Id">ModuleId</span></a></span></span>
    <span class="cons_NsDecl"><a href="#Sort_262_266" id="Sort_101_105" title="Referenced at line 18; ../sort.stx line 23, 24, 24, 24, 25, 25, 25, 30, 30, 30, 35, 43, 43, 43, 48"><span class="token sort_Id">Sort</span></a>        <span class="operator">:</span> <span class="cons_StringSort">string</span></span>
    <span class="cons_NsDecl"><a href="#Constructor_305_316" id="Constructor_126_137" title="Referenced at line 19; ../cons.stx line 14, 14, 15, 15, 15, 21, 21, 21, 26, 34, 34, 34, 39, 42"><span class="token sort_Id">Constructor</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span></span>
    <span class="cons_NsDecl"><a href="#Label_348_353" id="Label_151_156" title="Referenced at line 20; ../label.stx line 24, 25, 25, 25, 29, 29, 29, 33"><span class="token sort_Id">Label</span></a>       <span class="operator">:</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">name-resolution</span>
    <span class="keyword">labels</span> <span class="cons_Label"><a href="#P_237_238" id="P_202_203" title="Referenced at line 17, 17, 18, 18, 19, 19; ../module.stx line 25; ../section/syntax.stx line 57, 72, 79; ../section/template.stx line 51, 58"><span class="token sort_Id">P</span></a></span> <span class="cons_Label"><a href="#I_290_291" id="I_204_205" title="Referenced at line 18, 19; ../module.stx line 77"><span class="token sort_Id">I</span></a></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Module_74_80" id="Module_218_224" title="Defined at line 10"><span class="token sort_Id">Module</span></a>      <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_202_203" id="P_237_238" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span></span> <span class="cons_NamespaceMin"><span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_202_203" id="P_248_249" title="Defined at line 16"><span class="token sort_Id">P</span></a></span></span></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Sort_101_105" id="Sort_262_266" title="Defined at line 11"><span class="token sort_Id">Sort</span></a>        <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_202_203" id="P_281_282" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="operator">|</span> <span class="operator">(</span><span class="cons_Closure"><span class="cons_Label"><a href="#P_202_203" id="P_287_288" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="cons_Label"><a href="#I_204_205" id="I_290_291" title="Defined at line 16"><span class="token sort_Id">I</span></a></span>)</span>
    <span class="cons_NamespaceMin"></span></span><span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Constructor_126_137" id="Constructor_305_316" title="Defined at line 12"><span class="token sort_Id">Constructor</span></a> <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_202_203" id="P_324_325" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="operator">|</span> <span class="operator">(</span><span class="cons_Closure"><span class="cons_Label"><a href="#P_202_203" id="P_330_331" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="cons_Label"><a href="#I_204_205" id="I_333_334" title="Defined at line 16"><span class="token sort_Id">I</span></a></span>)</span>
    </span><span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Label_151_156" id="Label_348_353" title="Defined at line 13"><span class="token sort_Id">Label</span></a>       <span class="cons_NamespaceFilter">filter e</span> <span class="cons_NamespaceMin">min
</span></span>
</code></pre></td></tr></tbody></table></div>