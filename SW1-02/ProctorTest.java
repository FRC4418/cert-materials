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
        check("safe lower bound", BatteryStatus.isSafeVoltage(10.5));
        check("unsafe below bound", !BatteryStatus.isSafeVoltage(10.49));
        check("disabled wins", BatteryStatus.status(12.0, false).equals("DISABLED"));
        check("low", BatteryStatus.status(10.9, true).equals("LOW"));
        check("nominal", BatteryStatus.status(12.7, true).equals("NOMINAL"));
        check("high", BatteryStatus.status(12.71, true).equals("HIGH"));
        finish();
    }
}
