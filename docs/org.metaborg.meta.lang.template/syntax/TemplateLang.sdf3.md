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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../priority/Priority.sdf3#TemplateLang_65_77" id="TemplateLang_7_19" title="Referenced at ../priority/Priority.sdf3 line 3">TemplateLang</a> 
<span class="keyword">imports</span>
  <a href="../sdf2-core/Sdf2.sdf3#sdf2-core/Sdf2_7_21" id="sdf2-core/Sdf2_31_45" title="Defined at ../sdf2-core/Sdf2.sdf3 line 1">sdf2-core/Sdf2</a>
  <a href="../constants/StrCon.sdf3#constants/StrCon_7_23" id="constants/StrCon_48_64" title="Defined at ../constants/StrCon.sdf3 line 1">constants/StrCon</a>
  <a href="../sorts/Sorts.sdf3#sorts/Sorts_7_18" id="sorts/Sorts_67_78" title="Defined at ../sorts/Sorts.sdf3 line 1">sorts/Sorts</a>
  <a href="../symbols/Symbols.sdf3#symbols/Symbols_7_22" id="symbols/Symbols_81_96" title="Defined at ../symbols/Symbols.sdf3 line 1">symbols/Symbols</a>
  <a href="../labels/Labels.sdf3#labels/Labels_7_20" id="labels/Labels_99_112" title="Defined at ../labels/Labels.sdf3 line 1">labels/Labels</a>
  <a href="../constants/IdentifierCon.sdf3#constants/IdentifierCon_7_30" id="constants/IdentifierCon_115_138" title="Defined at ../constants/IdentifierCon.sdf3 line 1">constants/IdentifierCon</a>
  <a href="../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_141_154" title="Defined at ../kernel/Kernel.sdf3 line 1">kernel/Kernel</a>
  <a href="../restrictions/Restrictions.sdf3#restrictions/Restrictions_7_32" id="restrictions/Restrictions_157_182" title="Defined at ../restrictions/Restrictions.sdf3 line 1">restrictions/Restrictions</a>
  <a href="../priority/Priority.sdf3#priority/Priority_7_24" id="priority/Priority_185_202" title="Defined at ../priority/Priority.sdf3 line 1">priority/Priority</a>
  <a href="../basic/Basic.sdf3#basic/Basic_7_18" id="basic/Basic_205_216" title="Defined at ../basic/Basic.sdf3 line 1">basic/Basic</a>
  <a href="../modules/Modules.sdf3#modules/Modules_7_22" id="modules/Modules_219_234" title="Defined at ../modules/Modules.sdf3 line 1">modules/Modules</a>
  <a href="../layout-constraints/Layout-Constraints.sdf3#layout-constraints/Layout-Constraints_7_44" id="layout-constraints/Layout-Constraints_237_274" title="Defined at ../layout-constraints/Layout-Constraints.sdf3 line 1">layout-constraints/Layout-Constraints</a>

<span class="keyword">context-free start-symbols</span>
    <a href="../modules/Modules.sdf3#Module_534_540" id="Module_307_313" title="Defined at ../modules/Modules.sdf3 line 21">Module</a>

<span class="keyword">context-free syntax</span>
<span class="layout">//options section</span>
<span id="Section_353_360" title="Not referenced locally, nor via imports">Section</span>.<span class="cons_Constructor"><span id="TemplateOptions_361_376" title="Not referenced locally, nor via imports">TemplateOptions</span></span> = &lt;
        <span class="cons_String">template</span> <span class="cons_String">options</span> 
        
                &lt;{<a href="#TemplateOption_436_450" id="TemplateOption_406_420" title="Defined at line 28, 30, 37, 39">TemplateOption</a> <span class="cons_Lit">"\n"</span>}*&gt;
        
        &gt; 

<a href="#TemplateOption_406_420" id="TemplateOption_436_450" title="Referenced at line 24">TemplateOption</a>.<span class="cons_Constructor"><span id="Newlines_451_459" title="Not referenced locally, nor via imports">Newlines</span></span> = &lt;<span class="cons_String">newlines</span> <span class="cons_String">:</span> &lt;<a href="#NewlineOptionValue_571_589" id="NewlineOptionValue_475_493" title="Defined at line 32, 33, 34, 35">NewlineOptionValue</a>&gt;&gt;

<a href="#TemplateOption_406_420" id="TemplateOption_497_511" title="Referenced at line 24">TemplateOption</a>.<span class="cons_Constructor"><span id="KeywordAttributes_512_529" title="Not referenced locally, nor via imports">KeywordAttributes</span></span> = &lt;&lt;<a href="../sorts/Sorts.sdf3#SymbolDef_418_427" id="SymbolDef_534_543" title="Defined at ../sorts/Sorts.sdf3 line 17, 18, 19, 20">SymbolDef</a>&gt; <span class="cons_String">=</span> <span class="cons_String">keyword</span> &lt;<a href="../kernel/Kernel.sdf3#Attributes_293_303" id="Attributes_556_566" title="Defined at ../kernel/Kernel.sdf3 line 15, 16">Attributes</a>&gt;&gt;
 
<a href="#NewlineOptionValue_475_493" id="NewlineOptionValue_571_589" title="Referenced at line 28">NewlineOptionValue</a>.<span class="cons_Constructor"><span id="None_590_594" title="Not referenced locally, nor via imports">None</span></span> = &lt;<span class="cons_String">none</span>&gt;
<a href="#NewlineOptionValue_475_493" id="NewlineOptionValue_604_622" title="Referenced at line 28">NewlineOptionValue</a>.<span class="cons_Constructor"><span id="Leading_623_630" title="Not referenced locally, nor via imports">Leading</span></span> = &lt;<span class="cons_String">leading</span>&gt;
<a href="#NewlineOptionValue_475_493" id="NewlineOptionValue_643_661" title="Referenced at line 28">NewlineOptionValue</a>.<span class="cons_Constructor"><span id="Trailing_662_670" title="Not referenced locally, nor via imports">Trailing</span></span> = &lt;<span class="cons_String">trailing</span>&gt;
<a href="#NewlineOptionValue_475_493" id="NewlineOptionValue_684_702" title="Referenced at line 28">NewlineOptionValue</a>.<span class="cons_Constructor"><span id="Separating_703_713" title="Not referenced locally, nor via imports">Separating</span></span> = &lt;<span class="cons_String">separating</span>&gt;

