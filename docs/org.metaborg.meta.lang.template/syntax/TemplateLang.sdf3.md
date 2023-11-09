---
title: TemplateLang.sdf3
hide:
  - toc
---

# `TemplateLang.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/TemplateLang.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/TemplateLang.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/TemplateLang.sdf3 "The source file on GitHub"

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
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
138
139
140
141
142
143
144
145
146
147
148
149
150
151
152
153
154
155
156
157
158
159
160
161
162
163
164
165
166
167
168
169
170
171
172
173
174
175
176
177
178
179
180
181
182
183
184
185
186
187
188
189
190
191
192
193
194
195
196
197
198
199
200
201
202
203
204
205
206
207
208
209
210
211
212
213
214
215
216
217
218
219
220
221
222
223
224
225
226
227
228
229
230
231
232
233
234
235
236
237
238
239
240
241
242
243
244
245
246
247
248
249
250
251
252
253
254
255
256
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="TemplateLang_1_8" title="Multi-file references" data-urls="../basic/Basic.sdf3/#TemplateLang_5_3 line 5; ../priority/Priority.sdf3/#TemplateLang_3_40 line 3">TemplateLang</button> 
<span class="keyword">imports</span>
  <a href="../sdf2-core/Sdf2.sdf3/#sdf2-core/Sdf2_1_8" id="sdf2-core/Sdf2_3_3" title="Defined at ../sdf2-core/Sdf2.sdf3 line 1">sdf2-core/Sdf2</a>
  <a href="../constants/StrCon.sdf3/#constants/StrCon_1_8" id="constants/StrCon_4_3" title="Defined at ../constants/StrCon.sdf3 line 1">constants/StrCon</a>
  <a href="../sorts/Sorts.sdf3/#sorts/Sorts_1_8" id="sorts/Sorts_5_3" title="Defined at ../sorts/Sorts.sdf3 line 1">sorts/Sorts</a>
  <a href="../symbols/Symbols.sdf3/#symbols/Symbols_1_8" id="symbols/Symbols_6_3" title="Defined at ../symbols/Symbols.sdf3 line 1">symbols/Symbols</a>
  <a href="../labels/Labels.sdf3/#labels/Labels_1_8" id="labels/Labels_7_3" title="Defined at ../labels/Labels.sdf3 line 1">labels/Labels</a>
  <a href="../constants/IdentifierCon.sdf3/#constants/IdentifierCon_1_8" id="constants/IdentifierCon_8_3" title="Defined at ../constants/IdentifierCon.sdf3 line 1">constants/IdentifierCon</a>
  <a href="../kernel/Kernel.sdf3/#kernel/Kernel_1_8" id="kernel/Kernel_9_3" title="Defined at ../kernel/Kernel.sdf3 line 1">kernel/Kernel</a>
  <a href="../restrictions/Restrictions.sdf3/#restrictions/Restrictions_1_8" id="restrictions/Restrictions_10_3" title="Defined at ../restrictions/Restrictions.sdf3 line 1">restrictions/Restrictions</a>
  <a href="../priority/Priority.sdf3/#priority/Priority_1_8" id="priority/Priority_11_3" title="Defined at ../priority/Priority.sdf3 line 1">priority/Priority</a>
  <a href="../basic/Basic.sdf3/#basic/Basic_1_8" id="basic/Basic_12_3" title="Defined at ../basic/Basic.sdf3 line 1">basic/Basic</a>
  <a href="../modules/Modules.sdf3/#modules/Modules_1_8" id="modules/Modules_13_3" title="Defined at ../modules/Modules.sdf3 line 1">modules/Modules</a>
  <a href="../layout-constraints/Layout-Constraints.sdf3/#layout-constraints/Layout-Constraints_1_8" id="layout-constraints/Layout-Constraints_14_3" title="Defined at ../layout-constraints/Layout-Constraints.sdf3 line 1">layout-constraints/Layout-Constraints</a>

<span class="keyword">context-free start-symbols</span>
    <a href="../modules/Modules.sdf3/#Module_21_2" id="Module_17_5" title="Defined at ../modules/Modules.sdf3 line 21">Module</a>

<span class="keyword">context-free syntax</span>
<span class="layout">//options section</span>
<span id="Section_21_1" title="Not referenced">Section</span>.<span class="cons_Constructor"><span id="TemplateOptions_21_9" title="Not referenced">TemplateOptions</span></span> = &lt;
        <span class="cons_String">template</span> <span class="cons_String">options</span> 
        
                &lt;{<a href="#TemplateOption_28_1" id="TemplateOption_24_5" title="Defined at line 28, 30, 37, 39">TemplateOption</a> <span class="cons_Lit">"\n"</span>}*&gt;
        
        &gt; 

<a href="#TemplateOption_24_5" id="TemplateOption_28_1" title="Referenced at line 24">TemplateOption</a>.<span class="cons_Constructor"><span id="Newlines_28_16" title="Not referenced">Newlines</span></span> = &lt;<span class="cons_String">newlines</span> <span class="cons_String">:</span> &lt;<a href="#NewlineOptionValue_32_1" id="NewlineOptionValue_28_40" title="Defined at line 32, 33, 34, 35">NewlineOptionValue</a>&gt;&gt;

<a href="#TemplateOption_24_5" id="TemplateOption_30_1" title="Referenced at line 24">TemplateOption</a>.<span class="cons_Constructor"><span id="KeywordAttributes_30_16" title="Not referenced">KeywordAttributes</span></span> = &lt;&lt;<a href="../sorts/Sorts.sdf3/#SymbolDef_17_1" id="SymbolDef_30_38" title="Defined at ../sorts/Sorts.sdf3 line 17, 18, 19, 20">SymbolDef</a>&gt; <span class="cons_String">=</span> <span class="cons_String">keyword</span> &lt;<a href="../kernel/Kernel.sdf3/#Attributes_15_1" id="Attributes_30_60" title="Defined at ../kernel/Kernel.sdf3 line 15, 16">Attributes</a>&gt;&gt;
 
