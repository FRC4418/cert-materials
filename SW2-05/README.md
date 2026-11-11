# SW2-05 — First Commands and Subsystem Requirements

## Prerequisites
- SW2-00 through SW2-04.

## Goal
Build two reusable commands, one to spin a roller forward and one to reverse, using the already-approved RollerSubsystem.

## Student files
- `src/main/java/frc/robot/commands/RollerCommands.java`

**Student may edit** the starter files and the generated WPILib project, but must NOT edit any ProctorTest.java or PROCTOR_RUBRIC.md. Reuse the completed files from previous SW2 assessments when stated; do not copy a proctor's solution. 

## Procedure
1. Create RollerCommands.java (or command factory methods in RollerSubsystem) with forward(RollerSubsystem roller) and reverse(RollerSubsystem roller), each returning a Command.
2. forward uses a repeatedly applied +0.15 request while running and roller.stop() on end; reverse uses -0.15 and the same stop path. Require roller in both commands; do not schedule or control the motor directly in Robot.java.
3. In a supervised bench demonstration, proctor schedules and cancels each command, confirming zero demand after cancellation. If the bench is unavailable, the proctor may first review and build the code, but must withhold final hardware sign-off.
4. Student explains the difference between runOnce and runEnd and why commands should not create a second TalonFX object.

## Preparation
WPILib Commands v2: Commands; Command Scheduler; Subsystems.

Do not enable or deploy live motor code until the proctor verifies safety.
