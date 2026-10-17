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
        BoundedSetting speed = new BoundedSetting("speed", -1.0, 1.0, 3.0);
        check("constructor clamps", speed.getValue() == 1.0);
        speed.setValue(-2.0);
        check("setter clamps", speed.getValue() == -1.0);
        speed.setValue(0.5);
        check("setter accepts in range", speed.getValue() == 0.5);
        check("name", speed.getName().equals("speed"));
        check("toString", speed.toString().equals("speed=0.5"));
        finish();
    }
}
