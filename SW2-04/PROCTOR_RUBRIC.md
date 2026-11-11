# SW2-04 Proctor Rubric — Basic Kraken Motor: Forward, Reverse, and Stop

Student: __________   Proctor: __________   Date: __________

## Required behavior (all must pass)
- [ ] No motor is enabled until the proctor signs off bench setup.
- [ ] Motor performs forward, stop, reverse, stop in the intended order under mentor control.
- [ ] Commands stay within ±0.20 and stop produces zero duty cycle.
- [ ] Motor access is encapsulated inside RollerSubsystem; no PID, simulation or Motion Magic is required.

## Reproducible evidence
1. Under proctor supervision, verify a powered-down, mechanically secured Kraken/TalonFX bench with a separate disable operator. Proctor verifies battery, wiring, CAN ID, motor current protection and safe clearance. Students never bypass physical safety controls.
2. Starting from the finished SW2-03 subsystem, make a hardware-backed RollerSubsystem: private TalonFX motor = new TalonFX(Constants.Roller.MOTOR_CAN_ID), a DutyCycleOut request, setOutput(double) clamped to ±0.20, and stop() requesting zero. All TalonFX calls remain inside RollerSubsystem.
3. Build/deploy the motor project to the approved bench robot. With the proctor controlling Driver Station mode, demonstrate +0.10, stop, -0.10, stop. Motor output values are duty-cycle requests, NOT guaranteed exact rotational speeds.
4. Student identifies the meaning of CAN ID, motor direction and stop(), and points to the part of the code that prevents a command greater than ±0.20.

## Safety / test policy
- This is a beginner FRC programming assessment. No simulation or advanced control is required.
- If a physical motor is involved, an authorized proctor controls the enable/disable process, checks current limits and secures the test bench.
- No production robot deployment, unapproved wiring, or bypass of safety interlocks.
- Any `ProctorTest.java` file is protected and must remain unchanged.

Result: PASS / RETEST   Evidence link / notes: __________________________
