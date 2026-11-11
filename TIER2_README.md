# Tier II — WPILib Foundations (2026)

This is **Level 2 / Tier II**, following Tier I Java. It is intentionally an introductory FRC programming curriculum, not an advanced robot controls course. The student outcome is one safe, command-based, supervised Kraken roller with Xbox controls.

## Materials

- `SW2-00` through `SW2-10`: individual certification briefs, starter files where useful, and proctor rubrics.
- `SW2-S`: no Java starter solution; from-scratch roller capstone.
- For WPILib tasks, **create an ordinary 2026 Java Command Robot project using the WPILib installer**. The folders here hold files to add to the generated project. They do not replace a generated GradleRIO project or contain a Gradle wrapper.
- For `SW2-03`, the pure Java helper's test can run without WPILib: `javac -d out src/main/java/frc/robot/util/RollerMath.java proctor/ProctorTest.java && java -cp out ProctorTest` (PowerShell users run these commands separately).
- For `SW2-09`, run `javac BrokenRoller.java ProctorTest.java` then `java ProctorTest`.

## Safety

Physical tests use a powered-down, clamped test bench verified by an adult/authorized mentor. Proctor owns enable/disable. Never run a motor on the competition robot just to pass a certification. Electrical setup and current limiting are managed by a qualified power mentor. Software requests are limited to ±0.20 unless a specific assessment is more restrictive.

## Tier boundary

- Tier I: standalone Java programming and from-scratch Java capstone.
- Tier II: WPILib project setup, basic command-based code, one roller motor, controller inputs, deployment, elementary Git/debugging.
- Tier III: sensors, multi-mechanism commands, autonomous selection, more demanding motor controls.
- Tier IV: advanced swerve, vision, auto navigation and sophisticated controls/design.

Curriculum Google Doc: https://docs.google.com/document/d/12_xtCQYXy8uRAJT4Gmzb19REAijIT0lsXDAd2K0espM/edit
Official references: https://docs.wpilib.org/en/stable/docs/software/commandbased/commands-v2/ and https://v6.docs.ctr-electronics.com/
