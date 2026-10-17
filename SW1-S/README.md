# SW1-S Tier I Java Supercert: Readiness Tracker Challenge

Student task: Design and complete a small Java console application for tracking certification readiness. This is a challenge brief, not a build recipe. Do not change `ProctorTest.java`.

## Scenario

FRC 4418 needs a way to track students who are working through certifications. A student has an ID, a name, and zero or more assessment scores. A mentor needs to find a student, see a clear report, and decide whether that student needs help, is on track, or exceeds expectations.

Use the supplied public file names and method signatures so the proctor test can run. You may add private helpers and reasonable supporting code. Choose the internal organization yourself, but your design must demonstrate the following:

* a class hierarchy and an interface used for a real purpose;
* private state with methods that give other code the behavior it needs;
* a collection, loops, and an enum used where they make sense;
* one lambda or method reference used to build the combined report; and
* safe conversion of a typed score, including handling bad input without a crash.

## Required behavior

* `Student` represents a student with an ID, name, and score history. An empty history averages to `0.0`.
* A student below `70.0` needs help, `70.0` through `89.9` is on track, and `90.0` or higher exceeds expectations.
* `report()` must communicate the ID, name, average, and status. For a student with ID `7`, name `Ada`, and scores `80` and `90`, it returns exactly `7 Ada: 85.0 ON_TRACK`.
* `findById` returns the matching student or `null` when no match exists.
* `reportAll` returns one report per student, in list order, separated by one newline with no final newline.
* `parseScore` accepts a trimmed whole-number score from `0` through `100` and returns `-1` for bad text or a score outside that range.
* `main` demonstrates the program by creating Ada with scores `80` and `90` and printing her report.

Be prepared to give the proctor a brief code tour: explain one class-boundary decision, why the list is owned where it is, and how your code prevents invalid input from interrupting the program.

Run:

    javac *.java
    java ProctorTest
    java ProgressTracker
