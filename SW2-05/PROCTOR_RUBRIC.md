# SW2-05 Proctor Rubric — First Commands and Subsystem Requirements

Student: __________   Proctor: __________   Date: __________

## Required behavior (all must pass)
- [ ] Both factory methods return valid WPILib Command objects and project builds.
- [ ] Commands use the same roller subsystem requirement; no simultaneous competing motor owners.
- [ ] Canceling either command invokes stop() and produces zero demand.
- [ ] Student correctly explains initialize/execute/end at the conceptual level; writing custom Command subclasses is not required.

## Reproducible evidence
1. Create RollerCommands.java (or command factory methods in RollerSubsystem) with forward(RollerSubsystem roller) and reverse(RollerSubsystem roller), each returning a Command.
2. forward uses a repeatedly applied +0.15 request while running and roller.stop() on end; reverse uses -0.15 and the same stop path. Require roller in both commands; do not schedule or control the motor directly in Robot.java.
3. In a supervised bench demonstration, proctor schedules and cancels each command, confirming zero demand after cancellation. If the bench is unavailable, the proctor may first review and build the code, but must withhold final hardware sign-off.
4. Student explains the difference between runOnce and runEnd and why commands should not create a second TalonFX object.

## Safety / test policy
- This is a beginner FRC programming assessment. No simulation or advanced control is required.
- If a physical motor is involved, an authorized proctor controls the enable/disable process, checks current limits and secures the test bench.
- No production robot deployment, unapproved wiring, or bypass of safety interlocks.
- Any `ProctorTest.java` file is protected and must remain unchanged.

Result: PASS / RETEST   Evidence link / notes: __________________________
