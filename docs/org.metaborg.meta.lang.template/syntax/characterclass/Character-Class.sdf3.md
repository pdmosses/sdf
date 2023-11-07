---
title: Character-Class.sdf3
hide:
  - toc
---

# `Character-Class.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/characterclass/Character-Class.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/characterclass/Character-Class.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/characterclass/Character-Class.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="characterclass/Character-Class_1_8" title="Multi-file references" data-urls="../CC.sdf3/#characterclass/Character-Class_3_9 ../../restrictions/Restrictions.sdf3/#characterclass/Character-Class_4_3">characterclass/Character-Class</button>

<span class="keyword">imports</span> <a href="../Character.sdf3/#characterclass/Character_0_7" id="characterclass/Character_3_9" title="Defined at ../Character.sdf3 line 1">characterclass/Character</a>

<span class="keyword">context-free syntax</span>

<a href="#CharRange_8_15" id="CharRange_7_1" title="Referenced at line 9">CharRange</a> = &lt;&lt;<a href="../Character.sdf3/#Character_21_4" id="Character_7_15" title="Defined at ../Character.sdf3 line 22, 23, 24, 25, 26, 27, 30, 31, 32">Character</a>&gt;&gt;
<a href="#CharRange_8_15" id="CharRange_8_1" title="Referenced at line 9">CharRange</a>.<span class="cons_Constructor"><span id="Range_8_11" title="Not referenced locally, nor via imports">Range</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="start_8_21" title="Not referenced locally, nor via imports">start</span></span>:<a href="../Character.sdf3/#Character_21_4" id="Character_8_27" title="Defined at ../Character.sdf3 line 22, 23, 24, 25, 26, 27, 30, 31, 32">Character</a>&gt;<span class="cons_String">-</span>&lt;<span class="cons_Unquoted"><span id="end_8_39" title="Not referenced locally, nor via imports">end</span></span>:<a href="../Character.sdf3/#Character_21_4" id="Character_8_43" title="Defined at ../Character.sdf3 line 22, 23, 24, 25, 26, 27, 30, 31, 32">Character</a>&gt;&gt;
<a href="#CharRanges_10_20" id="CharRanges_9_1" title="Referenced at line 11, 12, 15">CharRanges</a> = &lt;&lt;<a href="#CharRange_6_0" id="CharRange_9_16" title="Defined at line 7, 8">CharRange</a>&gt;&gt;
<span class="layout">//"left":CharRanges "right":CharRanges        -&gt; CharRanges   {cons("conc"),right,memo}</span>
<a href="#CharRanges_10_20" id="CharRanges_11_1" title="Referenced at line 11, 12, 15">CharRanges</a>.<span class="cons_Constructor"><span id="Conc_11_12" title="Not referenced locally, nor via imports">Conc</span></span> = &lt;&lt;<a href="#CharRanges_8_0" id="CharRanges_11_21" title="Defined at line 9, 11, 12">CharRanges</a>&gt;&lt;<a href="#CharRanges_8_0" id="CharRanges_11_33" title="Defined at line 9, 11, 12">CharRanges</a>&gt;&gt; {<span class="keyword">right</span>, <span class="cons_Unquoted">memo</span>}
<a href="#CharRanges_10_20" id="CharRanges_12_1" title="Referenced at line 11, 12, 15">CharRanges</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#CharRanges_8_0" id="CharRanges_12_17" title="Defined at line 9, 11, 12">CharRanges</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

<a href="#OptCharRanges_16_22" id="OptCharRanges_14_1" title="Referenced at line 17">OptCharRanges</a>.<span class="cons_Constructor"><span id="Absent_14_15" title="Not referenced locally, nor via imports">Absent</span></span> = &lt;&gt;
<a href="#OptCharRanges_16_22" id="OptCharRanges_15_1" title="Referenced at line 17">OptCharRanges</a>.<span class="cons_Constructor"><span id="Present_15_15" title="Not referenced locally, nor via imports">Present</span></span> = &lt;&lt;<a href="#CharRanges_8_0" id="CharRanges_15_27" title="Defined at line 9, 11, 12">CharRanges</a>&gt;&gt;
 
