# SW1-S Tier I Java Supercert: Student Progress Tracker

Student task: Complete this console project. Do not change `ProctorTest.java`.

The project tracks students and their assessment scores.

* `Status` must be an enum with `NEEDS_HELP`, `ON_TRACK`, and `EXCEEDS`.
* `Reportable` must declare `String report()`.
* `Person` is an abstract class with protected `name`, a constructor, and `getName()`.
* `Student` extends `Person`, implements `Reportable`, stores a private `int id` and private `ArrayList<Integer> scores`, has `addScore`, `average`, `status`, and `report`.
* `average` uses a loop. It returns 0.0 with no scores.
* `status` is NEEDS_HELP below 70.0, ON_TRACK from 70.0 through 89.9, and EXCEEDS at 90.0 or above.
* `report` returns exactly `7 Ada: 85.0 ON_TRACK` for id 7, name Ada, and average 85.0.
* `ProgressTracker.findById(students, id)` searches a `List<Student>` and returns the matching student, or null.
* `ProgressTracker.reportAll(students)` uses a lambda or method reference to return the reports in list order, joined by `\n` with no final newline.
* `ProgressTracker.parseScore(text)` uses try/catch to return -1 for non-numbers or values outside 0 through 100.
* `main` creates Ada (id 7) with scores 80 and 90, then prints exactly `7 Ada: 85.0 ON_TRACK`.

Run:

    javac *.java
    java ProctorTest
    java ProgressTracker
