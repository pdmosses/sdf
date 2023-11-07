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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/name_0_7" title="Multi-file references" data-urls="../cons.stx/#statix/name_5_3 ../label.stx/#statix/name_5_3 ../main.stx/#statix/name_5_3 ../module.stx/#statix/name_6_3 ../sort.stx/#statix/name_5_3 ../sort_cons.stx/#statix/name_5_3 ../section/syntax.stx/#statix/name_7_3 ../section/template.stx/#statix/name_6_3"><span class="token sort_Id">statix/name</span></button>

<span class="keyword">imports</span>

  <a href="../module.stx/#statix/module_0_7" id="statix/module_4_2" title="Defined at ../module.stx line 1"><span class="token sort_Id">statix/module</span></a>

<span class="keyword">signature</span>

  <span class="keyword">namespaces</span>
    <span class="cons_NsDecl"><button class="modal-open" id="Module_9_4" title="Multi-file references" data-urls="#Module_17_13 ../module.stx/#Module_40_16"><span class="token sort_Id">Module</span></button>      <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../module.stx/#ModuleId_18_8" id="ModuleId_9_18" title="Defined at ../module.stx line 19"><span class="token sort_Id">ModuleId</span></a></span></span>
    <span class="cons_NsDecl"><button class="modal-open" id="Sort_10_4" title="Multi-file references" data-urls="#Sort_18_13 ../sort.stx/#Sort_23_19"><span class="token sort_Id">Sort</span></button>        <span class="operator">:</span> <span class="cons_StringSort">string</span></span>
    <span class="cons_NsDecl"><button class="modal-open" id="Constructor_11_4" title="Multi-file references" data-urls="#Constructor_19_13 ../cons.stx/#Constructor_14_10"><span class="token sort_Id">Constructor</span></button> <span class="operator">:</span> <span class="cons_StringSort">string</span></span>
    <span class="cons_NsDecl"><button class="modal-open" id="Label_12_4" title="Multi-file references" data-urls="#Label_20_13 ../label.stx/#Label_24_10"><span class="token sort_Id">Label</span></button>       <span class="operator">:</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">name-resolution</span>
    <span class="keyword">labels</span> <span class="cons_Label"><button class="modal-open" id="P_15_11" title="Multi-file references" data-urls="#P_17_32 ../module.stx/#P_25_21 ../section/syntax.stx/#P_57_23 ../section/template.stx/#P_51_23"><span class="token sort_Id">P</span></button></span> <span class="cons_Label"><button class="modal-open" id="I_15_13" title="Multi-file references" data-urls="#I_18_41 ../module.stx/#I_77_8"><span class="token sort_Id">I</span></button></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Module_9_4" id="Module_16_12" title="Defined at line 10"><span class="token sort_Id">Module</span></a>      <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_15_11" id="P_16_31" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span></span> <span class="cons_NamespaceMin"><span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_15_11" id="P_16_42" title="Defined at line 16"><span class="token sort_Id">P</span></a></span></span></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Sort_10_4" id="Sort_17_12" title="Defined at line 11"><span class="token sort_Id">Sort</span></a>        <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_15_11" id="P_17_31" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="operator">|</span> <span class="operator">(</span><span class="cons_Closure"><span class="cons_Label"><a href="#P_15_11" id="P_17_37" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="cons_Label"><a href="#I_15_13" id="I_17_40" title="Defined at line 16"><span class="token sort_Id">I</span></a></span>)</span>
    <span class="cons_NamespaceMin"></span></span><span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Constructor_11_4" id="Constructor_18_12" title="Defined at line 12"><span class="token sort_Id">Constructor</span></a> <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_15_11" id="P_18_31" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="operator">|</span> <span class="operator">(</span><span class="cons_Closure"><span class="cons_Label"><a href="#P_15_11" id="P_18_37" title="Defined at line 16"><span class="token sort_Id">P</span></a></span>*</span> <span class="cons_Label"><a href="#I_15_13" id="I_18_40" title="Defined at line 16"><span class="token sort_Id">I</span></a></span>)</span>
    </span><span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Label_12_4" id="Label_19_12" title="Defined at line 13"><span class="token sort_Id">Label</span></a>       <span class="cons_NamespaceFilter">filter e</span> <span class="cons_NamespaceMin">min
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
