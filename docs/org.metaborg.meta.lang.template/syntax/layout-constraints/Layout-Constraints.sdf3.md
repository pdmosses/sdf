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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="layout-constraints/Layout-Constraints_1_8" title="Multi-file references" data-urls="../../TemplateLang.sdf3/#layout-constraints/Layout-Constraints_14_3 line 14; ../../kernel/Kernel.sdf3/#layout-constraints/Layout-Constraints_8_9 line 8; ../../sdf2-core/Sdf2.sdf3/#layout-constraints/Layout-Constraints_11_3 line 11">layout-constraints/Layout-Constraints</button>

<span class="keyword">imports</span>

  <a href="../../constants/NatCon.sdf3/#constants/NatCon_1_8" id="constants/NatCon_5_3" title="Defined at ../../constants/NatCon.sdf3 line 1">constants/NatCon</a>
  <a href="../../constants/StrCon.sdf3/#constants/StrCon_1_8" id="constants/StrCon_6_3" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>
  <a href="../../constants/IdentifierCon.sdf3/#constants/IdentifierCon_1_8" id="constants/IdentifierCon_7_3" title="Defined at ../../constants/IdentifierCon.sdf3 line 1">constants/IdentifierCon</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]

<span class="keyword">context-free sorts</span>

  <button class="modal-open" id="Constraint_15_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>
  <a href="#ConstraintExp_31_22" id="ConstraintExp_16_3" title="Referenced at line 31, 32, 33, 34, 35, 41, 42, 43, 44, 45, 79">ConstraintExp</a>
  <a href="#ConstraintToken_36_26" id="ConstraintToken_17_3" title="Referenced at line 36, 37">ConstraintToken</a>
  <a href="#ConstraintTreeRef_26_29" id="ConstraintTreeRef_18_3" title="Referenced at line 26, 27, 28, 29, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">ConstraintTreeRef</a>

