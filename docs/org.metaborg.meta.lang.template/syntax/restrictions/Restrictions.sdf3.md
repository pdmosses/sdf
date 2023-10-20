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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../TemplateLang.sdf3/#restrictions/Restrictions_157_182" id="restrictions/Restrictions_7_32" title="Referenced at ../../TemplateLang.sdf3 line 10; ../../sdf2-core/Sdf2-Syntax.sdf3 line 14">restrictions/Restrictions</a>
  
<span class="keyword">imports</span> <a href="../../characterclass/CC.sdf3/#characterclass/CC_7_24" id="characterclass/CC_44_61" title="Defined at ../../characterclass/CC.sdf3 line 1">characterclass/CC</a> 
                <a href="../../characterclass/Character-Class.sdf3/#characterclass/Character-Class_7_37" id="characterclass/Character-Class_65_95" title="Defined at ../../characterclass/Character-Class.sdf3 line 1">characterclass/Character-Class</a>
                <a href="../../symbols/Symbols.sdf3/#symbols/Symbols_7_22" id="symbols/Symbols_98_113" title="Defined at ../../symbols/Symbols.sdf3 line 1">symbols/Symbols</a> 
                <a href="../../constants/StrCon.sdf3/#constants/StrCon_7_23" id="constants/StrCon_117_133" title="Defined at ../../constants/StrCon.sdf3 line 1">constants/StrCon</a>

<span class="keyword">context-free syntax</span>
  
<a href="#Lookahead_262_271" id="Lookahead_158_167" title="Referenced at line 13, 17, 33">Lookahead</a>.<span class="cons_Constructor"><span id="CharClass_168_177" title="Not referenced locally, nor via imports">CharClass</span></span> = &lt;&lt;<a href="../../characterclass/Character-Class.sdf3/#CharClass_456_465" id="CharClass_182_191" title="Defined at ../../characterclass/Character-Class.sdf3 line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;&gt;
<a href="#Lookahead_262_271" id="Lookahead_194_203" title="Referenced at line 13, 17, 33">Lookahead</a>.<span class="cons_Constructor"><a href="#Seq_758_761" id="Seq_204_207" title="Referenced at line 33">Seq</a></span> = &lt;&lt;<a href="../../characterclass/Character-Class.sdf3/#CharClass_456_465" id="CharClass_212_221" title="Defined at ../../characterclass/Character-Class.sdf3 line 17, 18, 20, 22, 24, 25">CharClass</a>&gt;<span class="cons_String">.</span>&lt;<a href="#Lookaheads_240_250" id="Lookaheads_224_234" title="Defined at line 13, 15, 16, 17">Lookaheads</a>&gt;&gt;  

<a href="#Lookaheads_224_234" id="Lookaheads_240_250" title="Referenced at line 11, 15, 16, 19, 34; ../../TemplateLang.sdf3 line 37">Lookaheads</a>.<span class="cons_Constructor"><span id="Single_251_257" title="Not referenced locally, nor via imports">Single</span></span> = &lt;&lt;<a href="#Lookahead_158_167" id="Lookahead_262_271" title="Defined at line 10, 11">Lookahead</a>&gt;&gt;
<span class="layout">//"left":Lookaheads "|" "right":Lookaheads -&gt; Lookaheads  {cons("alt"),right}</span>
<a href="#Lookaheads_224_234" id="Lookaheads_352_362" title="Referenced at line 11, 15, 16, 19, 34; ../../TemplateLang.sdf3 line 37">Lookaheads</a>.<span class="cons_Constructor"><a href="#Alt_780_783" id="Alt_363_366" title="Referenced at line 34">Alt</a></span> = &lt;&lt;<a href="#Lookaheads_240_250" id="Lookaheads_371_381" title="Defined at line 13, 15, 16, 17">Lookaheads</a>&gt; <span class="cons_String">|</span> &lt;<a href="#Lookaheads_240_250" id="Lookaheads_386_396" title="Defined at line 13, 15, 16, 17">Lookaheads</a>&gt;&gt; {<span class="keyword">right</span>}
<a href="#Lookaheads_224_234" id="Lookaheads_407_417" title="Referenced at line 11, 15, 16, 19, 34; ../../TemplateLang.sdf3 line 37">Lookaheads</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#Lookaheads_240_250" id="Lookaheads_423_433" title="Defined at line 13, 15, 16, 17">Lookaheads</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
<a href="#Lookaheads_224_234" id="Lookaheads_447_457" title="Referenced at line 11, 15, 16, 19, 34; ../../TemplateLang.sdf3 line 37">Lookaheads</a>.<span class="cons_Constructor"><span id="List_458_462" title="Not referenced locally, nor via imports">List</span></span> = &lt;<span class="cons_String">[[</span>&lt;<span class="cons_Unquoted"><span id="list_469_473" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#Lookahead_158_167" id="Lookahead_475_484" title="Defined at line 10, 11">Lookahead</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]]</span>&gt;

<a href="#Restriction_628_639" id="Restriction_497_508" title="Referenced at line 22">Restriction</a>.<span class="cons_Constructor"><span id="Follow_509_515" title="Not referenced locally, nor via imports">Follow</span></span> = &lt;&lt;<a href="#RestrictionSymbols_558_576" id="RestrictionSymbols_520_538" title="Defined at line 20">RestrictionSymbols</a>&gt; <span class="cons_String">-/-</span> &lt;<a href="#Lookaheads_240_250" id="Lookaheads_545_555" title="Defined at line 13, 15, 16, 17">Lookaheads</a>&gt;&gt;
<a href="#RestrictionSymbols_520_538" id="RestrictionSymbols_558_576" title="Referenced at line 19">RestrictionSymbols</a> = &lt;&lt;<span class="cons_Unquoted"><span id="list_581_585" title="Not referenced locally, nor via imports">list</span></span>:{<a href="../../symbols/Symbols.sdf3/#Symbol_71_77" id="Symbol_587_593" title="Defined at ../../symbols/Symbols.sdf3 line 7">Symbol</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;
 
<a href="#Restrictions_695_707" id="Restrictions_605_617" title="Referenced at line 27; ../../sdf2-core/Sdf2-Syntax.sdf3 line 40, 47">Restrictions</a> = &lt;&lt;<span class="cons_Unquoted"><span id="list_622_626" title="Not referenced locally, nor via imports">list</span></span>:{<a href="#Restriction_497_508" id="Restriction_628_639" title="Defined at line 19">Restriction</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;
 
<span id="Grammar_651_658" title="Not referenced locally, nor via imports">Grammar</span>.<span class="cons_Constructor"><span id="Restrictions_659_671" title="Not referenced locally, nor via imports">Restrictions</span></span> = &lt;
        <span class="cons_String">restrictions</span>
        
                &lt;<a href="#Restrictions_605_617" id="Restrictions_695_707" title="Defined at line 22">Restrictions</a>&gt;
        
        &gt;


<span class="keyword">context-free priorities</span>    
    <a href="#Lookahead_158_167" id="Lookahead_748_757" title="Defined at line 10, 11">Lookahead</a>.<span class="cons_Constructor"><a href="#Seq_204_207" id="Seq_758_761" title="Defined at line 11">Seq</a></span> &gt; 
    <a href="#Lookaheads_240_250" id="Lookaheads_769_779" title="Defined at line 13, 15, 16, 17">Lookaheads</a>.<span class="cons_Constructor"><a href="#Alt_363_366" id="Alt_780_783" title="Defined at line 15">Alt</a></span>
</code></pre></td></tr></tbody></table></div>