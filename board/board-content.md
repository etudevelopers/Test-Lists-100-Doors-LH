# Test Lists - 100 doors - LH

Board: https://miro.com/app/board/uXjVHl2sd10=/

Verbatim transcription of the Miro board content, captured via the Miro MCP.

## Title

**Test Lists**
100 doors — Learning hour

## Learning Goals (2 min)

- Understand what a test list is and why writing one before coding helps clarify the problem
- Know the checklist for a well-formed test list item (clear input/output, an explicit rule, easy to turn into code)
- Practice writing and revising a test list on the 100 doors kata, and cross-check it against the checklist

## Warm up (5 min)

Think of a bug you once shipped that a more complete test list would have caught before you wrote any code.

In pairs, share what case you missed — and what would have made it easier to see up front.

## Why write a test list? (2 min)

- Clarifies the problem before you start coding
- Groups and categorizes the cases you'll need
- Surfaces edge cases early, while they're cheap to spot
- Gives you clear names for test classes and methods up front
- Doubles as a completion criterion for TDD — you're done when the list is covered
- Builds shared understanding when pairing or ensembling

## Test lists + AI agents (2 min)

The same reasoning applies, even more so, when an AI coding agent is doing the typing.

A one-shot prompt hides which cases the agent actually covered — a wrong assumption early on quietly corrupts everything built on top of it.

Writing the test list first means scope is agreed before code exists, and feeding the agent one item at a time gives you a checkpoint after each one, so a wrong turn gets caught early rather than after the whole thing is built.

[Claude Code Best Practices](https://code.claude.com/docs/en/best-practices) · [Coding assistants do not replace pair programming](https://martinfowler.com/articles/exploring-gen-ai/05-not-your-pair-programmer.html)

## Checklist (2 min)

A good test list item has:

- A clear before/after, or input/output
- Its motivation or associated rule, in plain language
- A shape that's easy to translate into code
- Only the fundamentals — a test list is not a full spec (the list is a conjecture, the code is the proof)

## Example: leap year (2 min)

Rule: a year is a leap year if divisible by 4, except centuries, which must be divisible by 400.

- input: 2024 → output: leap (divisible by 4, not a century)
- input: 2023 → output: not leap (not divisible by 4)
- input: 1900 → output: not leap (a century, but not divisible by 400)
- input: 2000 → output: leap (a century, divisible by 400 — edge case)

Each row is a clear input/output pair, next to the rule that explains it — that's what makes new examples easy to generate.

## Practice (30 min)

**100 doors.** 100 doors in a row are all initially closed. You make 100 passes by the doors. The first time through, you visit every door and toggle it. The second time you only visit every 2nd door. The third time, every 3rd door, etc, until you only visit the 100th door.

Question: what state are the doors in after the last pass? Which are open, which are closed?

- Write a test list for this kata — do not implement anything yet
- Cross-check your list against the Checklist

*(footer link)* Finished early? Review what you worked through in the previous Learning Hour: [previous Learning Hour board](https://miro.com/app/board/uXjVH07M1TQ=/?share_link_id=561303950340)

## Wrap up (2 min)

- Revisit the bug you shared in the warm-up — would today's test list have caught it?
- What would make your list easy for another pair to implement from, next week, without asking you questions?
- Which item on your list are you least confident about, and what would it take to make it more precise?
- If another pair picked up your list next week with zero context, would they land on the same tests you would?

## Team frames (x4)

Each of the 4 "Team member 1, Team member 2" frames holds:

**100 doors**
100 doors in a row are all initially closed. Make 100 passes: pass n toggles every nth door. What state are the doors in after the last pass?

*(caption)* Drop your test list stickies below — with an empty working area below it for each pair's stickies.

## Your take-aways (5 min)

*(caption)* Add one light-yellow sticky per person with your key takeaway — with an empty working area for stickies.
