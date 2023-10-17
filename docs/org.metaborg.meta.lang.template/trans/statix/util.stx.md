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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../attribute.stx/#statix/util_36_47" id="statix/util_7_18" title="Referenced at ../attribute.stx line 5; ../cons.stx line 7; ../label.stx line 6; ../main.stx line 21; ../sort.stx line 7; ../sort_cons.stx line 10"><span class="token sort_Id">statix/util</span></a>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#EMPTINESS_80_89" id="EMPTINESS_39_48" title="Referenced at line 6, 7; ../cons.stx line 25, 38; ../label.stx line 32; ../module.stx line 49; ../sort.stx line 34, 47"><span class="token sort_Id">EMPTINESS</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="../cons.stx/#NON_EMPTY_687_696" id="NON_EMPTY_66_75" title="Referenced at ../cons.stx line 22, 29, 35, 44; ../label.stx line 30, 36; ../module.stx line 47, 53; ../sort.stx line 31, 38, 44, 51"><span class="token sort_Id">NON_EMPTY</span></a>   <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#EMPTINESS_39_48" id="EMPTINESS_80_89" title="Defined at line 5"><span class="token sort_Id">EMPTINESS</span></a></span></span>
    <span class="cons_OpDecl"><a href="../cons.stx/#MAYBE_EMPTY_969_980" id="MAYBE_EMPTY_94_105" title="Referenced at ../cons.stx line 28, 30, 41, 45; ../label.stx line 35, 37; ../module.stx line 52, 54; ../sort.stx line 37, 39, 50, 52"><span class="token sort_Id">MAYBE_EMPTY</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#EMPTINESS_39_48" id="EMPTINESS_108_117" title="Defined at line 5"><span class="token sort_Id">EMPTINESS</span></a></span></span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#BOOL_168_172" id="BOOL_138_142" title="Referenced at line 12, 13, 17, 17, 17, 21, 21, 21; ../attribute.stx line 19, 26"><span class="token sort_Id">BOOL</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#TRUE_236_240" id="TRUE_160_164" title="Referenced at line 18, 18, 18, 23; ../attribute.stx line 27"><span class="token sort_Id">TRUE</span></a>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_138_142" id="BOOL_168_172" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span></span>
    <span class="cons_OpDecl"><a href="#FALSE_289_294" id="FALSE_177_182" title="Referenced at line 19, 22, 22, 22; ../attribute.stx line 29"><span class="token sort_Id">FALSE</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_138_142" id="BOOL_185_189" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span></span>

<span class="keyword">rules</span>

  <a href="#bAnd_231_235" id="bAnd_200_204" title="Referenced at line 18, 19"><span class="token sort_Id">bAnd</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_138_142" id="BOOL_206_210" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#BOOL_138_142" id="BOOL_213_217" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>    <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#BOOL_138_142" id="BOOL_224_228" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#bAnd_200_204" id="bAnd_231_235" title="Defined at line 17"><span class="token sort_Id">bAnd</span></a><span class="operator">(</span><span class="cons_Op"><a href="#TRUE_160_164" id="TRUE_236_240" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#TRUE_160_164" id="TRUE_244_248" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a>()</span> <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#TRUE_160_164" id="TRUE_255_259" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a>()</span><span class="operator">.</span>
  <a href="#bAnd_200_204" id="bAnd_265_269" title="Defined at line 17"><span class="token sort_Id">bAnd</span></a><span class="operator">(_</span>     <span class="operator">,</span> <span class="operator">_</span>      <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#FALSE_177_182" id="FALSE_289_294" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a>()</span><span class="operator">.</span>

  <a href="#bOr_332_335" id="bOr_301_304" title="Referenced at line 22, 23"><span class="token sort_Id">bOr</span></a><span class="operator">:</span> <span class="cons_SimpleSort"><a href="#BOOL_138_142" id="BOOL_306_310" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>  <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#BOOL_138_142" id="BOOL_314_318" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>    <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#BOOL_138_142" id="BOOL_325_329" title="Defined at line 11"><span class="token sort_Id">BOOL</span></a></span>
  <a href="#bOr_301_304" id="bOr_332_335" title="Defined at line 21"><span class="token sort_Id">bOr</span></a><span class="operator">(</span><span class="cons_Op"><a href="#FALSE_177_182" id="FALSE_336_341" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#FALSE_177_182" id="FALSE_345_350" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#FALSE_177_182" id="FALSE_356_361" title="Defined at line 13"><span class="token sort_Id">FALSE</span></a>()</span><span class="operator">.</span>
  <a href="#bOr_301_304" id="bOr_367_370" title="Defined at line 21"><span class="token sort_Id">bOr</span></a><span class="operator">(_</span>      <span class="operator">,</span> <span class="operator">_</span>      <span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#TRUE_160_164" id="TRUE_391_395" title="Defined at line 12"><span class="token sort_Id">TRUE</span></a>()</span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>