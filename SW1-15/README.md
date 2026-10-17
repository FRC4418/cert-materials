# SW1-15 Debugging and Verifying Behavior

Student task: Repair the three files. Do not change `DebugTest.java`.

1. Run `javac BrokenSyntax.java`. Fix the compilation error. Then run `java BrokenSyntax`; it must print `Ready`.
2. Run `javac BrokenRuntime.java`, then `java BrokenRuntime`. Fix the runtime error. It must print exactly `10`, `20`, `30`, and `40`, each on its own line.
3. Run `javac BrokenLogic.java DebugTest.java`, then `java DebugTest`. Fix the logic error so every check passes. `average(new int[] {2, 3, 4, 5})` must return 3.5.
