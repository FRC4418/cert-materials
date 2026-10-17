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
        check("total cost", PartsCalculator.totalCost(4, 2.5) == 10.0);
        check("average cost", PartsCalculator.averageCost(10.0, 4) == 2.5);
        check("partial bin rounds up", PartsCalculator.roundedBins(13, 5) == 3);
        check("exact bin stays exact", PartsCalculator.roundedBins(10, 5) == 2);
        finish();
    }
}
