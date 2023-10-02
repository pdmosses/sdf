---
title: RealCon.sdf3
hide:
  - toc
---

# `RealCon.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/constants/RealCon.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/constants/RealCon.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/constants/RealCon.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../aterms/Aterms.sdf3#constants/RealCon_50_67" id="constants/RealCon_7_24" title="Referenced at ../../aterms/Aterms.sdf3 line 4">constants/RealCon</a>

<span class="keyword">imports</span> <a href="../IntCon.sdf3#constants/IntCon_7_23" id="constants/IntCon_34_50" title="Defined at ../IntCon.sdf3 line 1">constants/IntCon</a>
                <a href="../NatCon.sdf3#constants/NatCon_7_23" id="constants/NatCon_53_69" title="Defined at ../NatCon.sdf3 line 1">constants/NatCon</a>

<span class="keyword">context-free syntax</span>
        <a href="#OptExp_299_305" id="OptExp_92_98" title="Referenced at line 10">OptExp</a>.<span class="cons_Constructor"><span id="Present_99_106" title="Not referenced locally, nor via imports">Present</span></span> = &lt;<span class="cons_String">e</span>&lt;<a href="../IntCon.sdf3#IntCon_93_99" id="IntCon_112_118" title="Defined at ../IntCon.sdf3 line 8, 11, 13">IntCon</a>&gt;&gt; <span class="layout">//Change constructor name?</span>
        <a href="#OptExp_299_305" id="OptExp_149_155" title="Referenced at line 10">OptExp</a>.<span class="cons_Constructor"><span id="Absent_156_162" title="Not referenced locally, nor via imports">Absent</span></span> = &lt;&gt;
        <span class="layout">//base:IntCon "." decimal:NatCon exp:OptExp  -&gt; RealCon {cons("real-con")}</span>
        <span id="RealCon_245_252" title="Not referenced locally, nor via imports">RealCon</span>.<span class="cons_Constructor"><span id="RealCon_253_260" title="Not referenced locally, nor via imports">RealCon</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="base_265_269" title="Not referenced locally, nor via imports">base</span></span>:<a href="../IntCon.sdf3#IntCon_93_99" id="IntCon_270_276" title="Defined at ../IntCon.sdf3 line 8, 11, 13">IntCon</a>&gt;<span class="cons_String">.</span>&lt;<span class="cons_Unquoted"><span id="decimal_279_286" title="Not referenced locally, nor via imports">decimal</span></span>:<a href="../NatCon.sdf3#NatCon_44_50" id="NatCon_287_293" title="Defined at ../NatCon.sdf3 line 5">NatCon</a>&gt;&lt;<span class="cons_Unquoted"><span id="exp_295_298" title="Not referenced locally, nor via imports">exp</span></span>:<a href="#OptExp_92_98" id="OptExp_299_305" title="Defined at line 7, 8">OptExp</a>&gt;&gt;   
</code></pre></td></tr></tbody></table></div>