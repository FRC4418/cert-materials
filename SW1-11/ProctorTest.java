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
        InventoryList inventory = new InventoryList();
        inventory.add("Kraken"); inventory.add("Encoder");
        check("size after add", inventory.size() == 2);
        check("contains", inventory.contains("Kraken"));
        check("remove existing", inventory.remove("Kraken"));
        check("size after remove", inventory.size() == 1);
        check("remove missing", !inventory.remove("Falcon"));
        finish();
    }
}
