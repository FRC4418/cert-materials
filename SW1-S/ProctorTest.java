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
        Student ada = new Student(7, "Ada"); ada.addScore(80); ada.addScore(90);
        Student lin = new Student(8, "Lin"); lin.addScore(95); lin.addScore(100);
        java.util.List<Student> students = new java.util.ArrayList<Student>(); students.add(ada); students.add(lin);
        check("average", ada.average() == 85.0);
        check("on track status", ada.status() == Status.ON_TRACK);
        check("exceeds status", lin.status() == Status.EXCEEDS);
        check("report", ada.report().equals("7 Ada: 85.0 ON_TRACK"));
        check("find id", ProgressTracker.findById(students, 8) == lin);
        check("missing id", ProgressTracker.findById(students, 99) == null);
        check("lambda or method reference report list", ProgressTracker.reportAll(students).equals("7 Ada: 85.0 ON_TRACK\n8 Lin: 97.5 EXCEEDS"));
        check("parse valid", ProgressTracker.parseScore(" 42 ") == 42);
        check("parse words", ProgressTracker.parseScore("four") == -1);
        check("parse range", ProgressTracker.parseScore("101") == -1);
        finish();
    }
}
