package exception.personalizedA;

import exception.Student;

public class ValidationsTest {
    public static void main(String[] args) {

        try {
            Student student = new Student("Ana", 7);
            Validate.student(student);
        } catch (EmptyStringException | NumberOutsideInterval e) {
            System.out.println(e.getMessage());
            ;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
            System.out.println("Student validated!");
        }
    }
