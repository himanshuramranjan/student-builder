import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

    private EngineeringStudentBuilder() {}

    public static EngineeringStudentBuilder builder() {
        return new EngineeringStudentBuilder();
    }

    @Override
    protected StudentBuilder withSubjects() {
        this.subjects = List.of("CS", "DBMS", "OS");
        return this;
    }
}
