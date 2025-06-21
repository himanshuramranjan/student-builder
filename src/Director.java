public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if(studentBuilder instanceof ManagementStudentBuilder) {
            return createManagementStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder.withAge(2).withName("A").withRollNumber(1).withSubjects().build();
    }

    private Student createManagementStudent() {
        return studentBuilder.withAge(4).withName("B").withRollNumber(2).withSubjects().build();
    }
}
