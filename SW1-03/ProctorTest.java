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
        check("for loop count", PitStopCounter.countInspections(4) == 4);
        check("sum all hours", PitStopCounter.sumHours(new int[] {2, 3, 1}) == 6);
        check("while loop deliveries", PitStopCounter.countUntilReady(2, 5) == 3);
        check("already ready", PitStopCounter.countUntilReady(5, 5) == 0);
        finish();
    }
}
