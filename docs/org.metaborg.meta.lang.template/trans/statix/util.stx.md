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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/util_1_8" title="Multi-file references" data-urls="../attribute.stx/#statix/util_5_3 line 5; ../cons.stx/#statix/util_7_3 line 7; ../label.stx/#statix/util_6_3 line 6; ../main.stx/#statix/util_21_3 line 21; ../sort.stx/#statix/util_7_3 line 7; ../sort_cons.stx/#statix/util_10_3 line 10"><span class="token sort_Id">statix/util</span></button>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="EMPTINESS_5_9" title="Multi-file references" data-urls="#EMPTINESS_6_19 line 6, 7; ../cons.stx/#EMPTINESS_25_71 line 25, 38; ../label.stx/#EMPTINESS_32_56 line 32; ../module.stx/#EMPTINESS_49_68 line 49; ../sort.stx/#EMPTINESS_34_70 line 34, 47"><span class="token sort_Id">EMPTINESS</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><button class="modal-open" id="NON_EMPTY_6_5" title="Multi-file references" data-urls="../cons.stx/#NON_EMPTY_22_38 line 22, 29, 35, 44; ../label.stx/#NON_EMPTY_30_32 line 30, 36; ../module.stx/#NON_EMPTY_47_31 line 47, 53; ../sort.stx/#NON_EMPTY_31_37 line 31, 38, 44, 51"><span class="token sort_Id">NON_EMPTY</span></button>   <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#EMPTINESS_5_9" id="EMPTINESS_6_19" title="Defined at line 5"><span class="token sort_Id">EMPTINESS</span></a></span></span>
    <span class="cons_OpDecl"><button class="modal-open" id="MAYBE_EMPTY_7_5" title="Multi-file references" data-urls="../cons.stx/#MAYBE_EMPTY_28_38 line 28, 30, 41, 45; ../label.stx/#MAYBE_EMPTY_35_33 line 35, 37; ../module.stx/#MAYBE_EMPTY_52_31 line 52, 54; ../sort.stx/#MAYBE_EMPTY_37_37 line 37, 39, 50, 52"><span class="token sort_Id">MAYBE_EMPTY</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#EMPTINESS_5_9" id="EMPTINESS_7_19" title="Defined at line 5"><span class="token sort_Id">EMPTINESS</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="BOOL_11_9" title="Multi-file references" data-urls="#BOOL_12_13 line 12, 13, 17, 21; ../attribute.stx/#BOOL_19_43 line 19, 26"><span class="token sort_Id">BOOL</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><button class="modal-open" id="TRUE_12_5" title="Multi-file references" data-urls="#TRUE_18_8 line 18, 23; ../attribute.stx/#TRUE_27_40 line 27"><span class="token sort_Id">TRUE</span></button>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_12_13" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span></span>
    <span class="cons_OpDecl"><button class="modal-open" id="FALSE_13_5" title="Multi-file references" data-urls="#FALSE_19_27 line 19, 22; ../attribute.stx/#FALSE_29_40 line 29"><span class="token sort_Id">FALSE</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_13_13" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span></span>

<span class="keyword">rules</span>

  <a href="#bAnd_18_3" id="bAnd_17_3" title="Referenced at line 18, 19"><span class="token sort_Id">bAnd</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_17_9" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_17_16" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>    <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_17_27" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#bAnd_17_3" id="bAnd_18_3" title="Defined at line 17"><span class="token sort_Id">bAnd</span></a><span class="operator">(</span><span class="cons_Op"><a href="#TRUE_12_5" id="TRUE_18_8" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a><span class="operator">()</span></span><span class="operator">,</span> <span class="cons_Op"><a href="#TRUE_12_5" id="TRUE_18_16" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a><span class="operator">()</span></span> <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#TRUE_12_5" id="TRUE_18_27" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a><span class="operator">()</span></span><span class="operator">.</span>
  <a href="#bAnd_17_3" id="bAnd_19_3" title="Defined at line 17"><span class="token sort_Id">bAnd</span></a><span class="operator">(_</span>     <span class="operator">,</span> <span class="operator">_</span>      <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#FALSE_13_5" id="FALSE_19_27" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a><span class="operator">()</span></span><span class="operator">.</span>

  <a href="#bOr_22_3" id="bOr_21_3" title="Referenced at line 22, 23"><span class="token sort_Id">bOr</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_21_8" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>  <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_21_16" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>    <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_21_27" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#bOr_21_3" id="bOr_22_3" title="Defined at line 21"><span class="token sort_Id">bOr</span></a><span class="operator">(</span><span class="cons_Op"><a href="#FALSE_13_5" id="FALSE_22_7" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a><span class="operator">()</span></span><span class="operator">,</span> <span class="cons_Op"><a href="#FALSE_13_5" id="FALSE_22_16" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a><span class="operator">()</span></span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#FALSE_13_5" id="FALSE_22_27" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a><span class="operator">()</span></span><span class="operator">.</span>
  <a href="#bOr_21_3" id="bOr_23_3" title="Defined at line 21"><span class="token sort_Id">bOr</span></a><span class="operator">(_</span>      <span class="operator">,</span> <span class="operator">_</span>      <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#TRUE_12_5" id="TRUE_23_27" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a><span class="operator">()</span></span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
