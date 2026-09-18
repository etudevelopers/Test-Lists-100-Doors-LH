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

## Learning Goals 🎯 (⏱️ 2 min)

- Understand what a test list is and why writing one before coding helps clarify the problem
- Know the checklist for a well-formed test list item (clear input/output, an explicit rule, easy to turn into code)
- Practice writing and revising a test list on the "100 doors" kata, and cross-check it against the checklist

## Connect activity to get everyone thinking about the topic (⏱️ 5 min)

**Warm-up.** Think of a bug you once shipped that a more complete test list would have caught before you wrote
any code. In pairs, share what case you missed — and what would have made it easier to see up front.

See [Connect Activities] in the [Samman Coaching] website for more ideas on how to connect with your team and
introduce the topic of this Learning Hour.

## An explanation of a new Concept or a coding demo (⏱️ 8 min)

**Why write a test list? (⏱️ 2 min)** It clarifies the problem, groups and categorizes cases, surfaces edge cases,
gives you clear names for test classes and methods up front, doubles as a completion criterion for TDD, and builds
shared understanding when pairing or ensembling.

**Test lists + AI agents. (⏱️ 2 min)** The same reasoning applies, even more so, when an AI coding agent is doing
the typing. A one-shot prompt hides which cases the agent actually covered — a wrong assumption early on quietly
corrupts everything built on top of it. Writing the test list first means scope is agreed *before* code exists,
and feeding the agent one item at a time gives you a checkpoint after each one, so a wrong turn gets caught early
rather than after the whole thing is built. See [Claude Code Best Practices] and [Coding assistants do not replace
pair programming] for more on why an incremental, reviewed workflow beats letting an agent run ahead unsupervised.

**Checklist (⏱️ 2 min)** and **Example: leap year (⏱️ 2 min)** are covered on their own slides — see
[Concept Explanation] for the full checklist and worked example, and the [Concept Activities] in the
[Samman Coaching] website for more ideas on how to introduce a new Concept or do a coding demo.

## Concrete Practice in a coding exercise (⏱️ 30 min)

- Write a test list for the [100 doors kata](index.html#the-kata-100-doors) — do **not** implement anything yet
- Cross-check your list against the checklist in [Concept Explanation]
- Keep the list somewhere your pair (or a different pair) can pick it up unmodified next week

**Finished early?** Review what you worked through in the [previous Learning Hour board](https://miro.com/app/board/uXjVH07M1TQ=/?share_link_id=561303950340).

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

## Conclusions discussion and reflection (⏱️ 2 min)

- Revisit the bug you shared in the warm-up — would today's test list have caught it?
- What would make your list easy for *another* pair to implement from, next week, without asking you questions?
- Which item on your list are you least confident about, and what would it take to make it more precise?
- If another pair picked up your list next week with zero context, would they land on the same tests you would?

**Themes to listen for:** the warm-up bug is often the same *shape* of miss the group is about to make again —
naming it early makes it easier to catch on this list; groups that name the general rule early still needed
concrete boundary cases to trust it; a list is only as reusable as it is self-explanatory — an item like
"door 36 is open" is weaker than "door 36 is open, because 36 is a perfect square."

**Your take-aways (⏱️ 5 min).** Add one light-yellow sticky per person to the take-aways area on the Miro board
with your key takeaway from the session.

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
