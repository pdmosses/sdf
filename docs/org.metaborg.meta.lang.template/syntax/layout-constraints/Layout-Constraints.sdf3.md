---
title: Layout-Constraints.sdf3
hide:
  - toc
---

# `Layout-Constraints.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/layout-constraints/Layout-Constraints.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/layout-constraints/Layout-Constraints.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/layout-constraints/Layout-Constraints.sdf3 "The source file on GitHub"

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
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2.sdf3#layout-constraints/Layout-Constraints_182_219" id="layout-constraints/Layout-Constraints_7_44" title="Referenced at ../../sdf2-core/Sdf2.sdf3 line 11">layout-constraints/Layout-Constraints</a>

<span class="keyword">imports</span>

  <a href="../../constants/NatCon.sdf3#constants/NatCon_7_23" id="constants/NatCon_57_73" title="Defined at ../../constants/NatCon.sdf3 line 1">constants/NatCon</a>
  <a href="../../constants/StrCon.sdf3#constants/StrCon_7_23" id="constants/StrCon_76_92" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>
  <a href="../../constants/IdentifierCon.sdf3#constants/IdentifierCon_7_30" id="constants/IdentifierCon_95_118" title="Defined at ../../constants/IdentifierCon.sdf3 line 1">constants/IdentifierCon</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]

<span class="keyword">context-free sorts</span>

  <a href="#Constraint_2864_2874" id="Constraint_187_197" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>
  <a href="#ConstraintExp_2955_2968" id="ConstraintExp_200_213" title="Referenced at line 79">ConstraintExp</a>
  <a href="#ConstraintToken_981_996" id="ConstraintToken_216_231" title="Referenced at line 37">ConstraintToken</a>
  <a href="#ConstraintTreeRef_2648_2665" id="ConstraintTreeRef_234_251" title="Referenced at line 64">ConstraintTreeRef</a>

