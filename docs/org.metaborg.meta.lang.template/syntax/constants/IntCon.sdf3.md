---
title: IntCon.sdf3
hide:
  - toc
---

# `IntCon.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/constants/IntCon.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/constants/IntCon.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/constants/IntCon.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="constants/IntCon_1_8" title="a definition with multiple references" data-urls="../RealCon.sdf3/#constants/IntCon line 3_9; ../../aterms/Aterms.sdf3/#constants/IntCon line 3_9; ../../regular/Regular.sdf3/#constants/IntCon line 3_23">constants/IntCon</button>

<span class="keyword">imports</span> <a href="../../layout/Whitespace.sdf3/#layout/Whitespace_1_8" id="layout/Whitespace_3_9" title="a reference to a single-file definition">layout/Whitespace</a>
        <a href="../NatCon.sdf3/#constants/NatCon_1_8" id="constants/NatCon_4_2" title="a reference to a single-file definition">constants/NatCon</a>

<span class="keyword">context-free syntax</span>
 
        <button class="modal-open" id="IntCon_8_2" title="a definition with multiple references" data-urls="../RealCon.sdf3/#IntCon line 7_22, 10_27; ../../aterms/Aterms.sdf3/#IntCon line 14_16">IntCon</button>.<span class="cons_Constructor"><span id="Natural_8_9" title="a definition with no references">Natural</span></span> = &lt;&lt;<a href="../NatCon.sdf3/#NatCon_5_2" id="NatCon_8_21" title="a reference to a single-file definition">NatCon</a>&gt;&gt;
        
        <span class="layout">//pos:"+" NatCon -&gt; IntCon {cons("positive")}</span>
        <button class="modal-open" id="IntCon_11_2" title="a definition with multiple references" data-urls="../RealCon.sdf3/#IntCon line 7_22, 10_27; ../../aterms/Aterms.sdf3/#IntCon line 14_16">IntCon</button>.<span class="cons_Constructor"><span id="Positive_11_9" title="a definition with no references">Positive</span></span> = &lt;<span class="cons_String">+</span>&lt;<a href="../NatCon.sdf3/#NatCon_5_2" id="NatCon_11_23" title="a reference to a single-file definition">NatCon</a>&gt;&gt;
        <span class="layout">//neg:"-" NatCon -&gt; IntCon {cons("negative")}</span>
        <button class="modal-open" id="IntCon_13_2" title="a definition with multiple references" data-urls="../RealCon.sdf3/#IntCon line 7_22, 10_27; ../../aterms/Aterms.sdf3/#IntCon line 14_16">IntCon</button>.<span class="cons_Constructor"><span id="Negative_13_9" title="a definition with no references">Negative</span></span> = &lt;<span class="cons_String">-</span>&lt;<a href="../NatCon.sdf3/#NatCon_5_2" id="NatCon_13_23" title="a reference to a single-file definition">NatCon</a>&gt;&gt;
    

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
