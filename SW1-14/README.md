# SW1-14 Exceptions and Input Validation

Student task: Complete `CountParser.java`. `ParseResult.java` and the test are supplied; do not edit them.

## Scenario

A mentor enters a parts count into a text field. The rest of the program needs one safe answer: either a usable non-negative count or a clear invalid result. The text field can contain extra spaces, letters, decimals, or negative numbers.

Design `parseNonNegative(text)` so it meets this behavior contract:

* trim the input and accept only a whole integer that is `0` or greater;
* return a `ParseResult` marked valid with that value when the input is usable; and
* return an invalid `ParseResult` with value `-1` for every other input, without allowing a parsing exception to escape.

Choose the control flow yourself. Be ready to explain why your solution handles both malformed text and an out-of-range number safely.

Run:

    javac *.java
    java ProctorTest
