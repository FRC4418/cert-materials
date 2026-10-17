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
        int[] scores = {60, 70, 90, 80};
        check("sum", ScoreStatistics.sum(scores) == 300);
        check("average", ScoreStatistics.average(scores) == 75.0);
        check("highest", ScoreStatistics.highest(scores) == 90);
        check("passing count", ScoreStatistics.countPassing(scores) == 3);
        finish();
    }
}
