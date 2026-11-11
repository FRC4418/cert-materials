/** Intentionally buggy: student must fix three behavior errors. */
public class BrokenRoller {
  public static double limit(double request) {
    return request; // BUG: doesn't limit duty cycle
  }

  public static double reverse(double request) {
    return request; // BUG: reverses nothing
  }

  public static double stoppedOutput() {
    return 0.10; // BUG: motor would stay on after stopping
  }
}
