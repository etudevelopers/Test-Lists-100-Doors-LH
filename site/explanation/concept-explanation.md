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

## Example: prime numbers

A prime number is a natural number with exactly two distinct, positive divisors.

- **1** is *not* prime — it has only one distinct divisor
- **2** is prime — 1 × 2
- **4** is *not* prime — it has more than two divisors
- **0** is *not* prime — it isn't a natural number (edge case)

New examples are easy to generate once the rule is explicit — that's the point of writing the rule down next to
the case, not just the numbers.

## Further Reading

- [Learning Hour: Connect Activities](https://sammancoaching.org/activities/connect.html)
- [Learning Hour: Concept Activities](https://sammancoaching.org/activities/concept.html)
- [Learning Hour: Concrete Practice Activities](https://sammancoaching.org/activities/concrete.html)
