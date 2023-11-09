---
title: Restrictions.sdf3
hide:
  - toc
---

# `Restrictions.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/restrictions/Restrictions.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/restrictions/Restrictions.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/restrictions/Restrictions.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="restrictions/Restrictions_1_8" title="Multi-file references" data-urls="../../TemplateLang.sdf3/#restrictions/Restrictions_10_3 line 10; ../../sdf2-core/Sdf2-Syntax.sdf3/#restrictions/Restrictions_14_9 line 14">restrictions/Restrictions</button>
  
<span class="keyword">imports</span> <a href="../../characterclass/CC.sdf3/#characterclass/CC_1_8" id="characterclass/CC_3_9" title="Defined at ../../characterclass/CC.sdf3 line 1">characterclass/CC</a> 
                <a href="../../characterclass/Character-Class.sdf3/#characterclass/Character-Class_1_8" id="characterclass/Character-Class_4_3" title="Defined at ../../characterclass/Character-Class.sdf3 line 1">characterclass/Character-Class</a>
                <a href="../../symbols/Symbols.sdf3/#symbols/Symbols_1_8" id="symbols/Symbols_5_3" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a> 
                <a href="../../constants/StrCon.sdf3/#constants/StrCon_1_8" id="constants/StrCon_6_3" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>

<span class="keyword">context-free syntax</span>
  
<a href="#Lookahead_13_23" id="Lookahead_10_1" title="Referenced at line 13, 17, 33">Lookahead</a>.<span class="cons_Constructor"><span id="CharClass_10_11" title="Not referenced">CharClass</span></span> = &lt;&lt;<a href="../../characterclass/Character-Class.sdf3/#CharClass_17_1" id="CharClass_10_25" title="Defined at ../../characterclass/Character-Class.sdf3 line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;&gt;
<a href="#Lookahead_13_23" id="Lookahead_11_1" title="Referenced at line 13, 17, 33">Lookahead</a>.<span class="cons_Constructor"><a href="#Seq_33_15" id="Seq_11_11" title="Referenced at line 33">Seq</a></span> = &lt;&lt;<a href="../../characterclass/Character-Class.sdf3/#CharClass_17_1" id="CharClass_11_19" title="Defined at ../../characterclass/Character-Class.sdf3 line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;<span class="cons_String">.</span>&lt;<a href="#Lookaheads_13_1" id="Lookaheads_11_31" title="Defined at line 13, 15, 16, 17">Lookaheads</a>&gt;&gt;  

<button class="modal-open" id="Lookaheads_13_1" title="Multi-file references" data-urls="#Lookaheads_11_31 line 11, 15, 16, 19, 34; ../../TemplateLang.sdf3/#Lookaheads_37_57 line 37">Lookaheads</button>.<span class="cons_Constructor"><span id="Single_13_12" title="Not referenced">Single</span></span> = &lt;&lt;<a href="#Lookahead_10_1" id="Lookahead_13_23" title="Defined at line 10, 11">Lookahead</a>&gt;&gt;
<span class="layout">//"left":Lookaheads "|" "right":Lookaheads -&gt; Lookaheads  {cons("alt"),right}</span>
<button class="modal-open" id="Lookaheads_15_1" title="Multi-file references" data-urls="#Lookaheads_11_31 line 11, 15, 16, 19, 34; ../../TemplateLang.sdf3/#Lookaheads_37_57 line 37">Lookaheads</button>.<span class="cons_Constructor"><a href="#Alt_34_16" id="Alt_15_12" title="Referenced at line 34">Alt</a></span> = &lt;&lt;<a href="#Lookaheads_13_1" id="Lookaheads_15_20" title="Defined at line 13, 15, 16, 17">Lookaheads</a>&gt; <span class="cons_String">|</span> &lt;<a href="#Lookaheads_13_1" id="Lookaheads_15_35" title="Defined at line 13, 15, 16, 17">Lookaheads</a>&gt;&gt; {<span class="keyword">right</span>}
<button class="modal-open" id="Lookaheads_16_1" title="Multi-file references" data-urls="#Lookaheads_11_31 line 11, 15, 16, 19, 34; ../../TemplateLang.sdf3/#Lookaheads_37_57 line 37">Lookaheads</button> = &lt;<span class="cons_String">(</span>&lt;<a href="#Lookaheads_13_1" id="Lookaheads_16_17" title="Defined at line 13, 15, 16, 17">Lookaheads</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
<button class="modal-open" id="Lookaheads_17_1" title="Multi-file references" data-urls="#Lookaheads_11_31 line 11, 15, 16, 19, 34; ../../TemplateLang.sdf3/#Lookaheads_37_57 line 37">Lookaheads</button>.<span class="cons_Constructor"><span id="List_17_12" title="Not referenced">List</span></span> = &lt;<span class="cons_String">[[</span>&lt;<span class="cons_Unquoted"><span id="list_17_23" title="Not referenced">list</span></span>:{<a href="#Lookahead_10_1" id="Lookahead_17_29" title="Defined at line 10, 11">Lookahead</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]]</span>&gt;

<a href="#Restriction_22_24" id="Restriction_19_1" title="Referenced at line 22">Restriction</a>.<span class="cons_Constructor"><span id="Follow_19_13" title="Not referenced">Follow</span></span> = &lt;&lt;<a href="#RestrictionSymbols_20_1" id="RestrictionSymbols_19_24" title="Defined at line 20">RestrictionSymbols</a>&gt; <span class="cons_String">-/-</span> &lt;<a href="#Lookaheads_13_1" id="Lookaheads_19_49" title="Defined at line 13, 15, 16, 17">Lookaheads</a>&gt;&gt;
<a href="#RestrictionSymbols_19_24" id="RestrictionSymbols_20_1" title="Referenced at line 19">RestrictionSymbols</a> = &lt;&lt;<span class="cons_Unquoted"><span id="list_20_24" title="Not referenced">list</span></span>:{<a href="../../symbols/Symbols.sdf3/#Symbol_7_1" id="Symbol_20_30" title="Defined at ../../symbols/Symbols.sdf3 line 7">Symbol</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;
 
<button class="modal-open" id="Restrictions_22_1" title="Multi-file references" data-urls="#Restrictions_27_4 line 27; ../../sdf2-core/Sdf2-Syntax.sdf3/#Restrictions_40_4 line 40, 47">Restrictions</button> = &lt;&lt;<span class="cons_Unquoted"><span id="list_22_18" title="Not referenced">list</span></span>:{<a href="#Restriction_19_1" id="Restriction_22_24" title="Defined at line 19">Restriction</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;
 
<span id="Grammar_24_1" title="Not referenced">Grammar</span>.<span class="cons_Constructor"><span id="Restrictions_24_9" title="Not referenced">Restrictions</span></span> = &lt;
        <span class="cons_String">restrictions</span>
        
                &lt;<a href="#Restrictions_22_1" id="Restrictions_27_4" title="Defined at line 22">Restrictions</a>&gt;
        
        &gt;


<span class="keyword">context-free priorities</span>    
    <a href="#Lookahead_10_1" id="Lookahead_33_5" title="Defined at line 10, 11">Lookahead</a>.<span class="cons_Constructor"><a href="#Seq_11_11" id="Seq_33_15" title="Defined at line 11">Seq</a></span> &gt; 
    <a href="#Lookaheads_13_1" id="Lookaheads_34_5" title="Defined at line 13, 15, 16, 17">Lookaheads</a>.<span class="cons_Constructor"><a href="#Alt_15_12" id="Alt_34_16" title="Defined at line 15">Alt</a></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
