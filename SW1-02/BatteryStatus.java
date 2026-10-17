public class BatteryStatus {
    public static boolean isSafeVoltage(double voltage) {
        return false;
    }

    public static String status(double voltage, boolean enabled) {
        return "";
    }

    public static void main(String[] args) {
        System.out.println(status(12.0, true));
    }
}
