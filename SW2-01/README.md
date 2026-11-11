# SW2-01 — Robot.java, RobotContainer, and Robot Modes

## Prerequisites
- SW2-00.

## Goal
Make a tiny, read-only mode announcer in the generated Command Robot project.

## Student files
- This task uses a fresh WPILib-generated project; no prewritten Java solution is provided.

**Student may edit** the starter files and the generated WPILib project, but must NOT edit any ProctorTest.java or PROCTOR_RUBRIC.md. Reuse the completed files from previous SW2 assessments when stated; do not copy a proctor's solution. 

## Procedure
1. Use the SW2-00 project. Add a one-line print in robotInit(), teleopInit(), and autonomousInit() that names the respective event; preserve the scheduler in robotPeriodic().
2. Explain that init callbacks happen on entry, periodic callbacks run repeatedly, and RobotContainer owns controller/command setup.
3. Proctor asks student to point to where a motor subsystem would be constructed, where a controller binding belongs, and where a motor CAN ID should be stored. Student identifies RobotContainer, RobotContainer, and Constants respectively.
4. Build and show the code. With a mentor-owned test roboRIO available, the proctor may switch modes to observe the prints; physical enable is NOT required for a pass and no actuator is connected.

## Preparation
WPILib: Structuring a Command-Based Robot Project; The TimedRobot Class.

Do not enable or deploy live motor code until the proctor verifies safety.