<span class="keyword">context-free syntax</span>

  <a href="#ConstraintTreeRef_26_29" id="ConstraintTreeRef_22_3" title="Referenced at line 26, 27, 28, 29, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">ConstraintTreeRef</a>.<span class="cons_Constructor"><span id="PosRef_22_21" title="Not referenced">PosRef</span></span> = <a href="../../constants/NatCon.sdf3/#NatCon_5_2" id="NatCon_22_30" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a>
  <a href="#ConstraintTreeRef_26_29" id="ConstraintTreeRef_23_3" title="Referenced at line 26, 27, 28, 29, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">ConstraintTreeRef</a>.<span class="cons_Constructor"><span id="LiteralRef_23_21" title="Not referenced">LiteralRef</span></span> = <a href="../../constants/StrCon.sdf3/#StrCon_12_5" id="StrCon_23_34" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>
  <a href="#ConstraintTreeRef_26_29" id="ConstraintTreeRef_24_3" title="Referenced at line 26, 27, 28, 29, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">ConstraintTreeRef</a>.<span class="cons_Constructor"><span id="LabelRef_24_21" title="Not referenced">LabelRef</span></span> = <a href="../../constants/IdentifierCon.sdf3/#IdCon_6_1" id="IdCon_24_32" title="Defined at ../../constants/IdentifierCon.sdf3 line 6">IdCon</a>

  <a href="#ConstraintToken_36_26" id="ConstraintToken_26_3" title="Referenced at line 36, 37">ConstraintToken</a>.<span class="cons_Constructor"><span id="First_26_19" title="Not referenced">First</span></span> = &lt;&lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_26_29" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;<span class="cons_String">.first</span>&gt;
  <a href="#ConstraintToken_36_26" id="ConstraintToken_27_3" title="Referenced at line 36, 37">ConstraintToken</a>.<span class="cons_Constructor"><span id="Left_27_19" title="Not referenced">Left</span></span> = &lt;&lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_27_28" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;<span class="cons_String">.left</span>&gt;
  <a href="#ConstraintToken_36_26" id="ConstraintToken_28_3" title="Referenced at line 36, 37">ConstraintToken</a>.<span class="cons_Constructor"><span id="Right_28_19" title="Not referenced">Right</span></span> = &lt;&lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_28_29" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;<span class="cons_String">.right</span>&gt;
  <a href="#ConstraintToken_36_26" id="ConstraintToken_29_3" title="Referenced at line 36, 37">ConstraintToken</a>.<span class="cons_Constructor"><span id="Last_29_19" title="Not referenced">Last</span></span> = &lt;&lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_29_28" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;<span class="cons_String">.last</span>&gt;

  <a href="#ConstraintExp_31_22" id="ConstraintExp_31_3" title="Referenced at line 31, 32, 33, 34, 35, 41, 42, 43, 44, 45, 79">ConstraintExp</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_31_22" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
  <a href="#ConstraintExp_31_22" id="ConstraintExp_32_3" title="Referenced at line 31, 32, 33, 34, 35, 41, 42, 43, 44, 45, 79">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Mul_79_26" id="Mul_32_17" title="Referenced at line 79">Mul</a></span> = &lt;&lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_32_25" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; <span class="cons_String">*</span> &lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_32_43" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ConstraintExp_31_22" id="ConstraintExp_33_3" title="Referenced at line 31, 32, 33, 34, 35, 41, 42, 43, 44, 45, 79">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Div_79_44" id="Div_33_17" title="Referenced at line 79">Div</a></span> = &lt;&lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_33_25" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; <span class="cons_String">/</span> &lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_33_43" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ConstraintExp_31_22" id="ConstraintExp_34_3" title="Referenced at line 31, 32, 33, 34, 35, 41, 42, 43, 44, 45, 79">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Add_79_72" id="Add_34_17" title="Referenced at line 79">Add</a></span> = &lt;&lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_34_25" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; <span class="cons_String">+</span> &lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_34_43" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ConstraintExp_31_22" id="ConstraintExp_35_3" title="Referenced at line 31, 32, 33, 34, 35, 41, 42, 43, 44, 45, 79">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Sub_79_90" id="Sub_35_17" title="Referenced at line 79">Sub</a></span> = &lt;&lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_35_25" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; <span class="cons_String">-</span> &lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_35_43" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ConstraintExp_31_22" id="ConstraintExp_36_3" title="Referenced at line 31, 32, 33, 34, 35, 41, 42, 43, 44, 45, 79">ConstraintExp</a>.<span class="cons_Constructor"><span id="Line_36_17" title="Not referenced">Line</span></span> = &lt;&lt;<a href="#ConstraintToken_17_3" id="ConstraintToken_36_26" title="Defined at line 17, 26, 27, 28, 29">ConstraintToken</a>&gt;<span class="cons_String">.line</span>&gt;
  <a href="#ConstraintExp_31_22" id="ConstraintExp_37_3" title="Referenced at line 31, 32, 33, 34, 35, 41, 42, 43, 44, 45, 79">ConstraintExp</a>.<span class="cons_Constructor"><span id="Col_37_17" title="Not referenced">Col</span></span> = &lt;&lt;<a href="#ConstraintToken_17_3" id="ConstraintToken_37_25" title="Defined at line 17, 26, 27, 28, 29">ConstraintToken</a>&gt;<span class="cons_String">.col</span>&gt;
  <a href="#ConstraintExp_31_22" id="ConstraintExp_38_3" title="Referenced at line 31, 32, 33, 34, 35, 41, 42, 43, 44, 45, 79">ConstraintExp</a>.<span class="cons_Constructor"><span id="Num_38_17" title="Not referenced">Num</span></span> = <a href="../../constants/NatCon.sdf3/#NatCon_5_2" id="NatCon_38_23" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a>

  <button class="modal-open" id="Constraint_40_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button> = &lt;<span class="cons_String">(</span>&lt;<a href="#Constraint_15_3" id="Constraint_40_19" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
  <button class="modal-open" id="Constraint_41_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><a href="#Eq_70_18" id="Eq_41_14" title="Referenced at line 70">Eq</a></span> = &lt;&lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_41_21" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; <span class="cons_String">==</span> &lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_41_40" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
  <button class="modal-open" id="Constraint_42_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><a href="#Lt_71_18" id="Lt_42_14" title="Referenced at line 71">Lt</a></span> = &lt;&lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_42_21" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; \&lt; &lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_42_40" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
  <button class="modal-open" id="Constraint_43_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><a href="#Le_72_18" id="Le_43_14" title="Referenced at line 72">Le</a></span> = &lt;&lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_43_21" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; \&lt;<span class="cons_String">=</span> &lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_43_41" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
  <button class="modal-open" id="Constraint_44_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><a href="#Gt_73_18" id="Gt_44_14" title="Referenced at line 73">Gt</a></span> = &lt;&lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_44_21" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; \&gt; &lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_44_40" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
  <button class="modal-open" id="Constraint_45_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><a href="#Ge_74_18" id="Ge_45_14" title="Referenced at line 74">Ge</a></span> = &lt;&lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_45_21" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt; \&gt;<span class="cons_String">=</span> &lt;<a href="#ConstraintExp_16_3" id="ConstraintExp_45_41" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>&gt;&gt; {<span class="keyword">non-assoc</span>}
  <button class="modal-open" id="Constraint_46_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><a href="#Not_68_16" id="Not_46_14" title="Referenced at line 68">Not</a></span> = &lt;<span class="cons_String">!</span>&lt;<a href="#Constraint_15_3" id="Constraint_46_23" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;&gt;
  <button class="modal-open" id="Constraint_47_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><a href="#And_76_16" id="And_47_14" title="Referenced at line 76">And</a></span> = &lt;&lt;<a href="#Constraint_15_3" id="Constraint_47_22" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt; <span class="cons_String">&amp;&amp;</span> &lt;<a href="#Constraint_15_3" id="Constraint_47_38" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;&gt; {<span class="keyword">left</span>}
  <button class="modal-open" id="Constraint_48_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><a href="#Or_77_16" id="Or_48_14" title="Referenced at line 77">Or</a></span> = &lt;&lt;<a href="#Constraint_15_3" id="Constraint_48_21" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt; <span class="cons_String">||</span> &lt;<a href="#Constraint_15_3" id="Constraint_48_37" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;&gt; {<span class="keyword">left</span>}

  <button class="modal-open" id="Constraint_50_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="Offside_50_14" title="Not referenced">Offside</span></span> = &lt;<span class="cons_String">offside</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_50_34" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_50_55" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  <button class="modal-open" id="Constraint_51_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="Indent_51_14" title="Not referenced">Indent</span></span> = &lt;<span class="cons_String">indent</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_51_32" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_51_53" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <button class="modal-open" id="Constraint_52_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="Align_52_14" title="Not referenced">Align</span></span> = &lt;<span class="cons_String">align</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_52_30" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_52_51" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <button class="modal-open" id="Constraint_53_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="AlignList_53_14" title="Not referenced">AlignList</span></span> = &lt;<span class="cons_String">align-list</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_53_39" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;&gt;
  <button class="modal-open" id="Constraint_54_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="NewLineIndent_54_14" title="Not referenced">NewLineIndent</span></span> = &lt;<span class="cons_String">newline-indent</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_54_47" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_54_68" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <button class="modal-open" id="Constraint_55_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="SingleLine_55_14" title="Not referenced">SingleLine</span></span> = &lt;<span class="cons_String">single-line</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_55_41" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>*&gt;&gt;

  <button class="modal-open" id="Constraint_57_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="PPOffside_57_14" title="Not referenced">PPOffside</span></span> = &lt;<span class="cons_String">pp-offside</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_57_39" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_57_60" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  <button class="modal-open" id="Constraint_58_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="PPIndent_58_14" title="Not referenced">PPIndent</span></span> = &lt;<span class="cons_String">pp-indent</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_58_37" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_58_58" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <button class="modal-open" id="Constraint_59_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="PPAlign_59_14" title="Not referenced">PPAlign</span></span> = &lt;<span class="cons_String">pp-align</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_59_35" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_59_56" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <button class="modal-open" id="Constraint_60_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="PPAlignList_60_14" title="Not referenced">PPAlignList</span></span> = &lt;<span class="cons_String">pp-align-list</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_60_44" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;&gt;
  <button class="modal-open" id="Constraint_61_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="PPNewLineIndent_61_14" title="Not referenced">PPNewLineIndent</span></span> = &lt;<span class="cons_String">pp-newline-indent</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_61_52" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_61_73" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <button class="modal-open" id="Constraint_62_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="PPNewLineIndentBy_62_14" title="Not referenced">PPNewLineIndentBy</span></span> = &lt;<span class="cons_String">pp-newline-indent-by(</span>&lt;<a href="../../constants/NatCon.sdf3/#NatCon_5_2" id="NatCon_62_57" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a>&gt;<span class="cons_String">)</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_62_67" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt; &lt;{<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_62_88" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  <button class="modal-open" id="Constraint_63_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="PPNewLine_63_14" title="Not referenced">PPNewLine</span></span> = &lt;<span class="cons_String">pp-newline</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_63_39" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;&gt;
  <button class="modal-open" id="Constraint_64_3" title="Multi-file references" data-urls="#Constraint_40_19 line 40, 46, 47, 48, 68, 70, 71, 72, 73, 74, 76, 77; ../../kernel/Kernel.sdf3/#Constraint_34_39 line 34; ../../sdf2-core/Sdf2.sdf3/#Constraint_75_31 line 75">Constraint</button>.<span class="cons_Constructor"><span id="PPNewLineBy_64_14" title="Not referenced">PPNewLineBy</span></span> = &lt;<span class="cons_String">pp-newline(</span>&lt;<a href="../../constants/NatCon.sdf3/#NatCon_5_2" id="NatCon_64_41" title="Defined at ../../constants/NatCon.sdf3 line 5">NatCon</a>&gt;<span class="cons_String">)</span> &lt;<a href="#ConstraintTreeRef_18_3" id="ConstraintTreeRef_64_51" title="Defined at line 18, 22, 23, 24">ConstraintTreeRef</a>&gt;&gt;

