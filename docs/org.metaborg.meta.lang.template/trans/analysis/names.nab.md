---
title: names.nab
hide:
  - toc
---

# `names.nab`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/trans/analysis/names.nab]

[pdmosses/sdf/org.metaborg.meta.lang.template/trans/analysis/names.nab]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/trans/analysis/names.nab "The source file on GitHub"

<div class="nab"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="analysis/names_1_8" title="a definition with no references">analysis/names</span>

<span class="keyword">imports</span>
  <span id="signatures/TemplateLang-sig_4_3" title="a reference to an external definition">signatures/TemplateLang-sig</span>
  <span id="analysis/types_5_3" title="a reference to an external definition">analysis/types</span>
  <span id="libstrc_6_3" title="a reference to an external definition">libstrc</span>


<span class="keyword">namespaces</span>

  <span class="cons_NamespaceDef"><a href="#Module_31_36" id="Module_11_3" title="a definition with a single reference">Module</a></span> <span class="cons_NamespaceDef"><a href="#Sort_103_14" id="Sort_11_10" title="a definition with a single reference">Sort</a></span>
  <span class="cons_NamespaceDef"><a href="#Constructor_100_15" id="Constructor_12_3" title="a definition with a single reference">Constructor</a></span> <span class="cons_NamespaceDef"><a href="#Label_109_13" id="Label_12_15" title="a definition with a single reference">Label</a></span>
  <span class="cons_NamespaceDef"><span id="DeclSort_13_3" title="a definition with no references">DeclSort</span></span>


<span class="keyword">properties</span>

  <span id="def_18_3" title="a definition with no references">def</span> <span class="keyword">of</span> <span class="cons_NamespaceRef"><a href="#Constructor_12_3" id="Constructor_18_10" title="a reference to a single-file definition">Constructor</a></span>       : SdfProduction
  <a href="#sort_100_32" id="sort_19_3" title="a definition with a single reference">sort</a> <span class="keyword">of</span> <span class="cons_NamespaceRef"><a href="#Constructor_12_3" id="Constructor_19_11" title="a reference to a single-file definition">Constructor</a></span>      : Sort
  <span id="ast_20_3" title="a definition with no references">ast</span> <span class="keyword">of</span> <span class="cons_NamespaceRef"><a href="#Module_11_3" id="Module_20_10" title="a reference to a single-file definition">Module</a></span>            : Module

  <a href="#constructorName_70_54" id="constructorName_22_3" title="a definition with a single reference">constructorName</a> <span class="keyword">of</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_22_22" title="a reference to a single-file definition">Sort</a></span>           : Constructor