<a href="#TemplateOption_406_420" id="TemplateOption_730_744" title="Referenced at line 24">TemplateOption</a>.<span class="cons_Constructor"><span id="KeywordFollowRestriction_745_769" title="Not referenced locally, nor via imports">KeywordFollowRestriction</span></span> = &lt;<span class="cons_String">keyword</span> <span class="cons_String">-/-</span> &lt;<a href="../restrictions/Restrictions.sdf3#Lookaheads_240_250" id="Lookaheads_786_796" title="Defined at ../restrictions/Restrictions.sdf3 line 13, 15, 16, 17">Lookaheads</a>&gt;&gt;

<a href="#TemplateOption_406_420" id="TemplateOption_800_814" title="Referenced at line 24">TemplateOption</a>.<span class="cons_Constructor"><span id="Tokenize_815_823" title="Not referenced locally, nor via imports">Tokenize</span></span> = &lt;<span class="cons_String">tokenize</span> <span class="cons_String">:</span> &lt;<a href="../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_839_845" title="Defined at ../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;

<span class="keyword">context-free syntax</span>
<span class="layout">//references to productions using sort.cons notation in priority specification</span>
<span id="Group_948_953" title="Not referenced locally, nor via imports">Group</span>.<span class="cons_Constructor"><span id="SimpleRefGroup_954_968" title="Not referenced locally, nor via imports">SimpleRefGroup</span></span> = &lt;&lt;<a href="#SortConsRef_1105_1116" id="SortConsRef_973_984" title="Defined at line 48">SortConsRef</a>&gt;&gt;
<span id="Group_987_992" title="Not referenced locally, nor via imports">Group</span>.<span class="cons_Constructor"><span id="ProdsRefGroup_993_1006" title="Not referenced locally, nor via imports">ProdsRefGroup</span></span> = &lt;<span class="cons_String">{</span>&lt;{<a href="#SortConsRef_1105_1116" id="SortConsRef_1013_1024" title="Defined at line 48">SortConsRef</a> <span class="cons_Lit">"\n"</span>}+&gt;<span class="cons_String">}</span>&gt;
<span id="Group_1035_1040" title="Not referenced locally, nor via imports">Group</span>.<span class="cons_Constructor"><span id="AssocRefGroup_1041_1054" title="Not referenced locally, nor via imports">AssocRefGroup</span></span> = &lt;
        <span class="cons_String">{</span>&lt;<a href="../priority/Priority.sdf3#Associativity_101_114" id="Associativity_1062_1075" title="Defined at ../priority/Priority.sdf3 line 7, 8, 9, 10, 11">Associativity</a>&gt; <span class="cons_String">:</span>
                &lt;{<a href="#SortConsRef_1105_1116" id="SortConsRef_1083_1094" title="Defined at line 48">SortConsRef</a> <span class="cons_Lit">"\n"</span>}+&gt;<span class="cons_String">}</span>&gt;
<a href="#SortConsRef_1083_1094" id="SortConsRef_1105_1116" title="Referenced at line 47">SortConsRef</a>.<span class="cons_Constructor"><span id="SortConsRef_1117_1128" title="Not referenced locally, nor via imports">SortConsRef</span></span> = &lt;&lt;<a href="../labels/Labels.sdf3#Symbol_178_184" id="Symbol_1133_1139" title="Defined at ../labels/Labels.sdf3 line 11">Symbol</a>&gt;<span class="cons_String">.</span>&lt;<a href="#Constructor_2096_2107" id="Constructor_1142_1153" title="Defined at line 95">Constructor</a>&gt;&gt;

