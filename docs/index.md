# Home

This website is a _hyperlinked twin_ of part of the [SDF repo],
which is used by the [Spoofax language workbench][Spoofax].

It supports online code navigation by enhancing the raw code from the repo with syntax-based highlighting,
and with hyperlinks between declarations of and references to names.

Both the highlighting and the hyperlinks are generated from the metadata used by Spoofax.

Spoofax is used to generate the sources of the webpages from raw files in the SDF3 metalanguage:

- `docs/TemplateLang/DIR/FILE.sdf3.md` is generated from `metaborg/sdf/org.metaborg.meta.lang.template/DIR/FILE.sdf3`
- `docs/TemplateLang/DIR/.pages` is generated from `metaborg/sdf/org.metaborg.meta.lang.template/DIR/`

!!! warning

    The implementation and the generated website have not yet been reviewed by the Spoofax developers.

The aim is for a future release of Spoofax to support generation of hyperlinked twins
from code in all the [Spoofax meta-languages].

The [Material for MkDocs] theme builds this website from the generated Markdown files.

!!! note

    Currently, the generated CSS used for the syntax highlighting does not support a dark mode.


The [mkdocs-awesome-pages-plugin]
generates the directory titles in the navigation from the settings in the `.pages` files,
overriding the built-in title transformation made by MkDocs.[^mkdocs-issue]

[^mkdocs-issue]: See <https://github.com/mkdocs/mkdocs/issues/2086>.

[Spoofax]: https://spoofax.dev
[Spoofax meta-languages]: https://spoofax.dev/references/#spoofax-meta-languages
[SDF repo]: https://github.com/metaborg/sdf
[Material for MkDocs]: https://squidfunk.github.io/mkdocs-material
[mkdocs-awesome-pages-plugin]: https://github.com/lukasgeiter/mkdocs-awesome-pages-plugin
