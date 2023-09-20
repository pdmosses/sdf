---
title: Character-Class.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../restrictions/Restrictions.sdf3#characterclass/Character-Class_65_95" id="characterclass/Character-Class_7_37" title="Referenced at ../../restrictions/Restrictions.sdf3 line 4">characterclass/Character-Class</a>

<span class="keyword">imports</span> <a href="../Character.sdf3#characterclass/Character_7_31" id="characterclass/Character_47_71" title="Defined at ../Character.sdf3 line 1">characterclass/Character</a>

<span class="keyword">context-free syntax</span>

<a href="#CharRange_189_198" id="CharRange_94_103" title="Referenced at line 9">CharRange</a> = &lt;&lt;<a href="../Character.sdf3#Character_515_524" id="Character_108_117" title="Defined at ../Character.sdf3 line 22, 23, 24, 25, 26, 27, 30, 31, 32">Character</a>&gt;&gt;
<a href="#CharRange_189_198" id="CharRange_120_129" title="Referenced at line 9">CharRange</a>.<span class="cons_Constructor"><span id="Range_130_135" title="Not referenced locally, nor via imports">Range</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="start_140_145" title="Not referenced locally, nor via imports">start</span></span>:<a href="../Character.sdf3#Character_515_524" id="Character_146_155" title="Defined at ../Character.sdf3 line 22, 23, 24, 25, 26, 27, 30, 31, 32">Character</a>&gt;<span class="cons_String">-</span>&lt;<span class="cons_Unquoted"><span id="end_158_161" title="Not referenced locally, nor via imports">end</span></span>:<a href="../Character.sdf3#Character_515_524" id="Character_162_171" title="Defined at ../Character.sdf3 line 22, 23, 24, 25, 26, 27, 30, 31, 32">Character</a>&gt;&gt;
<a href="#CharRanges_441_451" id="CharRanges_174_184" title="Referenced at line 15">CharRanges</a> = &lt;&lt;<a href="#CharRange_94_103" id="CharRange_189_198" title="Defined at line 7, 8">CharRange</a>&gt;&gt;
<span class="layout">//"left":CharRanges "right":CharRanges        -&gt; CharRanges   {cons("conc"),right,memo}</span>
<a href="#CharRanges_441_451" id="CharRanges_289_299" title="Referenced at line 15">CharRanges</a>.<span class="cons_Constructor"><span id="Conc_300_304" title="Not referenced locally, nor via imports">Conc</span></span> = &lt;&lt;<a href="#CharRanges_174_184" id="CharRanges_309_319" title="Defined at line 9, 11, 12">CharRanges</a>&gt;&lt;<a href="#CharRanges_174_184" id="CharRanges_321_331" title="Defined at line 9, 11, 12">CharRanges</a>&gt;&gt; {<span class="keyword">right</span>, <span class="cons_Unquoted">memo</span>}
<a href="#CharRanges_441_451" id="CharRanges_348_358" title="Referenced at line 15">CharRanges</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#CharRanges_174_184" id="CharRanges_364_374" title="Defined at line 9, 11, 12">CharRanges</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

<a href="#OptCharRanges_478_491" id="OptCharRanges_389_402" title="Referenced at line 17">OptCharRanges</a>.<span class="cons_Constructor"><span id="Absent_403_409" title="Not referenced locally, nor via imports">Absent</span></span> = &lt;&gt;
<a href="#OptCharRanges_478_491" id="OptCharRanges_415_428" title="Referenced at line 17">OptCharRanges</a>.<span class="cons_Constructor"><span id="Present_429_436" title="Not referenced locally, nor via imports">Present</span></span> = &lt;&lt;<a href="#CharRanges_174_184" id="CharRanges_441_451" title="Defined at line 9, 11, 12">CharRanges</a>&gt;&gt;
 
