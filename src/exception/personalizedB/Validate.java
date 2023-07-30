package exception.personalizedB;

import exception.Student;

public class Validate {

    private Validate() {}

    public static void student(Student student)
            throws EmptyStringException, NumberOutsideInterval{
            if (student == null) {
                throw new IllegalArgumentException("Student is null.");
            }
            if (student.name == null || student.name.trim().isEmpty()) {
                throw new EmptyStringException("name");
            }
            if (student.grade < 0 || student.grade > 10) {
                throw new NumberOutsideInterval("grade");
            }
        }
    }
