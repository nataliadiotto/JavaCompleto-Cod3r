package exception;

public class Basic {
    public static void main(String[] args) {

        Student s1 = null;

        try {
            printStudent(s1);
        } catch (Exception exception) {
            System.out.println("Error printing user's name");
        }

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("The end");
    }

    public static void printStudent(Student student){
        System.out.println(student.name);
    }
}
