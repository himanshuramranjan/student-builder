import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    protected StudentBuilder setSubjects() {
        this.subjects = List.of("CS", "DBMS", "OS");
        return this;
    }
}
