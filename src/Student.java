import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String motherName;
    List<String> subjects;

    protected Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString() {
        return this.name + " " + this.rollNumber + " " + this.age;
    }
}
