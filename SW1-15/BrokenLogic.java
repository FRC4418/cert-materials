public class BrokenLogic {
    public static double average(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total / values.length;
    }
}
