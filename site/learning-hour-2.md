---
title: Learning Hour 2
layout: default
nav_order: 3
---

# Learning Hour 2: Implementing from the Test List
{: .no_toc }

Week 2 of the "100 doors" pair: recap the test list from [Learning Hour 1](learning-hour-1.html) and implement it.
{: .fs-6 .fw-300 }

> 🚧 **Work in progress.** This session's agenda, timings, and Miro slides haven't been finalized yet — content
> below is a draft and subject to change before week 2.

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Learning Goals 🎯

- Turn a test list written by someone else (or by your past self) into passing tests, one at a time
- Practice ordering a test list for implementation, not just for coverage
- Notice where red-green-refactor surfaces gaps or ambiguity the list didn't catch

## Connect activity to get everyone thinking about the topic (⏱️ 10 min)

**Warm-up.** Swap test lists with another pair (or re-read your own from last week). Without implementing
anything yet, pick which item you'd implement *first* and say why. Compare choices across pairs.

See [Connect Activities] in the [Samman Coaching] website for more ideas on how to connect with your team and
introduce the topic of this Learning Hour.

## An explanation of a new Concept or a coding demo (⏱️ 15 min)

**Test list re-cap.** A test list is a conjecture: it says what should be true, not how to make it true. Today's
job is turning each item into a real, passing test — one at a time, red before green, so each item earns its own
checkpoint instead of one large leap from list to finished code.

**Test list ordering.** Coverage order and implementation order aren't the same thing. A good implementation
order starts with the simplest case that forces real logic (not a degenerate one that's trivially true), and
builds toward the general rule — each new test should force a small, deliberate step in the production code, not
a rewrite. If two items would pass from the same code change, that's a sign your list has redundancy, or that
you're about to learn something about the rule by trying.

See [Concept Explanation] for the full checklist and the worked example, and the [Concept Activities] in the
[Samman Coaching] website for more ideas on how to introduce a new Concept or do a coding demo.

## Concrete Practice in a coding exercise (⏱️ 45 min)

- Order your test list for implementation, then implement it one item at a time: red, green, refactor
- If you still have time, extend the kata: what changes if there are 1,000 doors instead of 100? Does your
  implementation, and your test list, still hold up?
- Before moving on, check: does the final code reveal the general rule (a door ends open iff its number is a
  perfect square) more clearly than the list did, or less?

**Facilitator notes.** Expect the first implemented test to take the longest — pairs are deciding on a shape for
the production code (a `Door` type? a plain boolean array? a function from pass count to end state?) as much as
making the first assertion pass. After that, watch for pairs who reach the general-rule item early and are
tempted to jump straight to a closed-form implementation (`isPerfectSquare(n)`) — that's a legitimate refactor
step, not a shortcut to skip, so ask them to get there by refactoring from a passing brute-force version rather
than replacing it outright. The 1,000-doors extension is a good pressure test for whether the list's assertions
were phrased in terms of the rule or hard-coded to specific door numbers.

See [Concrete Practice Activities] in the [Samman Coaching] website for more ideas on how to design a coding
exercise to practice the new Concept.

## Conclusions discussion and reflection (⏱️ 20 min)

- Was implementing from someone else's list different from implementing your own?
- Did your chosen implementation order hold up, or did you reorder mid-session?
- Did any item turn out to be untestable, redundant, or wrong once you tried to implement it?
- How did the code's final shape compare to the test list's shape — did one make the rule clearer than the other?

**Themes to listen for:** implementing someone else's list surfaces exactly the ambiguity a good list should have
avoided — that's useful signal for next time, not a failure of this session; ordering by "simplest case that
forces real logic" beats ordering by "easiest to type first"; refactoring from a working brute-force version to
the closed-form rule is where the general rule actually gets *proven*, not just asserted.

See [Conclusions Activities] in the [Samman Coaching] website for more ideas on how to facilitate a discussion to
reflect on the learning experience and draw conclusions.

## References

- [Learning Hour] — the Samman format this session follows
- [Concept Explanation] — the full checklist and worked example
- [Miro board](https://miro.com/app/board/uXjVHl2sd10=/) — facilitation deck and your pair's frame
- [Learning Hour 1](learning-hour-1.html) — last week: writing the test list this session implements
- [Samman Coaching] — [Connect Activities] · [Concept Activities] · [Concrete Practice Activities] · [Conclusions Activities]


[Learning Hour]: https://sammancoaching.org/reference/learning_hour_definition.html
[Concept Explanation]: explanation/concept-explanation.html
[Connect Activities]: https://sammancoaching.org/activities/connect.html
[Concept Activities]: https://sammancoaching.org/activities/concept.html
[Concrete Practice Activities]: https://sammancoaching.org/activities/concrete.html
[Conclusions Activities]: https://sammancoaching.org/activities/conclusions.html
[Samman Coaching]: https://sammancoaching.org/
