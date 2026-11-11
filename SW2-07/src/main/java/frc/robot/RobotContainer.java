package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.RollerSubsystem;

/** Copy a completed RollerSubsystem into your WPILib project. */
public class RobotContainer {
  private final RollerSubsystem roller = new RollerSubsystem();
  private final CommandXboxController controller = new CommandXboxController(0);

  public RobotContainer() { configureBindings(); }

  private void configureBindings() {
    // TODO: use roller.setDefaultCommand(Commands.run(..., roller)).
    // Read controller.getLeftY() INSIDE the repeated lambda, not beforehand.
    // Add a deadband and scale output to +/-0.15.
    // TODO: bind a bumper override using whileTrue and a runEnd command.
  }

  public Command getAutonomousCommand() { return Commands.none(); }
}
