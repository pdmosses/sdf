---
title: StrCon.sdf3
hide:
  - toc
---

# `StrCon.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/constants/StrCon.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/constants/StrCon.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/constants/StrCon.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="constants/StrCon_1_8" title="Multi-file references" data-urls="../../TemplateLang.sdf3/#constants/StrCon_4_3 ../../aterms/Aterms.sdf3/#constants/StrCon_5_3 ../../kernel/Kernel.sdf3/#constants/StrCon_6_9 ../../labels/Labels.sdf3/#constants/StrCon_4_9 ../../layout-constraints/Layout-Constraints.sdf3/#constants/StrCon_6_3 ../../literals/Literals.sdf3/#constants/StrCon_4_2 ../../regular/Regular.sdf3/#constants/StrCon_3_56 ../../restrictions/Restrictions.sdf3/#constants/StrCon_6_3 ../../sdf2-core/Sdf2.sdf3/#constants/StrCon_6_3">constants/StrCon</button>

<span class="keyword">lexical syntax</span>
    
    <a href="#StrChar_11_32" id="StrChar_5_5" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Newline_5_13" title="Not referenced locally, nor via imports">Newline</span></span> = <span class="cons_Lit">"\\n"</span>       
    <a href="#StrChar_11_32" id="StrChar_6_5" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Tab_6_13" title="Not referenced locally, nor via imports">Tab</span></span> = <span class="cons_Lit">"\\t"</span>                
    <a href="#StrChar_11_32" id="StrChar_7_5" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Quote_7_13" title="Not referenced locally, nor via imports">Quote</span></span> = <span class="cons_Lit">"\\\""</span>                     
    <a href="#StrChar_11_32" id="StrChar_8_5" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Backslash_8_13" title="Not referenced locally, nor via imports">Backslash</span></span> = <span class="cons_Lit">"\\\\"</span>                    
    <a href="#StrChar_11_32" id="StrChar_9_5" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Decimal_9_13" title="Not referenced locally, nor via imports">Decimal</span></span> = <span class="cons_Lit">"\\"</span> <span class="cons_Unquoted"><span id="a_9_28" title="Not referenced locally, nor via imports">a</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span class="cons_Unquoted"><span id="b_9_35" title="Not referenced locally, nor via imports">b</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span class="cons_Unquoted"><span id="c_9_42" title="Not referenced locally, nor via imports">c</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] 
    <a href="#StrChar_11_32" id="StrChar_10_5" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Normal_10_13" title="Not referenced locally, nor via imports">Normal</span></span> = ~[<span class="cons_Decimal">\0</span>-<span class="cons_Decimal">\31</span>\n\t\"\\]          

    <button class="modal-open" id="StrCon_12_5" title="Multi-file references" data-urls="../../TemplateLang.sdf3/#StrCon_39_40 ../../aterms/Aterms.sdf3/#StrCon_9_18 ../../kernel/Kernel.sdf3/#StrCon_22_37 ../../labels/Labels.sdf3/#StrCon_9_18 ../../layout-constraints/Layout-Constraints.sdf3/#StrCon_23_34 ../../literals/Literals.sdf3/#StrCon_20_29 ../../regular/Regular.sdf3/#StrCon_25_19 ../../sdf2-core/Sdf2.sdf3/#StrCon_59_17">StrCon</button>.<span class="cons_Constructor"><span id="Default_12_12" title="Not referenced locally, nor via imports">Default</span></span> = [\"] <span class="cons_Unquoted"><span id="chars_12_27" title="Not referenced locally, nor via imports">chars</span></span>:<a href="#StrChar_4_4" id="StrChar_12_33" title="Defined at line 5, 6, 7, 8, 9, 10">StrChar</a>* [\"]   
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
