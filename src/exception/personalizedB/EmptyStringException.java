package exception.personalizedB;

public class EmptyStringException extends Exception {

    private String attributeName;

    public EmptyStringException(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("The attribute '%s' is empty",
                attributeName);
    }

}
