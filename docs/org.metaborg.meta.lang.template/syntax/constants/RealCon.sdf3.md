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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../aterms/Aterms.sdf3/#constants/RealCon_3_2" id="constants/RealCon_1_8" title="Referenced at ../../aterms/Aterms.sdf3 line 4">constants/RealCon</a>

<span class="keyword">imports</span> <a href="../IntCon.sdf3/#constants/IntCon_0_7" id="constants/IntCon_3_9" title="Defined at ../IntCon.sdf3 line 1">constants/IntCon</a>
                <a href="../NatCon.sdf3/#constants/NatCon_0_7" id="constants/NatCon_4_3" title="Defined at ../NatCon.sdf3 line 1">constants/NatCon</a>

<span class="keyword">context-free syntax</span>
        <a href="#OptExp_9_55" id="OptExp_7_2" title="Referenced at line 10">OptExp</a>.<span class="cons_Constructor"><span id="Present_7_9" title="Not referenced locally, nor via imports">Present</span></span> = &lt;<span class="cons_String">e</span>&lt;<a href="../IntCon.sdf3/#IntCon_7_1" id="IntCon_7_22" title="Defined at ../IntCon.sdf3 line 8, 11, 13">IntCon</a>&gt;&gt; <span class="layout">//Change constructor name?</span>
        <a href="#OptExp_9_55" id="OptExp_8_2" title="Referenced at line 10">OptExp</a>.<span class="cons_Constructor"><span id="Absent_8_9" title="Not referenced locally, nor via imports">Absent</span></span> = &lt;&gt;
        <span class="layout">//base:IntCon "." decimal:NatCon exp:OptExp  -&gt; RealCon {cons("real-con")}</span>
        <a href="../../aterms/Aterms.sdf3/#RealCon_14_16" id="RealCon_10_2" title="Referenced at ../../aterms/Aterms.sdf3 line 15">RealCon</a>.<span class="cons_Constructor"><span id="RealCon_10_10" title="Not referenced locally, nor via imports">RealCon</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="base_10_22" title="Not referenced locally, nor via imports">base</span></span>:<a href="../IntCon.sdf3/#IntCon_7_1" id="IntCon_10_27" title="Defined at ../IntCon.sdf3 line 8, 11, 13">IntCon</a>&gt;<span class="cons_String">.</span>&lt;<span class="cons_Unquoted"><span id="decimal_10_36" title="Not referenced locally, nor via imports">decimal</span></span>:<a href="../NatCon.sdf3/#NatCon_4_1" id="NatCon_10_44" title="Defined at ../NatCon.sdf3 line 5">NatCon</a>&gt;&lt;<span class="cons_Unquoted"><span id="exp_10_52" title="Not referenced locally, nor via imports">exp</span></span>:<a href="#OptExp_6_1" id="OptExp_10_56" title="Defined at line 7, 8">OptExp</a>&gt;&gt;   
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
