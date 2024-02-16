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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/name_1_8" title="a definition with multiple references" data-urls="../cons.stx/#statix/name line 5_3; ../label.stx/#statix/name line 5_3; ../main.stx/#statix/name line 5_3; ../module.stx/#statix/name line 6_3; ../sort.stx/#statix/name line 5_3; ../sort_cons.stx/#statix/name line 5_3; ../section/syntax.stx/#statix/name line 7_3; ../section/template.stx/#statix/name line 6_3"><span class="token sort_Id">statix/name</span></button>

<span class="keyword">imports</span>

  <a href="../module.stx/#statix/module_1_8" id="statix/module_5_3" title="a reference to a single-file definition"><span class="token sort_Id">statix/module</span></a>

<span class="keyword">signature</span>

  <span class="keyword">namespaces</span>
    <span class="cons_NsDecl"><button class="modal-open" id="Module_10_5" title="a definition with multiple references" data-urls="#Module line 17_13; ../module.stx/#Module line 40_16, 40_16, 41_5, 41_5, 41_5, 46_19, 46_19, 46_19, 50_28"><span class="token sort_Id">Module</span></button>      <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../module.stx/#ModuleId_19_9" id="ModuleId_10_19" title="a reference to a single-file definition"><span class="token sort_Id">ModuleId</span></a></span></span>
    <span class="cons_NsDecl"><button class="modal-open" id="Sort_11_5" title="a definition with multiple references" data-urls="#Sort line 18_13; ../sort.stx/#Sort line 23_19, 24_10, 24_10, 24_10, 25_5, 25_5, 25_5, 30_19, 30_19, 30_19, 35_34, 43_19, 43_19, 43_19, 48_34"><span class="token sort_Id">Sort</span></button>        <span class="operator">:</span> <span class="cons_StringSort"><span class="keyword">string</span></span></span>
    <span class="cons_NsDecl"><button class="modal-open" id="Constructor_12_5" title="a definition with multiple references" data-urls="#Constructor line 19_13; ../cons.stx/#Constructor line 14_10, 14_10, 15_19, 15_19, 15_19, 21_19, 21_19, 21_19, 26_35, 34_19, 34_19, 34_19, 39_48, 42_48"><span class="token sort_Id">Constructor</span></button> <span class="operator">:</span> <span class="cons_StringSort"><span class="keyword">string</span></span></span>
    <span class="cons_NsDecl"><button class="modal-open" id="Label_13_5" title="a definition with multiple references" data-urls="#Label line 20_13; ../label.stx/#Label line 24_10, 25_5, 25_5, 25_5, 29_5, 29_5, 29_5, 33_29"><span class="token sort_Id">Label</span></button>       <span class="operator">:</span> <span class="cons_StringSort"><span class="keyword">string</span></span></span>

  <span class="keyword">name-resolution</span>
    <span class="keyword">labels</span> <span class="cons_Label"><button class="modal-open" id="P_16_12" title="a definition with multiple references" data-urls="#P line 17_32, 17_43, 18_32, 18_38, 19_32, 19_38; ../module.stx/#P line 25_21; ../section/syntax.stx/#P line 57_23, 72_23, 79_23; ../section/template.stx/#P line 51_23, 58_23"><span class="token sort_Id">P</span></button></span> <span class="cons_Label"><button class="modal-open" id="I_16_14" title="a definition with multiple references" data-urls="#I line 18_41, 19_41; ../module.stx/#I line 77_8"><span class="token sort_Id">I</span></button></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Module_10_5" id="Module_17_13" title="a reference to a single-file definition"><span class="token sort_Id">Module</span></a>      <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_16_12" id="P_17_32" title="a reference to a single-file definition"><span class="token sort_Id">P</span></a></span><span class="operator">*</span></span></span> <span class="cons_NamespaceMin"><span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_16_12" id="P_17_43" title="a reference to a single-file definition"><span class="token sort_Id">P</span></a></span></span></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Sort_11_5" id="Sort_18_13" title="a reference to a single-file definition"><span class="token sort_Id">Sort</span></a>        <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_16_12" id="P_18_32" title="a reference to a single-file definition"><span class="token sort_Id">P</span></a></span><span class="operator">*</span></span> <span class="operator">|</span> <span class="operator">(</span><span class="cons_Closure"><span class="cons_Label"><a href="#P_16_12" id="P_18_38" title="a reference to a single-file definition"><span class="token sort_Id">P</span></a></span><span class="operator">*</span></span> <span class="cons_Label"><a href="#I_16_14" id="I_18_41" title="a reference to a single-file definition"><span class="token sort_Id">I</span></a></span><span class="operator">)</span></span>
    <span class="cons_NamespaceMin"></span></span><span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Constructor_12_5" id="Constructor_19_13" title="a reference to a single-file definition"><span class="token sort_Id">Constructor</span></a> <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_16_12" id="P_19_32" title="a reference to a single-file definition"><span class="token sort_Id">P</span></a></span><span class="operator">*</span></span> <span class="operator">|</span> <span class="operator">(</span><span class="cons_Closure"><span class="cons_Label"><a href="#P_16_12" id="P_19_38" title="a reference to a single-file definition"><span class="token sort_Id">P</span></a></span><span class="operator">*</span></span> <span class="cons_Label"><a href="#I_16_14" id="I_19_41" title="a reference to a single-file definition"><span class="token sort_Id">I</span></a></span><span class="operator">)</span></span>
    </span><span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Label_13_5" id="Label_20_13" title="a reference to a single-file definition"><span class="token sort_Id">Label</span></a>       <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="token sort_Id">e</span></span> <span class="cons_NamespaceMin"><span class="keyword">min</span>
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
