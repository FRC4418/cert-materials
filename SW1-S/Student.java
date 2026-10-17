import java.util.ArrayList;

public class Student extends Person implements Reportable {
    // TODO: id, scores, constructor, addScore, average, status, and report.
    public Student(int id, String name) { super(name); }
    public void addScore(int score) { }
    public double average() { return 0.0; }
    public Status status() { return Status.NEEDS_HELP; }
    public String report() { return ""; }
}
