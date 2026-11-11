# SW2-09 Proctor Rubric — Basic Debugging of Robot Code

Student: __________   Proctor: __________   Date: __________

## Required behavior (all must pass)
- [ ] ProctorTest reports 3/3 checks passed and is unchanged.
- [ ] Student diagnoses three separate logic defects and one compiler error.
- [ ] Student can describe at least two sensible initial checks for a nonresponsive mechanism.
- [ ] No unfamiliar simulator, automated JUnit setup, PID tuning, or bus diagnostics required.

## Reproducible evidence
1. Student receives BrokenRoller.java and ProctorTest.java. Do not modify ProctorTest.java. Run javac BrokenRoller.java ProctorTest.java, then java ProctorTest. The tests initially fail because of three separate logic defects.
2. Fix the helper so limit(0.8) = 0.2, reverse(0.1) = -0.1, and stoppedOutput() = 0.0. Preserve the method signatures. Describe the observed behavior and cause of each bug.
3. Proctor introduces a simple syntax mistake into a copy of the helper; student uses compiler output to find and correct it. The student then runs the unchanged proctor test again.
4. Proctor asks where to look next if a WPILib motor is not turning despite successful compilation: e.g., RioLog, robot enable, CAN ID, button binding, or hardware safety—but no powered troubleshooting is required.

## Safety / test policy
- This is a beginner FRC programming assessment. No simulation or advanced control is required.
- If a physical motor is involved, an authorized proctor controls the enable/disable process, checks current limits and secures the test bench.
- No production robot deployment, unapproved wiring, or bypass of safety interlocks.
- Any `ProctorTest.java` file is protected and must remain unchanged.

Result: PASS / RETEST   Evidence link / notes: __________________________
