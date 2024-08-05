public class RegExpBuilder {
    private final StringBuilder regexp = new StringBuilder();

    /**
     * returns custom text as a regexp
     * */
    @Deprecated
    public String text(String text) {
        regexp.append(text);
        return regexp.toString();
    }

    /**
     * appends a regular expression to current regexp
     * */

    public RegExpBuilder append(RegExpBuilder regExp) {
        regexp.append(regExp.build());
        return this;
    }

    public RegExpBuilder append (String regExp) {
        this.regexp.append(regExp);
        return this;
    }

    public RegExpBuilder append(Pattern pattern) {
        this.regexp.append(pattern.pattern);
        return this;
    }

    /**
     * appends 0-n amounts of pattern sequence to current regexp
     * 2-nd parameter shows can a looking up sequence have a "0" length
     * */

    public RegExpBuilder append(RegExpBuilder regExp, boolean canBeZero) {
        this.regexp
                .append(regExp);
        if (canBeZero) {
            this.regexp.append("*");
        } else  {
            this.regexp.append("+");
        }
        return this;
    }

    /**
     * builds regular expression
     */

    public String build() {
        return regexp.toString();
    }
}