<span class="keyword">binding rules</span>

  <span id="mod_26_3" title="a definition with no references">mod</span>@Module(Unparameterized(<a href="#m_27_20" id="m_26_30" title="a definition with a single reference">m</a>), <span id="i*_26_34" title="a definition with no references">i*</span>, <span id="s*_26_38" title="a definition with no references">s*</span>):
    <span class="keyword">defines</span> <span class="cons_NamespaceRef"><a href="#Module_11_3" id="Module_27_13" title="a reference to a single-file definition">Module</a></span> <a href="#m_26_30" id="m_27_20" title="a reference to a single-file definition">m</a>
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_28_12" title="a reference to a single-file definition">Sort</a></span>, <span class="cons_NamespaceRef"><a href="#Constructor_12_3" id="Constructor_28_18" title="a reference to a single-file definition">Constructor</a></span>

  Module(Unparameterized(<a href="#m_31_43" id="m_30_26" title="a definition with a single reference">m</a>)):
    <span class="keyword">imports</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_31_13" title="a reference to a single-file definition">Sort</a></span>, <span class="cons_NamespaceRef"><a href="#Constructor_12_3" id="Constructor_31_19" title="a reference to a single-file definition">Constructor</a></span> <span class="keyword">from</span> <span class="cons_NamespaceRef"><a href="#Module_11_3" id="Module_31_36" title="a reference to a single-file definition">Module</a></span> <a href="#m_30_26" id="m_31_43" title="a reference to a single-file definition">m</a>

  <span class="layout">//Kernel Productions</span>
  <span id="p_34_3" title="a definition with no references">p</span>@SdfProductionWithCons(SortCons(Lex(SortDef(<a href="#s_37_37" id="s_34_48" title="a definition with a single reference">s</a>)), Constructor(<a href="#c_36_32" id="c_34_65" title="a definition with a single reference">c</a>)), <a href="#rhs_38_13" id="rhs_34_70" title="a definition with a single reference">rhs</a>, <span id="attrs_34_75" title="a definition with no references">attrs</span>):
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_35_24" title="a reference to a single-file definition">Sort</a></span> <a href="#s_34_48" id="s_35_29" title="a reference to a single-file definition">s</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> SortType(<a href="#s_34_48" id="s_35_48" title="a reference to a single-file definition">s</a>) <span class="keyword">of</span> <span class="cons_PropertyRef"><a href="#constructorName_22_3" id="constructorName_35_54" title="a reference to a single-file definition">constructorName</a></span> <a href="#c_34_65" id="c_35_70" title="a reference to a single-file definition">c</a>
    <span class="keyword">defines unique</span> <span class="cons_NamespaceRef"><a href="#Constructor_12_3" id="Constructor_36_20" title="a reference to a single-file definition">Constructor</a></span> <a href="#c_34_65" id="c_36_32" title="a reference to a single-file definition">c</a>
      <span class="keyword">of</span> <span class="cons_TypeProp">type</span> FunType(<a href="#ty*_38_26" id="ty*_37_23" title="a reference to a single-file definition">ty*</a>, SortType(<a href="#s_34_48" id="s_37_37" title="a reference to a single-file definition">s</a>))
      <span class="keyword">where</span> <a href="#rhs_34_70" id="rhs_38_13" title="a reference to a single-file definition">rhs</a> <span class="keyword">has</span> <span class="cons_TypeProp">type</span> <a href="#ty*_37_23" id="ty*_38_26" title="a definition with a single reference">ty*</a>
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Label_12_15" id="Label_39_12" title="a reference to a single-file definition">Label</a></span>


  <span id="p_42_3" title="a definition with no references">p</span>@SdfProduction(Lex(SortDef(<a href="#s_43_48" id="s_42_31" title="a definition with a single reference">s</a>)), <span id="rhs_42_36" title="a definition with no references">rhs</span>, <span id="attrs_42_41" title="a definition with no references">attrs</span>):
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_43_24" title="a reference to a single-file definition">Sort</a></span> <a href="#s_42_31" id="s_43_29" title="a reference to a single-file definition">s</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> SortType(<a href="#s_42_31" id="s_43_48" title="a reference to a single-file definition">s</a>)
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Label_12_15" id="Label_44_12" title="a reference to a single-file definition">Label</a></span>

   <span id="p_46_4" title="a definition with no references">p</span>@SdfProductionWithCons(SortCons(Cf(SortDef(<a href="#s_49_37" id="s_46_48" title="a definition with a single reference">s</a>)), Constructor(<a href="#c_48_32" id="c_46_65" title="a definition with a single reference">c</a>)), <a href="#rhs_50_13" id="rhs_46_70" title="a definition with a single reference">rhs</a>, <span id="attrs_46_75" title="a definition with no references">attrs</span>):
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_47_24" title="a reference to a single-file definition">Sort</a></span> <a href="#s_46_48" id="s_47_29" title="a reference to a single-file definition">s</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> SortType(<a href="#s_46_48" id="s_47_48" title="a reference to a single-file definition">s</a>)  <span class="keyword">of</span> <span class="cons_PropertyRef"><a href="#constructorName_22_3" id="constructorName_47_55" title="a reference to a single-file definition">constructorName</a></span> <a href="#c_46_65" id="c_47_71" title="a reference to a single-file definition">c</a>
    <span class="keyword">defines unique</span> <span class="cons_NamespaceRef"><a href="#Constructor_12_3" id="Constructor_48_20" title="a reference to a single-file definition">Constructor</a></span> <a href="#c_46_65" id="c_48_32" title="a reference to a single-file definition">c</a>
      <span class="keyword">of</span> <span class="cons_TypeProp">type</span> FunType(<a href="#ty*_50_26" id="ty*_49_23" title="a reference to a single-file definition">ty*</a>, SortType(<a href="#s_46_48" id="s_49_37" title="a reference to a single-file definition">s</a>))
      <span class="keyword">where</span> <a href="#rhs_46_70" id="rhs_50_13" title="a reference to a single-file definition">rhs</a> <span class="keyword">has</span> <span class="cons_TypeProp">type</span> <a href="#ty*_49_23" id="ty*_50_26" title="a definition with a single reference">ty*</a>
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Label_12_15" id="Label_51_12" title="a reference to a single-file definition">Label</a></span>

  <span id="p_53_3" title="a definition with no references">p</span>@SdfProduction(Cf(SortDef(<a href="#s_54_48" id="s_53_30" title="a definition with a single reference">s</a>)), <span id="rhs_53_35" title="a definition with no references">rhs</span>, <span id="attrs_53_40" title="a definition with no references">attrs</span>):
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_54_24" title="a reference to a single-file definition">Sort</a></span> <a href="#s_53_30" id="s_54_29" title="a reference to a single-file definition">s</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> SortType(<a href="#s_53_30" id="s_54_48" title="a reference to a single-file definition">s</a>)
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Label_12_15" id="Label_55_12" title="a reference to a single-file definition">Label</a></span>

  <span class="layout">//Regular Productions</span>
  <span id="p_58_3" title="a definition with no references">p</span>@SdfProductionWithCons(SortCons(SortDef(<a href="#s_61_37" id="s_58_44" title="a definition with a single reference">s</a>), Constructor(<a href="#c_60_32" id="c_58_60" title="a definition with a single reference">c</a>)), <a href="#rhs_62_13" id="rhs_58_65" title="a definition with a single reference">rhs</a>, <span id="attrs_58_70" title="a definition with no references">attrs</span>):
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_59_24" title="a reference to a single-file definition">Sort</a></span> <a href="#s_58_44" id="s_59_29" title="a reference to a single-file definition">s</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> SortType(<a href="#s_58_44" id="s_59_48" title="a reference to a single-file definition">s</a>) <span class="keyword">of</span> <span class="cons_PropertyRef"><a href="#constructorName_22_3" id="constructorName_59_54" title="a reference to a single-file definition">constructorName</a></span> <a href="#c_58_60" id="c_59_70" title="a reference to a single-file definition">c</a>
    <span class="keyword">defines unique</span> <span class="cons_NamespaceRef"><a href="#Constructor_12_3" id="Constructor_60_20" title="a reference to a single-file definition">Constructor</a></span> <a href="#c_58_60" id="c_60_32" title="a reference to a single-file definition">c</a>
      <span class="keyword">of</span> <span class="cons_TypeProp">type</span> FunType(<a href="#ty*_62_26" id="ty*_61_23" title="a reference to a single-file definition">ty*</a>, SortType(<a href="#s_58_44" id="s_61_37" title="a reference to a single-file definition">s</a>))
      <span class="keyword">where</span> <a href="#rhs_58_65" id="rhs_62_13" title="a reference to a single-file definition">rhs</a> <span class="keyword">has</span> <span class="cons_TypeProp">type</span> <a href="#ty*_61_23" id="ty*_62_26" title="a definition with a single reference">ty*</a>
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Label_12_15" id="Label_63_12" title="a reference to a single-file definition">Label</a></span>

  <span id="p_65_3" title="a definition with no references">p</span>@SdfProduction(SortDef(<a href="#s_66_48" id="s_65_27" title="a definition with a single reference">s</a>), <span id="rhs_65_31" title="a definition with no references">rhs</span>, <span id="attrs_65_36" title="a definition with no references">attrs</span>):
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_66_24" title="a reference to a single-file definition">Sort</a></span> <a href="#s_65_27" id="s_66_29" title="a reference to a single-file definition">s</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> SortType(<a href="#s_65_27" id="s_66_48" title="a reference to a single-file definition">s</a>)
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Label_12_15" id="Label_67_12" title="a reference to a single-file definition">Label</a></span>

  <span id="p_69_3" title="a definition with no references">p</span>@TemplateProductionWithCons(SortCons(SortDef(<a href="#s_72_37" id="s_69_49" title="a definition with a single reference">s</a>), Constructor(<a href="#c_71_32" id="c_69_65" title="a definition with a single reference">c</a>)), <a href="#t_73_12" id="t_69_70" title="a definition with a single reference">t</a>, <span id="attrs_69_73" title="a definition with no references">attrs</span>):
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_70_24" title="a reference to a single-file definition">Sort</a></span> <a href="#s_69_49" id="s_70_29" title="a reference to a single-file definition">s</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> SortType(<a href="#s_69_49" id="s_70_48" title="a reference to a single-file definition">s</a>) <span class="keyword">of</span> <span class="cons_PropertyRef"><a href="#constructorName_22_3" id="constructorName_70_54" title="a reference to a single-file definition">constructorName</a></span> <a href="#c_69_65" id="c_70_70" title="a reference to a single-file definition">c</a>
    <span class="keyword">defines unique</span> <span class="cons_NamespaceRef"><a href="#Constructor_12_3" id="Constructor_71_20" title="a reference to a single-file definition">Constructor</a></span> <a href="#c_69_65" id="c_71_32" title="a reference to a single-file definition">c</a>
      <span class="keyword">of</span> <span class="cons_TypeProp">type</span> FunType(<a href="#ty*_73_23" id="ty*_72_23" title="a reference to a single-file definition">ty*</a>, SortType(<a href="#s_69_49" id="s_72_37" title="a reference to a single-file definition">s</a>))
     <span class="keyword">where</span> <a href="#t_69_70" id="t_73_12" title="a reference to a single-file definition">t</a> <span class="keyword">has</span> <span class="cons_TypeProp">type</span> <a href="#ty*_72_23" id="ty*_73_23" title="a definition with a single reference">ty*</a>
     <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Label_12_15" id="Label_74_13" title="a reference to a single-file definition">Label</a></span>

  <span id="p_76_3" title="a definition with no references">p</span>@TemplateProduction(SortDef(<a href="#s_77_48" id="s_76_32" title="a definition with a single reference">s</a>), <span id="t_76_36" title="a definition with no references">t</span>, <span id="attrs_76_39" title="a definition with no references">attrs</span>):
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_77_24" title="a reference to a single-file definition">Sort</a></span> <a href="#s_76_32" id="s_77_29" title="a reference to a single-file definition">s</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> SortType(<a href="#s_76_32" id="s_77_48" title="a reference to a single-file definition">s</a>)
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Label_12_15" id="Label_78_12" title="a reference to a single-file definition">Label</a></span>

 DeclSort(<a href="#s_81_46" id="s_80_11" title="a definition with a single reference">s</a>):     <span class="layout">// context-free</span>
  <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_81_22" title="a reference to a single-file definition">Sort</a></span> <a href="#s_80_11" id="s_81_27" title="a reference to a single-file definition">s</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> SortType(<a href="#s_80_11" id="s_81_46" title="a reference to a single-file definition">s</a>)
