---
hide:
  - toc
---

# SDF3 – Syntax Definition Formalism

> [SDF3] is the third version of the _Syntax Definition Formalism_ meta-language in [Spoofax]
for defining the syntax of a language,
which is used for both parsing an input into an Abstract Syntax Tree (AST),
and to provide syntax highlighting.

> Through the use of _templates_,
SDF3 can also be used to define a pretty-printer.

SDF3 was originally called "The Template Language".

## Syntax

[TemplateLang.sdf3](syntax/TemplateLang.sdf3.md)

The syntax of SDF3 is defined in SDF3 itself.

This example demonstrates generation of a hyperlinked twin from a _bootstrapped_ meta-language definition.

## Name binding

[`main.stx`](trans/statix/main.stx.md)

The name binding of SDF3 is specified in [Statix] (for use in Spoofax 3).

[Spoofax]: https://spoofax.dev
[SDF3]: https://spoofax.dev/references/sdf3
[Statix]: https://spoofax.dev/references/statix/