<button class="modal-open" id="CharClass_17_1" title="Multi-file references" data-urls="#CharClass_18_21 ../CC.sdf3/#CharClass_7_26 ../../restrictions/Restrictions.sdf3/#CharClass_10_25">CharClass</button>.<span class="cons_Constructor"><span id="Simple_17_11" title="Not referenced locally, nor via imports">Simple</span></span> = &lt;<span class="cons_String">[</span>&lt;<a href="#OptCharRanges_13_0" id="OptCharRanges_17_23" title="Defined at line 14, 15">OptCharRanges</a>&gt;<span class="cons_String">]</span>&gt;
<button class="modal-open" id="CharClass_18_1" title="Multi-file references" data-urls="#CharClass_18_21 ../CC.sdf3/#CharClass_7_26 ../../restrictions/Restrictions.sdf3/#CharClass_10_25">CharClass</button>.<span class="cons_Constructor"><a href="#Comp_27_11" id="Comp_18_11" title="Referenced at line 28">Comp</a></span> = &lt;<span class="cons_String">~</span>&lt;<a href="#CharClass_16_0" id="CharClass_18_21" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;&gt;
<span class="layout">//"left":CharClass "/" "right":CharClass   -&gt; CharClass  {cons("diff"),left,memo}</span>
<button class="modal-open" id="CharClass_20_1" title="Multi-file references" data-urls="#CharClass_18_21 ../CC.sdf3/#CharClass_7_26 ../../restrictions/Restrictions.sdf3/#CharClass_10_25">CharClass</button>.<span class="cons_Constructor"><a href="#Diff_27_28" id="Diff_20_11" title="Referenced at line 28">Diff</a></span> = &lt;&lt;<a href="#CharClass_16_0" id="CharClass_20_20" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;<span class="cons_String">/</span>&lt;<a href="#CharClass_16_0" id="CharClass_20_32" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;&gt; {<span class="keyword">left</span>, <span class="cons_Unquoted">memo</span>}
<span class="layout">//"left":CharClass "/\\" "right":CharClass -&gt; CharClass  {cons("isect"),left,memo}</span>
<button class="modal-open" id="CharClass_22_1" title="Multi-file references" data-urls="#CharClass_18_21 ../CC.sdf3/#CharClass_7_26 ../../restrictions/Restrictions.sdf3/#CharClass_10_25">CharClass</button>.<span class="cons_Constructor"><a href="#Isect_28_11" id="Isect_22_11" title="Referenced at line 29">Isect</a></span> = &lt;&lt;<a href="#CharClass_16_0" id="CharClass_22_21" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;<span class="cons_String">/</span>\\&lt;<a href="#CharClass_16_0" id="CharClass_22_35" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;&gt; {<span class="keyword">left</span>, <span class="cons_Unquoted">memo</span>}
<span class="layout">//"left":CharClass "\\/" "right":CharClass -&gt; CharClass  {cons("union"),left}</span>
<button class="modal-open" id="CharClass_24_1" title="Multi-file references" data-urls="#CharClass_18_21 ../CC.sdf3/#CharClass_7_26 ../../restrictions/Restrictions.sdf3/#CharClass_10_25">CharClass</button>.<span class="cons_Constructor"><a href="#Union_28_29" id="Union_24_11" title="Referenced at line 29">Union</a></span> = &lt;&lt;<a href="#CharClass_16_0" id="CharClass_24_21" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;\\<span class="cons_String">/</span>&lt;<a href="#CharClass_16_0" id="CharClass_24_35" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;&gt; {<span class="keyword">left</span>}
<button class="modal-open" id="CharClass_25_1" title="Multi-file references" data-urls="#CharClass_18_21 ../CC.sdf3/#CharClass_7_26 ../../restrictions/Restrictions.sdf3/#CharClass_10_25">CharClass</button> = &lt;<span class="cons_String">(</span>&lt;<a href="#CharClass_16_0" id="CharClass_25_16" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>, <span class="keyword">avoid</span>}

<span class="keyword">context-free priorities</span>
        <a href="#CharClass_16_0" id="CharClass_28_2" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>.<span class="cons_Constructor"><a href="#Comp_17_10" id="Comp_28_12" title="Defined at line 18">Comp</a></span> &gt; <a href="#CharClass_16_0" id="CharClass_28_19" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>.<span class="cons_Constructor"><a href="#Diff_19_10" id="Diff_28_29" title="Defined at line 20">Diff</a></span> &gt;
        <a href="#CharClass_16_0" id="CharClass_29_2" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>.<span class="cons_Constructor"><a href="#Isect_21_10" id="Isect_29_12" title="Defined at line 22">Isect</a></span> &gt; <a href="#CharClass_16_0" id="CharClass_29_20" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>.<span class="cons_Constructor"><a href="#Union_23_10" id="Union_29_30" title="Defined at line 24">Union</a></span>
        
        
         
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
