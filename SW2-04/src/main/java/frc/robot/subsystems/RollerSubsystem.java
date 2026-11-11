package frc.robot.subsystems;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

/** BEGINNER STARTER. Do not enable hardware until a proctor approves. */
public class RollerSubsystem extends SubsystemBase {
  private final TalonFX motor = new TalonFX(Constants.Roller.MOTOR_CAN_ID);
  private final DutyCycleOut request = new DutyCycleOut(0.0);

  public void setOutput(double desired) {
    // TODO: clamp desired to +/- Constants.Roller.MAX_OUTPUT.
    // TODO: send the clamped demand with motor.setControl(request.withOutput(...)).
  }

  public void stop() {
    motor.setControl(request.withOutput(0.0));
  }
}
