# SW1-14 Exceptions and Input Validation

Student task: Complete `CountParser.java`.

* `parseNonNegative(text)` trims the text and tries to parse an integer.
* Return a `ParseResult` with `valid` true and the parsed number when the number is 0 or greater.
* Return a `ParseResult` with `valid` false and value -1 when the text is not an integer or is negative.
* Use `try` and `catch (NumberFormatException ...)`; do not let the exception escape.

Run:

    javac *.java
    java ProctorTest
