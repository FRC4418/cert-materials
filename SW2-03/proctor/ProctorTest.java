import frc.robot.util.RollerMath;

public class ProctorTest {
  private static int passed = 0;
  private static void eq(double want, double got, String name) {
    if (Math.abs(want - got) > 1e-9) throw new AssertionError(name + " expected " + want + " got " + got);
    passed++;
  }
  public static void main(String[] args) {
    eq(0.20, RollerMath.clamp(0.80), "positive clamp");
    eq(-0.20, RollerMath.clamp(-0.80), "negative clamp");
    eq(0.10, RollerMath.clamp(0.10), "normal value");
    eq(0.00, RollerMath.clamp(0.00), "zero");
    System.out.println(passed + "/4 checks passed");
  }
}
