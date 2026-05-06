# Review Journal

This journal records the domain cases that matter before widening the public API.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 225, lane `ship`
- `stress`: `latency skew`, score 154, lane `ship`
- `edge`: `signal loss`, score 116, lane `watch`
- `recovery`: `incident shape`, score 168, lane `ship`
- `stale`: `span volume`, score 282, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
