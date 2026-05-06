# lattice-trace-redact-dock

`lattice-trace-redact-dock` is a focused Scala codebase around package a Scala local lab for redact analysis with bounded scenario files, conflict explanations, and documented operating limits. It is meant to be easy to inspect, run, and extend without a hosted service.

## Lattice Trace Redact Dock Walkthrough

I would read the project from the outside in: command, fixture, model, then roadmap. That keeps the observability idea grounded in files that can be checked locally.

## Reason For The Project

This is not a wrapper around a service. It is a self-contained project that shows how the model behaves when demand, capacity, latency, risk, and weight move in different directions.

## How It Is Put Together

The interesting part is the boundary between accepted and reviewed scenarios. Extended examples sit near that boundary so future edits can show whether the model became more permissive or more cautious. The Scala code uses case classes and a compact object API to keep the test path direct.

## Data Notes

The extended cases are not random smoke tests. `degraded` keeps pressure on the review path, while `surge` shows the model when capacity and weight are strong enough to clear the threshold.

## Capabilities

- Uses fixture data to keep log shape changes visible in code review.
- Includes extended examples for latency summaries, including `surge` and `degraded`.
- Documents incident slices tradeoffs in `docs/operations.md`.
- Runs locally with a single verification command and no external credentials.
- Stores project constants and verification metadata in `metadata/project.json`.

## Getting It Running

Use a normal shell with Scala available on `PATH`. The verifier is written as a PowerShell script because the portfolio was assembled on Windows.

## Check The Work

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/audit.ps1
```

The audit command checks repository structure and README constraints before it delegates to the verifier.

## Where Things Live

- `src`: primary implementation
- `tests`: verification harness
- `fixtures`: compact golden scenarios
- `examples`: expanded scenario set
- `metadata`: project constants and verification metadata
- `docs`: operations and extension notes
- `scripts`: local verification and audit commands

## Tradeoffs

This code is local-first. It makes no claim about deployed usage and avoids credentials, hosted state, and environment-specific setup.

## Possible Extensions

- Add a short report command that prints the score breakdown for a single scenario.
- Add malformed input fixtures so the failure path is as visible as the happy path.
- Split the scoring constants into a typed configuration object and validate it before use.
- Add one more observability fixture that focuses on a malformed or borderline input.

## Command Examples

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

This runs the language-level build or test path against the compact fixture set.
