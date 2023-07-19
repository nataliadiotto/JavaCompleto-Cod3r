package streams;

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
}
