package exception;

public class Cause {

    public static void main(String[] args) {
        methodA(null);

    }

    static void methodA(Student student) {
        methodB(student);
    }

    static void methodB(Student student) {
        if (student == null) {
            throw new NullPointerException("Student is null!");
        }
        System.out.println("Student: " + student.name);
    }
}
