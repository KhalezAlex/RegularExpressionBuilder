public class RegExpBuilder {
    private final StringBuilder regexp = new StringBuilder();

    /**
     * returns custom text as a regular expression
     * */

    public String text(String text) {
        regexp.append(text);
        return regexp.toString();
    }

    /**
     * builds regular expression
     */

    public String build() {
        return regexp.toString();
    }
}
