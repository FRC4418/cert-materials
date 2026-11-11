package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.util.RollerMath;

/** Software-only practice subsystem: no TalonFX yet. */
public class RollerSubsystem extends SubsystemBase {
  private double lastOutput = 0.0;

  public void setOutput(double requested) {
    // TODO: store the clamped output from RollerMath.clamp(requested).
  }

  public void stop() {
    // TODO: set lastOutput to zero.
  }

  public double getLastOutput() {
    return lastOutput;
  }
}
