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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2-Syntax.sdf3/#literals/Literals_12_9" id="literals/Literals_1_8" title="a definition with a single reference">literals/Literals</a>
 
<span class="keyword">imports</span> <a href="../../kernel/Kernel.sdf3/#kernel/Kernel_1_8" id="kernel/Kernel_3_9" title="a reference to a single-file definition">kernel/Kernel</a> 
 <a href="../../constants/StrCon.sdf3/#constants/StrCon_1_8" id="constants/StrCon_4_2" title="a reference to a single-file definition">constants/StrCon</a>
 <a href="../../constants/IdentifierCon.sdf3/#constants/IdentifierCon_1_8" id="constants/IdentifierCon_5_2" title="a reference to a single-file definition">constants/IdentifierCon</a>

<span class="keyword">lexical syntax</span>

    <a href="#SingleQuotedStrChar_16_46" id="SingleQuotedStrChar_9_5" title="a definition with a single reference">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Newline_9_25" title="a definition with no references">Newline</span></span> = <span class="cons_Lit">"\\n"</span>                    
    <a href="#SingleQuotedStrChar_16_46" id="SingleQuotedStrChar_10_5" title="a definition with a single reference">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Tab_10_25" title="a definition with no references">Tab</span></span> = <span class="cons_Lit">"\\t"</span>                   
    <a href="#SingleQuotedStrChar_16_46" id="SingleQuotedStrChar_11_5" title="a definition with a single reference">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Quote_11_25" title="a definition with no references">Quote</span></span> = <span class="cons_Lit">"\\'"</span>           
    <a href="#SingleQuotedStrChar_16_46" id="SingleQuotedStrChar_12_5" title="a definition with a single reference">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Backslash_12_25" title="a definition with no references">Backslash</span></span> = <span class="cons_Lit">"\\\\"</span>                    
    <a href="#SingleQuotedStrChar_16_46" id="SingleQuotedStrChar_13_5" title="a definition with a single reference">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Decimal_13_25" title="a definition with no references">Decimal</span></span> = <span class="cons_Lit">"\\"</span> <span class="cons_Unquoted"><span id="a_13_40" title="a definition with no references">a</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span class="cons_Unquoted"><span id="b_13_47" title="a definition with no references">b</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span class="cons_Unquoted"><span id="c_13_54" title="a definition with no references">c</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] 
    <a href="#SingleQuotedStrChar_16_46" id="SingleQuotedStrChar_14_5" title="a definition with a single reference">SingleQuotedStrChar</a>.<span class="cons_Constructor"><span id="Normal_14_25" title="a definition with no references">Normal</span></span> = ~[<span class="cons_Decimal">\0</span>-<span class="cons_Decimal">\31</span>\n\t\'\\] 
    
    <a href="#SingleQuotedStrCon_24_29" id="SingleQuotedStrCon_16_5" title="a definition with a single reference">SingleQuotedStrCon</a>.<span class="cons_Constructor"><span id="Default_16_24" title="a definition with no references">Default</span></span> =  [\'] <span class="cons_Unquoted"><span id="chars_16_40" title="a definition with no references">chars</span></span>:<a href="#SingleQuotedStrChar_9_5" id="SingleQuotedStrChar_16_46" title="a reference to a single-file definition">SingleQuotedStrChar</a>* [\'] 
    
<span class="keyword">context-free syntax</span>
        <span id="FunctionName_19_2" title="a definition with no references">FunctionName</span>.<span class="cons_Constructor"><span id="UnquotedFun_19_15" title="a definition with no references">UnquotedFun</span></span> = &lt;&lt;<a href="../../constants/IdentifierCon.sdf3/#IdCon_6_1" id="IdCon_19_31" title="a reference to a single-file definition">IdCon</a>&gt;&gt;
        <span id="FunctionName_20_2" title="a definition with no references">FunctionName</span>.<span class="cons_Constructor"><span id="QuotedFun_20_15" title="a definition with no references">QuotedFun</span></span> = &lt;&lt;<a href="../../constants/StrCon.sdf3/#StrCon_12_5" id="StrCon_20_29" title="a reference to a single-file definition">StrCon</a>&gt;&gt;
        
<span class="keyword">context-free syntax</span>
        <span id="Symbol_23_2" title="a definition with no references">Symbol</span>.<span class="cons_Constructor"><span id="Lit_23_9" title="a definition with no references">Lit</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="string_23_17" title="a definition with no references">string</span></span>:<a href="../../constants/StrCon.sdf3/#StrCon_12_5" id="StrCon_23_24" title="a reference to a single-file definition">StrCon</a>&gt;&gt;
        <span id="Symbol_24_2" title="a definition with no references">Symbol</span>.<span class="cons_Constructor"><span id="CiLit_24_9" title="a definition with no references">CiLit</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="ci-string_24_19" title="a definition with no references">ci-string</span></span>:<a href="#SingleQuotedStrCon_16_5" id="SingleQuotedStrCon_24_29" title="a reference to a single-file definition">SingleQuotedStrCon</a>&gt;&gt;
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
