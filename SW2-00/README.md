# SW2-00 — WPILib Installation, Project Creation, and Build

## Prerequisites
- Tier I Java complete (SW1-00 through SW1-15 and SW1-S).

## Goal
Create a clean, empty robot-code project for Team 4418, prove it builds, and show another student where the code belongs.

## Student files
- This task uses a fresh WPILib-generated project; no prewritten Java solution is provided.

**Student may edit** the starter files and the generated WPILib project, but must NOT edit any ProctorTest.java or PROCTOR_RUBRIC.md. Reuse the completed files from previous SW2 assessments when stated; do not copy a proctor's solution. 

## Procedure
1. Using the WPILib 2026 installer, create a Java Command Robot project named Tier2Training with team number 4418. Do not select TimedRobot Skeleton.
2. Identify build.gradle, src/main/java/frc/robot, Robot.java, RobotContainer.java, Constants.java, and the Gradle wrapper. Do not modify Main.java or generated Gradle scripts.
3. In Constants.java, add public static final String TEAM_LABEL = "Impulse". In Robot.java's robotInit(), print Team: Impulse exactly once to the RioLog or console when the code starts.
4. Run WPILib: Build Robot Code. Show the successful build and explain what file to inspect if a missing semicolon prevents it.
5. Show the proctor the project tree, the print statement and the build result. Do not deploy to a powered robot for this certification.

## Preparation
WPILib: Creating a Robot Program; VS Code Overview; Building and Deploying Robot Code.

Do not enable or deploy live motor code until the proctor verifies safety.
