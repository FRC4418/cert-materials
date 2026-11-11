# SW2-09 — Basic Debugging of Robot Code

## Prerequisites
- SW2-00 through SW2-08.

## Goal
Repair a small intentionally broken roller helper before it is permitted to control real hardware.

## Student files
- `BrokenRoller.java`
- `ProctorTest.java`

**Student may edit** the starter files and the generated WPILib project, but must NOT edit any ProctorTest.java or PROCTOR_RUBRIC.md. Reuse the completed files from previous SW2 assessments when stated; do not copy a proctor's solution. 

## Procedure
1. Student receives BrokenRoller.java and ProctorTest.java. Do not modify ProctorTest.java. Run javac BrokenRoller.java ProctorTest.java, then java ProctorTest. The tests initially fail because of three separate logic defects.
2. Fix the helper so limit(0.8) = 0.2, reverse(0.1) = -0.1, and stoppedOutput() = 0.0. Preserve the method signatures. Describe the observed behavior and cause of each bug.
3. Proctor introduces a simple syntax mistake into a copy of the helper; student uses compiler output to find and correct it. The student then runs the unchanged proctor test again.
4. Proctor asks where to look next if a WPILib motor is not turning despite successful compilation: e.g., RioLog, robot enable, CAN ID, button binding, or hardware safety—but no powered troubleshooting is required.

Test the broken code after each change:

```sh
javac BrokenRoller.java ProctorTest.java
java ProctorTest
```


## Preparation
WPILib: Viewing Console Output; Tier I: Debugging; WPILib: Building and Deploying Robot Code.

Do not enable or deploy live motor code until the proctor verifies safety.
