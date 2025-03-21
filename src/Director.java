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
        return studentBuilder.setAge(2).setName("A").setRollNumber(1).setSubjects().build();
    }

    private Student createManagementStudent() {
        return studentBuilder.setAge(4).setName("B").setRollNumber(2).setSubjects().build();
    }
}
