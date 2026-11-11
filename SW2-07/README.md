# SW2-07 — Basic Default Command and Live Joystick Input

## Prerequisites
- SW2-00 through SW2-06.

## Goal
Use the left joystick's Y axis as an alternate way to control the roller at low power.

## Student files
- `src/main/java/frc/robot/RobotContainer.java`

**Student may edit** the starter files and the generated WPILib project, but must NOT edit any ProctorTest.java or PROCTOR_RUBRIC.md. Reuse the completed files from previous SW2 assessments when stated; do not copy a proctor's solution. 

## Procedure
1. In RobotContainer, add a default command requiring RollerSubsystem. Inside the command's repeated action, read controller.getLeftY() live and send a scaled demand to roller.setOutput().
2. Ignore joystick values with absolute magnitude under 0.10. Scale nonzero values to at most ±0.15. Use one consistent sign convention and explain why joystick-forward may be negative.
3. In a supervised bench test, show neutral (0), forward axis request, reverse axis request, and neutral (0) again. Explain that a default command returns when no other command owns the subsystem.
4. Temporarily run the SW2-06 bumper command; demonstrate that it takes control of the roller and the default resumes after the bumper is released. The motor still stops on robot disable.

## Preparation
WPILib Commands v2: Default Commands; CommandXboxController; MathUtil applyDeadband concepts.

Do not enable or deploy live motor code until the proctor verifies safety.
