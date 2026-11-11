package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.RollerCommands;
import frc.robot.subsystems.RollerSubsystem;

/** Copy your completed SW2-04/05 classes into the same WPILib project. */
public class RobotContainer {
  private final RollerSubsystem roller = new RollerSubsystem();
  private final CommandXboxController controller = new CommandXboxController(0);

  public RobotContainer() { configureBindings(); }

  private void configureBindings() {
    // TODO: right bumper -> forward; left bumper -> reverse; use whileTrue.
  }

  public Command getAutonomousCommand() { return Commands.none(); }
}
