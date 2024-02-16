---
title: Character.sdf3
hide:
  - toc
---

# `Character.sdf3`

:simple-github: [pdmosses/sdf/org.metaborg.meta.lang.template/syntax/characterclass/Character.sdf3]

[pdmosses/sdf/org.metaborg.meta.lang.template/syntax/characterclass/Character.sdf3]: https://github.com/pdmosses/sdf/blob/master/org.metaborg.meta.lang.template/syntax/characterclass/Character.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="characterclass/Character_1_8" title="a definition with multiple references" data-urls="../Character-Class.sdf3/#characterclass/Character line 3_9; ../../sdf2-core/Sdf2.sdf3/#characterclass/Character line 9_3">characterclass/Character</button>

<span class="keyword">lexical syntax</span>
    <a href="#RegularChar_22_28" id="RegularChar_4_5" title="a definition with a single reference">RegularChar</a> = <span class="cons_Unquoted"><span id="character_4_19" title="a definition with no references">character</span></span>:[<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]
    <a href="#EscapedChar_23_33" id="EscapedChar_5_5" title="a definition with a single reference">EscapedChar</a> = <span class="cons_Unquoted"><span id="escape_5_19" title="a definition with no references">escape</span></span>:(~[<span class="cons_Decimal">\0</span>-<span class="cons_Decimal">\31</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] <span class="string">\/</span> [<span class="cons_Regular">f</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span><span class="cons_Regular">t</span><span class="cons_Regular">v</span>])
    <button class="modal-open" id="BinChar_6_5" title="a definition with multiple references" data-urls="#BinChar line 14_5, 24_34">BinChar</button> = <span class="cons_Unquoted"><span id="number_6_15" title="a definition with no references">number</span></span>:[<span class="cons_Regular">0</span><span class="cons_Regular">1</span>]+
    <button class="modal-open" id="OctChar_7_5" title="a definition with multiple references" data-urls="#OctChar line 15_5, 25_32">OctChar</button> = <span class="cons_Unquoted"><span id="number_7_15" title="a definition with no references">number</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">7</span>]+
    <button class="modal-open" id="NumChar_8_5" title="a definition with multiple references" data-urls="#NumChar line 16_5, 26_33">NumChar</button> = <span class="cons_Unquoted"><span id="number_8_15" title="a definition with no references">number</span></span>:<a href="#Zero_11_5" id="Zero_8_22" title="a reference to a single-file definition">Zero</a>
    <button class="modal-open" id="NumChar_9_5" title="a definition with multiple references" data-urls="#NumChar line 16_5, 26_33">NumChar</button> = <span class="cons_Unquoted"><span id="number_9_15" title="a definition with no references">number</span></span>:([<span class="cons_Regular">1</span>-<span class="cons_Regular">9</span>] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]*)
    <button class="modal-open" id="HexChar_10_5" title="a definition with multiple references" data-urls="#HexChar line 17_5, 27_39">HexChar</button> = <span class="cons_Unquoted"><span id="number_10_15" title="a definition with no references">number</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span>]+
    <button class="modal-open" id="Zero_11_5" title="a definition with multiple references" data-urls="#Zero line 8_22, 19_5">Zero</button> = <span class="cons_Lit">"0"</span>

<span class="keyword">lexical restrictions</span>
    <a href="#BinChar_6_5" id="BinChar_14_5" title="a reference to a single-file definition">BinChar</a> -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">1</span>]
    <a href="#OctChar_7_5" id="OctChar_15_5" title="a reference to a single-file definition">OctChar</a> -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">7</span>]
    <a href="#NumChar_8_5" id="NumChar_16_5" title="a reference to a single-file definition">NumChar</a> -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]
    <a href="#HexChar_10_5" id="HexChar_17_5" title="a reference to a single-file definition">HexChar</a> -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span>]

    <a href="#Zero_11_5" id="Zero_19_5" title="a reference to a single-file definition">Zero</a> -/- [<span class="cons_Regular">0</span><span class="cons_Regular">b</span><span class="cons_Regular">x</span>] <span class="layout">// To avoid clashes with Binary, Octal, and Hexadecimal</span>

