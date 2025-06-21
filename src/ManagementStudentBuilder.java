import java.util.List;

public class ManagementStudentBuilder extends StudentBuilder {

    private ManagementStudentBuilder() {}

    public static ManagementStudentBuilder builder() {
        return new ManagementStudentBuilder();
    }
    @Override
    protected StudentBuilder withSubjects() {
        this.subjects = List.of("Finance", "Marketing");
        return this;
    }
}
