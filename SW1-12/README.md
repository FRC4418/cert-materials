# SW1-12 Enums and Switch

Student task: Complete `MachineMode.java` and `ModeMessage.java`.

* `MachineMode` has exactly `DISABLED`, `TELEOP`, `AUTONOMOUS`, and `TEST`.
* `ModeMessage.message(mode)` uses a `switch` and returns these exact strings:
  * DISABLED: `Safe to work`
  * TELEOP: `Driver control`
  * AUTONOMOUS: `Robot control`
  * TEST: `Test enabled`

Run:

    javac *.java
    java ProctorTest
