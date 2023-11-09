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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/name_1_8" title="Multi-file references" data-urls="../cons.stx/#statix/name_5_3 line 5; ../label.stx/#statix/name_5_3 line 5; ../main.stx/#statix/name_5_3 line 5; ../module.stx/#statix/name_6_3 line 6; ../sort.stx/#statix/name_5_3 line 5; ../sort_cons.stx/#statix/name_5_3 line 5; ../section/syntax.stx/#statix/name_7_3 line 7; ../section/template.stx/#statix/name_6_3 line 6"><span class="token sort_Id">statix/name</span></button>

<span class="keyword">imports</span>

  <a href="../module.stx/#statix/module_1_8" id="statix/module_5_3" title="Defined at ../module.stx line 1"><span class="token sort_Id">statix/module</span></a>

<span class="keyword">signature</span>

  <span class="keyword">namespaces</span>
    <span class="cons_NsDecl"><button class="modal-open" id="Module_10_5" title="Multi-file references" data-urls="#Module_17_13 line 17; ../module.stx/#Module_40_16 line 40, 41, 46, 50"><span class="token sort_Id">Module</span></button>      <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../module.stx/#ModuleId_19_9" id="ModuleId_10_19" title="Defined at ../module.stx line 19"><span class="token sort_Id">ModuleId</span></a></span></span>
    <span class="cons_NsDecl"><button class="modal-open" id="Sort_11_5" title="Multi-file references" data-urls="#Sort_18_13 line 18; ../sort.stx/#Sort_23_19 line 23, 24, 25, 30, 35, 43, 48"><span class="token sort_Id">Sort</span></button>        <span class="operator">:</span> <span class="cons_StringSort">string</span></span>
    <span class="cons_NsDecl"><button class="modal-open" id="Constructor_12_5" title="Multi-file references" data-urls="#Constructor_19_13 line 19; ../cons.stx/#Constructor_14_10 line 14, 15, 21, 26, 34, 39, 42"><span class="token sort_Id">Constructor</span></button> <span class="operator">:</span> <span class="cons_StringSort">string</span></span>
    <span class="cons_NsDecl"><button class="modal-open" id="Label_13_5" title="Multi-file references" data-urls="#Label_20_13 line 20; ../label.stx/#Label_24_10 line 24, 25, 29, 33"><span class="token sort_Id">Label</span></button>       <span class="operator">:</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">name-resolution</span>
    <span class="keyword">labels</span> <span class="cons_Label"><button class="modal-open" id="P_16_12" title="Multi-file references" data-urls="#P_17_32 line 17, 18, 19; ../module.stx/#P_25_21 line 25; ../section/syntax.stx/#P_57_23 line 57, 72, 79; ../section/template.stx/#P_51_23 line 51, 58"><span class="token sort_Id">P</span></button></span> <span class="cons_Label"><button class="modal-open" id="I_16_14" title="Multi-file references" data-urls="#I_18_41 line 18, 19; ../module.stx/#I_77_8 line 77"><span class="token sort_Id">I</span></button></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Module_10_5" id="Module_17_13" title="Defined at line 10"><span class="token sort_Id">Module</span></a>      <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_16_12" id="P_17_32" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span></span> <span class="cons_NamespaceMin"><span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_16_12" id="P_17_43" title="Defined at line 16"><span class="token sort_Id">P</span></a></span></span></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Sort_11_5" id="Sort_18_13" title="Defined at line 11"><span class="token sort_Id">Sort</span></a>        <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_16_12" id="P_18_32" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="operator">|</span> <span class="operator">(</span><span class="cons_Closure"><span class="cons_Label"><a href="#P_16_12" id="P_18_38" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="cons_Label"><a href="#I_16_14" id="I_18_41" title="Defined at line 16"><span class="token sort_Id">I</span></a></span>)</span>
    <span class="cons_NamespaceMin"></span></span><span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Constructor_12_5" id="Constructor_19_13" title="Defined at line 12"><span class="token sort_Id">Constructor</span></a> <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_16_12" id="P_19_32" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="operator">|</span> <span class="operator">(</span><span class="cons_Closure"><span class="cons_Label"><a href="#P_16_12" id="P_19_38" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="cons_Label"><a href="#I_16_14" id="I_19_41" title="Defined at line 16"><span class="token sort_Id">I</span></a></span>)</span>
    </span><span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Label_13_5" id="Label_20_13" title="Defined at line 13"><span class="token sort_Id">Label</span></a>       <span class="cons_NamespaceFilter">filter e</span> <span class="cons_NamespaceMin">min
</span></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
