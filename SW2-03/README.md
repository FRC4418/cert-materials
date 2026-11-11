# SW2-03 — Creating a Subsystem and Simple Output Methods

## Prerequisites
- SW2-00 through SW2-02.

## Goal
Create the software interface for a roller subsystem before attaching a motor. This is a normal Java test inside a WPILib project, not a robot simulation.

## Student files
- `src/main/java/frc/robot/util/RollerMath.java`
- `src/main/java/frc/robot/subsystems/RollerSubsystem.java`
- `proctor/ProctorTest.java`

**Student may edit** the starter files and the generated WPILib project, but must NOT edit any ProctorTest.java or PROCTOR_RUBRIC.md. Reuse the completed files from previous SW2 assessments when stated; do not copy a proctor's solution. 

## Procedure
1. Complete the provided RollerMath.java clamp helper so clamp(+0.8) returns +0.2, clamp(-0.8) returns -0.2, and clamp(+0.1) returns +0.1. Run the provided standalone ProctorTest against this helper without modifying the proctor test.
2. Create RollerSubsystem extends SubsystemBase. It has private double lastOutput, public void setOutput(double requested), public void stop(), and public double getLastOutput(). setOutput uses RollerMath.clamp; stop stores 0.0.
3. The student compiles the WPILib project and shows that neither RobotContainer nor a command needs direct access to lastOutput.
4. Before sign-off, explain the role of periodic() and why it may be empty for a simple subsystem.

Test standalone helper:

```sh
javac -d out src/main/java/frc/robot/util/RollerMath.java proctor/ProctorTest.java
java -cp out ProctorTest
```


## Preparation
WPILib Commands v2: Subsystems; Tier I OOP; Java Math.max and Math.min.

Do not enable or deploy live motor code until the proctor verifies safety.
