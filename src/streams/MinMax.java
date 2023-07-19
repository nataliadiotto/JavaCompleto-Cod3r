package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 7.1);
        Student s2 = new Student("Luna", 6.1);
        Student s3 = new Student("Gui", 8.1);
        Student s4 = new Student("Gabi", 10);

        List<Student> students = Arrays.asList(s1, s2, s3, s4);

        Comparator<Student> bestGrade = (std1, std2) -> {
          if (std1.grade > std2.grade) return 1;
          if (std1.grade < std2.grade) return -1;
          return 0;
        };

        Comparator<Student> worstGrade = (std1, std2) -> {
            if (std1.grade > std2.grade) return -1;
            if (std1.grade < std2.grade) return 1;
            return 0;
        };

        System.out.println(students.stream().max(bestGrade).get());
        System.out.println(students.stream().min(bestGrade).get());
        System.out.println(students.stream().min(worstGrade).get());
        System.out.println(students.stream().max(worstGrade).get());
        System.out.println();
    }
}
