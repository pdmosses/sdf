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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="characterclass/Character-Class_1_8" title="a definition with multiple references" data-urls="../CC.sdf3/#characterclass/Character-Class line 3_9; ../../restrictions/Restrictions.sdf3/#characterclass/Character-Class line 4_3">characterclass/Character-Class</button>

<span class="keyword">imports</span> <a href="../Character.sdf3/#characterclass/Character_1_8" id="characterclass/Character_3_9" title="a reference to a single-file definition">characterclass/Character</a>

<span class="keyword">context-free syntax</span>

<a href="#CharRange_9_16" id="CharRange_7_1" title="a definition with a single reference">CharRange</a> = &lt;&lt;<a href="../Character.sdf3/#Character_22_5" id="Character_7_15" title="a reference to a single-file definition">Character</a>&gt;&gt;
<a href="#CharRange_9_16" id="CharRange_8_1" title="a definition with a single reference">CharRange</a>.<span class="cons_Constructor"><span id="Range_8_11" title="a definition with no references">Range</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="start_8_21" title="a definition with no references">start</span></span>:<a href="../Character.sdf3/#Character_22_5" id="Character_8_27" title="a reference to a single-file definition">Character</a>&gt;<span class="cons_String">-</span>&lt;<span class="cons_Unquoted"><span id="end_8_39" title="a definition with no references">end</span></span>:<a href="../Character.sdf3/#Character_22_5" id="Character_8_43" title="a reference to a single-file definition">Character</a>&gt;&gt;
<button class="modal-open" id="CharRanges_9_1" title="a definition with multiple references" data-urls="#CharRanges line 11_21, 11_33, 12_17, 15_27">CharRanges</button> = &lt;&lt;<a href="#CharRange_7_1" id="CharRange_9_16" title="a reference to a single-file definition">CharRange</a>&gt;&gt;
<span class="layout">//"left":CharRanges "right":CharRanges        -&gt; CharRanges   {cons("conc"),right,memo}</span>
<button class="modal-open" id="CharRanges_11_1" title="a definition with multiple references" data-urls="#CharRanges line 11_21, 11_33, 12_17, 15_27">CharRanges</button>.<span class="cons_Constructor"><span id="Conc_11_12" title="a definition with no references">Conc</span></span> = &lt;&lt;<a href="#CharRanges_9_1" id="CharRanges_11_21" title="a reference to a single-file definition">CharRanges</a>&gt;&lt;<a href="#CharRanges_9_1" id="CharRanges_11_33" title="a reference to a single-file definition">CharRanges</a>&gt;&gt; {<span class="keyword">right</span>, <span class="cons_Unquoted">memo</span>}
<button class="modal-open" id="CharRanges_12_1" title="a definition with multiple references" data-urls="#CharRanges line 11_21, 11_33, 12_17, 15_27">CharRanges</button> = &lt;<span class="cons_String">(</span>&lt;<a href="#CharRanges_9_1" id="CharRanges_12_17" title="a reference to a single-file definition">CharRanges</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

<a href="#OptCharRanges_17_23" id="OptCharRanges_14_1" title="a definition with a single reference">OptCharRanges</a>.<span class="cons_Constructor"><span id="Absent_14_15" title="a definition with no references">Absent</span></span> = &lt;&gt;
<a href="#OptCharRanges_17_23" id="OptCharRanges_15_1" title="a definition with a single reference">OptCharRanges</a>.<span class="cons_Constructor"><span id="Present_15_15" title="a definition with no references">Present</span></span> = &lt;&lt;<a href="#CharRanges_9_1" id="CharRanges_15_27" title="a reference to a single-file definition">CharRanges</a>&gt;&gt;
 
<button class="modal-open" id="CharClass_17_1" title="a definition with multiple references" data-urls="#CharClass line 18_21, 20_20, 20_32, 22_21, 22_35, 24_21, 24_35, 25_16, 28_2, 28_19, 29_2, 29_20; ../CC.sdf3/#CharClass line 7_26; ../../restrictions/Restrictions.sdf3/#CharClass line 10_25, 11_19">CharClass</button>.<span class="cons_Constructor"><span id="Simple_17_11" title="a definition with no references">Simple</span></span> = &lt;<span class="cons_String">[</span>&lt;<a href="#OptCharRanges_14_1" id="OptCharRanges_17_23" title="a reference to a single-file definition">OptCharRanges</a>&gt;<span class="cons_String">]</span>&gt;
<button class="modal-open" id="CharClass_18_1" title="a definition with multiple references" data-urls="#CharClass line 18_21, 20_20, 20_32, 22_21, 22_35, 24_21, 24_35, 25_16, 28_2, 28_19, 29_2, 29_20; ../CC.sdf3/#CharClass line 7_26; ../../restrictions/Restrictions.sdf3/#CharClass line 10_25, 11_19">CharClass</button>.<span class="cons_Constructor"><a href="#Comp_28_12" id="Comp_18_11" title="a definition with a single reference">Comp</a></span> = &lt;<span class="cons_String">~</span>&lt;<a href="#CharClass_17_1" id="CharClass_18_21" title="a reference to a single-file definition">CharClass</a>&gt;&gt;
<span class="layout">//"left":CharClass "/" "right":CharClass   -&gt; CharClass  {cons("diff"),left,memo}</span>
<button class="modal-open" id="CharClass_20_1" title="a definition with multiple references" data-urls="#CharClass line 18_21, 20_20, 20_32, 22_21, 22_35, 24_21, 24_35, 25_16, 28_2, 28_19, 29_2, 29_20; ../CC.sdf3/#CharClass line 7_26; ../../restrictions/Restrictions.sdf3/#CharClass line 10_25, 11_19">CharClass</button>.<span class="cons_Constructor"><a href="#Diff_28_29" id="Diff_20_11" title="a definition with a single reference">Diff</a></span> = &lt;&lt;<a href="#CharClass_17_1" id="CharClass_20_20" title="a reference to a single-file definition">CharClass</a>&gt;<span class="cons_String">/</span>&lt;<a href="#CharClass_17_1" id="CharClass_20_32" title="a reference to a single-file definition">CharClass</a>&gt;&gt; {<span class="keyword">left</span>, <span class="cons_Unquoted">memo</span>}
<span class="layout">//"left":CharClass "/\\" "right":CharClass -&gt; CharClass  {cons("isect"),left,memo}</span>
<button class="modal-open" id="CharClass_22_1" title="a definition with multiple references" data-urls="#CharClass line 18_21, 20_20, 20_32, 22_21, 22_35, 24_21, 24_35, 25_16, 28_2, 28_19, 29_2, 29_20; ../CC.sdf3/#CharClass line 7_26; ../../restrictions/Restrictions.sdf3/#CharClass line 10_25, 11_19">CharClass</button>.<span class="cons_Constructor"><a href="#Isect_29_12" id="Isect_22_11" title="a definition with a single reference">Isect</a></span> = &lt;&lt;<a href="#CharClass_17_1" id="CharClass_22_21" title="a reference to a single-file definition">CharClass</a>&gt;<span class="cons_String">/</span>\\&lt;<a href="#CharClass_17_1" id="CharClass_22_35" title="a reference to a single-file definition">CharClass</a>&gt;&gt; {<span class="keyword">left</span>, <span class="cons_Unquoted">memo</span>}
<span class="layout">//"left":CharClass "\\/" "right":CharClass -&gt; CharClass  {cons("union"),left}</span>
<button class="modal-open" id="CharClass_24_1" title="a definition with multiple references" data-urls="#CharClass line 18_21, 20_20, 20_32, 22_21, 22_35, 24_21, 24_35, 25_16, 28_2, 28_19, 29_2, 29_20; ../CC.sdf3/#CharClass line 7_26; ../../restrictions/Restrictions.sdf3/#CharClass line 10_25, 11_19">CharClass</button>.<span class="cons_Constructor"><a href="#Union_29_30" id="Union_24_11" title="a definition with a single reference">Union</a></span> = &lt;&lt;<a href="#CharClass_17_1" id="CharClass_24_21" title="a reference to a single-file definition">CharClass</a>&gt;\\<span class="cons_String">/</span>&lt;<a href="#CharClass_17_1" id="CharClass_24_35" title="a reference to a single-file definition">CharClass</a>&gt;&gt; {<span class="keyword">left</span>}
<button class="modal-open" id="CharClass_25_1" title="a definition with multiple references" data-urls="#CharClass line 18_21, 20_20, 20_32, 22_21, 22_35, 24_21, 24_35, 25_16, 28_2, 28_19, 29_2, 29_20; ../CC.sdf3/#CharClass line 7_26; ../../restrictions/Restrictions.sdf3/#CharClass line 10_25, 11_19">CharClass</button> = &lt;<span class="cons_String">(</span>&lt;<a href="#CharClass_17_1" id="CharClass_25_16" title="a reference to a single-file definition">CharClass</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>, <span class="keyword">avoid</span>}

<span class="keyword">context-free priorities</span>
        <a href="#CharClass_17_1" id="CharClass_28_2" title="a reference to a single-file definition">CharClass</a>.<span class="cons_Constructor"><a href="#Comp_18_11" id="Comp_28_12" title="a reference to a single-file definition">Comp</a></span> &gt; <a href="#CharClass_17_1" id="CharClass_28_19" title="a reference to a single-file definition">CharClass</a>.<span class="cons_Constructor"><a href="#Diff_20_11" id="Diff_28_29" title="a reference to a single-file definition">Diff</a></span> &gt;
        <a href="#CharClass_17_1" id="CharClass_29_2" title="a reference to a single-file definition">CharClass</a>.<span class="cons_Constructor"><a href="#Isect_22_11" id="Isect_29_12" title="a reference to a single-file definition">Isect</a></span> &gt; <a href="#CharClass_17_1" id="CharClass_29_20" title="a reference to a single-file definition">CharClass</a>.<span class="cons_Constructor"><a href="#Union_24_11" id="Union_29_30" title="a reference to a single-file definition">Union</a></span>
        
        
         
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
