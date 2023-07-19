package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {

        Student s1 = new Student("Ana", 7.1);
        Student s2 = new Student("Luna", 6.1);
        Student s3 = new Student("Gui", 8.1);
        Student s4 = new Student("Gabi", 10);

        List<Student> students = Arrays.asList(s1, s2, s3, s4);

        Predicate<Student> approved = student -> student.grade >= 7;
        Function<Student, Double> studentGrade = student -> student.grade;
        BinaryOperator<Double> sum = (a, b) -> a + b;

        students.stream()
                .filter(approved)
                .map(studentGrade)
                .reduce(sum)
                .ifPresent(System.out::println);


    }
}