<span class="keyword">context-free priorities</span>

    <a href="#Constraint_15_3" id="Constraint_68_5" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Not_46_14" id="Not_68_16" title="Defined at line 46">Not</a></span> &gt;
    {<span class="keyword">non-assoc</span>:
      <a href="#Constraint_15_3" id="Constraint_70_7" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Eq_41_14" id="Eq_70_18" title="Defined at line 41">Eq</a></span>
      <a href="#Constraint_15_3" id="Constraint_71_7" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Lt_42_14" id="Lt_71_18" title="Defined at line 42">Lt</a></span>
      <a href="#Constraint_15_3" id="Constraint_72_7" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Le_43_14" id="Le_72_18" title="Defined at line 43">Le</a></span>
      <a href="#Constraint_15_3" id="Constraint_73_7" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Gt_44_14" id="Gt_73_18" title="Defined at line 44">Gt</a></span>
      <a href="#Constraint_15_3" id="Constraint_74_7" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Ge_45_14" id="Ge_74_18" title="Defined at line 45">Ge</a></span>
    } &gt;
    <a href="#Constraint_15_3" id="Constraint_76_5" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#And_47_14" id="And_76_16" title="Defined at line 47">And</a></span> &gt;
    <a href="#Constraint_15_3" id="Constraint_77_5" title="Defined at line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>.<span class="cons_Constructor"><a href="#Or_48_14" id="Or_77_16" title="Defined at line 48">Or</a></span>,

    {<span class="keyword">left</span>: <a href="#ConstraintExp_16_3" id="ConstraintExp_79_12" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Mul_32_17" id="Mul_79_26" title="Defined at line 32">Mul</a></span> <a href="#ConstraintExp_16_3" id="ConstraintExp_79_30" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Div_33_17" id="Div_79_44" title="Defined at line 33">Div</a></span>} &gt; {<span class="keyword">left</span>: <a href="#ConstraintExp_16_3" id="ConstraintExp_79_58" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Add_34_17" id="Add_79_72" title="Defined at line 34">Add</a></span> <a href="#ConstraintExp_16_3" id="ConstraintExp_79_76" title="Defined at line 16, 31, 32, 33, 34, 35, 36, 37, 38">ConstraintExp</a>.<span class="cons_Constructor"><a href="#Sub_35_17" id="Sub_79_90" title="Defined at line 35">Sub</a></span>}

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
