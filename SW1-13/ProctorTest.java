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
        Settings settings = new Settings(true, 0.25);
        java.util.function.BooleanSupplier enabled = SupplierDemo.enabledSupplier(settings);
        java.util.function.DoubleSupplier speed = SupplierDemo.speedSupplier(settings);
        check("initial enabled", enabled.getAsBoolean());
        check("initial speed", speed.getAsDouble() == 0.25);
        settings.setEnabled(false); settings.setSpeed(0.75);
        check("lambda reads current enabled", !enabled.getAsBoolean());
        check("method reference reads current speed", speed.getAsDouble() == 0.75);
        finish();
    }
}
