---
title: Literals.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2-Syntax.sdf3/#literals/Literals_11_8" id="literals/Literals_1_8" title="Referenced at ../../sdf2-core/Sdf2-Syntax.sdf3 line 12">literals/Literals</a>
 
<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_0_7" id="kernel/Kernel_3_9" title="Defined at ../../kernel/Kernel.sdf3 line 1">kernel/Kernel</a> 
 <a href="../../constants/StrCon.sdf3/#constants/StrCon_0_7" id="constants/StrCon_4_2" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>
 <a href="../../constants/IdentifierCon.sdf3/#constants/IdentifierCon_0_7" id="constants/IdentifierCon_5_2" title="Defined at ../../constants/IdentifierCon.sdf3 line 1">constants/IdentifierCon</a>

<span class="keyword">lexical syntax</span>

    <a href="#SingleQuotedStrChar_15_45" id="SingleQuotedStrChar_9_5" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Newline_9_25" title="Not referenced locally, nor via imports">Newline</span></span> = <span class="cons_Lit">"\\n"</span>                    
    <a href="#SingleQuotedStrChar_15_45" id="SingleQuotedStrChar_10_5" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Tab_10_25" title="Not referenced locally, nor via imports">Tab</span></span> = <span class="cons_Lit">"\\t"</span>                   
    <a href="#SingleQuotedStrChar_15_45" id="SingleQuotedStrChar_11_5" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Quote_11_25" title="Not referenced locally, nor via imports">Quote</span></span> = <span class="cons_Lit">"\\'"</span>           
    <a href="#SingleQuotedStrChar_15_45" id="SingleQuotedStrChar_12_5" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Backslash_12_25" title="Not referenced locally, nor via imports">Backslash</span></span> = <span class="cons_Lit">"\\\\"</span>                    
    <a href="#SingleQuotedStrChar_15_45" id="SingleQuotedStrChar_13_5" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Decimal_13_25" title="Not referenced locally, nor via imports">Decimal</span></span> = <span class="cons_Lit">"\\"</span> <span class="cons_Unquoted"><span id="a_13_40" title="Not referenced locally, nor via imports">a</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span class="cons_Unquoted"><span id="b_13_47" title="Not referenced locally, nor via imports">b</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span class="cons_Unquoted"><span id="c_13_54" title="Not referenced locally, nor via imports">c</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] 
    <a href="#SingleQuotedStrChar_15_45" id="SingleQuotedStrChar_14_5" title="Referenced at line 16">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Normal_14_25" title="Not referenced locally, nor via imports">Normal</span></span> = ~[<span class="cons_Decimal">\0</span>-<span class="cons_Decimal">\31</span>\n\t\'\\] 
    
    <a href="#SingleQuotedStrCon_23_28" id="SingleQuotedStrCon_16_5" title="Referenced at line 24">SingleQuotedStrCon</a>.<span class="cons_Constructor"><span id="Default_16_24" title="Not referenced locally, nor via imports">Default</span></span> =  [\'] <span class="cons_Unquoted"><span id="chars_16_40" title="Not referenced locally, nor via imports">chars</span></span>:<a href="#SingleQuotedStrChar_8_4" id="SingleQuotedStrChar_16_46" title="Defined at line 9, 10, 11, 12, 13, 14">SingleQuotedStrChar</a>* [\'] 
    
<span class="keyword">context-free syntax</span>
        <span id="FunctionName_19_2" title="Not referenced locally, nor via imports">FunctionName</span>.<span class="cons_Constructor"><span id="UnquotedFun_19_15" title="Not referenced locally, nor via imports">UnquotedFun</span></span> = &lt;&lt;<a href="../../constants/IdentifierCon.sdf3/#IdCon_5_0" id="IdCon_19_31" title="Defined at ../../constants/IdentifierCon.sdf3 line 6">IdCon</a>&gt;&gt;
        <span id="FunctionName_20_2" title="Not referenced locally, nor via imports">FunctionName</span>.<span class="cons_Constructor"><span id="QuotedFun_20_15" title="Not referenced locally, nor via imports">QuotedFun</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3/#StrCon_11_4" id="StrCon_20_29" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;
        
<span class="keyword">context-free syntax</span>
        <span id="Symbol_23_2" title="Not referenced locally, nor via imports">Symbol</span>.<span class="cons_Constructor"><span id="Lit_23_9" title="Not referenced locally, nor via imports">Lit</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="string_23_17" title="Not referenced locally, nor via imports">string</span></span>:<a href="../../constants/StrCon.sdf3/#StrCon_11_4" id="StrCon_23_24" title="Defined at ../../constants/StrCon.sdf3 line 12">StrCon</a>&gt;&gt;
        <span id="Symbol_24_2" title="Not referenced locally, nor via imports">Symbol</span>.<span class="cons_Constructor"><span id="CiLit_24_9" title="Not referenced locally, nor via imports">CiLit</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="ci-string_24_19" title="Not referenced locally, nor via imports">ci-string</span></span>:<a href="#SingleQuotedStrCon_15_4" id="SingleQuotedStrCon_24_29" title="Defined at line 16">SingleQuotedStrCon</a>&gt;&gt;
        <span class="layout">//Production.PrefixFun = &lt;&lt;fun:FunctionName&gt;(&lt;arguments:{Symbol ", "}*&gt;) -\&gt; &lt;result:Symbol&gt; &lt;Attributes&gt;&gt;</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
