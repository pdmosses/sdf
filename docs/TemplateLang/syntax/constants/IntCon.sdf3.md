---
title: IntCon.sdf3
---

# `IntCon.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/constants/IntCon.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/constants/IntCon.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/constants/IntCon.sdf3 "The source file on GitHub"

<div class="TemplateLang"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../regular/Regular.sdf3#constants/IntCon_46_62" id="constants/IntCon_7_23" title="Referenced at ../../regular/Regular.sdf3 line 3">constants/IntCon</a>

<span class="keyword">imports</span> <a href="../../layout/Whitespace.sdf3#layout/Whitespace_7_24" id="layout/Whitespace_33_50" title="Defined at ../../layout/Whitespace.sdf3 line 1">layout/Whitespace</a>
        <a href="../NatCon.sdf3#constants/NatCon_7_23" id="constants/NatCon_52_68" title="Defined at ../NatCon.sdf3 line 1">constants/NatCon</a>

<span class="keyword">context-free syntax</span>
 
        <a href="../../aterms/Aterms.sdf3#IntCon_230_236" id="IntCon_93_99" title="Referenced at ../../aterms/Aterms.sdf3 line 14; ../RealCon.sdf3 line 10">IntCon</a>.<span class="cons_Constructor"><span id="Natural_100_107" title="Not referenced locally, nor via imports">Natural</span></span> = &lt;&lt;<a href="../NatCon.sdf3#NatCon_44_50" id="NatCon_112_118" title="Defined at ../NatCon.sdf3 line 5">NatCon</a>&gt;&gt;
        
        <span class="layout">//pos:"+" NatCon -&gt; IntCon {cons("positive")}</span>
        <a href="../../aterms/Aterms.sdf3#IntCon_230_236" id="IntCon_171_177" title="Referenced at ../../aterms/Aterms.sdf3 line 14; ../RealCon.sdf3 line 10">IntCon</a>.<span class="cons_Constructor"><span id="Positive_178_186" title="Not referenced locally, nor via imports">Positive</span></span> = &lt;<span class="cons_String">+</span>&lt;<a href="../NatCon.sdf3#NatCon_44_50" id="NatCon_192_198" title="Defined at ../NatCon.sdf3 line 5">NatCon</a>&gt;&gt;
        <span class="layout">//neg:"-" NatCon -&gt; IntCon {cons("negative")}</span>
        <a href="../../aterms/Aterms.sdf3#IntCon_230_236" id="IntCon_249_255" title="Referenced at ../../aterms/Aterms.sdf3 line 14; ../RealCon.sdf3 line 10">IntCon</a>.<span class="cons_Constructor"><span id="Negative_256_264" title="Not referenced locally, nor via imports">Negative</span></span> = &lt;<span class="cons_String">-</span>&lt;<a href="../NatCon.sdf3#NatCon_44_50" id="NatCon_270_276" title="Defined at ../NatCon.sdf3 line 5">NatCon</a>&gt;&gt;
    

</code></pre></td></tr></tbody></table></div>