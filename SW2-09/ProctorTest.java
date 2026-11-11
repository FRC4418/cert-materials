public class ProctorTest {
  private static int passed = 0;
  private static void eq(double want, double got, String name) {
    if (Math.abs(want - got) > 1e-9) throw new AssertionError(name + " expected " + want + " got " + got);
    passed++;
  }
  public static void main(String[] args) {
    eq(0.20, BrokenRoller.limit(0.80), "clamp");
    eq(-0.10, BrokenRoller.reverse(0.10), "reverse");
    eq(0.00, BrokenRoller.stoppedOutput(), "stop");
    System.out.println(passed + "/3 checks passed");
  }
}