<span class="layout">//  defines DeclSort s</span>
 DeclSortLex(<a href="#s_84_46" id="s_83_14" title="a definition with a single reference">s</a>):
  <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_84_22" title="a reference to a single-file definition">Sort</a></span> <a href="#s_83_14" id="s_84_27" title="a reference to a single-file definition">s</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> SortType(<a href="#s_83_14" id="s_84_46" title="a reference to a single-file definition">s</a>)
<span class="layout">//  defines DeclSort s</span>
 DeclSortVar(<a href="#s_87_46" id="s_86_14" title="a definition with a single reference">s</a>):
  <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_87_22" title="a reference to a single-file definition">Sort</a></span> <a href="#s_86_14" id="s_87_27" title="a reference to a single-file definition">s</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> SortType(<a href="#s_86_14" id="s_87_46" title="a reference to a single-file definition">s</a>)
<span class="layout">//  defines DeclSort s</span>

 SortConsRef(Sort(<button class="modal-open" id="s_90_19" title="a definition with multiple references" data-urls="#s line 91_20, 92_37">s</button>), Constructor(<a href="#c_92_27" id="c_90_35" title="a definition with a single reference">c</a>)):
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_91_15" title="a reference to a single-file definition">Sort</a></span> <a href="#s_90_19" id="s_91_20" title="a reference to a single-file definition">s</a>
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Constructor_12_3" id="Constructor_92_15" title="a reference to a single-file definition">Constructor</a></span> <a href="#c_90_35" id="c_92_27" title="a reference to a single-file definition">c</a> <span class="keyword">of</span> <span class="cons_PropertyRef"><a href="#sort_19_3" id="sort_92_32" title="a reference to a single-file definition">sort</a></span> <a href="#s_90_19" id="s_92_37" title="a reference to a single-file definition">s</a>

  SortConsRef(Lex(Sort(<button class="modal-open" id="s_94_24" title="a definition with multiple references" data-urls="#s line 95_20, 96_37">s</button>)), Constructor(<a href="#c_96_27" id="c_94_41" title="a definition with a single reference">c</a>)):
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_95_15" title="a reference to a single-file definition">Sort</a></span> <a href="#s_94_24" id="s_95_20" title="a reference to a single-file definition">s</a>
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Constructor_12_3" id="Constructor_96_15" title="a reference to a single-file definition">Constructor</a></span> <a href="#c_94_41" id="c_96_27" title="a reference to a single-file definition">c</a> <span class="keyword">of</span> <span class="cons_PropertyRef"><a href="#sort_19_3" id="sort_96_32" title="a reference to a single-file definition">sort</a></span> <a href="#s_94_24" id="s_96_37" title="a reference to a single-file definition">s</a>

   SortConsRef(Cf(Sort(<button class="modal-open" id="s_98_24" title="a definition with multiple references" data-urls="#s line 99_20, 100_37">s</button>)), Constructor(<a href="#c_100_27" id="c_98_41" title="a definition with a single reference">c</a>)):
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_99_15" title="a reference to a single-file definition">Sort</a></span> <a href="#s_98_24" id="s_99_20" title="a reference to a single-file definition">s</a>
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Constructor_12_3" id="Constructor_100_15" title="a reference to a single-file definition">Constructor</a></span> <a href="#c_98_41" id="c_100_27" title="a reference to a single-file definition">c</a> <span class="keyword">of</span> <span class="cons_PropertyRef"><a href="#sort_19_3" id="sort_100_32" title="a reference to a single-file definition">sort</a></span> <a href="#s_98_24" id="s_100_37" title="a reference to a single-file definition">s</a>

 Sort(<a href="#s_103_19" id="s_102_7" title="a definition with a single reference">s</a>):
   <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Sort_11_10" id="Sort_103_14" title="a reference to a single-file definition">Sort</a></span> <a href="#s_102_7" id="s_103_19" title="a reference to a single-file definition">s</a>

 Label(Unquoted(<a href="#l_106_24" id="l_105_17" title="a definition with a single reference">l</a>), _):
  <span class="keyword">defines unique</span> <span class="cons_NamespaceRef"><a href="#Label_12_15" id="Label_106_18" title="a reference to a single-file definition">Label</a></span> <a href="#l_105_17" id="l_106_24" title="a reference to a single-file definition">l</a>

 LabelRef(<a href="#l_109_19" id="l_108_11" title="a definition with a single reference">l</a>):
  <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Label_12_15" id="Label_109_13" title="a reference to a single-file definition">Label</a></span> <a href="#l_108_11" id="l_109_19" title="a reference to a single-file definition">l</a>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
