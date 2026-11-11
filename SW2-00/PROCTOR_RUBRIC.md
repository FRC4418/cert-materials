# SW2-00 Proctor Rubric — WPILib Installation, Project Creation, and Build

Student: __________   Proctor: __________   Date: __________

## Required behavior (all must pass)
- [ ] 2026 Java Command Robot project with correct team number exists and builds.
- [ ] Student correctly identifies all six requested project elements.
- [ ] Code contains TEAM_LABEL and a one-time startup print, and the student can explain how it appears when run.
- [ ] No simulation, real motor, or advanced robot code is required.

## Reproducible evidence
1. Using the WPILib 2026 installer, create a Java Command Robot project named Tier2Training with team number 4418. Do not select TimedRobot Skeleton.
2. Identify build.gradle, src/main/java/frc/robot, Robot.java, RobotContainer.java, Constants.java, and the Gradle wrapper. Do not modify Main.java or generated Gradle scripts.
3. In Constants.java, add public static final String TEAM_LABEL = "Impulse". In Robot.java's robotInit(), print Team: Impulse exactly once to the RioLog or console when the code starts.
4. Run WPILib: Build Robot Code. Show the successful build and explain what file to inspect if a missing semicolon prevents it.
5. Show the proctor the project tree, the print statement and the build result. Do not deploy to a powered robot for this certification.

## Safety / test policy
- This is a beginner FRC programming assessment. No simulation or advanced control is required.
- If a physical motor is involved, an authorized proctor controls the enable/disable process, checks current limits and secures the test bench.
- No production robot deployment, unapproved wiring, or bypass of safety interlocks.
- Any `ProctorTest.java` file is protected and must remain unchanged.

Result: PASS / RETEST   Evidence link / notes: __________________________