<span class="keyword">context-free syntax</span>

  <a href="#ConstraintTreeRef_2648_2665" id="ConstraintTreeRef_276_293" title="Referenced at line 64">ConstraintTreeRef</a>.<span class="cons_Constructor"><span id="PosRef_294_300" title="Not referenced locally, nor via imports">PosRef</span></span> = <a href="../../constants/NatCon.sdf3#NatCon_44_50" id="NatCon_303_309" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a>
  <a href="#ConstraintTreeRef_2648_2665" id="ConstraintTreeRef_312_329" title="Referenced at line 64">ConstraintTreeRef</a>.<span class="cons_Constructor"><span id="LiteralRef_330_340" title="Not referenced locally, nor via imports">LiteralRef</span></span> = <a href="../../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_343_349" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>
  <a href="#ConstraintTreeRef_2648_2665" id="ConstraintTreeRef_352_369" title="Referenced at line 64">ConstraintTreeRef</a>.<span class="cons_Constructor"><span id="LabelRef_370_378" title="Not referenced locally, nor via imports">LabelRef</span></span> = <a href="../../constants/IdentifierCon.sdf3#IdCon_114_119" id="IdCon_381_386" title="Defined at ../../constants/IdentifierCon.sdf3 line 6">IdCon</a>

  <a href="#ConstraintToken_981_996" id="ConstraintToken_390_405" title="Referenced at line 37">ConstraintToken</a>.<span class="cons_Constructor"><span id="First_406_411" title="Not referenced locally, nor via imports">First</span></span> = &lt;&lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_416_433" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;<span class="cons_String">.first</span>&gt;
  <a href="#ConstraintToken_981_996" id="ConstraintToken_444_459" title="Referenced at line 37">ConstraintToken</a>.<span class="cons_Constructor"><span id="Left_460_464" title="Not referenced locally, nor via imports">Left</span></span> = &lt;&lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_469_486" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;<span class="cons_String">.left</span>&gt;
  <a href="#ConstraintToken_981_996" id="ConstraintToken_496_511" title="Referenced at line 37">ConstraintToken</a>.<span class="cons_Constructor"><span id="Right_512_517" title="Not referenced locally, nor via imports">Right</span></span> = &lt;&lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_522_539" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;<span class="cons_String">.right</span>&gt;
  <a href="#ConstraintToken_981_996" id="ConstraintToken_550_565" title="Referenced at line 37">ConstraintToken</a>.<span class="cons_Constructor"><span id="Last_566_570" title="Not referenced locally, nor via imports">Last</span></span> = &lt;&lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_575_592" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;<span class="cons_String">.last</span>&gt;

  <a href="#ConstraintExp_2955_2968" id="ConstraintExp_603_616" title="Referenced at line 79">ConstraintExp</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_622_635" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
  <a href="#ConstraintExp_2955_2968" id="ConstraintExp_651_664" title="Referenced at line 79">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Mul_2905_2908" id="Mul_665_668" title="Referenced at line 79">Mul</a></span> = &lt;&lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_673_686" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; <span class="cons_String">*</span> &lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_691_704" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ConstraintExp_2955_2968" id="ConstraintExp_716_729" title="Referenced at line 79">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Div_2923_2926" id="Div_730_733" title="Referenced at line 79">Div</a></span> = &lt;&lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_738_751" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; <span class="cons_String">/</span> &lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_756_769" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ConstraintExp_2955_2968" id="ConstraintExp_781_794" title="Referenced at line 79">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Add_2951_2954" id="Add_795_798" title="Referenced at line 79">Add</a></span> = &lt;&lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_803_816" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; <span class="cons_String">+</span> &lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_821_834" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ConstraintExp_2955_2968" id="ConstraintExp_846_859" title="Referenced at line 79">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Sub_2969_2972" id="Sub_860_863" title="Referenced at line 79">Sub</a></span> = &lt;&lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_868_881" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; <span class="cons_String">-</span> &lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_886_899" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ConstraintExp_2955_2968" id="ConstraintExp_911_924" title="Referenced at line 79">ConstraintExp</a>.<span class="cons_Constructor"><span id="Line_925_929" title="Not referenced locally, nor via imports">Line</span></span> = &lt;&lt;<a href="#ConstraintToken_216_231" id="ConstraintToken_934_949" title="Defined at line 17, 26, 27, 28, 29">ConstraintToken</a>&gt;<span class="cons_String">.line</span>&gt;
  <a href="#ConstraintExp_2955_2968" id="ConstraintExp_959_972" title="Referenced at line 79">ConstraintExp</a>.<span class="cons_Constructor"><span id="Col_973_976" title="Not referenced locally, nor via imports">Col</span></span> = &lt;&lt;<a href="#ConstraintToken_216_231" id="ConstraintToken_981_996" title="Defined at line 17, 26, 27, 28, 29">ConstraintToken</a>&gt;<span class="cons_String">.col</span>&gt;
  <a href="#ConstraintExp_2955_2968" id="ConstraintExp_1005_1018" title="Referenced at line 79">ConstraintExp</a>.<span class="cons_Constructor"><span id="Num_1019_1022" title="Not referenced locally, nor via imports">Num</span></span> = <a href="../../constants/NatCon.sdf3#NatCon_44_50" id="NatCon_1025_1031" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a>

  <a href="#Constraint_2864_2874" id="Constraint_1035_1045" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#Constraint_187_197" id="Constraint_1051_1061" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
  <a href="#Constraint_2864_2874" id="Constraint_1077_1087" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><a href="#Eq_2748_2750" id="Eq_1088_1090" title="Referenced at line 70">Eq</a></span> = &lt;&lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_1095_1108" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; <span class="cons_String">==</span> &lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_1114_1127" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
  <a href="#Constraint_2864_2874" id="Constraint_1144_1154" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><a href="#Lt_2768_2770" id="Lt_1155_1157" title="Referenced at line 71">Lt</a></span> = &lt;&lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_1162_1175" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; \&lt; &lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_1181_1194" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
  <a href="#Constraint_2864_2874" id="Constraint_1211_1221" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><a href="#Le_2788_2790" id="Le_1222_1224" title="Referenced at line 72">Le</a></span> = &lt;&lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_1229_1242" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; \&lt;<span class="cons_String">=</span> &lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_1249_1262" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
  <a href="#Constraint_2864_2874" id="Constraint_1279_1289" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><a href="#Gt_2808_2810" id="Gt_1290_1292" title="Referenced at line 73">Gt</a></span> = &lt;&lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_1297_1310" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; \&gt; &lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_1316_1329" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
  <a href="#Constraint_2864_2874" id="Constraint_1346_1356" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><a href="#Ge_2828_2830" id="Ge_1357_1359" title="Referenced at line 74">Ge</a></span> = &lt;&lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_1364_1377" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; \&gt;<span class="cons_String">=</span> &lt;<a href="#ConstraintExp_200_213" id="ConstraintExp_1384_1397" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
  <a href="#Constraint_2864_2874" id="Constraint_1414_1424" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><a href="#Not_2709_2712" id="Not_1425_1428" title="Referenced at line 68">Not</a></span> = &lt;<span class="cons_String">!</span>&lt;<a href="#Constraint_187_197" id="Constraint_1434_1444" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_1449_1459" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><a href="#And_2854_2857" id="And_1460_1463" title="Referenced at line 76">And</a></span> = &lt;&lt;<a href="#Constraint_187_197" id="Constraint_1468_1478" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt; <span class="cons_String">&amp;&amp;</span> &lt;<a href="#Constraint_187_197" id="Constraint_1484_1494" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#Constraint_2864_2874" id="Constraint_1506_1516" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><a href="#Or_2875_2877" id="Or_1517_1519" title="Referenced at line 77">Or</a></span> = &lt;&lt;<a href="#Constraint_187_197" id="Constraint_1524_1534" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt; <span class="cons_String">||</span> &lt;<a href="#Constraint_187_197" id="Constraint_1540_1550" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;&gt; {<span class="keyword">left</span>}

  <a href="#Constraint_2864_2874" id="Constraint_1563_1573" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="Offside_1574_1581" title="Not referenced locally, nor via imports">Offside</span></span> = &lt;<span class="cons_String">offside</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_1594_1611" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_1615_1632" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_1644_1654" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="Indent_1655_1661" title="Not referenced locally, nor via imports">Indent</span></span> = &lt;<span class="cons_String">indent</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_1673_1690" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_1694_1711" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_1723_1733" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="Align_1734_1739" title="Not referenced locally, nor via imports">Align</span></span> = &lt;<span class="cons_String">align</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_1750_1767" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_1771_1788" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_1800_1810" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="AlignList_1811_1820" title="Not referenced locally, nor via imports">AlignList</span></span> = &lt;<span class="cons_String">align-list</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_1836_1853" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_1858_1868" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="NewLineIndent_1869_1882" title="Not referenced locally, nor via imports">NewLineIndent</span></span> = &lt;<span class="cons_String">newline-indent</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_1902_1919" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_1923_1940" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_1952_1962" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="SingleLine_1963_1973" title="Not referenced locally, nor via imports">SingleLine</span></span> = &lt;<span class="cons_String">single-line</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_1990_2007" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>*&gt;&gt;

  <a href="#Constraint_2864_2874" id="Constraint_2014_2024" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="PPOffside_2025_2034" title="Not referenced locally, nor via imports">PPOffside</span></span> = &lt;<span class="cons_String">pp-offside</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2050_2067" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2071_2088" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_2100_2110" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="PPIndent_2111_2119" title="Not referenced locally, nor via imports">PPIndent</span></span> = &lt;<span class="cons_String">pp-indent</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2134_2151" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2155_2172" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_2184_2194" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="PPAlign_2195_2202" title="Not referenced locally, nor via imports">PPAlign</span></span> = &lt;<span class="cons_String">pp-align</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2216_2233" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2237_2254" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_2266_2276" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="PPAlignList_2277_2288" title="Not referenced locally, nor via imports">PPAlignList</span></span> = &lt;<span class="cons_String">pp-align-list</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2307_2324" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_2329_2339" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="PPNewLineIndent_2340_2355" title="Not referenced locally, nor via imports">PPNewLineIndent</span></span> = &lt;<span class="cons_String">pp-newline-indent</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2378_2395" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2399_2416" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_2428_2438" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="PPNewLineIndentBy_2439_2456" title="Not referenced locally, nor via imports">PPNewLineIndentBy</span></span> = &lt;<span class="cons_String">pp-newline-indent-by(</span>&lt;<a href="../../constants/NatCon.sdf3#NatCon_44_50" id="NatCon_2482_2488" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a>&gt;<span class="cons_String">)</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2492_2509" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2513_2530" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_2542_2552" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="PPNewLine_2553_2562" title="Not referenced locally, nor via imports">PPNewLine</span></span> = &lt;<span class="cons_String">pp-newline</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2578_2595" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;&gt;
  <a href="#Constraint_2864_2874" id="Constraint_2600_2610" title="Referenced at line 77; ../../sdf2-core/Sdf2.sdf3 line 75">Constraint</a>.<span class="cons_Constructor"><span id="PPNewLineBy_2611_2622" title="Not referenced locally, nor via imports">PPNewLineBy</span></span> = &lt;<span class="cons_String">pp-newline(</span>&lt;<a href="../../constants/NatCon.sdf3#NatCon_44_50" id="NatCon_2638_2644" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a>&gt;<span class="cons_String">)</span> &lt;<a href="#ConstraintTreeRef_234_251" id="ConstraintTreeRef_2648_2665" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;&gt;

