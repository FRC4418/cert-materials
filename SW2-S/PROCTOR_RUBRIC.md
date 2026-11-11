# SW2-S Proctor Rubric — Tier II Supercert: Build a Simple Driver-Controlled Roller

Student: __________   Proctor: __________   Date: __________

## Required behavior (all must pass)
- [ ] Program builds and deploys to the intended target, with appropriate vendor library and assigned CAN ID.
- [ ] Code has meaningful separation between Constants, RollerSubsystem, commands and RobotContainer.
- [ ] Both bumpers operate in the specified directions only while held; release and disable leave demand at zero.
- [ ] No motor commands bypass subsystem requirements or the ±0.20 output limit.
- [ ] Proctor accepts safety setup, review explanation and one small follow-up change. Passing SW2-S completes Tier II Foundations.

## Reproducible evidence
1. Use the new 2026 WPILib Java Command Robot template. The GitHub SW2-S folder supplies only README.md and PROCTOR_RUBRIC.md. No starter mechanism Java classes are supplied. Write a short PLAN.md naming the subsystem, constants, controller port and safe stop behavior.
2. In Constants, define mentor-assigned CAN ID and MAX_OUTPUT 0.20. Add the approved Phoenix 6 library. Implement RollerSubsystem with private TalonFX, a bounded duty-cycle method and stop(), plus Commands v2 hold-to-run commands that require the same subsystem.
3. In RobotContainer, bind rightBumper to +0.15 and leftBumper to -0.15 using whileTrue. Do not build autonomous, PID, simulation, sensors, dashboards, vision, swerve or command groups.
4. Build. After bench safety sign-off, deploy to the approved training robot; demonstrate forward/stop/reverse/stop and an immediate stop on Disable. Show a short Git commit/diff of student work.
5. During code review the proctor asks for one small change, for example lower maximum forward demand to +0.10. Student makes the change and repeats the affected test without breaking stop behavior.

## Safety / test policy
- This is a beginner FRC programming assessment. No simulation or advanced control is required.
- If a physical motor is involved, an authorized proctor controls the enable/disable process, checks current limits and secures the test bench.
- No production robot deployment, unapproved wiring, or bypass of safety interlocks.
- Any `ProctorTest.java` file is protected and must remain unchanged.

Result: PASS / RETEST   Evidence link / notes: __________________________
