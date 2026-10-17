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
        ParseResult good = CountParser.parseNonNegative(" 42 ");
        ParseResult negative = CountParser.parseNonNegative("-2");
        ParseResult letters = CountParser.parseNonNegative("four");
        check("valid number", good.isValid() && good.getValue() == 42);
        check("negative rejected", !negative.isValid() && negative.getValue() == -1);
        check("letters rejected", !letters.isValid() && letters.getValue() == -1);
        finish();
    }
}
