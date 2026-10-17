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
        Reportable[] reports = {new InspectionReport("Battery"), new ServiceReport("Drive")};
        check("polymorphic reports", ReportPrinter.join(reports).equals("Inspection: Battery\nService: Drive"));
        finish();
    }
}
