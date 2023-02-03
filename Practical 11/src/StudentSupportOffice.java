import java.util.Collections;

public class StudentSupportOffice {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("U0000001");
        Student student2 = new Student("U0000002");
        Student student3 = new Student("U0000003");
        Student student4 = new Student("U0000004");
        Student student5 = new Student("U0000005");

        // Creating module objects
        Module module1 = new Module("CIS2206");
        Module module2 = new Module("CIS2360");
        Module module3 = new Module("CIS2205");

        // Enrolling students in modules
        module1.enrolledStudents(student1);
        module1.enrolledStudents(student5);

        module2.enrolledStudents(student1);
        module2.enrolledStudents(student3);
        module2.enrolledStudents(student4);

        module3.enrolledStudents(student2);
        module3.enrolledStudents(student4);
        module3.enrolledStudents(student5);

        System.out.println("Students before modification:" + "\n" + module3 + "\n" + module2 + "\n" + module1);

        // Disenrolling students from modules
        module1.unenrollStudent(student5);

        module1.enrolledStudents(student3);
        module1.enrolledStudents(student4);

        // Enrolling and disenrolling students in modules
        module2.enrolledStudents(student2);
        module2.enrolledStudents(student5);

        module3.unenrollStudent(student2);
        module3.unenrollStudent(student5);
        module3.enrolledStudents(student1);
        module3.enrolledStudents(student3);

        System.out.println("Students after modification:" + "\n" + module3 + "\n" + module2 + "\n" + module1);


    }
}
