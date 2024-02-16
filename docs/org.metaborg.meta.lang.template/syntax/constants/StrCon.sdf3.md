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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="constants/StrCon_1_8" title="a definition with multiple references" data-urls="../../TemplateLang.sdf3/#constants/StrCon line 4_3; ../../aterms/Aterms.sdf3/#constants/StrCon line 5_3; ../../kernel/Kernel.sdf3/#constants/StrCon line 6_9; ../../labels/Labels.sdf3/#constants/StrCon line 4_9; ../../layout-constraints/Layout-Constraints.sdf3/#constants/StrCon line 6_3; ../../literals/Literals.sdf3/#constants/StrCon line 4_2; ../../regular/Regular.sdf3/#constants/StrCon line 3_56; ../../restrictions/Restrictions.sdf3/#constants/StrCon line 6_3; ../../sdf2-core/Sdf2.sdf3/#constants/StrCon line 6_3">constants/StrCon</button>

<span class="keyword">lexical syntax</span>
    
    <a href="#StrChar_12_33" id="StrChar_5_5" title="a definition with a single reference">StrChar</a>.<span class="cons_Constructor"><span id="Newline_5_13" title="a definition with no references">Newline</span></span> = <span class="cons_Lit">"\\n"</span>       
    <a href="#StrChar_12_33" id="StrChar_6_5" title="a definition with a single reference">StrChar</a>.<span class="cons_Constructor"><span id="Tab_6_13" title="a definition with no references">Tab</span></span> = <span class="cons_Lit">"\\t"</span>                
    <a href="#StrChar_12_33" id="StrChar_7_5" title="a definition with a single reference">StrChar</a>.<span class="cons_Constructor"><span id="Quote_7_13" title="a definition with no references">Quote</span></span> = <span class="cons_Lit">"\\\""</span>                     
    <a href="#StrChar_12_33" id="StrChar_8_5" title="a definition with a single reference">StrChar</a>.<span class="cons_Constructor"><span id="Backslash_8_13" title="a definition with no references">Backslash</span></span> = <span class="cons_Lit">"\\\\"</span>                    
    <a href="#StrChar_12_33" id="StrChar_9_5" title="a definition with a single reference">StrChar</a>.<span class="cons_Constructor"><span id="Decimal_9_13" title="a definition with no references">Decimal</span></span> = <span class="cons_Lit">"\\"</span> <span class="cons_Unquoted"><span id="a_9_28" title="a definition with no references">a</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span class="cons_Unquoted"><span id="b_9_35" title="a definition with no references">b</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span class="cons_Unquoted"><span id="c_9_42" title="a definition with no references">c</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] 
    <a href="#StrChar_12_33" id="StrChar_10_5" title="a definition with a single reference">StrChar</a>.<span class="cons_Constructor"><span id="Normal_10_13" title="a definition with no references">Normal</span></span> = ~[<span class="cons_Decimal">\0</span>-<span class="cons_Decimal">\31</span>\n\t\"\\]          

    <button class="modal-open" id="StrCon_12_5" title="a definition with multiple references" data-urls="../../TemplateLang.sdf3/#StrCon line 39_40, 119_43, 120_33; ../../aterms/Aterms.sdf3/#StrCon line 9_18; ../../kernel/Kernel.sdf3/#StrCon line 22_37, 23_32, 25_35; ../../labels/Labels.sdf3/#StrCon line 9_18; ../../layout-constraints/Layout-Constraints.sdf3/#StrCon line 23_34; ../../literals/Literals.sdf3/#StrCon line 20_29, 23_24; ../../regular/Regular.sdf3/#StrCon line 25_19; ../../sdf2-core/Sdf2.sdf3/#StrCon line 59_17, 77_35, 78_41">StrCon</button>.<span class="cons_Constructor"><span id="Default_12_12" title="a definition with no references">Default</span></span> = [\"] <span class="cons_Unquoted"><span id="chars_12_27" title="a definition with no references">chars</span></span>:<a href="#StrChar_5_5" id="StrChar_12_33" title="a reference to a single-file definition">StrChar</a>* [\"]   
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
