---
title: util.stx
hide:
  - toc
---

# `util.stx`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/util.stx]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/statix/util.stx]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/statix/util.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/util_0_7" title="Multi-file references" data-urls="../attribute.stx/#statix/util_5_3 ../cons.stx/#statix/util_7_3 ../label.stx/#statix/util_6_3 ../main.stx/#statix/util_21_3 ../sort.stx/#statix/util_7_3 ../sort_cons.stx/#statix/util_10_3"><span class="token sort_Id">statix/util</span></button>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="EMPTINESS_4_8" title="Multi-file references" data-urls="#EMPTINESS_6_19 ../cons.stx/#EMPTINESS_25_71 ../label.stx/#EMPTINESS_32_56 ../module.stx/#EMPTINESS_49_68 ../sort.stx/#EMPTINESS_34_70"><span class="token sort_Id">EMPTINESS</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><button class="modal-open" id="NON_EMPTY_5_4" title="Multi-file references" data-urls="../cons.stx/#NON_EMPTY_22_38 ../label.stx/#NON_EMPTY_30_32 ../module.stx/#NON_EMPTY_47_31 ../sort.stx/#NON_EMPTY_31_37"><span class="token sort_Id">NON_EMPTY</span></button>   <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#EMPTINESS_4_8" id="EMPTINESS_5_18" title="Defined at line 5"><span class="token sort_Id">EMPTINESS</span></a></span></span>
    <span class="cons_OpDecl"><button class="modal-open" id="MAYBE_EMPTY_6_4" title="Multi-file references" data-urls="../cons.stx/#MAYBE_EMPTY_28_38 ../label.stx/#MAYBE_EMPTY_35_33 ../module.stx/#MAYBE_EMPTY_52_31 ../sort.stx/#MAYBE_EMPTY_37_37"><span class="token sort_Id">MAYBE_EMPTY</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#EMPTINESS_4_8" id="EMPTINESS_6_18" title="Defined at line 5"><span class="token sort_Id">EMPTINESS</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="BOOL_10_8" title="Multi-file references" data-urls="#BOOL_12_13 ../attribute.stx/#BOOL_19_43"><span class="token sort_Id">BOOL</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><button class="modal-open" id="TRUE_11_4" title="Multi-file references" data-urls="#TRUE_18_8 ../attribute.stx/#TRUE_27_40"><span class="token sort_Id">TRUE</span></button>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_10_8" id="BOOL_11_12" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span></span>
    <span class="cons_OpDecl"><button class="modal-open" id="FALSE_12_4" title="Multi-file references" data-urls="#FALSE_19_27 ../attribute.stx/#FALSE_29_40"><span class="token sort_Id">FALSE</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_10_8" id="BOOL_12_12" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span></span>

<span class="keyword">rules</span>

  <a href="#bAnd_17_2" id="bAnd_16_2" title="Referenced at line 18, 19"><span class="token sort_Id">bAnd</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_10_8" id="BOOL_16_8" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#BOOL_10_8" id="BOOL_16_15" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>    <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#BOOL_10_8" id="BOOL_16_26" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#bAnd_16_2" id="bAnd_17_2" title="Defined at line 17"><span class="token sort_Id">bAnd</span></a><span class="operator">(</span><span class="cons_Op"><a href="#TRUE_11_4" id="TRUE_17_7" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#TRUE_11_4" id="TRUE_17_15" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a>()</span> <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#TRUE_11_4" id="TRUE_17_26" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a>()</span><span class="operator">.</span>
  <a href="#bAnd_16_2" id="bAnd_18_2" title="Defined at line 17"><span class="token sort_Id">bAnd</span></a><span class="operator">(_</span>     <span class="operator">,</span> <span class="operator">_</span>      <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#FALSE_12_4" id="FALSE_18_26" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a>()</span><span class="operator">.</span>

  <a href="#bOr_21_2" id="bOr_20_2" title="Referenced at line 22, 23"><span class="token sort_Id">bOr</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_10_8" id="BOOL_20_7" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>  <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#BOOL_10_8" id="BOOL_20_15" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>    <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#BOOL_10_8" id="BOOL_20_26" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#bOr_20_2" id="bOr_21_2" title="Defined at line 21"><span class="token sort_Id">bOr</span></a><span class="operator">(</span><span class="cons_Op"><a href="#FALSE_12_4" id="FALSE_21_6" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#FALSE_12_4" id="FALSE_21_15" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#FALSE_12_4" id="FALSE_21_26" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a>()</span><span class="operator">.</span>
  <a href="#bOr_20_2" id="bOr_22_2" title="Defined at line 21"><span class="token sort_Id">bOr</span></a><span class="operator">(_</span>      <span class="operator">,</span> <span class="operator">_</span>      <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#TRUE_11_4" id="TRUE_22_26" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a>()</span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
