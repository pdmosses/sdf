---
title: Kernel.sdf3
hide:
  - toc
---

# `Kernel.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/kernel/Kernel.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/kernel/Kernel.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/kernel/Kernel.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../TemplateLang.sdf3/#kernel/Kernel_141_154" id="kernel/Kernel_7_20" title="Referenced at ../../TemplateLang.sdf3 line 9; ../../aliases/Aliases.sdf3 line 3; ../../basic/Basic.sdf3 line 3; ../../characterclass/CC.sdf3 line 4; ../../labels/Labels.sdf3 line 3; ../../lifting/Lifting.sdf3 line 3; ../../literals/Literals.sdf3 line 3; ../../modules/Modules.sdf3 line 3; ../../priority/Priority.sdf3 line 3; ../../regular/Regular.sdf3 line 3; ../../renaming/Renaming.sdf3 line 3; ../../sdf2-core/Sdf2-Syntax.sdf3 line 3; ../../sorts/Sorts.sdf3 line 3; ../../symbols/Start-Symbols.sdf3 line 3">kernel/Kernel</a>

<span class="keyword">imports</span> <a href="../../aterms/Aterms.sdf3/#aterms/Aterms_7_20" id="aterms/Aterms_30_43" title="Defined at ../../aterms/Aterms.sdf3 line 1">aterms/Aterms</a> 
        <a href="../../symbols/Symbols.sdf3/#symbols/Symbols_7_22" id="symbols/Symbols_53_68" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a> 
        <a href="../../grammar/Grammars.sdf3/#grammar/Grammars_7_23" id="grammar/Grammars_78_94" title="Defined at ../../grammar/Grammars.sdf3 line 1">grammar/Grammars</a>
        <a href="../../constants/StrCon.sdf3/#constants/StrCon_7_23" id="constants/StrCon_103_119" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>
        <a href="../../priority/Priority.sdf3/#priority/Priority_7_24" id="priority/Priority_128_145" title="Defined at ../../priority/Priority.sdf3 line 1">priority/Priority</a>
        <a href="../../layout-constraints/Layout-Constraints.sdf3/#layout-constraints/Layout-Constraints_7_44" id="layout-constraints/Layout-Constraints_154_191" title="Defined at ../../layout-constraints/Layout-Constraints.sdf3 line 1">layout-constraints/Layout-Constraints</a>
 
<span class="keyword">context-free syntax</span>

<a href="#ATermAttribute_275_289" id="ATermAttribute_215_229" title="Referenced at line 13">ATermAttribute</a>.<span class="cons_Constructor"><span id="Default_230_237" title="Not referenced locally, nor via imports">Default</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="aterm_242_247" title="Not referenced locally, nor via imports">aterm</span></span>:<a href="../../aterms/Aterms.sdf3/#ATerm_216_221" id="ATerm_248_253" title="Defined at ../../aterms/Aterms.sdf3 line 14, 15, 16, 17, 18, 19, 20">ATerm</a>&gt;&gt;
<a href="#Attribute_321_330" id="Attribute_256_265" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Term_266_270" title="Not referenced locally, nor via imports">Term</span></span> = &lt;&lt;<a href="#ATermAttribute_215_229" id="ATermAttribute_275_289" title="Defined at line 12">ATermAttribute</a>&gt;&gt;

