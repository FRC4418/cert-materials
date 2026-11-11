# SW2-01 Proctor Rubric — Robot.java, RobotContainer, and Robot Modes

Student: __________   Proctor: __________   Date: __________

## Required behavior (all must pass)
- [ ] All three print statements are in appropriate init callbacks rather than a repeated loop.
- [ ] Scheduler call is unchanged and the project builds.
- [ ] Student correctly explains the roles and locations of Robot, RobotContainer, Constants and Subsystem classes.
- [ ] Student can explain disabled, teleop, and autonomous at a basic level without implementing autonomous.

## Reproducible evidence
1. Use the SW2-00 project. Add a one-line print in robotInit(), teleopInit(), and autonomousInit() that names the respective event; preserve the scheduler in robotPeriodic().
2. Explain that init callbacks happen on entry, periodic callbacks run repeatedly, and RobotContainer owns controller/command setup.
3. Proctor asks student to point to where a motor subsystem would be constructed, where a controller binding belongs, and where a motor CAN ID should be stored. Student identifies RobotContainer, RobotContainer, and Constants respectively.
4. Build and show the code. With a mentor-owned test roboRIO available, the proctor may switch modes to observe the prints; physical enable is NOT required for a pass and no actuator is connected.

## Safety / test policy
- This is a beginner FRC programming assessment. No simulation or advanced control is required.
- If a physical motor is involved, an authorized proctor controls the enable/disable process, checks current limits and secures the test bench.
- No production robot deployment, unapproved wiring, or bypass of safety interlocks.
- Any `ProctorTest.java` file is protected and must remain unchanged.

Result: PASS / RETEST   Evidence link / notes: __________________________
