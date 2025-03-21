import java.util.List;

public class ManagementStudentBuilder extends StudentBuilder {
    @Override
    protected StudentBuilder setSubjects() {
        this.subjects = List.of("Finance", "Marketing");
        return this;
    }
}
