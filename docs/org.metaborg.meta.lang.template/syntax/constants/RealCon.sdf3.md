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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../aterms/Aterms.sdf3/#constants/RealCon_4_3" id="constants/RealCon_1_8" title="a definition with a single reference">constants/RealCon</a>

<span class="keyword">imports</span> <a href="../IntCon.sdf3/#constants/IntCon_1_8" id="constants/IntCon_3_9" title="a reference to a single-file definition">constants/IntCon</a>
                <a href="../NatCon.sdf3/#constants/NatCon_1_8" id="constants/NatCon_4_3" title="a reference to a single-file definition">constants/NatCon</a>

<span class="keyword">context-free syntax</span>
        <a href="#OptExp_10_56" id="OptExp_7_2" title="a definition with a single reference">OptExp</a>.<span class="cons_Constructor"><span id="Present_7_9" title="a definition with no references">Present</span></span> = &lt;<span class="cons_String">e</span>&lt;<a href="../IntCon.sdf3/#IntCon_8_2" id="IntCon_7_22" title="a reference to a single-file definition">IntCon</a>&gt;&gt; <span class="layout">//Change constructor name?</span>
        <a href="#OptExp_10_56" id="OptExp_8_2" title="a definition with a single reference">OptExp</a>.<span class="cons_Constructor"><span id="Absent_8_9" title="a definition with no references">Absent</span></span> = &lt;&gt;
        <span class="layout">//base:IntCon "." decimal:NatCon exp:OptExp  -&gt; RealCon {cons("real-con")}</span>
        <a href="../../aterms/Aterms.sdf3/#RealCon_15_17" id="RealCon_10_2" title="a definition with a single reference">RealCon</a>.<span class="cons_Constructor"><span id="RealCon_10_10" title="a definition with no references">RealCon</span></span> = &lt;&lt;<span class="cons_Unquoted"><span id="base_10_22" title="a definition with no references">base</span></span>:<a href="../IntCon.sdf3/#IntCon_8_2" id="IntCon_10_27" title="a reference to a single-file definition">IntCon</a>&gt;<span class="cons_String">.</span>&lt;<span class="cons_Unquoted"><span id="decimal_10_36" title="a definition with no references">decimal</span></span>:<a href="../NatCon.sdf3/#NatCon_5_2" id="NatCon_10_44" title="a reference to a single-file definition">NatCon</a>&gt;&lt;<span class="cons_Unquoted"><span id="exp_10_52" title="a definition with no references">exp</span></span>:<a href="#OptExp_7_2" id="OptExp_10_56" title="a reference to a single-file definition">OptExp</a>&gt;&gt;   
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
