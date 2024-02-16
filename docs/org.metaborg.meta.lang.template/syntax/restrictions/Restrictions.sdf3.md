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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="restrictions/Restrictions_1_8" title="a definition with multiple references" data-urls="../../TemplateLang.sdf3/#restrictions/Restrictions line 10_3; ../../sdf2-core/Sdf2-Syntax.sdf3/#restrictions/Restrictions line 14_9">restrictions/Restrictions</button>
  
<span class="keyword">imports</span> <a href="../../characterclass/CC.sdf3/#characterclass/CC_1_8" id="characterclass/CC_3_9" title="a reference to a single-file definition">characterclass/CC</a> 
                <a href="../../characterclass/Character-Class.sdf3/#characterclass/Character-Class_1_8" id="characterclass/Character-Class_4_3" title="a reference to a single-file definition">characterclass/Character-Class</a>
                <a href="../../symbols/Symbols.sdf3/#symbols/Symbols_1_8" id="symbols/Symbols_5_3" title="a reference to a single-file definition">symbols/Symbols</a> 
                <a href="../../constants/StrCon.sdf3/#constants/StrCon_1_8" id="constants/StrCon_6_3" title="a reference to a single-file definition">constants/StrCon</a>

<span class="keyword">context-free syntax</span>
  
<button class="modal-open" id="Lookahead_10_1" title="a definition with multiple references" data-urls="#Lookahead line 13_23, 17_29, 33_5">Lookahead</button>.<span class="cons_Constructor"><span id="CharClass_10_11" title="a definition with no references">CharClass</span></span> = &lt;&lt;<a href="../../characterclass/Character-Class.sdf3/#CharClass_17_1" id="CharClass_10_25" title="a reference to a single-file definition">CharClass</a>&gt;&gt;
<button class="modal-open" id="Lookahead_11_1" title="a definition with multiple references" data-urls="#Lookahead line 13_23, 17_29, 33_5">Lookahead</button>.<span class="cons_Constructor"><a href="#Seq_33_15" id="Seq_11_11" title="a definition with a single reference">Seq</a></span> = &lt;&lt;<a href="../../characterclass/Character-Class.sdf3/#CharClass_17_1" id="CharClass_11_19" title="a reference to a single-file definition">CharClass</a>&gt;<span class="cons_String">.</span>&lt;<a href="#Lookaheads_13_1" id="Lookaheads_11_31" title="a reference to a single-file definition">Lookaheads</a>&gt;&gt;  

<button class="modal-open" id="Lookaheads_13_1" title="a definition with multiple references" data-urls="#Lookaheads line 11_31, 15_20, 15_35, 16_17, 19_49, 34_5; ../../TemplateLang.sdf3/#Lookaheads line 37_57">Lookaheads</button>.<span class="cons_Constructor"><span id="Single_13_12" title="a definition with no references">Single</span></span> = &lt;&lt;<a href="#Lookahead_10_1" id="Lookahead_13_23" title="a reference to a single-file definition">Lookahead</a>&gt;&gt;
<span class="layout">//"left":Lookaheads "|" "right":Lookaheads -&gt; Lookaheads  {cons("alt"),right}</span>
<button class="modal-open" id="Lookaheads_15_1" title="a definition with multiple references" data-urls="#Lookaheads line 11_31, 15_20, 15_35, 16_17, 19_49, 34_5; ../../TemplateLang.sdf3/#Lookaheads line 37_57">Lookaheads</button>.<span class="cons_Constructor"><a href="#Alt_34_16" id="Alt_15_12" title="a definition with a single reference">Alt</a></span> = &lt;&lt;<a href="#Lookaheads_13_1" id="Lookaheads_15_20" title="a reference to a single-file definition">Lookaheads</a>&gt; <span class="cons_String">|</span> &lt;<a href="#Lookaheads_13_1" id="Lookaheads_15_35" title="a reference to a single-file definition">Lookaheads</a>&gt;&gt; {<span class="keyword">right</span>}
<button class="modal-open" id="Lookaheads_16_1" title="a definition with multiple references" data-urls="#Lookaheads line 11_31, 15_20, 15_35, 16_17, 19_49, 34_5; ../../TemplateLang.sdf3/#Lookaheads line 37_57">Lookaheads</button> = &lt;<span class="cons_String">(</span>&lt;<a href="#Lookaheads_13_1" id="Lookaheads_16_17" title="a reference to a single-file definition">Lookaheads</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
<button class="modal-open" id="Lookaheads_17_1" title="a definition with multiple references" data-urls="#Lookaheads line 11_31, 15_20, 15_35, 16_17, 19_49, 34_5; ../../TemplateLang.sdf3/#Lookaheads line 37_57">Lookaheads</button>.<span class="cons_Constructor"><span id="List_17_12" title="a definition with no references">List</span></span> = &lt;<span class="cons_String">[[</span>&lt;<span class="cons_Unquoted"><span id="list_17_23" title="a definition with no references">list</span></span>:{<a href="#Lookahead_10_1" id="Lookahead_17_29" title="a reference to a single-file definition">Lookahead</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]]</span>&gt;

<a href="#Restriction_22_24" id="Restriction_19_1" title="a definition with a single reference">Restriction</a>.<span class="cons_Constructor"><span id="Follow_19_13" title="a definition with no references">Follow</span></span> = &lt;&lt;<a href="#RestrictionSymbols_20_1" id="RestrictionSymbols_19_24" title="a reference to a single-file definition">RestrictionSymbols</a>&gt; <span class="cons_String">-/-</span> &lt;<a href="#Lookaheads_13_1" id="Lookaheads_19_49" title="a reference to a single-file definition">Lookaheads</a>&gt;&gt;
<a href="#RestrictionSymbols_19_24" id="RestrictionSymbols_20_1" title="a definition with a single reference">RestrictionSymbols</a> = &lt;&lt;<span class="cons_Unquoted"><span id="list_20_24" title="a definition with no references">list</span></span>:{<a href="../../characterclass/CC.sdf3/#Symbol_7_5" id="Symbol_20_30" title="a reference to a single-file definition">Symbol</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;
 
<button class="modal-open" id="Restrictions_22_1" title="a definition with multiple references" data-urls="#Restrictions line 27_4; ../../sdf2-core/Sdf2-Syntax.sdf3/#Restrictions line 40_4, 47_4">Restrictions</button> = &lt;&lt;<span class="cons_Unquoted"><span id="list_22_18" title="a definition with no references">list</span></span>:{<a href="#Restriction_19_1" id="Restriction_22_24" title="a reference to a single-file definition">Restriction</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;
 
<span id="Grammar_24_1" title="a definition with no references">Grammar</span>.<span class="cons_Constructor"><span id="Restrictions_24_9" title="a definition with no references">Restrictions</span></span> = &lt;
        <span class="cons_String">restrictions</span>
        
                &lt;<a href="#Restrictions_22_1" id="Restrictions_27_4" title="a reference to a single-file definition">Restrictions</a>&gt;
        
        &gt;


<span class="keyword">context-free priorities</span>    
    <a href="#Lookahead_10_1" id="Lookahead_33_5" title="a reference to a single-file definition">Lookahead</a>.<span class="cons_Constructor"><a href="#Seq_11_11" id="Seq_33_15" title="a reference to a single-file definition">Seq</a></span> &gt; 
    <a href="#Lookaheads_13_1" id="Lookaheads_34_5" title="a reference to a single-file definition">Lookaheads</a>.<span class="cons_Constructor"><a href="#Alt_15_12" id="Alt_34_16" title="a reference to a single-file definition">Alt</a></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
