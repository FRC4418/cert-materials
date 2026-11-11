# SW2-02 Proctor Rubric — Constants, Imports, and Phoenix 6 Vendor Library

Student: __________   Proctor: __________   Date: __________

## Required behavior (all must pass)
- [ ] Project builds with approved Phoenix 6 vendordep and imports.
- [ ] Constants.java contains all three requested values; actual CAN ID matches the proctor's bench identifier.
- [ ] Student shows where the vendordep file lives and what an unresolved import indicates.
- [ ] No hardware motion or PID configuration is required.

## Reproducible evidence
1. In the WPILib VS Code command palette, install the mentor-approved CTRE Phoenix 6 vendor library using Manage Vendor Libraries. Do not choose an unapproved preview or another season's library.
2. Create nested Constants.Roller values: MOTOR_CAN_ID (assigned by the proctor, not guessed) and MAX_OUTPUT = 0.20. Add another value CONTROLLER_PORT = 0.
3. Create a file VendorCheck.java that imports com.ctre.phoenix6.hardware.TalonFX and com.ctre.phoenix6.controls.DutyCycleOut and declares these as types without constructing/energizing a motor.
4. Build the project, show vendordeps contains the intended library, and explain why the team stores device IDs in Constants instead of scattering them across commands.

## Safety / test policy
- This is a beginner FRC programming assessment. No simulation or advanced control is required.
- If a physical motor is involved, an authorized proctor controls the enable/disable process, checks current limits and secures the test bench.
- No production robot deployment, unapproved wiring, or bypass of safety interlocks.
- Any `ProctorTest.java` file is protected and must remain unchanged.

Result: PASS / RETEST   Evidence link / notes: __________________________
