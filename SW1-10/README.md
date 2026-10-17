# SW1-10 Interfaces and Polymorphism

Student task: Complete the three types in this folder.

* `Reportable` declares `String report()`.
* `InspectionReport` stores an item name and returns `Inspection: ` plus the name.
* `ServiceReport` stores an item name and returns `Service: ` plus the name.
* Both report classes implement `Reportable`.
* `ReportPrinter.join(Reportable[] reports)` returns each report on a new line, with no extra line after the last report.

Run:

    javac *.java
    java ProctorTest
