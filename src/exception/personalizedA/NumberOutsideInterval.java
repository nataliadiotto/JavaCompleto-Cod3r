package exception.personalizedA;

public class NumberOutsideInterval extends RuntimeException {

    private String attributeName;

    public NumberOutsideInterval(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("The attribute '%s' is outside the required interval.",
                attributeName);
    }

}
