# SW2-S — Tier II Supercert: Build a Simple Driver-Controlled Roller

## Prerequisites
- SW2-00 through SW2-10, all passed; mentor-approved motor bench and safe operator.

## Goal
From a new WPILib Command Robot template, create a one-motor roller that runs forward with right bumper, reverse with left bumper and stops on release or disable.

## Student files
- This task uses a fresh WPILib-generated project; no prewritten Java solution is provided.

**Student may edit** the starter files and the generated WPILib project, but must NOT edit any ProctorTest.java or PROCTOR_RUBRIC.md. Reuse the completed files from previous SW2 assessments when stated; do not copy a proctor's solution. No Java starter file is provided for this capstone.

## Procedure
1. Use the new 2026 WPILib Java Command Robot template. The GitHub SW2-S folder supplies only README.md and PROCTOR_RUBRIC.md. No starter mechanism Java classes are supplied. Write a short PLAN.md naming the subsystem, constants, controller port and safe stop behavior.
2. In Constants, define mentor-assigned CAN ID and MAX_OUTPUT 0.20. Add the approved Phoenix 6 library. Implement RollerSubsystem with private TalonFX, a bounded duty-cycle method and stop(), plus Commands v2 hold-to-run commands that require the same subsystem.
3. In RobotContainer, bind rightBumper to +0.15 and leftBumper to -0.15 using whileTrue. Do not build autonomous, PID, simulation, sensors, dashboards, vision, swerve or command groups.
4. Build. After bench safety sign-off, deploy to the approved training robot; demonstrate forward/stop/reverse/stop and an immediate stop on Disable. Show a short Git commit/diff of student work.
5. During code review the proctor asks for one small change, for example lower maximum forward demand to +0.10. Student makes the change and repeats the affected test without breaking stop behavior.

## Preparation
WPILib: Command Robot template; Commands v2 Subsystems and Command Factories; CTRE Phoenix 6 DutyCycleOut; Driver Station.

Do not enable or deploy live motor code until the proctor verifies safety.
