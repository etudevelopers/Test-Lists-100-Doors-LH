---
title: Learning Hour 1
layout: default
nav_order: 2
---

# Learning Hour 1: Writing the Test List
{: .no_toc }

Week 1 of the "100 doors" pair: produce a test list for the kata — no implementation yet.
{: .fs-6 .fw-300 }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Learning Goals 🎯

- Understand what a test list is and why writing one before coding helps clarify the problem
- Know the checklist for a well-formed test list item (clear input/output, an explicit rule, easy to turn into code)
- Practice writing and revising a test list on the "100 doors" kata, and cross-check it against the checklist

## Connect activity to get everyone thinking about the topic (⏱️ 10 min)

**Warm-up.** Before opening a laptop: guess, just from reading the kata statement, roughly how many of the 100
doors end up open. Don't compute it — trade guesses and the intuition behind them with your pair.

See [Connect Activities] in the [Samman Coaching] website for more ideas on how to connect with your team and
introduce the topic of this Learning Hour.

## An explanation of a new Concept or a coding demo (⏱️ 15 min)

**Why write a test list?** It clarifies the problem, groups and categorizes cases, surfaces edge cases, gives you
clear names for test classes and methods up front, doubles as a completion criterion for TDD, and builds shared
understanding when pairing or ensembling.

**Test lists + AI agents.** The same reasoning applies, even more so, when an AI coding agent is doing the typing.
A one-shot prompt hides which cases the agent actually covered — a wrong assumption early on quietly corrupts
everything built on top of it. Writing the test list first means scope is agreed *before* code exists, and feeding
the agent one item at a time gives you a checkpoint after each one, so a wrong turn gets caught early rather than
after the whole thing is built. See [Claude Code Best Practices] and [Coding assistants do not replace pair
programming] for more on why an incremental, reviewed workflow beats letting an agent run ahead unsupervised.

See [Concept Explanation] for the full checklist and a worked example (prime numbers), and the
[Concept Activities] in the [Samman Coaching] website for more ideas on how to introduce a new Concept or do a
coding demo.

## Concrete Practice in a coding exercise (⏱️ 45 min)

- Write a test list for the [100 doors kata](index.html#the-kata-100-doors) — do **not** implement anything yet
- Cross-check your list against the checklist in [Concept Explanation]
- Keep the list somewhere your pair (or a different pair) can pick it up unmodified next week

**Facilitator notes.** The rule is stated explicitly in the prompt, so groups rarely get stuck on *what* the code
should do — the richer conversation is in *how to structure the list*. Expect groups to gravitate toward one of
two shapes: enumerating small, concrete cases (door 1 after 1 pass, door 2 after 2 passes, ...) versus stating the
general rule up front (a door ends open iff its number is a perfect square) and writing cases that pin that rule
down. Both are valid test lists; if a group jumps straight to the general rule, ask them how they'd convince a
teammate who doubts it — that usually produces the boundary cases (door 1, door 100, the largest perfect square
≤ 100) the list was missing. Also watch for scale: some groups will want to test with 100 doors directly, others
will realize a smaller N (e.g. 10) is easier to reason about and generalizes just as well — both are fine, but the
choice is worth surfacing in the debrief. Do not let groups start implementing; if the list feels "obviously
right," push them to write down *why* rather than reaching for the editor.

See [Concrete Practice Activities] in the [Samman Coaching] website for more ideas on how to design a coding
exercise to practice the new Concept.

## Conclusions discussion and reflection (⏱️ 20 min)

- How close was your warm-up guess to what your test list implies?
- Did you converge on enumerated cases, the general rule, or a mix of both?
- Remember: a test list is a conjecture, not a full spec — the code is the proof
- What would make your list easy for *another* pair to implement from, next week, without asking you questions?

**Themes to listen for:** the warm-up guess is often wrong in an interesting way — that gap is exactly what the
test list should later explain; groups that name the general rule early still needed concrete boundary cases to
trust it; a list is only as reusable as it is self-explanatory — an item like "door 36 is open" is weaker than
"door 36 is open, because 36 is a perfect square."

See [Conclusions Activities] in the [Samman Coaching] website for more ideas on how to facilitate a discussion to
reflect on the learning experience and draw conclusions.

## References

- [Learning Hour] — the Samman format this session follows
- [Concept Explanation] — the full checklist and worked example
- [Miro board](https://miro.com/app/board/uXjVHl2sd10=/) — facilitation deck and your pair's frame
- [Learning Hour 2](learning-hour-2.html) — next week: recap this list and implement it
- [Samman Coaching] — [Connect Activities] · [Concept Activities] · [Concrete Practice Activities] · [Conclusions Activities]


[Learning Hour]: https://sammancoaching.org/reference/learning_hour_definition.html
[Concept Explanation]: explanation/concept-explanation.html
[Connect Activities]: https://sammancoaching.org/activities/connect.html
[Concept Activities]: https://sammancoaching.org/activities/concept.html
[Concrete Practice Activities]: https://sammancoaching.org/activities/concrete.html
[Conclusions Activities]: https://sammancoaching.org/activities/conclusions.html
[Samman Coaching]: https://sammancoaching.org/
[Claude Code Best Practices]: https://code.claude.com/docs/en/best-practices
[Coding assistants do not replace pair programming]: https://martinfowler.com/articles/exploring-gen-ai/05-not-your-pair-programmer.html
