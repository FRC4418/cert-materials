public class ParseResult {
    private final boolean valid;
    private final int value;
    public ParseResult(boolean valid, int value) { this.valid = valid; this.value = value; }
    public boolean isValid() { return valid; }
    public int getValue() { return value; }
}
