# Lattice Trace Redact Dock Walkthrough

I use this file as a small checklist before changing the Scala implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 225 | ship |
| stress | latency skew | 154 | ship |
| edge | signal loss | 116 | watch |
| recovery | incident shape | 168 | ship |
| stale | span volume | 282 | ship |

Start with `stale` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around latency skew and incident shape.
