public class Client {
    public static void main(String[] args) {

        Director directorObj1 = new Director(EngineeringStudentBuilder.builder());
        Director directorObj2 = new Director(ManagementStudentBuilder.builder());

        Student engineerStudent = directorObj1.createStudent();
        Student mbaStudent =directorObj2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());


    }
}