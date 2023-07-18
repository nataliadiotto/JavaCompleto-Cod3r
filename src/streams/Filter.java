package streams;

import oo.composicao.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Student std1 = new Student("Anna", 7.8);
        Student std2 = new Student("Bia", 5.8);
        Student std3 = new Student("Daniel", 9.8);
        Student std4 = new Student("Gui", 6.8);
        Student std5 = new Student("Rebeca", 7.1);
        Student std6 = new Student("Pedro", 8.8);

        List<Student> students = Arrays.asList(std1, std2, std3, std4, std5, std6);

        Predicate<Student> approved = student -> student.grade >= 7;
        Function<Student, String> message =
                student -> "Congratulations, " + student.name + "! You have been approved.";

        students.stream()
                .filter(approved)
                .map(message)
                .forEach(System.out::println);

        /*students.stream()
                .filter(student -> student.grade >= 7.0)
                .map(student -> "Congratulations, " + student.name + "! You have been approved.")
                .forEach(System.out::println);*/
    }
}