<span class="keyword">context-free syntax</span> 
<span class="layout">//grammars</span>
<span id="Section_1189_1196" title="Not referenced locally, nor via imports">Section</span>.<span class="cons_Constructor"><span id="TemplateSection_1197_1212" title="Not referenced locally, nor via imports">TemplateSection</span></span> = &lt;
        <span class="cons_String">templates</span> 
        
                &lt;{<a href="#TemplateProduction_1887_1905" id="TemplateProduction_1235_1253" title="Defined at line 90, 93">TemplateProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;
        
        &gt; {<span class="keyword">deprecated</span>("Use context-free syntax section instead")}

<span id="Grammar_1324_1331" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="LexicalSyntax_1332_1345" title="Not referenced locally, nor via imports">LexicalSyntax</span></span> = &lt;
        <span class="cons_String">lexical</span> <span class="cons_String">syntax</span> 
        
                &lt;{<a href="#SdfProduction_1702_1715" id="SdfProduction_1373_1386" title="Defined at line 85, 86">SdfProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;
        
        &gt; {<span class="keyword">prefer</span>}
        
<span id="Grammar_1411_1418" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="ContextFreeSyntax_1419_1436" title="Not referenced locally, nor via imports">ContextFreeSyntax</span></span> = &lt;
        <span class="cons_String">context-free</span> <span class="cons_String">syntax</span> 
        
                &lt;{<a href="#GeneralProduction_1583_1600" id="GeneralProduction_1469_1486" title="Defined at line 80, 81">GeneralProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;
        
        &gt; {<span class="keyword">prefer</span>}
        
<span id="Grammar_1511_1518" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="Kernel_1519_1525" title="Not referenced locally, nor via imports">Kernel</span></span> = &lt;
        <span class="cons_String">syntax</span> 
        
                &lt;{<a href="#SdfProduction_1702_1715" id="SdfProduction_1545_1558" title="Defined at line 85, 86">SdfProduction</a> <span class="cons_Lit">"\n"</span>}*&gt;
        
        &gt; {<span class="keyword">prefer</span>}
        
<a href="#GeneralProduction_1469_1486" id="GeneralProduction_1583_1600" title="Referenced at line 69">GeneralProduction</a> = &lt;&lt;<a href="#SdfProduction_1702_1715" id="SdfProduction_1605_1618" title="Defined at line 85, 86">SdfProduction</a>&gt;&gt;
<a href="#GeneralProduction_1469_1486" id="GeneralProduction_1621_1638" title="Referenced at line 69">GeneralProduction</a> = &lt;&lt;<a href="#TemplateProduction_1887_1905" id="TemplateProduction_1643_1661" title="Defined at line 90, 93">TemplateProduction</a>&gt;&gt; {<span class="keyword">prefer</span>}


<span class="layout">// syntactic sugar for SDF</span>
<a href="#SdfProduction_1605_1618" id="SdfProduction_1702_1715" title="Referenced at line 80; ../basic/Basic.sdf3 line 44; ../priority/Priority.sdf3 line 26">SdfProduction</a>.<span class="cons_Constructor"><span id="SdfProduction_1716_1729" title="Not referenced locally, nor via imports">SdfProduction</span></span> = &lt;&lt;<a href="../sorts/Sorts.sdf3#SymbolDef_418_427" id="SymbolDef_1734_1743" title="Defined at ../sorts/Sorts.sdf3 line 17, 18, 19, 20">SymbolDef</a>&gt; <span class="cons_String">=</span> &lt;<a href="#RHS_1840_1843" id="RHS_1748_1751" title="Defined at line 87">RHS</a>&gt; &lt;<a href="../kernel/Kernel.sdf3#Attributes_293_303" id="Attributes_1754_1764" title="Defined at ../kernel/Kernel.sdf3 line 15, 16">Attributes</a>&gt;&gt; 
<a href="#SdfProduction_1605_1618" id="SdfProduction_1768_1781" title="Referenced at line 80; ../basic/Basic.sdf3 line 44; ../priority/Priority.sdf3 line 26">SdfProduction</a>.<span class="cons_Constructor"><span id="SdfProductionWithCons_1782_1803" title="Not referenced locally, nor via imports">SdfProductionWithCons</span></span> = &lt;&lt;<a href="#SortCons_2133_2141" id="SortCons_1808_1816" title="Defined at line 97">SortCons</a>&gt; <span class="cons_String">=</span> &lt;<a href="#RHS_1840_1843" id="RHS_1821_1824" title="Defined at line 87">RHS</a>&gt; &lt;<a href="../kernel/Kernel.sdf3#Attributes_293_303" id="Attributes_1827_1837" title="Defined at ../kernel/Kernel.sdf3 line 15, 16">Attributes</a>&gt;&gt;
<a href="#RHS_1821_1824" id="RHS_1840_1843" title="Referenced at line 86">RHS</a>.<span class="cons_Constructor"><span id="Rhs_1844_1847" title="Not referenced locally, nor via imports">Rhs</span></span> = &lt;&lt;<a href="../sdf2-core/Sdf2.sdf3#Symbols_1648_1655" id="Symbols_1852_1859" title="Defined at ../sdf2-core/Sdf2.sdf3 line 59">Symbols</a>&gt;&gt;

<span class="layout">// template productions</span>
<a href="#TemplateProduction_1643_1661" id="TemplateProduction_1887_1905" title="Referenced at line 81">TemplateProduction</a>.<span class="cons_Constructor"><span id="TemplateProduction_1906_1924" title="Not referenced locally, nor via imports">TemplateProduction</span></span> = &lt;&lt;<a href="../sorts/Sorts.sdf3#SymbolDef_418_427" id="SymbolDef_1929_1938" title="Defined at ../sorts/Sorts.sdf3 line 17, 18, 19, 20">SymbolDef</a>&gt; <span class="cons_String">=</span> &lt;<a href="#Template_2903_2911" id="Template_1943_1951" title="Defined at line 125, 126, 132, 133">Template</a>&gt; &lt;<a href="../kernel/Kernel.sdf3#Attributes_293_303" id="Attributes_1954_1964" title="Defined at ../kernel/Kernel.sdf3 line 15, 16">Attributes</a>&gt;&gt;

<span class="layout">// template productions Sort.Cons = ...</span>
<a href="#TemplateProduction_1643_1661" id="TemplateProduction_2008_2026" title="Referenced at line 81">TemplateProduction</a>.<span class="cons_Constructor"><span id="TemplateProductionWithCons_2027_2053" title="Not referenced locally, nor via imports">TemplateProductionWithCons</span></span> = &lt;&lt;<a href="#SortCons_2133_2141" id="SortCons_2058_2066" title="Defined at line 97">SortCons</a>&gt; <span class="cons_String">=</span> &lt;<a href="#Template_2903_2911" id="Template_2071_2079" title="Defined at line 125, 126, 132, 133">Template</a>&gt; &lt;<a href="../kernel/Kernel.sdf3#Attributes_293_303" id="Attributes_2082_2092" title="Defined at ../kernel/Kernel.sdf3 line 15, 16">Attributes</a>&gt;&gt;

<a href="#Constructor_2167_2178" id="Constructor_2096_2107" title="Referenced at line 97">Constructor</a>.<span class="cons_Constructor"><span id="Constructor_2108_2119" title="Not referenced locally, nor via imports">Constructor</span></span> = &lt;&lt;<a href="../constants/IdentifierCon.sdf3#IdCon_114_119" id="IdCon_2124_2129" title="Defined at ../constants/IdentifierCon.sdf3 line 6">IdCon</a>&gt;&gt;

<a href="#SortCons_2058_2066" id="SortCons_2133_2141" title="Referenced at line 93">SortCons</a>.<span class="cons_Constructor"><span id="SortCons_2142_2150" title="Not referenced locally, nor via imports">SortCons</span></span> = &lt;&lt;<a href="../sorts/Sorts.sdf3#SymbolDef_418_427" id="SymbolDef_2155_2164" title="Defined at ../sorts/Sorts.sdf3 line 17, 18, 19, 20">SymbolDef</a>&gt;<span class="cons_String">.</span>&lt;<a href="#Constructor_2096_2107" id="Constructor_2167_2178" title="Defined at line 95">Constructor</a>&gt;&gt;

 
<span class="layout">// placeholders</span>
<a href="#TemplatePart1_3123_3136" id="TemplatePart1_2200_2213" title="Referenced at line 127">TemplatePart1</a>.<span class="cons_Constructor"><span id="Angled_2214_2220" title="Not referenced locally, nor via imports">Angled</span></span>       = [<span class="cons_String">&lt;</span>[<a href="#Placeholder_2363_2374" id="Placeholder_2232_2243" title="Defined at line 106">Placeholder</a>]<span class="cons_String">&gt;</span>]
<a href="#TemplatePart1_3123_3136" id="TemplatePart1_2247_2260" title="Referenced at line 127">TemplatePart1</a>.<span class="cons_Constructor"><span id="BreakAngled_2261_2272" title="Not referenced locally, nor via imports">BreakAngled</span></span>  = [<span class="cons_String">&lt;&gt;</span>]
<a href="#TemplatePart2_3522_3535" id="TemplatePart2_2281_2294" title="Referenced at line 134">TemplatePart2</a>.<span class="cons_Constructor"><span id="Squared_2295_2302" title="Not referenced locally, nor via imports">Squared</span></span>      = &lt;<span class="cons_String">[</span>&lt;<a href="#Placeholder_2363_2374" id="Placeholder_2313_2324" title="Defined at line 106">Placeholder</a>&gt;<span class="cons_String">]</span>&gt;
<a href="#TemplatePart2_3522_3535" id="TemplatePart2_2328_2341" title="Referenced at line 134">TemplatePart2</a>.<span class="cons_Constructor"><span id="BreakSquared_2342_2354" title="Not referenced locally, nor via imports">BreakSquared</span></span> = &lt;<span class="cons_String">[]</span>&gt;

<a href="#Placeholder_2313_2324" id="Placeholder_2363_2374" title="Referenced at line 103">Placeholder</a>.<span class="cons_Constructor"><span id="Placeholder_2375_2386" title="Not referenced locally, nor via imports">Placeholder</span></span> = &lt;&lt;<a href="../labels/Labels.sdf3#Symbol_178_184" id="Symbol_2391_2397" title="Defined at ../labels/Labels.sdf3 line 11">Symbol</a>&gt;&lt;<a href="#PlaceholderOptions_2423_2441" id="PlaceholderOptions_2399_2417" title="Defined at line 110, 111">PlaceholderOptions</a>&gt;&gt;



<a href="#PlaceholderOptions_2399_2417" id="PlaceholderOptions_2423_2441" title="Referenced at line 106">PlaceholderOptions</a>.<span class="cons_Constructor"><span id="NoOptions_2442_2451" title="Not referenced locally, nor via imports">NoOptions</span></span> = &lt;&gt;
<a href="#PlaceholderOptions_2399_2417" id="PlaceholderOptions_2457_2475" title="Referenced at line 106">PlaceholderOptions</a>.<span class="cons_Constructor"><span id="Options_2476_2483" title="Not referenced locally, nor via imports">Options</span></span> = &lt;<span class="cons_String">;</span>&lt;{<a href="#PlaceholderOption_2518_2535" id="PlaceholderOption_2490_2507" title="Defined at line 113, 114, 115, 116, 117, 119, 120">PlaceholderOption</a> <span class="cons_Lit">", "</span>}+&gt;&gt;

<a href="#PlaceholderOption_2490_2507" id="PlaceholderOption_2518_2535" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Hide_2536_2540" title="Not referenced locally, nor via imports">Hide</span></span> = &lt;<span class="cons_String">hide</span>&gt;
<a href="#PlaceholderOption_2490_2507" id="PlaceholderOption_2550_2567" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Wrap_2568_2572" title="Not referenced locally, nor via imports">Wrap</span></span> = &lt;<span class="cons_String">wrap</span>&gt;
<a href="#PlaceholderOption_2490_2507" id="PlaceholderOption_2582_2599" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Anchor_2600_2606" title="Not referenced locally, nor via imports">Anchor</span></span> = &lt;<span class="cons_String">anchor</span>&gt;
<a href="#PlaceholderOption_2490_2507" id="PlaceholderOption_2618_2635" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Floating_2636_2644" title="Not referenced locally, nor via imports">Floating</span></span> = &lt;<span class="cons_String">float</span>&gt;
<a href="#PlaceholderOption_2490_2507" id="PlaceholderOption_2655_2672" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="CompCursor_2673_2683" title="Not referenced locally, nor via imports">CompCursor</span></span> = &lt;<span class="cons_String">cursor</span>&gt;
<span class="layout">//mark as deprecated</span>
<a href="#PlaceholderOption_2490_2507" id="PlaceholderOption_2716_2733" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Separator_2734_2743" title="Not referenced locally, nor via imports">Separator</span></span> = &lt;<span class="cons_String">separator=</span>&lt;<a href="../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_2758_2764" title="Defined at ../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt; {<span class="keyword">deprecated</span>("Use list with separator symbol instead: {S \"separator\"}*")}
<a href="#PlaceholderOption_2490_2507" id="PlaceholderOption_2842_2859" title="Referenced at line 111">PlaceholderOption</a>.<span class="cons_Constructor"><span id="Text_2860_2864" title="Not referenced locally, nor via imports">Text</span></span> = &lt;<span class="cons_String">text=</span>&lt;<a href="../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_2874_2880" title="Defined at ../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;
  
  <span class="keyword">syntax</span>
  
  
  <a href="#Template_2071_2079" id="Template_2903_2911" title="Referenced at line 93">Template</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Template_2915_2923" title="Not referenced locally, nor via imports">Template</span></span> = <span class="cons_Lit">"&lt;"</span> {<a href="#TemplateLine1_3099_3112" id="TemplateLine1_2931_2944" title="Defined at line 127">TemplateLine1</a><span class="keyword">-CF</span> <span class="cons_Lit">"\n"</span>}+ <span class="cons_Lit">"&gt;"</span>
  <a href="#Template_2071_2079" id="Template_2961_2969" title="Referenced at line 93">Template</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="TemplateDeprecated_2973_2991" title="Not referenced locally, nor via imports">TemplateDeprecated</span></span> =  <span class="cons_Lit">"&lt;&lt;"</span> {<a href="#TemplateLine1_3099_3112" id="TemplateLine1_3001_3014" title="Defined at line 127">TemplateLine1</a><span class="keyword">-CF</span> <span class="cons_Lit">"\n"</span>}+ <span class="cons_Lit">"&gt;&gt;"</span> {<span class="keyword">avoid</span>, <span class="keyword">deprecated</span>("Use single brackets to delimit the template")}
  <a href="#TemplateLine1_3001_3014" id="TemplateLine1_3099_3112" title="Referenced at line 126">TemplateLine1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Line_3116_3120" title="Not referenced locally, nor via imports">Line</span></span> = <a href="#TemplatePart1_2200_2213" id="TemplatePart1_3123_3136" title="Defined at line 101, 102, 128, 129, 130">TemplatePart1</a><span class="keyword">-CF</span>* 
  <a href="#TemplatePart1_3123_3136" id="TemplatePart1_3144_3157" title="Referenced at line 127">TemplatePart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="String_3161_3167" title="Not referenced locally, nor via imports">String</span></span> = <a href="#TemplateString1_3923_3938" id="TemplateString1_3170_3185" title="Defined at line 162">TemplateString1</a><span class="keyword">-LEX</span>
  <a href="#TemplatePart1_3123_3136" id="TemplatePart1_3192_3205" title="Referenced at line 127">TemplatePart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Escape_3209_3215" title="Not referenced locally, nor via imports">Escape</span></span> = <a href="#TemplateEscape1_4851_4866" id="TemplateEscape1_3218_3233" title="Defined at line 196">TemplateEscape1</a><span class="keyword">-LEX</span>
  <a href="#TemplatePart1_3123_3136" id="TemplatePart1_3240_3253" title="Referenced at line 127">TemplatePart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Layout_3257_3263" title="Not referenced locally, nor via imports">Layout</span></span> = <a href="#TemplateLayout_3888_3902" id="TemplateLayout_3266_3280" title="Defined at line 160">TemplateLayout</a><span class="keyword">-LEX</span> 
  
  <a href="#Template_2071_2079" id="Template_3291_3299" title="Referenced at line 93">Template</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="TemplateSquare_3303_3317" title="Not referenced locally, nor via imports">TemplateSquare</span></span> = <span class="cons_Lit">"["</span> {<a href="#TemplateLine2_3498_3511" id="TemplateLine2_3325_3338" title="Defined at line 134">TemplateLine2</a><span class="keyword">-CF</span> <span class="cons_Lit">"\n"</span>}+ <span class="cons_Lit">"]"</span>
  <a href="#Template_2071_2079" id="Template_3355_3363" title="Referenced at line 93">Template</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="TemplateSquareDeprecated_3367_3391" title="Not referenced locally, nor via imports">TemplateSquareDeprecated</span></span> = <span class="cons_Lit">"[["</span> {<a href="#TemplateLine2_3498_3511" id="TemplateLine2_3400_3413" title="Defined at line 134">TemplateLine2</a><span class="keyword">-CF</span> <span class="cons_Lit">"\n"</span>}+ <span class="cons_Lit">"]]"</span> {<span class="keyword">avoid</span>, <span class="keyword">deprecated</span>("Use single brackets to delimit the template")}
  <a href="#TemplateLine2_3400_3413" id="TemplateLine2_3498_3511" title="Referenced at line 133">TemplateLine2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Line_3515_3519" title="Not referenced locally, nor via imports">Line</span></span> = <a href="#TemplatePart2_2281_2294" id="TemplatePart2_3522_3535" title="Defined at line 103, 104, 136, 138, 139">TemplatePart2</a><span class="keyword">-CF</span>* 
  
  <a href="#TemplatePart2_3522_3535" id="TemplatePart2_3546_3559" title="Referenced at line 134">TemplatePart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="String_3563_3569" title="Not referenced locally, nor via imports">String</span></span> =  <a href="#TemplateString2_3965_3980" id="TemplateString2_3573_3588" title="Defined at line 163">TemplateString2</a><span class="keyword">-LEX</span> 
  
  <a href="#TemplatePart2_3522_3535" id="TemplatePart2_3599_3612" title="Referenced at line 134">TemplatePart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Escape_3616_3622" title="Not referenced locally, nor via imports">Escape</span></span> = <a href="#TemplateEscape2_4885_4900" id="TemplateEscape2_3625_3640" title="Defined at line 197">TemplateEscape2</a><span class="keyword">-LEX</span>
  <a href="#TemplatePart2_3522_3535" id="TemplatePart2_3647_3660" title="Referenced at line 134">TemplatePart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Layout_3664_3670" title="Not referenced locally, nor via imports">Layout</span></span> = <a href="#TemplateLayout_3888_3902" id="TemplateLayout_3673_3687" title="Defined at line 160">TemplateLayout</a><span class="keyword">-LEX</span>
  
  
  <span class="keyword">lexical syntax</span>
  
          <a href="#EOL_3839_3842" id="EOL_3721_3724" title="Referenced at line 155">EOL</a> = <a href="#LF_3777_3779" id="LF_3727_3729" title="Defined at line 149">LF</a>
          <a href="#EOL_3839_3842" id="EOL_3733_3736" title="Referenced at line 155">EOL</a> = <a href="#CR_3764_3766" id="CR_3739_3741" title="Defined at line 148">CR</a>
          <a href="#EOL_3839_3842" id="EOL_3745_3748" title="Referenced at line 155">EOL</a> = <a href="#CR_3764_3766" id="CR_3751_3753" title="Defined at line 148">CR</a> <a href="#LF_3777_3779" id="LF_3754_3756" title="Defined at line 149">LF</a>
          
          <a href="#CR_3751_3753" id="CR_3764_3766" title="Referenced at line 146">CR</a> = [\r]
          <a href="#LF_3754_3756" id="LF_3777_3779" title="Referenced at line 146">LF</a> = [\n]
          
    <span class="cons_Lit">"\n"</span> = <a href="#EOL_3721_3724" id="EOL_3802_3805" title="Defined at line 144, 145, 146">EOL</a>
  
  <span class="keyword">lexical restrictions</span>
  
    <a href="#EOL_3721_3724" id="EOL_3839_3842" title="Defined at line 144, 145, 146">EOL</a> -/- [\n]
      
  
  <span class="keyword">lexical syntax</span>
    
    <a href="#TemplateLayout_4287_4301" id="TemplateLayout_3888_3902" title="Referenced at line 174">TemplateLayout</a> =  [\ \t]+
    
    <a href="#TemplateString1_4542_4557" id="TemplateString1_3923_3938" title="Referenced at line 182">TemplateString1</a> = <a href="#TemplateString1Alt_4043_4061" id="TemplateString1Alt_3941_3959" title="Defined at line 165">TemplateString1Alt</a>+
    <a href="#TemplateString2_4581_4596" id="TemplateString2_3965_3980" title="Referenced at line 183">TemplateString2</a> = <a href="#TemplateString2Alt_4086_4104" id="TemplateString2Alt_3983_4001" title="Defined at line 166, 167">TemplateString2Alt</a>+
        <a href="#TemplateStringQ_4430_4445" id="TemplateStringQ_4004_4019" title="Referenced at line 179">TemplateStringQ</a> =  ~[\\\"\ \t]+   
    <a href="#TemplateString1Alt_3941_3959" id="TemplateString1Alt_4043_4061" title="Referenced at line 162">TemplateString1Alt</a> = ~[\\\&lt;\&gt;\ \t\r\n]
    <a href="#TemplateString2Alt_3983_4001" id="TemplateString2Alt_4086_4104" title="Referenced at line 163">TemplateString2Alt</a> = ~[\\\[\]\ \t\r\n] 
    <a href="#TemplateString2Alt_3983_4001" id="TemplateString2Alt_4130_4148" title="Referenced at line 163">TemplateString2Alt</a> = <a href="#Backslash_4163_4172" id="Backslash_4151_4160" title="Defined at line 169">Backslash</a>

        <a href="#Backslash_4621_4630" id="Backslash_4163_4172" title="Referenced at line 185">Backslash</a> = [\\] 
    <span class="layout">// [\\] -&gt; Backslash1</span>
    <span class="layout">// [\\] -&gt; Backslash2      =&gt; [\\] -&gt; Backslash</span>

  <span class="keyword">lexical restrictions</span>
    <a href="#TemplateLayout_3888_3902" id="TemplateLayout_4287_4301" title="Defined at line 160">TemplateLayout</a> -/- [\ \t]

    <span class="layout">%% must be followed by:</span>
    <a href="#TemplateString1_3923_3938" id="TemplateString1_4346_4361" title="Defined at line 162">TemplateString1</a> -/- ~[\\\&lt;\&gt;\ \t\r\n]
    <a href="#TemplateString2_3965_3980" id="TemplateString2_4388_4403" title="Defined at line 163">TemplateString2</a> -/- ~[\\\[\]\ \t\r\n]
    <a href="#TemplateStringQ_4004_4019" id="TemplateStringQ_4430_4445" title="Defined at line 164">TemplateStringQ</a> -/- ~[\\\"\ \t]

    <span class="layout">%% if followed by a backslash, then the backslash must be followed by:</span>
    <a href="#TemplateString1_3923_3938" id="TemplateString1_4542_4557" title="Defined at line 162">TemplateString1</a> -/- [\\].~[\&lt;\&gt;\\]
    <a href="#TemplateString2_3965_3980" id="TemplateString2_4581_4596" title="Defined at line 163">TemplateString2</a> -/- [\\].~[\[\]\\]

    <a href="#Backslash_4163_4172" id="Backslash_4621_4630" title="Defined at line 169">Backslash</a> -/- [\&lt;\&gt;\\]

  <span class="keyword">template options</span>
  
          <span class="keyword">tokenize</span> : "="  

  <span class="keyword">lexical syntax</span>
  <span class="layout">//production for ContenteCompletion</span>
  <span id="CONTENTCOMPLETE_4745_4760" title="Not referenced locally, nor via imports">CONTENTCOMPLETE</span> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>]* <span class="cons_Lit">"CONTENTCOMPLETE"</span> [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+  {<span class="keyword">avoid</span>}
  
  <span class="layout">//combine sequences of escaped chars</span>
  <a href="#TemplateEscape1_6465_6480" id="TemplateEscape1_4851_4866" title="Referenced at line 250">TemplateEscape1</a> = <a href="#EscapedChar1_4972_4984" id="EscapedChar1_4869_4881" title="Defined at line 200, 201, 202, 208, 212, 244">EscapedChar1</a>+
  <a href="#TemplateEscape2_6530_6545" id="TemplateEscape2_4885_4900" title="Referenced at line 252">TemplateEscape2</a> = <a href="#EscapedChar2_5042_5054" id="EscapedChar2_4903_4915" title="Defined at line 203, 204, 205, 215, 218, 245">EscapedChar2</a>+
  
  <span class="layout">//this are the escapes which StringTemplate has</span>
  <a href="#EscapedChar1_4869_4881" id="EscapedChar1_4972_4984" title="Referenced at line 196">EscapedChar1</a> = <span class="cons_Lit">"\\&lt;"</span>
  <a href="#EscapedChar1_4869_4881" id="EscapedChar1_4995_5007" title="Referenced at line 196">EscapedChar1</a> = <span class="cons_Lit">"\\&gt;"</span>
  <a href="#EscapedChar1_4869_4881" id="EscapedChar1_5018_5030" title="Referenced at line 196">EscapedChar1</a> = <span class="cons_Lit">"\\\\"</span>
  <a href="#EscapedChar2_4903_4915" id="EscapedChar2_5042_5054" title="Referenced at line 197">EscapedChar2</a> = <span class="cons_Lit">"\\["</span>
  <a href="#EscapedChar2_4903_4915" id="EscapedChar2_5065_5077" title="Referenced at line 197">EscapedChar2</a> = <span class="cons_Lit">"\\]"</span>
  <a href="#EscapedChar2_4903_4915" id="EscapedChar2_5088_5100" title="Referenced at line 197">EscapedChar2</a> = <span class="cons_Lit">"\\\\"</span>
  
   <span class="layout">//EscapedChar1 = "&lt;" (EscapedBackslashChar1 | EscapedChar)* "&gt;"</span>
   <a href="#EscapedChar1_4869_4881" id="EscapedChar1_5183_5195" title="Referenced at line 196">EscapedChar1</a> = <span class="cons_Lit">"&lt;"</span> <a href="#EscapedChar1Alt_5226_5241" id="EscapedChar1Alt_5202_5217" title="Defined at line 209, 210">EscapedChar1Alt</a>+ <span class="cons_Lit">"&gt;"</span>
   <a href="#EscapedChar1Alt_5202_5217" id="EscapedChar1Alt_5226_5241" title="Referenced at line 208">EscapedChar1Alt</a> = <a href="#EscapedBackslashChar1_5786_5807" id="EscapedBackslashChar1_5244_5265" title="Defined at line 223">EscapedBackslashChar1</a>
   <a href="#EscapedChar1Alt_5202_5217" id="EscapedChar1Alt_5269_5284" title="Referenced at line 208">EscapedChar1Alt</a> = <a href="#EscapedChar_6023_6034" id="EscapedChar_5287_5298" title="Defined at line 231, 232, 233, 234, 235, 236, 241, 243">EscapedChar</a>
   
   <a href="#EscapedChar1_4869_4881" id="EscapedChar1_5306_5318" title="Referenced at line 196">EscapedChar1</a> = <span class="cons_Lit">"&lt;\\\\&gt;"</span> [\ \t\r]* [\n]
   
   <span class="layout">//EscapedChar2 = "[" (EscapedBackslashChar2 | EscapedChar)* "]"</span>
   <a href="#EscapedChar2_4903_4915" id="EscapedChar2_5419_5431" title="Referenced at line 197">EscapedChar2</a> = <span class="cons_Lit">"["</span> <a href="#EscapedChar2Alt_5462_5477" id="EscapedChar2Alt_5438_5453" title="Defined at line 216, 217">EscapedChar2Alt</a>+ <span class="cons_Lit">"]"</span>
   <a href="#EscapedChar2Alt_5438_5453" id="EscapedChar2Alt_5462_5477" title="Referenced at line 215">EscapedChar2Alt</a> = <a href="#EscapedBackslashChar2_5820_5841" id="EscapedBackslashChar2_5480_5501" title="Defined at line 224">EscapedBackslashChar2</a> 
   <a href="#EscapedChar2Alt_5438_5453" id="EscapedChar2Alt_5506_5521" title="Referenced at line 215">EscapedChar2Alt</a> = <a href="#EscapedChar_6023_6034" id="EscapedChar_5524_5535" title="Defined at line 231, 232, 233, 234, 235, 236, 241, 243">EscapedChar</a>
   <a href="#EscapedChar2_4903_4915" id="EscapedChar2_5539_5551" title="Referenced at line 197">EscapedChar2</a> = <span class="cons_Lit">"[\\\\]"</span> [\ \t\r]* [\n]

    <span class="layout">// double-backslash isn't allowed as sole member of escape placeholder</span>
    <span class="layout">// (would clash with &lt;\\&gt; / [\\] line continuation construct)</span>
    <span class="layout">// so we add follow restrictions to the following symbols:</span>
   <a href="#EscapedBackslashChar1_6595_6616" id="EscapedBackslashChar1_5786_5807" title="Referenced at line 254">EscapedBackslashChar1</a> = <span class="cons_Lit">"\\\\"</span>
   <a href="#EscapedBackslashChar2_6630_6651" id="EscapedBackslashChar2_5820_5841" title="Referenced at line 255">EscapedBackslashChar2</a> = <span class="cons_Lit">"\\\\"</span>
   
   <a href="#TemplateEscapeQ_6566_6581" id="TemplateEscapeQ_5858_5873" title="Referenced at line 253">TemplateEscapeQ</a> = <a href="#TemplateEscapeQAlt_5899_5917" id="TemplateEscapeQAlt_5876_5894" title="Defined at line 227, 228">TemplateEscapeQAlt</a>+
   <a href="#TemplateEscapeQAlt_5876_5894" id="TemplateEscapeQAlt_5899_5917" title="Referenced at line 226">TemplateEscapeQAlt</a> = <a href="#EscapedChar_6023_6034" id="EscapedChar_5920_5931" title="Defined at line 231, 232, 233, 234, 235, 236, 241, 243">EscapedChar</a>
   <a href="#TemplateEscapeQAlt_5876_5894" id="TemplateEscapeQAlt_5935_5953" title="Referenced at line 226">TemplateEscapeQAlt</a> = <span class="cons_Lit">"\\\\"</span>
   
   <span class="layout">//escapes allowed in a placeholder-like construct</span>
   <a href="#EscapedChar_5920_5931" id="EscapedChar_6023_6034" title="Referenced at line 227">EscapedChar</a> = <span class="cons_Lit">"\\'"</span>
   <a href="#EscapedChar_5920_5931" id="EscapedChar_6046_6057" title="Referenced at line 227">EscapedChar</a> = <span class="cons_CiLit">'\\"'</span>
   <a href="#EscapedChar_5920_5931" id="EscapedChar_6069_6080" title="Referenced at line 227">EscapedChar</a> =  <span class="cons_Lit">"\\ "</span>
   <a href="#EscapedChar_5920_5931" id="EscapedChar_6093_6104" title="Referenced at line 227">EscapedChar</a> =  <span class="cons_Lit">"\\t"</span>
   <a href="#EscapedChar_5920_5931" id="EscapedChar_6117_6128" title="Referenced at line 227">EscapedChar</a> =  <span class="cons_Lit">"\\r"</span>
   <a href="#EscapedChar_5920_5931" id="EscapedChar_6141_6152" title="Referenced at line 227">EscapedChar</a> =  <span class="cons_Lit">"\\n"</span>
    
    
    
    <a href="#EscapedUnicodeChar_6665_6683" id="EscapedUnicodeChar_6181_6199" title="Referenced at line 256">EscapedUnicodeChar</a> = <span class="cons_Lit">"\\u"</span> [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span>]+ 
    <a href="#EscapedChar_5920_5931" id="EscapedChar_6226_6237" title="Referenced at line 227">EscapedChar</a> = <a href="#EscapedUnicodeChar_6181_6199" id="EscapedUnicodeChar_6240_6258" title="Defined at line 240">EscapedUnicodeChar</a>
    
    <a href="#EscapedChar_5920_5931" id="EscapedChar_6268_6279" title="Referenced at line 227">EscapedChar</a>.<span class="cons_Constructor"><span id="WATER_6280_6285" title="Not referenced locally, nor via imports">WATER</span></span> = <span class="cons_Lit">"\\"</span> ~[] {<span class="keyword">recover</span>}
    <a href="#EscapedChar1_4869_4881" id="EscapedChar1_6311_6323" title="Referenced at line 196">EscapedChar1</a>.<span class="cons_Constructor"><span id="WATER_6324_6329" title="Not referenced locally, nor via imports">WATER</span></span> = <span class="cons_Lit">"&lt;"</span> ~[\&gt;]+ <span class="cons_Lit">"&gt;"</span> {<span class="keyword">recover</span>}
    <a href="#EscapedChar2_4903_4915" id="EscapedChar2_6361_6373" title="Referenced at line 197">EscapedChar2</a>.<span class="cons_Constructor"><span id="WATER_6374_6379" title="Not referenced locally, nor via imports">WATER</span></span> = <span class="cons_Lit">"["</span> ~[\]]+ <span class="cons_Lit">"]"</span> {<span class="keyword">recover</span>}


  <span class="keyword">lexical restrictions</span>
    <a href="#TemplateEscape1_4851_4866" id="TemplateEscape1_6436_6451" title="Defined at line 196">TemplateEscape1</a> -/- [\\]
    <a href="#TemplateEscape1_4851_4866" id="TemplateEscape1_6465_6480" title="Defined at line 196">TemplateEscape1</a> -/- [\&lt;].[\\\&gt;]
    <a href="#TemplateEscape2_4885_4900" id="TemplateEscape2_6501_6516" title="Defined at line 197">TemplateEscape2</a> -/- [\\]
    <a href="#TemplateEscape2_4885_4900" id="TemplateEscape2_6530_6545" title="Defined at line 197">TemplateEscape2</a> -/- [\[].[\\\]]
    <a href="#TemplateEscapeQ_5858_5873" id="TemplateEscapeQ_6566_6581" title="Defined at line 226">TemplateEscapeQ</a> -/- [\\]
    <a href="#EscapedBackslashChar1_5786_5807" id="EscapedBackslashChar1_6595_6616" title="Defined at line 223">EscapedBackslashChar1</a> -/- [\&gt;]
    <a href="#EscapedBackslashChar2_5820_5841" id="EscapedBackslashChar2_6630_6651" title="Defined at line 224">EscapedBackslashChar2</a> -/- [\]]
    <a href="#EscapedUnicodeChar_6181_6199" id="EscapedUnicodeChar_6665_6683" title="Defined at line 240">EscapedUnicodeChar</a> -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span>]

</code></pre></td></tr></tbody></table></div>