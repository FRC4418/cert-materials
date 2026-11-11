# SW2-06 — RobotContainer and Xbox Controller Buttons

## Prerequisites
- SW2-00 through SW2-05.

## Goal
Turn the roller into a simple driver-operated mechanism with two bumper controls.

## Student files
- `src/main/java/frc/robot/RobotContainer.java`

**Student may edit** the starter files and the generated WPILib project, but must NOT edit any ProctorTest.java or PROCTOR_RUBRIC.md. Reuse the completed files from previous SW2 assessments when stated; do not copy a proctor's solution. 

## Procedure
1. Create/keep exactly one RollerSubsystem in RobotContainer and one CommandXboxController on controller port 0.
2. In configureBindings(), bind rightBumper().whileTrue(RollerCommands.forward(roller)) and leftBumper().whileTrue(RollerCommands.reverse(roller)) or equivalent methods; use the same subsystem in both commands.
3. Build and deploy to the authorized bench. Test right bumper press/hold/release, then left bumper press/hold/release. Confirm +0.15, then zero, then -0.15, then zero, with the proctor controlling enable.
4. Show where bindings are declared, explain why whileTrue differs from onTrue, and explain what happens if both commands require the same subsystem.

## Preparation
WPILib Commands v2: Binding Commands to Triggers; Structuring a Command-Based Robot Project.

Do not enable or deploy live motor code until the proctor verifies safety.
