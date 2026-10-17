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
        MatchCounter first = new MatchCounter();
        MatchCounter second = new MatchCounter();
        first.increment(); first.add(4); second.add(2);
        check("first object state", first.getCount() == 5);
        check("second object state", second.getCount() == 2);
        finish();
    }
}
