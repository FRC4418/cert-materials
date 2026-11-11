# SW2-03 Proctor Rubric — Creating a Subsystem and Simple Output Methods

Student: __________   Proctor: __________   Date: __________

## Required behavior (all must pass)
- [ ] ProctorTest prints 4/4 checks passed and remains unchanged.
- [ ] Subsystem extends SubsystemBase, uses private state, clamps to ±0.2, and stops at zero.
- [ ] WPILib project builds after the helper and subsystem are added.
- [ ] Student can explain what a subsystem represents, without implementing sensors or real hardware yet.

## Reproducible evidence
1. Complete the provided RollerMath.java clamp helper so clamp(+0.8) returns +0.2, clamp(-0.8) returns -0.2, and clamp(+0.1) returns +0.1. Run the provided standalone ProctorTest against this helper without modifying the proctor test.
2. Create RollerSubsystem extends SubsystemBase. It has private double lastOutput, public void setOutput(double requested), public void stop(), and public double getLastOutput(). setOutput uses RollerMath.clamp; stop stores 0.0.
3. The student compiles the WPILib project and shows that neither RobotContainer nor a command needs direct access to lastOutput.
4. Before sign-off, explain the role of periodic() and why it may be empty for a simple subsystem.

## Safety / test policy
- This is a beginner FRC programming assessment. No simulation or advanced control is required.
- If a physical motor is involved, an authorized proctor controls the enable/disable process, checks current limits and secures the test bench.
- No production robot deployment, unapproved wiring, or bypass of safety interlocks.
- Any `ProctorTest.java` file is protected and must remain unchanged.

Result: PASS / RETEST   Evidence link / notes: __________________________
