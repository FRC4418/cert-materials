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
        check("clean name", TeamNameFormatter.cleanName("  Impulse ").equals("IMPULSE"));
        check("initials", TeamNameFormatter.initials("Ada", "Lovelace").equals("AL"));
        check("team word case insensitive", TeamNameFormatter.hasTeamWord("Our team is ready"));
        check("label", TeamNameFormatter.label(4418, "Impulse").equals("Team 4418: IMPULSE"));
        finish();
    }
}
