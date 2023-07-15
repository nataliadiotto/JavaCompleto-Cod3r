package exception;

public class NegativeNumberException extends RuntimeException {

    private String attributeName;

    public NegativeNumberException(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("The attribute %s is negative",
                attributeName);
    }

}
