---
title: StrCon.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sdf2-core/Sdf2.sdf3#constants/StrCon_75_91" id="constants/StrCon_7_23" title="Referenced at ../../sdf2-core/Sdf2.sdf3 line 6">constants/StrCon</a>

<span class="keyword">lexical syntax</span>
    
    <a href="#StrChar_351_358" id="StrChar_49_56" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Newline_57_64" title="Not referenced locally, nor via imports">Newline</span></span> = <span class="cons_Lit">"\\n"</span>       
    <a href="#StrChar_351_358" id="StrChar_84_91" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Tab_92_95" title="Not referenced locally, nor via imports">Tab</span></span> = <span class="cons_Lit">"\\t"</span>                
    <a href="#StrChar_351_358" id="StrChar_124_131" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Quote_132_137" title="Not referenced locally, nor via imports">Quote</span></span> = <span class="cons_Lit">"\\\""</span>                     
    <a href="#StrChar_351_358" id="StrChar_172_179" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Backslash_180_189" title="Not referenced locally, nor via imports">Backslash</span></span> = <span class="cons_Lit">"\\\\"</span>                    
    <a href="#StrChar_351_358" id="StrChar_223_230" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Decimal_231_238" title="Not referenced locally, nor via imports">Decimal</span></span> = <span class="cons_Lit">"\\"</span> <span id="a_246_247" title="Not referenced locally, nor via imports">a</span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span id="b_253_254" title="Not referenced locally, nor via imports">b</span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]<span id="c_260_261" title="Not referenced locally, nor via imports">c</span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] 
    <a href="#StrChar_351_358" id="StrChar_273_280" title="Referenced at line 12">StrChar</a>.<span class="cons_Constructor"><span id="Normal_281_287" title="Not referenced locally, nor via imports">Normal</span></span> = ~[<span class="cons_Decimal">\0</span>-<span class="cons_Decimal">\31</span>\n\t\"\\]          

    <a href="../../aterms/Aterms.sdf3#StrCon_157_163" id="StrCon_323_329" title="Referenced at ../../aterms/Aterms.sdf3 line 9; ../../kernel/Kernel.sdf3 line 25; ../../labels/Labels.sdf3 line 9; ../../layout-constraints/Layout-Constraints.sdf3 line 23; ../../literals/Literals.sdf3 line 23; ../../regular/Regular.sdf3 line 25; ../../sdf2-core/Sdf2.sdf3 line 78; ../../TemplateLang.sdf3 line 120">StrCon</a>.<span class="cons_Constructor"><span id="Default_330_337" title="Not referenced locally, nor via imports">Default</span></span> = [\"] <span id="chars_345_350" title="Not referenced locally, nor via imports">chars</span>:<a href="#StrChar_49_56" id="StrChar_351_358" title="Defined at line 5, 6, 7, 8, 9, 10">StrChar</a>* [\"]   
</code></pre></td></tr></tbody></table></div>