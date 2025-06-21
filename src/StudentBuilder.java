import java.util.List;

public abstract class StudentBuilder {
    int rollNumber;
    int age;
    String name;
    String motherName;
    List<String> subjects;

    public StudentBuilder withRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder withMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    protected abstract StudentBuilder withSubjects();

    public Student build() {
        return new Student(this);
    }
}
