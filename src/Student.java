import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }
}
