package exception;

public class Cause {

    public static void main(String[] args) {
        try {
            methodA(null);
        } catch (Exception e) {
            if (e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
        methodA(null);
    }

    static void methodA(Student student) {
        try {
            methodB(student);
        } catch (Exception cause) { //posso lançar outra exceção dentro do catch
            throw new IllegalArgumentException(cause);
        }

    }

    static void methodB(Student student) {
        if (student == null) {
            throw new NullPointerException("Student is null!");
        }
        System.out.println("Student: " + student.name);
    }
}
