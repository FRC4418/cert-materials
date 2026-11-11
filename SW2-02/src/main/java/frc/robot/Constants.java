package frc.robot;

/** Edit the CAN ID to match the mentor-assigned bench device. */
public final class Constants {
  private Constants() {}

  public static final int CONTROLLER_PORT = 0;

  public static final class Roller {
    public static final int MOTOR_CAN_ID = -1; // TODO: request correct CAN ID from proctor
    public static final double MAX_OUTPUT = 0.20;
    private Roller() {}
  }
}