<span class="keyword">context-free priorities</span>

    <a href="#Constraint_187_197" id="Constraint_2698_2708" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Not_1425_1428" id="Not_2709_2712" title="Defined at line 46">Not</a></span> &gt;
    {<span class="keyword">non-assoc</span>:
      <a href="#Constraint_187_197" id="Constraint_2737_2747" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Eq_1088_1090" id="Eq_2748_2750" title="Defined at line 41">Eq</a></span>
      <a href="#Constraint_187_197" id="Constraint_2757_2767" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Lt_1155_1157" id="Lt_2768_2770" title="Defined at line 42">Lt</a></span>
      <a href="#Constraint_187_197" id="Constraint_2777_2787" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Le_1222_1224" id="Le_2788_2790" title="Defined at line 43">Le</a></span>
      <a href="#Constraint_187_197" id="Constraint_2797_2807" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Gt_1290_1292" id="Gt_2808_2810" title="Defined at line 44">Gt</a></span>
      <a href="#Constraint_187_197" id="Constraint_2817_2827" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Ge_1357_1359" id="Ge_2828_2830" title="Defined at line 45">Ge</a></span>
    } &gt;
    <a href="#Constraint_187_197" id="Constraint_2843_2853" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#And_1460_1463" id="And_2854_2857" title="Defined at line 47">And</a></span> &gt;
    <a href="#Constraint_187_197" id="Constraint_2864_2874" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Or_1517_1519" id="Or_2875_2877" title="Defined at line 48">Or</a></span>,

    {<span class="keyword">left</span>: <a href="#ConstraintExp_200_213" id="ConstraintExp_2891_2904" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Mul_665_668" id="Mul_2905_2908" title="Defined at line 32">Mul</a></span> <a href="#ConstraintExp_200_213" id="ConstraintExp_2909_2922" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Div_730_733" id="Div_2923_2926" title="Defined at line 33">Div</a></span>} &gt; {<span class="keyword">left</span>: <a href="#ConstraintExp_200_213" id="ConstraintExp_2937_2950" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Add_795_798" id="Add_2951_2954" title="Defined at line 34">Add</a></span> <a href="#ConstraintExp_200_213" id="ConstraintExp_2955_2968" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Sub_860_863" id="Sub_2969_2972" title="Defined at line 35">Sub</a></span>}

</code></pre></td></tr></tbody></table></div>