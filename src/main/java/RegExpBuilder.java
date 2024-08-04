public class RegExpBuilder {
    private final StringBuilder regexp = new StringBuilder();

    /**
     * appends custom text to regular expression
     * */

    public RegExpBuilder text(String text) {
        regexp.append(text);
        return this;
    }

    /**
     * builds regular expression
     */

    public String build() {
        return regexp.toString();
    }
}
