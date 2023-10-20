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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Character-Class.sdf3/#characterclass/Character_47_71" id="characterclass/Character_7_31" title="Referenced at ../Character-Class.sdf3 line 3; ../../sdf2-core/Sdf2.sdf3 line 9">characterclass/Character</a>

<span class="keyword">lexical syntax</span>
    <a href="#RegularChar_538_549" id="RegularChar_52_63" title="Referenced at line 22">RegularChar</a> = <span class="cons_Unquoted"><span id="character_66_75" title="Not referenced locally, nor via imports">character</span></span>:[<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]
    <a href="#EscapedChar_586_597" id="EscapedChar_92_103" title="Referenced at line 23">EscapedChar</a> = <span class="cons_Unquoted"><span id="escape_106_112" title="Not referenced locally, nor via imports">escape</span></span>:(~[<span class="cons_Decimal">\0</span>-<span class="cons_Decimal">\31</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>] <span class="string">\/</span> [<span class="cons_Regular">f</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span><span class="cons_Regular">t</span><span class="cons_Regular">v</span>])
    <a href="#BinChar_337_344" id="BinChar_149_156" title="Referenced at line 14, 24">BinChar</a> = <span class="cons_Unquoted"><span id="number_159_165" title="Not referenced locally, nor via imports">number</span></span>:[<span class="cons_Regular">0</span><span class="cons_Regular">1</span>]+
    <a href="#OctChar_359_366" id="OctChar_176_183" title="Referenced at line 15, 25">OctChar</a> = <span class="cons_Unquoted"><span id="number_186_192" title="Not referenced locally, nor via imports">number</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">7</span>]+
    <a href="#NumChar_381_388" id="NumChar_204_211" title="Referenced at line 16, 26">NumChar</a> = <span class="cons_Unquoted"><span id="number_214_220" title="Not referenced locally, nor via imports">number</span></span>:<a href="#Zero_300_304" id="Zero_221_225" title="Defined at line 11">Zero</a>
    <a href="#NumChar_381_388" id="NumChar_230_237" title="Referenced at line 16, 26">NumChar</a> = <span class="cons_Unquoted"><span id="number_240_246" title="Not referenced locally, nor via imports">number</span></span>:([<span class="cons_Regular">1</span>-<span class="cons_Regular">9</span>] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]*)
    <a href="#HexChar_403_410" id="HexChar_266_273" title="Referenced at line 17, 27">HexChar</a> = <span class="cons_Unquoted"><span id="number_276_282" title="Not referenced locally, nor via imports">number</span></span>:[<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span>]+
    <a href="#Zero_221_225" id="Zero_300_304" title="Referenced at line 8, 19">Zero</a> = <span class="cons_Lit">"0"</span>

<span class="keyword">lexical restrictions</span>
    <a href="#BinChar_149_156" id="BinChar_337_344" title="Defined at line 6">BinChar</a> -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">1</span>]
    <a href="#OctChar_176_183" id="OctChar_359_366" title="Defined at line 7">OctChar</a> -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">7</span>]
    <a href="#NumChar_204_211" id="NumChar_381_388" title="Defined at line 8, 9">NumChar</a> -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]
    <a href="#HexChar_266_273" id="HexChar_403_410" title="Defined at line 10">HexChar</a> -/- [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span><span class="cons_Regular">A</span>-<span class="cons_Regular">F</span><span class="cons_Regular">a</span>-<span class="cons_Regular">f</span>]

    <a href="#Zero_300_304" id="Zero_432_436" title="Defined at line 11">Zero</a> -/- [<span class="cons_Regular">0</span><span class="cons_Regular">b</span><span class="cons_Regular">x</span>] <span class="layout">// To avoid clashes with Binary, Octal, and Hexadecimal</span>

<span class="keyword">syntax</span>
    <a href="../Character-Class.sdf3/#Character_108_117" id="Character_515_524" title="Referenced at ../Character-Class.sdf3 line 7, 8">Character</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Regular_528_535" title="Not referenced locally, nor via imports">Regular</span></span> = <a href="#RegularChar_52_63" id="RegularChar_538_549" title="Defined at line 4">RegularChar</a><span class="keyword">-LEX</span>
    <a href="../Character-Class.sdf3/#Character_108_117" id="Character_558_567" title="Referenced at ../Character-Class.sdf3 line 7, 8">Character</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Escaped_571_578" title="Not referenced locally, nor via imports">Escaped</span></span> = <span class="cons_Lit">"\\"</span> <a href="#EscapedChar_92_103" id="EscapedChar_586_597" title="Defined at line 5">EscapedChar</a><span class="keyword">-LEX</span>
    <a href="../Character-Class.sdf3/#Character_108_117" id="Character_606_615" title="Referenced at ../Character-Class.sdf3 line 7, 8">Character</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Binary_619_625" title="Not referenced locally, nor via imports">Binary</span></span> = <span class="cons_Lit">"\\0b"</span> <a href="#BinChar_149_156" id="BinChar_635_642" title="Defined at line 6">BinChar</a><span class="keyword">-LEX</span>
    <a href="../Character-Class.sdf3/#Character_108_117" id="Character_651_660" title="Referenced at ../Character-Class.sdf3 line 7, 8">Character</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Octal_664_669" title="Not referenced locally, nor via imports">Octal</span></span> = <span class="cons_Lit">"\\0"</span> <a href="#OctChar_176_183" id="OctChar_678_685" title="Defined at line 7">OctChar</a><span class="keyword">-LEX</span>
    <a href="../Character-Class.sdf3/#Character_108_117" id="Character_694_703" title="Referenced at ../Character-Class.sdf3 line 7, 8">Character</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Decimal_707_714" title="Not referenced locally, nor via imports">Decimal</span></span> = <span class="cons_Lit">"\\"</span> <a href="#NumChar_204_211" id="NumChar_722_729" title="Defined at line 8, 9">NumChar</a><span class="keyword">-LEX</span>
    <a href="../Character-Class.sdf3/#Character_108_117" id="Character_738_747" title="Referenced at ../Character-Class.sdf3 line 7, 8">Character</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Hexadecimal_751_762" title="Not referenced locally, nor via imports">Hexadecimal</span></span> = <span class="cons_Lit">"\\0x"</span> <a href="#HexChar_266_273" id="HexChar_772_779" title="Defined at line 10">HexChar</a><span class="keyword">-LEX</span>

<span class="keyword">context-free syntax</span>
    <a href="../Character-Class.sdf3/#Character_108_117" id="Character_809_818" title="Referenced at ../Character-Class.sdf3 line 7, 8">Character</a>.<span class="cons_Constructor"><span id="Bot_819_822" title="Not referenced locally, nor via imports">Bot</span></span> = <span class="cons_Lit">"\\BOT"</span>
    <a href="../Character-Class.sdf3/#Character_108_117" id="Character_837_846" title="Referenced at ../Character-Class.sdf3 line 7, 8">Character</a>.<span class="cons_Constructor"><span id="Top_847_850" title="Not referenced locally, nor via imports">Top</span></span> = <span class="cons_Lit">"\\TOP"</span>
    <a href="../Character-Class.sdf3/#Character_108_117" id="Character_865_874" title="Referenced at ../Character-Class.sdf3 line 7, 8">Character</a>.<span class="cons_Constructor"><span id="LabelStart_875_885" title="Not referenced locally, nor via imports">LabelStart</span></span> = <span class="cons_Lit">"\\LABEL_START"</span>

</code></pre></td></tr></tbody></table></div>