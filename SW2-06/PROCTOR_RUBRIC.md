# SW2-06 Proctor Rubric — RobotContainer and Xbox Controller Buttons

Student: __________   Proctor: __________   Date: __________

## Required behavior (all must pass)
- [ ] Controller works from assigned port with no button polling loop in robotPeriodic().
- [ ] Right bumper controls forward and left bumper reverse; either release causes a stop.
- [ ] Both commands require the same roller subsystem and do not create duplicate hardware objects.
- [ ] Student explains the controller -> trigger -> command -> subsystem -> motor path.

## Reproducible evidence
1. Create/keep exactly one RollerSubsystem in RobotContainer and one CommandXboxController on controller port 0.
2. In configureBindings(), bind rightBumper().whileTrue(RollerCommands.forward(roller)) and leftBumper().whileTrue(RollerCommands.reverse(roller)) or equivalent methods; use the same subsystem in both commands.
3. Build and deploy to the authorized bench. Test right bumper press/hold/release, then left bumper press/hold/release. Confirm +0.15, then zero, then -0.15, then zero, with the proctor controlling enable.
4. Show where bindings are declared, explain why whileTrue differs from onTrue, and explain what happens if both commands require the same subsystem.

## Safety / test policy
- This is a beginner FRC programming assessment. No simulation or advanced control is required.
- If a physical motor is involved, an authorized proctor controls the enable/disable process, checks current limits and secures the test bench.
- No production robot deployment, unapproved wiring, or bypass of safety interlocks.
- Any `ProctorTest.java` file is protected and must remain unchanged.

Result: PASS / RETEST   Evidence link / notes: __________________________
