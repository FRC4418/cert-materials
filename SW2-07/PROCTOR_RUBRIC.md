# SW2-07 Proctor Rubric — Basic Default Command and Live Joystick Input

Student: __________   Proctor: __________   Date: __________

## Required behavior (all must pass)
- [ ] Default command runs only when no other command has the roller requirement.
- [ ] Live axis changes alter motor demand; center returns zero.
- [ ] Bumper override works and default resumes without simultaneous motor ownership.
- [ ] Output is bounded to ±0.15 for this axis task; advanced tuning is not required.

## Reproducible evidence
1. In RobotContainer, add a default command requiring RollerSubsystem. Inside the command's repeated action, read controller.getLeftY() live and send a scaled demand to roller.setOutput().
2. Ignore joystick values with absolute magnitude under 0.10. Scale nonzero values to at most ±0.15. Use one consistent sign convention and explain why joystick-forward may be negative.
3. In a supervised bench test, show neutral (0), forward axis request, reverse axis request, and neutral (0) again. Explain that a default command returns when no other command owns the subsystem.
4. Temporarily run the SW2-06 bumper command; demonstrate that it takes control of the roller and the default resumes after the bumper is released. The motor still stops on robot disable.

## Safety / test policy
- This is a beginner FRC programming assessment. No simulation or advanced control is required.
- If a physical motor is involved, an authorized proctor controls the enable/disable process, checks current limits and secures the test bench.
- No production robot deployment, unapproved wiring, or bypass of safety interlocks.
- Any `ProctorTest.java` file is protected and must remain unchanged.

Result: PASS / RETEST   Evidence link / notes: __________________________
