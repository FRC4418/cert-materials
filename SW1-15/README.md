# SW1-15 Debugging and Verifying Behavior

Student task: Diagnose and repair the supplied code. Do not change `DebugTest.java`.

## Challenge

The folder has three separate failures, like a real handoff from another programmer:

* one program does not compile;
* one program compiles but fails while it runs; and
* one program runs but calculates an average incorrectly for a fractional result.

Use compiler output, the runtime error, and the provided test as evidence. You decide the repair path; do not guess or rewrite unrelated code. The completed programs must print the required output and every `DebugTest` check must pass.

For each failure, be ready to tell the proctor: the symptom you observed, the underlying cause, and why your change fixes it.

Run the relevant compiler/test commands as you investigate. At the end, run:

    javac BrokenSyntax.java
    java BrokenSyntax
    javac BrokenRuntime.java
    java BrokenRuntime
    javac BrokenLogic.java DebugTest.java
    java DebugTest
