---
title: Concept Explanation
layout: default
parent: Explanation
nav_order: 1
---

# Concept Explanation
{: .no_toc }

What makes a good test list item, illustrated with a worked example.
{: .fs-6 .fw-300 }

A **test list** is the set of cases you write down *before* you write any test or production code. It is a
conjecture about what needs to be covered — not a full specification. The code that eventually makes each item
pass is the proof.

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Why write a test list?

- Clarifies the problem before you start coding
- Groups and categorizes the cases you'll need
- Surfaces edge cases early, while they're cheap to spot
- Gives you clear names for test classes and methods up front
- Doubles as a completion criterion for TDD — you're done when the list is covered
- Builds shared understanding when pairing or ensembling

## Checklist

A good test list item has:

- A clear **before/after**, or **input/output**
- Its **motivation** or associated rule, in **plain language**
- A shape that's **easy to translate into code**
- Only the fundamentals — a test list is **not a full spec**
  - The list is a conjecture, the code is the proof

## Example: leap year

Rule: a year is a leap year if divisible by 4, except centuries, which must be divisible by 400.

- input: **2024** → output: leap (divisible by 4, not a century)
- input: **2023** → output: not leap (not divisible by 4)
- input: **1900** → output: not leap (a century, but not divisible by 400)
- input: **2000** → output: leap (a century, divisible by 400 — edge case)

Each row is a clear input/output pair, next to the rule that explains it — that's what makes new examples easy
to generate.

## Further Reading

- [Learning Hour: Connect Activities](https://sammancoaching.org/activities/connect.html)
- [Learning Hour: Concept Activities](https://sammancoaching.org/activities/concept.html)
- [Learning Hour: Concrete Practice Activities](https://sammancoaching.org/activities/concrete.html)