<a href="#NewlineOptionValue_28_40" id="NewlineOptionValue_32_1" title="Referenced at line 28">NewlineOptionValue</a>.<span class="cons_Constructor"><span id="None_32_20" title="Not referenced">None</span></span> = &lt;<span class="cons_String">none</span>&gt;
<a href="#NewlineOptionValue_28_40" id="NewlineOptionValue_33_1" title="Referenced at line 28">NewlineOptionValue</a>.<span class="cons_Constructor"><span id="Leading_33_20" title="Not referenced">Leading</span></span> = &lt;<span class="cons_String">leading</span>&gt;
<a href="#NewlineOptionValue_28_40" id="NewlineOptionValue_34_1" title="Referenced at line 28">NewlineOptionValue</a>.<span class="cons_Constructor"><span id="Trailing_34_20" title="Not referenced">Trailing</span></span> = &lt;<span class="cons_String">trailing</span>&gt;
<a href="#NewlineOptionValue_28_40" id="NewlineOptionValue_35_1" title="Referenced at line 28">NewlineOptionValue</a>.<span class="cons_Constructor"><span id="Separating_35_20" title="Not referenced">Separating</span></span> = &lt;<span class="cons_String">separating</span>&gt;

<a href="#TemplateOption_24_5" id="TemplateOption_37_1" title="Referenced at line 24">TemplateOption</a>.<span class="cons_Constructor"><span id="KeywordFollowRestriction_37_16" title="Not referenced">KeywordFollowRestriction</span></span> = &lt;<span class="cons_String">keyword</span> <span class="cons_String">-/-</span> &lt;<a href="../restrictions/Restrictions.sdf3/#Lookaheads_13_1" id="Lookaheads_37_57" title="Defined at ../restrictions/Restrictions.sdf3 line 13, 15, 16, 17">Lookaheads</a>&gt;&gt;

<a href="#TemplateOption_24_5" id="TemplateOption_39_1" title="Referenced at line 24">TemplateOption</a>.<span class="cons_Constructor"><span id="Tokenize_39_16" title="Not referenced">Tokenize</span></span> = &lt;<span class="cons_String">tokenize</span> <span class="cons_String">:</span> &lt;<a href="../constants/StrCon.sdf3/#StrCon_12_5" id="StrCon_39_40" title="Defined at ../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;

<span class="keyword">context-free syntax</span>
<span class="layout">//references to productions using sort.cons notation in priority specification</span>
<span id="Group_43_1" title="Not referenced">Group</span>.<span class="cons_Constructor"><span id="SimpleRefGroup_43_7" title="Not referenced">SimpleRefGroup</span></span> = &lt;&lt;<a href="#SortConsRef_48_1" id="SortConsRef_43_26" title="Defined at line 48">SortConsRef</a>&gt;&gt;
<span id="Group_44_1" title="Not referenced">Group</span>.<span class="cons_Constructor"><span id="ProdsRefGroup_44_7" title="Not referenced">ProdsRefGroup</span></span> = &lt;<span class="cons_String">{</span>&lt;{<a href="#SortConsRef_48_1" id="SortConsRef_44_27" title="Defined at line 48">SortConsRef</a> <span class="cons_Lit">"\n"</span>}+&gt;<span class="cons_String">}</span>&gt;
<span id="Group_45_1" title="Not referenced">Group</span>.<span class="cons_Constructor"><span id="AssocRefGroup_45_7" title="Not referenced">AssocRefGroup</span></span> = &lt;
        <span class="cons_String">{</span>&lt;<a href="../priority/Priority.sdf3/#Associativity_7_1" id="Associativity_46_4" title="Defined at ../priority/Priority.sdf3 line 7, 8, 9, 10, 11">Associativity</a>&gt; <span class="cons_String">:</span>
                &lt;{<a href="#SortConsRef_48_1" id="SortConsRef_47_5" title="Defined at line 48">SortConsRef</a> <span class="cons_Lit">"\n"</span>}+&gt;<span class="cons_String">}</span>&gt;
<a href="#SortConsRef_43_26" id="SortConsRef_48_1" title="Referenced at line 43, 44, 47">SortConsRef</a>.<span class="cons_Constructor"><span id="SortConsRef_48_13" title="Not referenced">SortConsRef</span></span> = &lt;&lt;<a href="../basic/Basic.sdf3/#Symbol_48_1" id="Symbol_48_29" title="Defined at ../basic/Basic.sdf3 line 48, 49, 50, 51">Symbol</a>&gt;<span class="cons_String">.</span>&lt;<a href="#Constructor_95_1" id="Constructor_48_38" title="Defined at line 95">Constructor</a>&gt;&gt;

