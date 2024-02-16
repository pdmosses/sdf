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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/util_1_8" title="a definition with multiple references" data-urls="../attribute.stx/#statix/util line 5_3; ../cons.stx/#statix/util line 7_3; ../label.stx/#statix/util line 6_3; ../main.stx/#statix/util line 21_3; ../sort.stx/#statix/util line 7_3; ../sort_cons.stx/#statix/util line 10_3"><span class="token sort_Id">statix/util</span></button>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="EMPTINESS_5_9" title="a definition with multiple references" data-urls="#EMPTINESS line 6_19, 7_19; ../cons.stx/#EMPTINESS line 25_71, 38_84; ../label.stx/#EMPTINESS line 32_56; ../module.stx/#EMPTINESS line 49_68; ../sort.stx/#EMPTINESS line 34_70, 47_75"><span class="token sort_Id">EMPTINESS</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><button class="modal-open" id="NON_EMPTY_6_5" title="a definition with multiple references" data-urls="../cons.stx/#NON_EMPTY line 22_38, 29_33, 35_51, 44_46; ../label.stx/#NON_EMPTY line 30_32, 36_27; ../module.stx/#NON_EMPTY line 47_31, 53_26; ../sort.stx/#NON_EMPTY line 31_37, 38_32, 44_37, 51_32"><span class="token sort_Id">NON_EMPTY</span></button>   <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#EMPTINESS_5_9" id="EMPTINESS_6_19" title="a reference to a single-file definition"><span class="token sort_Id">EMPTINESS</span></a></span></span>
    <span class="cons_OpDecl"><button class="modal-open" id="MAYBE_EMPTY_7_5" title="a definition with multiple references" data-urls="../cons.stx/#MAYBE_EMPTY line 28_38, 30_33, 41_51, 45_46; ../label.stx/#MAYBE_EMPTY line 35_33, 37_27; ../module.stx/#MAYBE_EMPTY line 52_31, 54_26; ../sort.stx/#MAYBE_EMPTY line 37_37, 39_32, 50_37, 52_32"><span class="token sort_Id">MAYBE_EMPTY</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#EMPTINESS_5_9" id="EMPTINESS_7_19" title="a reference to a single-file definition"><span class="token sort_Id">EMPTINESS</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><button class="modal-open" id="BOOL_11_9" title="a definition with multiple references" data-urls="#BOOL line 12_13, 13_13, 17_9, 17_16, 17_27, 21_8, 21_16, 21_27; ../attribute.stx/#BOOL line 19_43, 26_54"><span class="token sort_Id">BOOL</span></button></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><button class="modal-open" id="TRUE_12_5" title="a definition with multiple references" data-urls="#TRUE line 18_8, 18_16, 18_27, 23_27; ../attribute.stx/#TRUE line 27_40"><span class="token sort_Id">TRUE</span></button>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_12_13" title="a reference to a single-file definition"><span class="token sort_Id">BOOL</span></a></span></span>
    <span class="cons_OpDecl"><button class="modal-open" id="FALSE_13_5" title="a definition with multiple references" data-urls="#FALSE line 19_27, 22_7, 22_16, 22_27; ../attribute.stx/#FALSE line 29_40"><span class="token sort_Id">FALSE</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_13_13" title="a reference to a single-file definition"><span class="token sort_Id">BOOL</span></a></span></span>

<span class="keyword">rules</span>

  <button class="modal-open" id="bAnd_17_3" title="a definition with multiple references" data-urls="#bAnd line 18_3, 19_3"><span class="token sort_Id">bAnd</span></button><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_17_9" title="a reference to a single-file definition"><span class="token sort_Id">BOOL</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_17_16" title="a reference to a single-file definition"><span class="token sort_Id">BOOL</span></a></span>    <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_17_27" title="a reference to a single-file definition"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#bAnd_17_3" id="bAnd_18_3" title="a reference to a single-file definition"><span class="token sort_Id">bAnd</span></a><span class="operator">(</span><span class="cons_Op"><a href="#TRUE_12_5" id="TRUE_18_8" title="a reference to a single-file definition"><span class="token sort_Id">TRUE</span></a><span class="operator">()</span></span><span class="operator">,</span> <span class="cons_Op"><a href="#TRUE_12_5" id="TRUE_18_16" title="a reference to a single-file definition"><span class="token sort_Id">TRUE</span></a><span class="operator">()</span></span> <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#TRUE_12_5" id="TRUE_18_27" title="a reference to a single-file definition"><span class="token sort_Id">TRUE</span></a><span class="operator">()</span></span><span class="operator">.</span>
  <a href="#bAnd_17_3" id="bAnd_19_3" title="a reference to a single-file definition"><span class="token sort_Id">bAnd</span></a><span class="operator">(_</span>     <span class="operator">,</span> <span class="operator">_</span>      <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#FALSE_13_5" id="FALSE_19_27" title="a reference to a single-file definition"><span class="token sort_Id">FALSE</span></a><span class="operator">()</span></span><span class="operator">.</span>

  <button class="modal-open" id="bOr_21_3" title="a definition with multiple references" data-urls="#bOr line 22_3, 23_3"><span class="token sort_Id">bOr</span></button><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_21_8" title="a reference to a single-file definition"><span class="token sort_Id">BOOL</span></a></span>  <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_21_16" title="a reference to a single-file definition"><span class="token sort_Id">BOOL</span></a></span>    <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#BOOL_11_9" id="BOOL_21_27" title="a reference to a single-file definition"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#bOr_21_3" id="bOr_22_3" title="a reference to a single-file definition"><span class="token sort_Id">bOr</span></a><span class="operator">(</span><span class="cons_Op"><a href="#FALSE_13_5" id="FALSE_22_7" title="a reference to a single-file definition"><span class="token sort_Id">FALSE</span></a><span class="operator">()</span></span><span class="operator">,</span> <span class="cons_Op"><a href="#FALSE_13_5" id="FALSE_22_16" title="a reference to a single-file definition"><span class="token sort_Id">FALSE</span></a><span class="operator">()</span></span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#FALSE_13_5" id="FALSE_22_27" title="a reference to a single-file definition"><span class="token sort_Id">FALSE</span></a><span class="operator">()</span></span><span class="operator">.</span>
  <a href="#bOr_21_3" id="bOr_23_3" title="a reference to a single-file definition"><span class="token sort_Id">bOr</span></a><span class="operator">(_</span>      <span class="operator">,</span> <span class="operator">_</span>      <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#TRUE_12_5" id="TRUE_23_27" title="a reference to a single-file definition"><span class="token sort_Id">TRUE</span></a><span class="operator">()</span></span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