<span class="keyword">syntax</span>
    <button class="modal-open" id="Character_22_5" title="a definition with multiple references" data-urls="../Character-Class.sdf3/#Character line 7_15, 8_27, 8_43">Character</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Regular_22_18" title="a definition with no references">Regular</span></span> = <a href="#RegularChar_4_5" id="RegularChar_22_28" title="a reference to a single-file definition">RegularChar</a><span class="keyword">-LEX</span>
    <button class="modal-open" id="Character_23_5" title="a definition with multiple references" data-urls="../Character-Class.sdf3/#Character line 7_15, 8_27, 8_43">Character</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Escaped_23_18" title="a definition with no references">Escaped</span></span> = <span class="cons_Lit">"\\"</span> <a href="#EscapedChar_5_5" id="EscapedChar_23_33" title="a reference to a single-file definition">EscapedChar</a><span class="keyword">-LEX</span>
    <button class="modal-open" id="Character_24_5" title="a definition with multiple references" data-urls="../Character-Class.sdf3/#Character line 7_15, 8_27, 8_43">Character</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Binary_24_18" title="a definition with no references">Binary</span></span> = <span class="cons_Lit">"\\0b"</span> <a href="#BinChar_6_5" id="BinChar_24_34" title="a reference to a single-file definition">BinChar</a><span class="keyword">-LEX</span>
    <button class="modal-open" id="Character_25_5" title="a definition with multiple references" data-urls="../Character-Class.sdf3/#Character line 7_15, 8_27, 8_43">Character</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Octal_25_18" title="a definition with no references">Octal</span></span> = <span class="cons_Lit">"\\0"</span> <a href="#OctChar_7_5" id="OctChar_25_32" title="a reference to a single-file definition">OctChar</a><span class="keyword">-LEX</span>
    <button class="modal-open" id="Character_26_5" title="a definition with multiple references" data-urls="../Character-Class.sdf3/#Character line 7_15, 8_27, 8_43">Character</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Decimal_26_18" title="a definition with no references">Decimal</span></span> = <span class="cons_Lit">"\\"</span> <a href="#NumChar_8_5" id="NumChar_26_33" title="a reference to a single-file definition">NumChar</a><span class="keyword">-LEX</span>
    <button class="modal-open" id="Character_27_5" title="a definition with multiple references" data-urls="../Character-Class.sdf3/#Character line 7_15, 8_27, 8_43">Character</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Hexadecimal_27_18" title="a definition with no references">Hexadecimal</span></span> = <span class="cons_Lit">"\\0x"</span> <a href="#HexChar_10_5" id="HexChar_27_39" title="a reference to a single-file definition">HexChar</a><span class="keyword">-LEX</span>

<span class="keyword">context-free syntax</span>
    <button class="modal-open" id="Character_30_5" title="a definition with multiple references" data-urls="../Character-Class.sdf3/#Character line 7_15, 8_27, 8_43">Character</button>.<span class="cons_Constructor"><span id="Bot_30_15" title="a definition with no references">Bot</span></span> = <span class="cons_Lit">"\\BOT"</span>
    <button class="modal-open" id="Character_31_5" title="a definition with multiple references" data-urls="../Character-Class.sdf3/#Character line 7_15, 8_27, 8_43">Character</button>.<span class="cons_Constructor"><span id="Top_31_15" title="a definition with no references">Top</span></span> = <span class="cons_Lit">"\\TOP"</span>
    <button class="modal-open" id="Character_32_5" title="a definition with multiple references" data-urls="../Character-Class.sdf3/#Character line 7_15, 8_27, 8_43">Character</button>.<span class="cons_Constructor"><span id="LabelStart_32_15" title="a definition with no references">LabelStart</span></span> = <span class="cons_Lit">"\\LABEL_START"</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
