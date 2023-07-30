package exception.personalizedB;

public class NumberOutsideInterval extends Exception {

    private String attributeName;

    public NumberOutsideInterval(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("The attribute '%s' is outside the required interval.",
                attributeName);
    }

}
