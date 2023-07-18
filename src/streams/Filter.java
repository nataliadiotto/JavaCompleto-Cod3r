package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Student std1 = new Student("Anna", 7.8, false);
        Student std2 = new Student("Bia", 5.8, true);
        Student std3 = new Student("Daniel", 9.8, true);
        Student std4 = new Student("Gui", 6.8, true);
        Student std5 = new Student("Rebeca", 7.1, true);
        Student std6 = new Student("Pedro", 8.8, false);

        List<Student> students = Arrays.asList(std1, std2, std3, std4, std5, std6);

        Predicate<Student> approved = student -> student.grade >= 7; //&& student.goodBehavior;
        Predicate<Student> goodBehavior = student -> student.goodBehavior;
        Function<Student, String> message =
                student -> "Congratulations, " + student.name + "! You have been approved.";

        students.stream()
                .filter(approved)
                .filter(goodBehavior)
                .map(message)
                .forEach(System.out::println);

        /*students.stream()
                .filter(student -> student.grade >= 7.0)
                .map(student -> "Congratulations, " + student.name + "! You have been approved.")
                .forEach(System.out::println);*/
    }
}
