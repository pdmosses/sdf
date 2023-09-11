---
title: Literals.sdf3
---

# `Literals.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/literals/Literals.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/literals/Literals.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/literals/Literals.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2-Syntax.sdf3#literals/Literals_254_271" id="literals/Literals_7_24" title="Referenced at ../../sdf2-core/Sdf2-Syntax.sdf3 line 12">literals/Literals</a>
 
<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3#kernel/Kernel_7_20" id="kernel/Kernel_35_48" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> 
 <a href="../../constants/StrCon.sdf3#constants/StrCon_7_23" id="constants/StrCon_51_67" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>
 <a href="../../constants/IdentifierCon.sdf3#constants/IdentifierCon_7_30" id="constants/IdentifierCon_69_92" title="Defined at ../../constants/IdentifierCon.sdf3 line 1">constants/IdentifierCon</a>

<span class="keyword">lexical syntax</span>

    <a href="#SingleQuotedStrChar_501_520" id="SingleQuotedStrChar_114_133" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Newline_134_141" title="Not referenced locally, nor via imports">Newline</span></span> = <span class="cons_Lit">"\\n"</span>                    
    <a href="#SingleQuotedStrChar_501_520" id="SingleQuotedStrChar_174_193" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Tab_194_197" title="Not referenced locally, nor via imports">Tab</span></span> = <span class="cons_Lit">"\\t"</span>                   
    <a href="#SingleQuotedStrChar_501_520" id="SingleQuotedStrChar_229_248" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Quote_249_254" title="Not referenced locally, nor via imports">Quote</span></span> = <span class="cons_Lit">"\\'"</span>           
    <a href="#SingleQuotedStrChar_501_520" id="SingleQuotedStrChar_278_297" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Backslash_298_307" title="Not referenced locally, nor via imports">Backslash</span></span> = <span class="cons_Lit">"\\\\"</span>                    
    <a href="#SingleQuotedStrChar_501_520" id="SingleQuotedStrChar_341_360" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Decimal_361_368" title="Not referenced locally, nor via imports">Decimal</span></span> = <span class="cons_Lit">"\\"</span> <span id="a_376_377" title="Not referenced locally, nor via imports">a</span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span id="b_383_384" title="Not referenced locally, nor via imports">b</span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span id="c_390_391" title="Not referenced locally, nor via imports">c</span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] 
    <a href="#SingleQuotedStrChar_501_520" id="SingleQuotedStrChar_403_422" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Normal_423_429" title="Not referenced locally, nor via imports">Normal</span></span> = ~[<span class="cons_Decimal">\0</span>-<span class="cons_Decimal">\31</span>\n\t\'\\] 
    
    <a href="#SingleQuotedStrCon_710_728" id="SingleQuotedStrCon_460_478" title="Referenced at line 24">SingleQuotedStrCon</a>.<span class="cons_Constructor"><span id="Default_479_486" title="Not referenced locally, nor via imports">Default</span></span> =  [\'] <span id="chars_495_500" title="Not referenced locally, nor via imports">chars</span>:<a href="#SingleQuotedStrChar_114_133" id="SingleQuotedStrChar_501_520" title="Defined at line 9, 10, 11, 12, 13, 14">SingleQuotedStrChar</a>* [\'] 
    
<span class="keyword">context-free syntax</span>
        <span id="FunctionName_554_566" title="Not referenced locally, nor via imports">FunctionName</span>.<span class="cons_Constructor"><span id="UnquotedFun_567_578" title="Not referenced locally, nor via imports">UnquotedFun</span></span> = &lt;&lt;<a href="../../constants/IdentifierCon.sdf3#IdCon_114_119" id="IdCon_583_588" title="Defined at ../../constants/IdentifierCon.sdf3 line 6">IdCon</a>&gt;&gt;
        <span id="FunctionName_592_604" title="Not referenced locally, nor via imports">FunctionName</span>.<span class="cons_Constructor"><span id="QuotedFun_605_614" title="Not referenced locally, nor via imports">QuotedFun</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_619_625" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;
        
<span class="keyword">context-free syntax</span>
        <span id="Symbol_651_657" title="Not referenced locally, nor via imports">Symbol</span>.<span class="cons_Constructor"><span id="Lit_658_661" title="Not referenced locally, nor via imports">Lit</span></span> = &lt;&lt;<span id="string_666_672" title="Not referenced locally, nor via imports">string</span>:<a href="../../constants/StrCon.sdf3#StrCon_323_329" id="StrCon_673_679" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;
        <span id="Symbol_683_689" title="Not referenced locally, nor via imports">Symbol</span>.<span class="cons_Constructor"><span id="CiLit_690_695" title="Not referenced locally, nor via imports">CiLit</span></span> = &lt;&lt;<span id="ci-string_700_709" title="Not referenced locally, nor via imports">ci-string</span>:<a href="#SingleQuotedStrCon_460_478" id="SingleQuotedStrCon_710_728" title="Defined at line 16">SingleQuotedStrCon</a>&gt;&gt;
        <span class="layout">//Production.PrefixFun = &lt;&lt;fun:FunctionName&gt;(&lt;arguments:{Symbol ", "}*&gt;) -\&gt; &lt;result:Symbol&gt; &lt;Attributes&gt;&gt;</span>

</code></pre></td></tr></tbody></table></div>