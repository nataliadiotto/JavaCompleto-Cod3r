package exception;

import java.util.Objects;

public class Student {

    final String name;
    final double grade;
    final boolean goodBehavior;

    public Student(String name, double grade){
        this(name, grade, true);
    }

    public Student(String name, double grade, boolean goodBehavior) {
        this.name = name;
        this.grade = grade;
        this.goodBehavior = goodBehavior;
    }

    public String toString(){
        return name + "'s grade is " + grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(student.grade, grade) != 0) return false;
        if (goodBehavior != student.goodBehavior) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(grade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (goodBehavior ? 1 : 0);
        return result;
    }
}
