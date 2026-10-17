# SW1-S Proctor Rubric

Use this after the student has passed SW1-00 through SW1-15. This capstone is a pass/revise assessment, not an automated-test score.

## Required evidence

The student created:

* their own Java source files and project structure;
* `DESIGN.md` before or during implementation; and
* `TESTING.md` with a normal, boundary, and invalid-input case.

## Functional review

Confirm that the running program:

* stores and reports on at least three people with unique identifiers and score histories;
* finds a person by identifier;
* calculates decimal averages correctly;
* labels `< 70`, `70` through `89.9`, and `>= 90` as described in the brief;
* handles an empty score history without a crash or misleading average;
* rejects non-whole, out-of-range, and non-numeric typed scores safely; and
* produces readable output a mentor could use.

## Design and communication review

Confirm that:

* classes and methods have clear, non-duplicated responsibilities;
* state is appropriately protected;
* collections and loops are used purposefully;
* the student can explain their major design choices and an alternative they chose not to use; and
* the student can make one small follow-up change without breaking the demonstrated behavior.

If a requirement is incomplete, identify the smallest concrete revision needed and re-check that portion after the student makes it.
