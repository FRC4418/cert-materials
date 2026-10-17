# SW1-S Tier I Java Supercert: From-Scratch FRC Readiness Tool

This required capstone follows SW1-00 through SW1-15. It is deliberately different from the small certifications: there are no starter Java files, required class names, or automated proctor test.

## Starting point

This folder contains only this brief and `PROCTOR_RUBRIC.md`. Create your own Java project here. You choose the file names, classes, methods, fields, and internal structure.

Before coding, create `DESIGN.md`. In a few short paragraphs or a diagram, explain the main classes you expect to create, what each owns, and how information will move through the program.

## Challenge

Build a Java console tool for FRC 4418 that helps a mentor track certification readiness.

The mentor must be able to:

* store at least three people, each with a unique identifier, name, and zero or more assessment scores;
* find a person by their identifier;
* see a readable readiness report for one person and for the stored group;
* record an accurate decimal average for a person with scores;
* label an average below `70` as **Needs Support**, `70` through `89.9` as **On Track**, and `90` or above as **Exceeds**;
* handle a person with no scores without crashing; and
* safely reject typed scores that are not whole numbers from `0` through `100`.

The wording and layout of the console output are your choice. The program must make its behavior clear to a mentor reading it.

## Design expectations

This is not a request for one giant `main` method. Make purposeful design choices:

* use multiple classes with clear responsibilities;
* keep state private when outside code should not change it directly;
* use a collection and a loop to work with score data;
* handle invalid typed input without allowing the program to crash; and
* use an enum, interface, inheritance, lambda, or method reference only where it makes the design clearer. Be ready to explain why you used it, or why a simpler design was better.

Create `TESTING.md` with at least three tests you ran: one normal case, one boundary case, and one invalid-input case. Include the input, expected result, and observed result.

## Demonstration and code review

Run the program for the proctor. The demonstration must show:

* three stored people;
* a successful lookup;
* a normal readiness report;
* a person with no scores; and
* rejected invalid input.

Give a short code tour. Explain your major class boundaries, how score data is protected, how bad input is handled, and one decision you considered but did not use.

The proctor will ask for one small follow-up change, such as adding a report field, changing a display label, or adding one validation case. Make the change without breaking existing behavior.
