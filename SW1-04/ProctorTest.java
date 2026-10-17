public class ProctorTest {
    private static int passed = 0;
    private static int total = 0;

    private static void check(String label, boolean condition) {
        total++;
        if (condition) {
            passed++;
            System.out.println("PASS: " + label);
        } else {
            System.out.println("FAIL: " + label);
        }
    }

    private static void finish() {
        System.out.println(passed + "/" + total + " checks passed");
        if (passed != total) System.exit(1);
    }
    public static void main(String[] args) {
        check("clamp low", DriveMath.clamp(-0.2, 0.0, 1.0) == 0.0);
        check("clamp middle", DriveMath.clamp(0.4, 0.0, 1.0) == 0.4);
        check("clamp high", DriveMath.clamp(1.4, 0.0, 1.0) == 1.0);
        check("two value average", DriveMath.average(2.0, 4.0) == 3.0);
        check("three value overload", DriveMath.average(2.0, 4.0, 6.0) == 4.0);
        check("report", DriveMath.report(2.0).equals("Speed: 1.0"));
        finish();
    }
}
