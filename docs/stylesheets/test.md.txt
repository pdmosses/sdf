# Test Highlighting

<pre class="TemplateLang"><code>
/* Tokens: */

<span class="keyword">keyword {
  color: rgb(127 0 85);
  font-weight: bold;
}</span>

<span class="identifier">identifier {
  color: --md-code-fg-color;
}</span>

<span class="string">string {
  color: rgb(0 0 255);
}</span>

<span class="number">number {
  color: rgb(0 128 0);
}</span>

<span class="var">var {
  color: rgb(139 69 19);
  font-style: italic;
}</span>

<span class="operator">operator {
  color: rgb(0 0 128);
}</span>

<span class="layout">layout {
  color: rgb(63 127 95);
  font-style: italic;
}</span>

// Constructors:

<span class="cons_String">cons_String {
  color: rgb(0 0 255);
}</span>

<span class="cons_Constructor">cons_Constructor {
  color: rgb(0 0 128);
}</span>

<span class="cons_Lit">cons_Lit,
<span class="cons_CiLit">cons_CiLit {
  color: rgb(0 0 255);
}</span>

<span class="cons_Quoted">cons_Quoted,
<span class="cons_Unquoted">cons_Unquoted {
  color: rgb(128 128 128);
}</span>

<span class="cons_PosRef">cons_PosRef {
  color: rgb(0 128 0);
}</span>

<span class="cons_LiteralRef">cons_LiteralRef {
  color: rgb(0 0 255);
}</span>

<span class="cons_LabelRef">cons_LabelRef {
  color: rgb(128 128 128);
}</span>

<span class="cons_Regular">cons_Regular {
  color: rgb(0 128 0);
}</span>

<span class="cons_Binary">cons_Binary {
  color: rgb(127 0 85);
}</span>

<span class="cons_Octal">cons_Octal {
  color: rgb(127 0 85);
}</span>

<span class="cons_Decimal">cons_Decimal {
  color: rgb(127 0 85);
}</span>

<span class="cons_Hexadecimal">cons_Hexadecimal {
  color: rgb(127 0 85);
}</span>

// Sorts:

<span class="sort_Label">sort_Label {
  color: rgb(128 128 128);
}</span>

<span class="sort_Character">sort_Character {
  color: rgb(0 0 255);
}</span>

// Sorts with constructors:

<span class="sort_Character cons_Regular">sort_Character.cons_Regular {
  color: rgb(0 128 0);
}</span>
</code></pre>
