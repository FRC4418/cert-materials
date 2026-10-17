public class DebugTest {
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
        check("fractional average", BrokenLogic.average(new int[] {2, 3, 4, 5}) == 3.5);
        check("whole average", BrokenLogic.average(new int[] {2, 4, 6}) == 4.0);
        finish();
    }
}