<a href="#Attributes_1583_1593" id="Attributes_293_303" title="Referenced at line 50; ../../TemplateLang.sdf3 line 30, 85, 86, 90, 93">Attributes</a>.<span class="cons_Constructor"><span id="Attrs_304_309" title="Not referenced locally, nor via imports">Attrs</span></span> = &lt;<span class="cons_String">{</span>&lt;<span class="cons_Unquoted"><span id="list_315_319" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#Attribute_256_265" id="Attribute_321_330" title="Defined at line 13, 22, 23, 24, 27, 28, 29, 31, 32, 34, 36, 37, 38, 39, 41, 42, 45, 46, 47">Attribute</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span>&gt;
<a href="#Attributes_1583_1593" id="Attributes_341_351" title="Referenced at line 50; ../../TemplateLang.sdf3 line 30, 85, 86, 90, 93">Attributes</a>.<span class="cons_Constructor"><span id="NoAttrs_352_359" title="Not referenced locally, nor via imports">NoAttrs</span></span> = &lt;&gt;



<span class="layout">//special attributes that should show up in the parse table as attr</span>

<a href="#Attribute_321_330" id="Attribute_437_446" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Deprecated_447_457" title="Not referenced locally, nor via imports">Deprecated</span></span> = &lt;<span class="cons_String">deprecated(</span>&lt;<a href="../../constants/StrCon.sdf3/#StrCon_323_329" id="StrCon_473_479" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;<span class="cons_String">)</span>&gt; 
<a href="#Attribute_321_330" id="Attribute_484_493" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Constructor_494_505" title="Not referenced locally, nor via imports">Constructor</span></span> = &lt;<span class="cons_String">cons(</span>&lt;<a href="../../constants/StrCon.sdf3/#StrCon_323_329" id="StrCon_515_521" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("Use 'Sort.Cons' notation instead")}
<a href="#Attribute_321_330" id="Attribute_574_583" title="Referenced at line 15">Attribute</a> = &lt;&lt;<a href="#QuotedConstructor_666_683" id="QuotedConstructor_588_605" title="Defined at line 25">QuotedConstructor</a>&gt;&gt; {<span class="keyword">prefer</span>, <span class="keyword">deprecated</span>("Use 'Sort.Cons' notation instead") }
<a href="#QuotedConstructor_588_605" id="QuotedConstructor_666_683" title="Referenced at line 24">QuotedConstructor</a>.<span class="cons_Constructor"><span id="Constructor_684_695" title="Not referenced locally, nor via imports">Constructor</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3/#StrCon_323_329" id="StrCon_700_706" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;

<a href="#Attribute_321_330" id="Attribute_710_719" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Reject_720_726" title="Not referenced locally, nor via imports">Reject</span></span> = &lt;<span class="cons_String">reject</span>&gt;
<a href="#Attribute_321_330" id="Attribute_738_747" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Prefer_748_754" title="Not referenced locally, nor via imports">Prefer</span></span> = &lt;<span class="cons_String">prefer</span>&gt; {<span class="keyword">deprecated</span>("Prefer and avoid are deprecated and will be removed in a future version of SDF3")}
<a href="#Attribute_321_330" id="Attribute_862_871" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Avoid_872_877" title="Not referenced locally, nor via imports">Avoid</span></span> = &lt;<span class="cons_String">avoid</span>&gt; {<span class="keyword">deprecated</span>("Prefer and avoid are deprecated and will be removed in a future version of SDF3")}

<a href="#Attribute_321_330" id="Attribute_985_994" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Bracket_995_1002" title="Not referenced locally, nor via imports">Bracket</span></span> = &lt;<span class="cons_String">bracket</span>&gt;
<a href="#Attribute_321_330" id="Attribute_1015_1024" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Assoc_1025_1030" title="Not referenced locally, nor via imports">Assoc</span></span> = &lt;&lt;<a href="../../priority/Priority.sdf3/#Associativity_101_114" id="Associativity_1035_1048" title="Defined at ../../priority/Priority.sdf3 line 7, 8, 9, 10, 11">Associativity</a>&gt;&gt;

<a href="#Attribute_321_330" id="Attribute_1052_1061" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="LayoutConstraint_1062_1078" title="Not referenced locally, nor via imports">LayoutConstraint</span></span> = &lt;<span class="cons_String">layout(</span>&lt;<a href="../../layout-constraints/Layout-Constraints.sdf3/#Constraint_187_197" id="Constraint_1090_1100" title="Defined at ../../layout-constraints/Layout-Constraints.sdf3 line 15, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 62, 63, 64">Constraint</a>&gt;<span class="cons_String">)</span>&gt;

<a href="#Attribute_321_330" id="Attribute_1105_1114" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="IgnoreLayout_1115_1127" title="Not referenced locally, nor via imports">IgnoreLayout</span></span> = &lt;<span class="cons_String">ignore-layout</span>&gt;
<a href="#Attribute_321_330" id="Attribute_1146_1155" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="EnforceNewLine_1156_1170" title="Not referenced locally, nor via imports">EnforceNewLine</span></span> = &lt;<span class="cons_String">enforce-newline</span>&gt;
<a href="#Attribute_321_330" id="Attribute_1191_1200" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="LongestMatch_1201_1213" title="Not referenced locally, nor via imports">LongestMatch</span></span> = &lt;<span class="cons_String">longest-match</span>&gt;
<a href="#Attribute_321_330" id="Attribute_1232_1241" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Recover_1242_1249" title="Not referenced locally, nor via imports">Recover</span></span>      = &lt;<span class="cons_String">recover</span>&gt;

<a href="#Attribute_321_330" id="Attribute_1268_1277" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="CaseInsensitive_1278_1293" title="Not referenced locally, nor via imports">CaseInsensitive</span></span> = &lt;<span class="cons_String">case-insensitive</span>&gt;
<a href="#Attribute_321_330" id="Attribute_1315_1324" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Deprecated_1325_1335" title="Not referenced locally, nor via imports">Deprecated</span></span> = &lt;<span class="cons_String">deprecated</span>&gt;  

<span class="layout">//new completion attributes</span>
<a href="#Attribute_321_330" id="Attribute_1382_1391" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="Placeholder_1392_1403" title="Not referenced locally, nor via imports">Placeholder</span></span> = &lt;<span class="cons_String">placeholder</span>&gt; 
<a href="#Attribute_321_330" id="Attribute_1421_1430" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="PlaceholderInsertion_1431_1451" title="Not referenced locally, nor via imports">PlaceholderInsertion</span></span> = &lt;<span class="cons_String">placeholder-insertion</span>&gt; 
<a href="#Attribute_321_330" id="Attribute_1479_1488" title="Referenced at line 15">Attribute</a>.<span class="cons_Constructor"><span id="LiteralCompletion_1489_1506" title="Not referenced locally, nor via imports">LiteralCompletion</span></span> = &lt;<span class="cons_String">literal-completion</span>&gt; 


<a href="#Production_1663_1673" id="Production_1533_1543" title="Referenced at line 52; ../../priority/Priority.sdf3 line 27; ../../renaming/Renaming.sdf3 line 9">Production</a>.<span class="cons_Constructor"><span id="Prod_1544_1548" title="Not referenced locally, nor via imports">Prod</span></span> = &lt;&lt;<a href="../../symbols/Symbols.sdf3/#Symbols_103_110" id="Symbols_1553_1560" title="Defined at ../../symbols/Symbols.sdf3 line 8">Symbols</a>&gt; <span class="cons_String">-</span>\&gt; &lt;<span class="cons_Unquoted"><span id="result_1567_1573" title="Not referenced locally, nor via imports">result</span></span>:<a href="../../symbols/Symbols.sdf3/#Symbol_71_77" id="Symbol_1574_1580" title="Defined at ../../symbols/Symbols.sdf3 line 7">Symbol</a>&gt; &lt;<a href="#Attributes_293_303" id="Attributes_1583_1593" title="Defined at line 15, 16">Attributes</a>&gt;&gt; {<span class="keyword">deprecated</span>("Use productive form instead")}

<a href="#Productions_1716_1727" id="Productions_1641_1652" title="Referenced at line 57; ../../basic/Basic.sdf3 line 12, 18, 24, 37">Productions</a> = &lt;&lt;<span class="cons_Unquoted"><span id="list_1657_1661" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#Production_1533_1543" id="Production_1663_1673" title="Defined at line 50">Production</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

<a href="../../modules/Modules.sdf3/#Grammar_763_770" id="Grammar_1684_1691" title="Referenced at ../../modules/Modules.sdf3 line 33">Grammar</a>.<span class="cons_Constructor"><span id="Syntax_1692_1698" title="Not referenced locally, nor via imports">Syntax</span></span> = &lt;
        <span class="cons_String">syntax</span> 

                &lt;<a href="#Productions_1641_1652" id="Productions_1716_1727" title="Defined at line 52">Productions</a>&gt;
                
                &gt;
</code></pre></td></tr></tbody></table></div>