<span class="keyword">context-free syntax</span> 
<span class="layout">//grammars</span>
<span id="Section_52_1" title="Not referenced">Section</span>.<span class="cons_Constructor"><span id="TemplateSection_52_9" title="Not referenced">TemplateSection</span></span> = &lt;
        <span class="cons_String">templates</span> 
        
                &lt;{<a href="#TemplateProduction_90_1" id="TemplateProduction_55_5" title="Defined at line 90, 93">TemplateProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;
        
        &gt; {<span class="keyword">deprecated</span>("Use context-free syntax section instead")}

<span id="Grammar_59_1" title="Not referenced">Grammar</span>.<span class="cons_Constructor"><span id="LexicalSyntax_59_9" title="Not referenced">LexicalSyntax</span></span> = &lt;
        <span class="cons_String">lexical</span> <span class="cons_String">syntax</span> 
        
                &lt;{<a href="#SdfProduction_85_1" id="SdfProduction_62_5" title="Defined at line 85, 86">SdfProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;
        
        &gt; {<span class="keyword">prefer</span>}
        
<span id="Grammar_66_1" title="Not referenced">Grammar</span>.<span class="cons_Constructor"><span id="ContextFreeSyntax_66_9" title="Not referenced">ContextFreeSyntax</span></span> = &lt;
        <span class="cons_String">context-free</span> <span class="cons_String">syntax</span> 
        
                &lt;{<a href="#GeneralProduction_80_1" id="GeneralProduction_69_5" title="Defined at line 80, 81">GeneralProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;
        
        &gt; {<span class="keyword">prefer</span>}
        
<span id="Grammar_73_1" title="Not referenced">Grammar</span>.<span class="cons_Constructor"><span id="Kernel_73_9" title="Not referenced">Kernel</span></span> = &lt;
        <span class="cons_String">syntax</span> 
        
                &lt;{<a href="#SdfProduction_85_1" id="SdfProduction_76_5" title="Defined at line 85, 86">SdfProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;
        
        &gt; {<span class="keyword">prefer</span>}
        
<a href="#GeneralProduction_69_5" id="GeneralProduction_80_1" title="Referenced at line 69">GeneralProduction</a> = &lt;&lt;<a href="#SdfProduction_85_1" id="SdfProduction_80_23" title="Defined at line 85, 86">SdfProduction</a>&gt;&gt;
<a href="#GeneralProduction_69_5" id="GeneralProduction_81_1" title="Referenced at line 69">GeneralProduction</a> = &lt;&lt;<a href="#TemplateProduction_90_1" id="TemplateProduction_81_23" title="Defined at line 90, 93">TemplateProduction</a>&gt;&gt; {<span class="keyword">prefer</span>}


<span class="layout">// syntactic sugar for SDF</span>
<button class="modal-open" id="SdfProduction_85_1" title="Multi-file references" data-urls="#SdfProduction_62_5 line 62, 76, 80; ../basic/Basic.sdf3/#SdfProduction_30_8 line 30, 44; ../priority/Priority.sdf3/#SdfProduction_26_24 line 26">SdfProduction</button>.<span class="cons_Constructor"><span id="SdfProduction_85_15" title="Not referenced">SdfProduction</span></span> = &lt;&lt;<a href="../sorts/Sorts.sdf3/#SymbolDef_17_1" id="SymbolDef_85_33" title="Defined at ../sorts/Sorts.sdf3 line 17, 18, 19, 20">SymbolDef</a>&gt; <span class="cons_String">=</span> &lt;<a href="#RHS_87_1" id="RHS_85_47" title="Defined at line 87">RHS</a>&gt; &lt;<a href="../kernel/Kernel.sdf3/#Attributes_15_1" id="Attributes_85_53" title="Defined at ../kernel/Kernel.sdf3 line 15, 16">Attributes</a>&gt;&gt; 
<button class="modal-open" id="SdfProduction_86_1" title="Multi-file references" data-urls="#SdfProduction_62_5 line 62, 76, 80; ../basic/Basic.sdf3/#SdfProduction_30_8 line 30, 44; ../priority/Priority.sdf3/#SdfProduction_26_24 line 26">SdfProduction</button>.<span class="cons_Constructor"><span id="SdfProductionWithCons_86_15" title="Not referenced">SdfProductionWithCons</span></span> = &lt;&lt;<a href="#SortCons_97_1" id="SortCons_86_41" title="Defined at line 97">SortCons</a>&gt; <span class="cons_String">=</span> &lt;<a href="#RHS_87_1" id="RHS_86_54" title="Defined at line 87">RHS</a>&gt; &lt;<a href="../kernel/Kernel.sdf3/#Attributes_15_1" id="Attributes_86_60" title="Defined at ../kernel/Kernel.sdf3 line 15, 16">Attributes</a>&gt;&gt;
<a href="#RHS_85_47" id="RHS_87_1" title="Referenced at line 85, 86">RHS</a>.<span class="cons_Constructor"><span id="Rhs_87_5" title="Not referenced">Rhs</span></span> = &lt;&lt;<a href="../sdf2-core/Sdf2.sdf3/#Symbols_59_5" id="Symbols_87_13" title="Defined at ../sdf2-core/Sdf2.sdf3 line 59">Symbols</a>&gt;&gt;

<span class="layout">// template productions</span>
<a href="#TemplateProduction_55_5" id="TemplateProduction_90_1" title="Referenced at line 55, 81">TemplateProduction</a>.<span class="cons_Constructor"><span id="TemplateProduction_90_20" title="Not referenced">TemplateProduction</span></span> = &lt;&lt;<a href="../sorts/Sorts.sdf3/#SymbolDef_17_1" id="SymbolDef_90_43" title="Defined at ../sorts/Sorts.sdf3 line 17, 18, 19, 20">SymbolDef</a>&gt; <span class="cons_String">=</span> &lt;<a href="#Template_125_3" id="Template_90_57" title="Defined at line 125, 126, 132, 133">Template</a>&gt; &lt;<a href="../kernel/Kernel.sdf3/#Attributes_15_1" id="Attributes_90_68" title="Defined at ../kernel/Kernel.sdf3 line 15, 16">Attributes</a>&gt;&gt;

<span class="layout">// template productions Sort.Cons = ...</span>
<a href="#TemplateProduction_55_5" id="TemplateProduction_93_1" title="Referenced at line 55, 81">TemplateProduction</a>.<span class="cons_Constructor"><span id="TemplateProductionWithCons_93_20" title="Not referenced">TemplateProductionWithCons</span></span> = &lt;&lt;<a href="#SortCons_97_1" id="SortCons_93_51" title="Defined at line 97">SortCons</a>&gt; <span class="cons_String">=</span> &lt;<a href="#Template_125_3" id="Template_93_64" title="Defined at line 125, 126, 132, 133">Template</a>&gt; &lt;<a href="../kernel/Kernel.sdf3/#Attributes_15_1" id="Attributes_93_75" title="Defined at ../kernel/Kernel.sdf3 line 15, 16">Attributes</a>&gt;&gt;

<a href="#Constructor_48_38" id="Constructor_95_1" title="Referenced at line 48, 97">Constructor</a>.<span class="cons_Constructor"><span id="Constructor_95_13" title="Not referenced">Constructor</span></span> = &lt;&lt;<a href="../constants/IdentifierCon.sdf3/#IdCon_6_1" id="IdCon_95_29" title="Defined at ../constants/IdentifierCon.sdf3 line 6">IdCon</a>&gt;&gt;

<a href="#SortCons_86_41" id="SortCons_97_1" title="Referenced at line 86, 93">SortCons</a>.<span class="cons_Constructor"><span id="SortCons_97_10" title="Not referenced">SortCons</span></span> = &lt;&lt;<a href="../sorts/Sorts.sdf3/#SymbolDef_17_1" id="SymbolDef_97_23" title="Defined at ../sorts/Sorts.sdf3 line 17, 18, 19, 20">SymbolDef</a>&gt;<span class="cons_String">.</span>&lt;<a href="#Constructor_95_1" id="Constructor_97_35" title="Defined at line 95">Constructor</a>&gt;&gt;

 
<span class="layout">// placeholders</span>
<a href="#TemplatePart1_127_27" id="TemplatePart1_101_1" title="Referenced at line 127">TemplatePart1</a>.<span class="cons_Constructor"><span id="Angled_101_15" title="Not referenced">Angled</span></span>       = [<span class="cons_String">&lt;</span>[<a href="#Placeholder_106_1" id="Placeholder_101_33" title="Defined at line 106">Placeholder</a>]<span class="cons_String">&gt;</span>]
<a href="#TemplatePart1_127_27" id="TemplatePart1_102_1" title="Referenced at line 127">TemplatePart1</a>.<span class="cons_Constructor"><span id="BreakAngled_102_15" title="Not referenced">BreakAngled</span></span>  = [<span class="cons_String">&lt;&gt;</span>]
<a href="#TemplatePart2_134_27" id="TemplatePart2_103_1" title="Referenced at line 134">TemplatePart2</a>.<span class="cons_Constructor"><span id="Squared_103_15" title="Not referenced">Squared</span></span>      = &lt;<span class="cons_String">[</span>&lt;<a href="#Placeholder_106_1" id="Placeholder_103_33" title="Defined at line 106">Placeholder</a>&gt;<span class="cons_String">]</span>&gt;
<a href="#TemplatePart2_134_27" id="TemplatePart2_104_1" title="Referenced at line 134">TemplatePart2</a>.<span class="cons_Constructor"><span id="BreakSquared_104_15" title="Not referenced">BreakSquared</span></span> = &lt;<span class="cons_String">[]</span>&gt;

<a href="#Placeholder_101_33" id="Placeholder_106_1" title="Referenced at line 101, 103">Placeholder</a>.<span class="cons_Constructor"><span id="Placeholder_106_13" title="Not referenced">Placeholder</span></span> = &lt;&lt;<a href="../basic/Basic.sdf3/#Symbol_48_1" id="Symbol_106_29" title="Defined at ../basic/Basic.sdf3 line 48, 49, 50, 51">Symbol</a>&gt;&lt;<a href="#PlaceholderOptions_110_1" id="PlaceholderOptions_106_37" title="Defined at line 110, 111">PlaceholderOptions</a>&gt;&gt;



<a href="#PlaceholderOptions_106_37" id="PlaceholderOptions_110_1" title="Referenced at line 106">PlaceholderOptions</a>.<span class="cons_Constructor"><span id="NoOptions_110_20" title="Not referenced">NoOptions</span></span> = &lt;&gt;
<a href="#PlaceholderOptions_106_37" id="PlaceholderOptions_111_1" title="Referenced at line 106">PlaceholderOptions</a>.<span class="cons_Constructor"><span id="Options_111_20" title="Not referenced">Options</span></span> = &lt;<span class="cons_String">;</span>&lt;{<a href="#PlaceholderOption_113_1" id="PlaceholderOption_111_34" title="Defined at line 113, 114, 115, 116, 117, 119, 120">PlaceholderOption</a> <span class="cons_Lit">", "</span>}+&gt;&gt;

<a href="#PlaceholderOption_111_34" id="PlaceholderOption_113_1" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Hide_113_19" title="Not referenced">Hide</span></span> = &lt;<span class="cons_String">hide</span>&gt;
<a href="#PlaceholderOption_111_34" id="PlaceholderOption_114_1" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Wrap_114_19" title="Not referenced">Wrap</span></span> = &lt;<span class="cons_String">wrap</span>&gt;
<a href="#PlaceholderOption_111_34" id="PlaceholderOption_115_1" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Anchor_115_19" title="Not referenced">Anchor</span></span> = &lt;<span class="cons_String">anchor</span>&gt;
<a href="#PlaceholderOption_111_34" id="PlaceholderOption_116_1" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Floating_116_19" title="Not referenced">Floating</span></span> = &lt;<span class="cons_String">float</span>&gt;
<a href="#PlaceholderOption_111_34" id="PlaceholderOption_117_1" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="CompCursor_117_19" title="Not referenced">CompCursor</span></span> = &lt;<span class="cons_String">cursor</span>&gt;
<span class="layout">//mark as deprecated</span>
<a href="#PlaceholderOption_111_34" id="PlaceholderOption_119_1" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Separator_119_19" title="Not referenced">Separator</span></span> = &lt;<span class="cons_String">separator=</span>&lt;<a href="../constants/StrCon.sdf3/#StrCon_12_5" id="StrCon_119_43" title="Defined at ../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt; {<span class="keyword">deprecated</span>("Use list with separator symbol instead: {S \"separator\"}*")}
<a href="#PlaceholderOption_111_34" id="PlaceholderOption_120_1" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Text_120_19" title="Not referenced">Text</span></span> = &lt;<span class="cons_String">text=</span>&lt;<a href="../constants/StrCon.sdf3/#StrCon_12_5" id="StrCon_120_33" title="Defined at ../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;
  
  <span class="keyword">syntax</span>
  
  
  <a href="#Template_90_57" id="Template_125_3" title="Referenced at line 90, 93">Template</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Template_125_15" title="Not referenced">Template</span></span> = <span class="cons_Lit">"&lt;"</span> {<a href="#TemplateLine1_127_3" id="TemplateLine1_125_31" title="Defined at line 127">TemplateLine1</a><span class="keyword">-CF</span> <span class="cons_Lit">"\n"</span>}+ <span class="cons_Lit">"&gt;"</span>
  <a href="#Template_90_57" id="Template_126_3" title="Referenced at line 90, 93">Template</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="TemplateDeprecated_126_15" title="Not referenced">TemplateDeprecated</span></span> =  <span class="cons_Lit">"&lt;&lt;"</span> {<a href="#TemplateLine1_127_3" id="TemplateLine1_126_43" title="Defined at line 127">TemplateLine1</a><span class="keyword">-CF</span> <span class="cons_Lit">"\n"</span>}+ <span class="cons_Lit">"&gt;&gt;"</span> {<span class="keyword">avoid</span>, <span class="keyword">deprecated</span>("Use single brackets to delimit the template")}
  <a href="#TemplateLine1_125_31" id="TemplateLine1_127_3" title="Referenced at line 125, 126">TemplateLine1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Line_127_20" title="Not referenced">Line</span></span> = <a href="#TemplatePart1_101_1" id="TemplatePart1_127_27" title="Defined at line 101, 102, 128, 129, 130">TemplatePart1</a><span class="keyword">-CF</span>* 
  <a href="#TemplatePart1_127_27" id="TemplatePart1_128_3" title="Referenced at line 127">TemplatePart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="String_128_20" title="Not referenced">String</span></span> = <a href="#TemplateString1_162_5" id="TemplateString1_128_29" title="Defined at line 162">TemplateString1</a><span class="keyword">-LEX</span>
  <a href="#TemplatePart1_127_27" id="TemplatePart1_129_3" title="Referenced at line 127">TemplatePart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Escape_129_20" title="Not referenced">Escape</span></span> = <a href="#TemplateEscape1_196_3" id="TemplateEscape1_129_29" title="Defined at line 196">TemplateEscape1</a><span class="keyword">-LEX</span>
  <a href="#TemplatePart1_127_27" id="TemplatePart1_130_3" title="Referenced at line 127">TemplatePart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Layout_130_20" title="Not referenced">Layout</span></span> = <a href="#TemplateLayout_160_5" id="TemplateLayout_130_29" title="Defined at line 160">TemplateLayout</a><span class="keyword">-LEX</span> 
  
  <a href="#Template_90_57" id="Template_132_3" title="Referenced at line 90, 93">Template</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="TemplateSquare_132_15" title="Not referenced">TemplateSquare</span></span> = <span class="cons_Lit">"["</span> {<a href="#TemplateLine2_134_3" id="TemplateLine2_132_37" title="Defined at line 134">TemplateLine2</a><span class="keyword">-CF</span> <span class="cons_Lit">"\n"</span>}+ <span class="cons_Lit">"]"</span>
  <a href="#Template_90_57" id="Template_133_3" title="Referenced at line 90, 93">Template</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="TemplateSquareDeprecated_133_15" title="Not referenced">TemplateSquareDeprecated</span></span> = <span class="cons_Lit">"[["</span> {<a href="#TemplateLine2_134_3" id="TemplateLine2_133_48" title="Defined at line 134">TemplateLine2</a><span class="keyword">-CF</span> <span class="cons_Lit">"\n"</span>}+ <span class="cons_Lit">"]]"</span> {<span class="keyword">avoid</span>, <span class="keyword">deprecated</span>("Use single brackets to delimit the template")}
  <a href="#TemplateLine2_132_37" id="TemplateLine2_134_3" title="Referenced at line 132, 133">TemplateLine2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Line_134_20" title="Not referenced">Line</span></span> = <a href="#TemplatePart2_103_1" id="TemplatePart2_134_27" title="Defined at line 103, 104, 136, 138, 139">TemplatePart2</a><span class="keyword">-CF</span>* 
  
  <a href="#TemplatePart2_134_27" id="TemplatePart2_136_3" title="Referenced at line 134">TemplatePart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="String_136_20" title="Not referenced">String</span></span> =  <a href="#TemplateString2_163_5" id="TemplateString2_136_30" title="Defined at line 163">TemplateString2</a><span class="keyword">-LEX</span> 
  
  <a href="#TemplatePart2_134_27" id="TemplatePart2_138_3" title="Referenced at line 134">TemplatePart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Escape_138_20" title="Not referenced">Escape</span></span> = <a href="#TemplateEscape2_197_3" id="TemplateEscape2_138_29" title="Defined at line 197">TemplateEscape2</a><span class="keyword">-LEX</span>
  <a href="#TemplatePart2_134_27" id="TemplatePart2_139_3" title="Referenced at line 134">TemplatePart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Layout_139_20" title="Not referenced">Layout</span></span> = <a href="#TemplateLayout_160_5" id="TemplateLayout_139_29" title="Defined at line 160">TemplateLayout</a><span class="keyword">-LEX</span>
  
  
  <span class="keyword">lexical syntax</span>
  
          <a href="#EOL_151_12" id="EOL_144_4" title="Referenced at line 151, 155">EOL</a> = <a href="#LF_149_4" id="LF_144_10" title="Defined at line 149">LF</a>
          <a href="#EOL_151_12" id="EOL_145_4" title="Referenced at line 151, 155">EOL</a> = <a href="#CR_148_4" id="CR_145_10" title="Defined at line 148">CR</a>
          <a href="#EOL_151_12" id="EOL_146_4" title="Referenced at line 151, 155">EOL</a> = <a href="#CR_148_4" id="CR_146_10" title="Defined at line 148">CR</a> <a href="#LF_149_4" id="LF_146_13" title="Defined at line 149">LF</a>
          
          <a href="#CR_145_10" id="CR_148_4" title="Referenced at line 145, 146">CR</a> = [\r]
          <a href="#LF_144_10" id="LF_149_4" title="Referenced at line 144, 146">LF</a> = [\n]
          
    <span class="cons_Lit">"\n"</span> = <a href="#EOL_144_4" id="EOL_151_12" title="Defined at line 144, 145, 146">EOL</a>
  
  <span class="keyword">lexical restrictions</span>
  
    <a href="#EOL_144_4" id="EOL_155_5" title="Defined at line 144, 145, 146">EOL</a> -/- [\n]
      
  
  <span class="keyword">lexical syntax</span>
    
    <a href="#TemplateLayout_130_29" id="TemplateLayout_160_5" title="Referenced at line 130, 139, 174">TemplateLayout</a> =  [\ \t]+
    
    <a href="#TemplateString1_128_29" id="TemplateString1_162_5" title="Referenced at line 128, 177, 182">TemplateString1</a> = <a href="#TemplateString1Alt_165_5" id="TemplateString1Alt_162_23" title="Defined at line 165">TemplateString1Alt</a>+
    <a href="#TemplateString2_136_30" id="TemplateString2_163_5" title="Referenced at line 136, 178, 183">TemplateString2</a> = <a href="#TemplateString2Alt_166_5" id="TemplateString2Alt_163_23" title="Defined at line 166, 167">TemplateString2Alt</a>+
        <a href="#TemplateStringQ_179_5" id="TemplateStringQ_164_2" title="Referenced at line 179">TemplateStringQ</a> =  ~[\\\"\ \t]+   
    <a href="#TemplateString1Alt_162_23" id="TemplateString1Alt_165_5" title="Referenced at line 162">TemplateString1Alt</a> = ~[\\\&lt;\&gt;\ \t\r\n]
    <a href="#TemplateString2Alt_163_23" id="TemplateString2Alt_166_5" title="Referenced at line 163">TemplateString2Alt</a> = ~[\\\[\]\ \t\r\n] 
    <a href="#TemplateString2Alt_163_23" id="TemplateString2Alt_167_5" title="Referenced at line 163">TemplateString2Alt</a> = <a href="#Backslash_169_2" id="Backslash_167_26" title="Defined at line 169">Backslash</a>

        <a href="#Backslash_167_26" id="Backslash_169_2" title="Referenced at line 167, 185">Backslash</a> = [\\] 
    <span class="layout">// [\\] -&gt; Backslash1</span>
    <span class="layout">// [\\] -&gt; Backslash2      =&gt; [\\] -&gt; Backslash</span>

  <span class="keyword">lexical restrictions</span>
    <a href="#TemplateLayout_160_5" id="TemplateLayout_174_5" title="Defined at line 160">TemplateLayout</a> -/- [\ \t]

    <span class="layout">%% must be followed by:</span>
    <a href="#TemplateString1_162_5" id="TemplateString1_177_5" title="Defined at line 162">TemplateString1</a> -/- ~[\\\&lt;\&gt;\ \t\r\n]
    <a href="#TemplateString2_163_5" id="TemplateString2_178_5" title="Defined at line 163">TemplateString2</a> -/- ~[\\\[\]\ \t\r\n]
    <a href="#TemplateStringQ_164_2" id="TemplateStringQ_179_5" title="Defined at line 164">TemplateStringQ</a> -/- ~[\\\"\ \t]

    <span class="layout">%% if followed by a backslash, then the backslash must be followed by:</span>
    <a href="#TemplateString1_162_5" id="TemplateString1_182_5" title="Defined at line 162">TemplateString1</a> -/- [\\].~[\&lt;\&gt;\\]
    <a href="#TemplateString2_163_5" id="TemplateString2_183_5" title="Defined at line 163">TemplateString2</a> -/- [\\].~[\[\]\\]

    <a href="#Backslash_169_2" id="Backslash_185_5" title="Defined at line 169">Backslash</a> -/- [\&lt;\&gt;\\]

  <span class="keyword">template options</span>
  
          <span class="keyword">tokenize</span> : "="  

  <span class="keyword">lexical syntax</span>
  <span class="layout">//production for ContenteCompletion</span>
  <span id="CONTENTCOMPLETE_193_3" title="Not referenced">CONTENTCOMPLETE</span> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>]* <span class="cons_Lit">"CONTENTCOMPLETE"</span> [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+  {<span class="keyword">avoid</span>}
  
  <span class="layout">//combine sequences of escaped chars</span>
  <a href="#TemplateEscape1_129_29" id="TemplateEscape1_196_3" title="Referenced at line 129, 249, 250">TemplateEscape1</a> = <a href="#EscapedChar1_200_3" id="EscapedChar1_196_21" title="Defined at line 200, 201, 202, 208, 212, 244">EscapedChar1</a>+
  <a href="#TemplateEscape2_138_29" id="TemplateEscape2_197_3" title="Referenced at line 138, 251, 252">TemplateEscape2</a> = <a href="#EscapedChar2_203_3" id="EscapedChar2_197_21" title="Defined at line 203, 204, 205, 215, 218, 245">EscapedChar2</a>+
  
  <span class="layout">//this are the escapes which StringTemplate has</span>
  <a href="#EscapedChar1_196_21" id="EscapedChar1_200_3" title="Referenced at line 196">EscapedChar1</a> = <span class="cons_Lit">"\\&lt;"</span>
  <a href="#EscapedChar1_196_21" id="EscapedChar1_201_3" title="Referenced at line 196">EscapedChar1</a> = <span class="cons_Lit">"\\&gt;"</span>
  <a href="#EscapedChar1_196_21" id="EscapedChar1_202_3" title="Referenced at line 196">EscapedChar1</a> = <span class="cons_Lit">"\\\\"</span>
  <a href="#EscapedChar2_197_21" id="EscapedChar2_203_3" title="Referenced at line 197">EscapedChar2</a> = <span class="cons_Lit">"\\["</span>
  <a href="#EscapedChar2_197_21" id="EscapedChar2_204_3" title="Referenced at line 197">EscapedChar2</a> = <span class="cons_Lit">"\\]"</span>
  <a href="#EscapedChar2_197_21" id="EscapedChar2_205_3" title="Referenced at line 197">EscapedChar2</a> = <span class="cons_Lit">"\\\\"</span>
  
   <span class="layout">//EscapedChar1 = "&lt;" (EscapedBackslashChar1 | EscapedChar)* "&gt;"</span>
   <a href="#EscapedChar1_196_21" id="EscapedChar1_208_4" title="Referenced at line 196">EscapedChar1</a> = <span class="cons_Lit">"&lt;"</span> <a href="#EscapedChar1Alt_209_4" id="EscapedChar1Alt_208_23" title="Defined at line 209, 210">EscapedChar1Alt</a>+ <span class="cons_Lit">"&gt;"</span>
   <a href="#EscapedChar1Alt_208_23" id="EscapedChar1Alt_209_4" title="Referenced at line 208">EscapedChar1Alt</a> = <a href="#EscapedBackslashChar1_223_4" id="EscapedBackslashChar1_209_22" title="Defined at line 223">EscapedBackslashChar1</a>
   <a href="#EscapedChar1Alt_208_23" id="EscapedChar1Alt_210_4" title="Referenced at line 208">EscapedChar1Alt</a> = <a href="#EscapedChar_231_4" id="EscapedChar_210_22" title="Defined at line 231, 232, 233, 234, 235, 236, 241, 243">EscapedChar</a>
   
   <a href="#EscapedChar1_196_21" id="EscapedChar1_212_4" title="Referenced at line 196">EscapedChar1</a> = <span class="cons_Lit">"&lt;\\\\&gt;"</span> [\ \t\r]* [\n]
   
   <span class="layout">//EscapedChar2 = "[" (EscapedBackslashChar2 | EscapedChar)* "]"</span>
   <a href="#EscapedChar2_197_21" id="EscapedChar2_215_4" title="Referenced at line 197">EscapedChar2</a> = <span class="cons_Lit">"["</span> <a href="#EscapedChar2Alt_216_4" id="EscapedChar2Alt_215_23" title="Defined at line 216, 217">EscapedChar2Alt</a>+ <span class="cons_Lit">"]"</span>
   <a href="#EscapedChar2Alt_215_23" id="EscapedChar2Alt_216_4" title="Referenced at line 215">EscapedChar2Alt</a> = <a href="#EscapedBackslashChar2_224_4" id="EscapedBackslashChar2_216_22" title="Defined at line 224">EscapedBackslashChar2</a> 
   <a href="#EscapedChar2Alt_215_23" id="EscapedChar2Alt_217_4" title="Referenced at line 215">EscapedChar2Alt</a> = <a href="#EscapedChar_231_4" id="EscapedChar_217_22" title="Defined at line 231, 232, 233, 234, 235, 236, 241, 243">EscapedChar</a>
   <a href="#EscapedChar2_197_21" id="EscapedChar2_218_4" title="Referenced at line 197">EscapedChar2</a> = <span class="cons_Lit">"[\\\\]"</span> [\ \t\r]* [\n]

    <span class="layout">// double-backslash isn't allowed as sole member of escape placeholder</span>
    <span class="layout">// (would clash with &lt;\\&gt; / [\\] line continuation construct)</span>
    <span class="layout">// so we add follow restrictions to the following symbols:</span>
   <a href="#EscapedBackslashChar1_209_22" id="EscapedBackslashChar1_223_4" title="Referenced at line 209, 254">EscapedBackslashChar1</a> = <span class="cons_Lit">"\\\\"</span>
   <a href="#EscapedBackslashChar2_216_22" id="EscapedBackslashChar2_224_4" title="Referenced at line 216, 255">EscapedBackslashChar2</a> = <span class="cons_Lit">"\\\\"</span>
   
   <a href="#TemplateEscapeQ_253_5" id="TemplateEscapeQ_226_4" title="Referenced at line 253">TemplateEscapeQ</a> = <a href="#TemplateEscapeQAlt_227_4" id="TemplateEscapeQAlt_226_22" title="Defined at line 227, 228">TemplateEscapeQAlt</a>+
   <a href="#TemplateEscapeQAlt_226_22" id="TemplateEscapeQAlt_227_4" title="Referenced at line 226">TemplateEscapeQAlt</a> = <a href="#EscapedChar_231_4" id="EscapedChar_227_25" title="Defined at line 231, 232, 233, 234, 235, 236, 241, 243">EscapedChar</a>
   <a href="#TemplateEscapeQAlt_226_22" id="TemplateEscapeQAlt_228_4" title="Referenced at line 226">TemplateEscapeQAlt</a> = <span class="cons_Lit">"\\\\"</span>
   
   <span class="layout">//escapes allowed in a placeholder-like construct</span>
   <a href="#EscapedChar_210_22" id="EscapedChar_231_4" title="Referenced at line 210, 217, 227">EscapedChar</a> = <span class="cons_Lit">"\\'"</span>
   <a href="#EscapedChar_210_22" id="EscapedChar_232_4" title="Referenced at line 210, 217, 227">EscapedChar</a> = <span class="cons_CiLit">'\\"'</span>
   <a href="#EscapedChar_210_22" id="EscapedChar_233_4" title="Referenced at line 210, 217, 227">EscapedChar</a> =  <span class="cons_Lit">"\\ "</span>
   <a href="#EscapedChar_210_22" id="EscapedChar_234_4" title="Referenced at line 210, 217, 227">EscapedChar</a> =  <span class="cons_Lit">"\\t"</span>
   <a href="#EscapedChar_210_22" id="EscapedChar_235_4" title="Referenced at line 210, 217, 227">EscapedChar</a> =  <span class="cons_Lit">"\\r"</span>
   <a href="#EscapedChar_210_22" id="EscapedChar_236_4" title="Referenced at line 210, 217, 227">EscapedChar</a> =  <span class="cons_Lit">"\\n"</span>
    
    
    
    <a href="#EscapedUnicodeChar_241_19" id="EscapedUnicodeChar_240_5" title="Referenced at line 241, 256">EscapedUnicodeChar</a> = <span class="cons_Lit">"\\u"</span> [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span>]+ 
    <a href="#EscapedChar_210_22" id="EscapedChar_241_5" title="Referenced at line 210, 217, 227">EscapedChar</a> = <a href="#EscapedUnicodeChar_240_5" id="EscapedUnicodeChar_241_19" title="Defined at line 240">EscapedUnicodeChar</a>
    
    <a href="#EscapedChar_210_22" id="EscapedChar_243_5" title="Referenced at line 210, 217, 227">EscapedChar</a>.<span class="cons_Constructor"><span id="WATER_243_17" title="Not referenced">WATER</span></span> = <span class="cons_Lit">"\\"</span> ~[] {<span class="keyword">recover</span>}
    <a href="#EscapedChar1_196_21" id="EscapedChar1_244_5" title="Referenced at line 196">EscapedChar1</a>.<span class="cons_Constructor"><span id="WATER_244_18" title="Not referenced">WATER</span></span> = <span class="cons_Lit">"&lt;"</span> ~[\&gt;]+ <span class="cons_Lit">"&gt;"</span> {<span class="keyword">recover</span>}
    <a href="#EscapedChar2_197_21" id="EscapedChar2_245_5" title="Referenced at line 197">EscapedChar2</a>.<span class="cons_Constructor"><span id="WATER_245_18" title="Not referenced">WATER</span></span> = <span class="cons_Lit">"["</span> ~[\]]+ <span class="cons_Lit">"]"</span> {<span class="keyword">recover</span>}


  <span class="keyword">lexical restrictions</span>
    <a href="#TemplateEscape1_196_3" id="TemplateEscape1_249_5" title="Defined at line 196">TemplateEscape1</a> -/- [\\]
    <a href="#TemplateEscape1_196_3" id="TemplateEscape1_250_5" title="Defined at line 196">TemplateEscape1</a> -/- [\&lt;].[\\\&gt;]
    <a href="#TemplateEscape2_197_3" id="TemplateEscape2_251_5" title="Defined at line 197">TemplateEscape2</a> -/- [\\]
    <a href="#TemplateEscape2_197_3" id="TemplateEscape2_252_5" title="Defined at line 197">TemplateEscape2</a> -/- [\[].[\\\]]
    <a href="#TemplateEscapeQ_226_4" id="TemplateEscapeQ_253_5" title="Defined at line 226">TemplateEscapeQ</a> -/- [\\]
    <a href="#EscapedBackslashChar1_223_4" id="EscapedBackslashChar1_254_5" title="Defined at line 223">EscapedBackslashChar1</a> -/- [\&gt;]
    <a href="#EscapedBackslashChar2_224_4" id="EscapedBackslashChar2_255_5" title="Defined at line 224">EscapedBackslashChar2</a> -/- [\]]
    <a href="#EscapedUnicodeChar_240_5" id="EscapedUnicodeChar_256_5" title="Defined at line 240">EscapedUnicodeChar</a> -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span>]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
