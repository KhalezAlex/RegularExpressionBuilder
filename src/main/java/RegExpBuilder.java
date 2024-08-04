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
     * appends a regular expression to current regular expression
     * */

    public RegExpBuilder append(RegExpBuilder regExp) {
        regexp.append(regExp.build());
        return this;
    }

    public RegExpBuilder append (String regexp) {
        this.regexp.append(regexp);
        return this;
    }

    /**
     * builds regular expression
     */

    public String build() {
        return regexp.toString();
    }
}
