# SW2-02 — Constants, Imports, and Phoenix 6 Vendor Library

## Prerequisites
- SW2-00 through SW2-01.

## Goal
Prepare a 2026 robot project for a single Kraken/TalonFX motor without yet moving the motor.

## Student files
- `src/main/java/frc/robot/Constants.java`
- `src/main/java/frc/robot/VendorCheck.java`

**Student may edit** the starter files and the generated WPILib project, but must NOT edit any ProctorTest.java or PROCTOR_RUBRIC.md. Reuse the completed files from previous SW2 assessments when stated; do not copy a proctor's solution. 

## Procedure
1. In the WPILib VS Code command palette, install the mentor-approved CTRE Phoenix 6 vendor library using Manage Vendor Libraries. Do not choose an unapproved preview or another season's library.
2. Create nested Constants.Roller values: MOTOR_CAN_ID (assigned by the proctor, not guessed) and MAX_OUTPUT = 0.20. Add another value CONTROLLER_PORT = 0.
3. Create a file VendorCheck.java that imports com.ctre.phoenix6.hardware.TalonFX and com.ctre.phoenix6.controls.DutyCycleOut and declares these as types without constructing/energizing a motor.
4. Build the project, show vendordeps contains the intended library, and explain why the team stores device IDs in Constants instead of scattering them across commands.

## Preparation
WPILib: 3rd Party Libraries; CTRE Phoenix 6: Installation; CTRE TalonFX Basics.

Do not enable or deploy live motor code until the proctor verifies safety.
