# SW2-04 — Basic Kraken Motor: Forward, Reverse, and Stop

## Prerequisites
- SW2-00 through SW2-03; mentor-approved Kraken/TalonFX bench and Power Safety / Driver Station orientation.

## Goal
With a motor firmly secured on the bench, demonstrate basic open-loop movement without PID, position control, or autonomous behavior.

## Student files
- `src/main/java/frc/robot/subsystems/RollerSubsystem.java`

**Student may edit** the starter files and the generated WPILib project, but must NOT edit any ProctorTest.java or PROCTOR_RUBRIC.md. Reuse the completed files from previous SW2 assessments when stated; do not copy a proctor's solution. 

## Procedure
1. Under proctor supervision, verify a powered-down, mechanically secured Kraken/TalonFX bench with a separate disable operator. Proctor verifies battery, wiring, CAN ID, motor current protection and safe clearance. Students never bypass physical safety controls.
2. Starting from the finished SW2-03 subsystem, make a hardware-backed RollerSubsystem: private TalonFX motor = new TalonFX(Constants.Roller.MOTOR_CAN_ID), a DutyCycleOut request, setOutput(double) clamped to ±0.20, and stop() requesting zero. All TalonFX calls remain inside RollerSubsystem.
3. Build/deploy the motor project to the approved bench robot. With the proctor controlling Driver Station mode, demonstrate +0.10, stop, -0.10, stop. Motor output values are duty-cycle requests, NOT guaranteed exact rotational speeds.
4. Student identifies the meaning of CAN ID, motor direction and stop(), and points to the part of the code that prevents a command greater than ±0.20.

## Preparation
CTRE Phoenix 6: TalonFX; DutyCycleOut; WPILib: 3rd Party Libraries; FRC robot safety.

Do not enable or deploy live motor code until the proctor verifies safety.