<a href="#CharClass_1062_1071" id="CharClass_456_465" title="Referenced at line 29; ../CC.sdf3 line 7; ../../restrictions/Restrictions.sdf3 line 11">CharClass</a>.<span class="cons_Constructor"><span id="Simple_466_472" title="Not referenced locally, nor via imports">Simple</span></span> = &lt;<span class="cons_String">[</span>&lt;<a href="#OptCharRanges_389_402" id="OptCharRanges_478_491" title="Defined at line 14, 15">OptCharRanges</a>&gt;<span class="cons_String">]</span>&gt;
<a href="#CharClass_1062_1071" id="CharClass_495_504" title="Referenced at line 29; ../CC.sdf3 line 7; ../../restrictions/Restrictions.sdf3 line 11">CharClass</a>.<span class="cons_Constructor"><a href="#Comp_1019_1023" id="Comp_505_509" title="Referenced at line 28">Comp</a></span> = &lt;<span class="cons_String">~</span>&lt;<a href="#CharClass_456_465" id="CharClass_515_524" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;&gt;
<span class="layout">//"left":CharClass "/" "right":CharClass   -&gt; CharClass  {cons("diff"),left,memo}</span>
<a href="#CharClass_1062_1071" id="CharClass_609_618" title="Referenced at line 29; ../CC.sdf3 line 7; ../../restrictions/Restrictions.sdf3 line 11">CharClass</a>.<span class="cons_Constructor"><a href="#Diff_1036_1040" id="Diff_619_623" title="Referenced at line 28">Diff</a></span> = &lt;&lt;<a href="#CharClass_456_465" id="CharClass_628_637" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;<span class="cons_String">/</span>&lt;<a href="#CharClass_456_465" id="CharClass_640_649" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;&gt; {<span class="keyword">left</span>, <span class="cons_Unquoted">memo</span>}
<span class="layout">//"left":CharClass "/\\" "right":CharClass -&gt; CharClass  {cons("isect"),left,memo}</span>
<a href="#CharClass_1062_1071" id="CharClass_748_757" title="Referenced at line 29; ../CC.sdf3 line 7; ../../restrictions/Restrictions.sdf3 line 11">CharClass</a>.<span class="cons_Constructor"><a href="#Isect_1054_1059" id="Isect_758_763" title="Referenced at line 29">Isect</a></span> = &lt;&lt;<a href="#CharClass_456_465" id="CharClass_768_777" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;<span class="cons_String">/</span>\\&lt;<a href="#CharClass_456_465" id="CharClass_782_791" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;&gt; {<span class="keyword">left</span>, <span class="cons_Unquoted">memo</span>}
<span class="layout">//"left":CharClass "\\/" "right":CharClass -&gt; CharClass  {cons("union"),left}</span>
<a href="#CharClass_1062_1071" id="CharClass_885_894" title="Referenced at line 29; ../CC.sdf3 line 7; ../../restrictions/Restrictions.sdf3 line 11">CharClass</a>.<span class="cons_Constructor"><a href="#Union_1072_1077" id="Union_895_900" title="Referenced at line 29">Union</a></span> = &lt;&lt;<a href="#CharClass_456_465" id="CharClass_905_914" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;\\<span class="cons_String">/</span>&lt;<a href="#CharClass_456_465" id="CharClass_919_928" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;&gt; {<span class="keyword">left</span>}
<a href="#CharClass_1062_1071" id="CharClass_938_947" title="Referenced at line 29; ../CC.sdf3 line 7; ../../restrictions/Restrictions.sdf3 line 11">CharClass</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#CharClass_456_465" id="CharClass_953_962" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>, <span class="keyword">avoid</span>}

<span class="keyword">context-free priorities</span>
        <a href="#CharClass_456_465" id="CharClass_1009_1018" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>.<span class="cons_Constructor"><a href="#Comp_505_509" id="Comp_1019_1023" title="Defined at line 18">Comp</a></span> &gt; <a href="#CharClass_456_465" id="CharClass_1026_1035" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>.<span class="cons_Constructor"><a href="#Diff_619_623" id="Diff_1036_1040" title="Defined at line 20">Diff</a></span> &gt;
        <a href="#CharClass_456_465" id="CharClass_1044_1053" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>.<span class="cons_Constructor"><a href="#Isect_758_763" id="Isect_1054_1059" title="Defined at line 22">Isect</a></span> &gt; <a href="#CharClass_456_465" id="CharClass_1062_1071" title="Defined at line 17, 18, 20, 22, 24, 25">CharClass</a>.<span class="cons_Constructor"><a href="#Union_895_900" id="Union_1072_1077" title="Defined at line 24">Union</a></span>
        
        
         
</code></pre></td></tr></tbody></table></div>