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
        check("disabled", ModeMessage.message(MachineMode.DISABLED).equals("Safe to work"));
        check("teleop", ModeMessage.message(MachineMode.TELEOP).equals("Driver control"));
        check("autonomous", ModeMessage.message(MachineMode.AUTONOMOUS).equals("Robot control"));
        check("test", ModeMessage.message(MachineMode.TEST).equals("Test enabled"));
        finish();
    }
}
