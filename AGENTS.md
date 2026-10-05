This repository holds the facilitation material for a two-session "Test Lists" Learning Hour built around the
100 doors kata. It is a [Jekyll] site (in `site/`) styled with the [Just the Docs] theme and deployed to GitHub
Pages by `.github/workflows/pages.yml`. The test lists are written on the linked Miro board; the root also holds a
minimal Java 17 / Maven project (`pom.xml`, `src/`) where pairs implement the kata in week 2. Keep `src/main`
empty: choosing the shape of the production code is part of the exercise.

`site/index.md` is the landing page; `site/learning-hour-1.md` and `site/learning-hour-2.md` are the two
sessions; `site/explanation/` holds background reading (the test list checklist and worked example).

[Jekyll]: https://jekyllrb.com
[Just the Docs]: https://just-the-docs.github.io/just-the-docs/
