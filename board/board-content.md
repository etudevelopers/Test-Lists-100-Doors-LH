# Test Lists - 100 doors - LH

Board: https://miro.com/app/board/uXjVHl2sd10=/

Verbatim transcription of the Miro board content, captured via the Miro MCP.

## Title

**Test Lists**
100 doors — Learning hour

## Learning Goals

- Understand what a test list is and why writing one before coding helps clarify the problem
- Know the checklist for a well-formed test list item (clear input/output, an explicit rule, easy to turn into code)
- Practice writing and revising a test list on the 100 doors kata, and cross-check it against the checklist

## Warm up

Before opening a laptop: guess, just from reading the kata statement, roughly how many of the 100 doors end up open.

Don't compute it — trade guesses and the intuition behind them with your pair.

## Why write a test list?

- Clarifies the problem before you start coding
- Groups and categorizes the cases you'll need
- Surfaces edge cases early, while they're cheap to spot
- Gives you clear names for test classes and methods up front
- Doubles as a completion criterion for TDD — you're done when the list is covered
- Builds shared understanding when pairing or ensembling

## Test lists + AI agents

The same reasoning applies, even more so, when an AI coding agent is doing the typing.

A one-shot prompt hides which cases the agent actually covered — a wrong assumption early on quietly corrupts everything built on top of it.

Writing the test list first means scope is agreed before code exists, and feeding the agent one item at a time gives you a checkpoint after each one, so a wrong turn gets caught early rather than after the whole thing is built.

[Claude Code Best Practices](https://code.claude.com/docs/en/best-practices) · [Coding assistants do not replace pair programming](https://martinfowler.com/articles/exploring-gen-ai/05-not-your-pair-programmer.html)

## Checklist

A good test list item has:

- A clear before/after, or input/output
- Its motivation or associated rule, in plain language
- A shape that's easy to translate into code
- Only the fundamentals — a test list is not a full spec (the list is a conjecture, the code is the proof)

## Example: prime numbers

A prime number is a natural number with exactly two distinct, positive divisors.

- 1 is not prime — it has only one distinct divisor
- 2 is prime — 1 × 2
- 4 is not prime — it has more than two divisors
- 0 is not prime — it isn't a natural number (edge case)

New examples are easy to generate once the rule is explicit — that's the point of writing the rule down next to the case, not just the numbers.

## Practice

**100 doors.** 100 doors in a row are all initially closed. You make 100 passes by the doors. The first time through, you visit every door and toggle it. The second time you only visit every 2nd door. The third time, every 3rd door, etc, until you only visit the 100th door.

Question: what state are the doors in after the last pass? Which are open, which are closed?

- Write a test list for this kata — do not implement anything yet
- Cross-check your list against the Checklist

## Wrap up

- How close was your warm-up guess to what your test list implies?
- Did you converge on enumerated cases, the general rule, or a mix of both?
- Remember: a test list is a conjecture, not a full spec — the code is the proof
- What would make your list easy for another pair to implement from, next week, without asking you questions?

## Team frames (x4)

Each of the 4 "Team member 1, Team member 2" frames holds:

**100 doors**
100 doors in a row are all initially closed. Make 100 passes: pass n toggles every nth door. What state are the doors in after the last pass?

*(caption)* Drop your test list stickies below — with an empty working area below it for each pair's stickies.

## Your take-aways

*(caption)* Add one light-yellow sticky per person with your key takeaway — with an empty working area for stickies.
