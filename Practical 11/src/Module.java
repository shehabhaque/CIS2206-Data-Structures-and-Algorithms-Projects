import java.util.ArrayList;
import java.util.Arrays;

public class Module {
    // module identifier
    String moduleId;
    // array of students enrolled in the module
    Student[] enrolledStudents;
    // number of students currently enrolled in the module
    int size;

    public Module(String moduleId) {
        this.moduleId = moduleId;
        this.enrolledStudents = new Student[5];
        this.size = 0;
    }

    public void enrolledStudents(Student student) {
        //checking if student is already enrolled in the module
        for (int index = 0; index < size; index++) {
            if (enrolledStudents[index].gets_id().equals(student.gets_id())) {
                System.out.println("\nError during enrollment\nStudent enrolled already\n\n");
                return;
            }
        }
        // add student to the module
        enrolledStudents[size] = student;
        // increase size by one
        size++;
        // sort enrolled students in the array
        Arrays.sort(enrolledStudents, 0, this.size);

    }

    public void unenrollStudent(Student s_id) {

        // removing students
        // student id is found using a sequential search
        for (int index = 0; index < enrolledStudents.length; index++) {
            if (String.valueOf(enrolledStudents[index]).equals(String.valueOf(s_id))) {
                enrolledStudents[index] = null;
                // decrement size by one
                size--;
                break;
            }
        }

        // loop gets shifted
        int tmpSize = 0;
        Student[] tmp = new Student[enrolledStudents.length];
        for (int index = 0; index < enrolledStudents.length; index++) {
            if (enrolledStudents[index] != null) {
                tmp[tmpSize] = enrolledStudents[index];
                tmpSize++;
            }
        }
        for (int index = 0; index < enrolledStudents.length; index++) {
            enrolledStudents[index] = tmp[index];
        }
    }

    @Override
    public String toString() {
        // create a string representation of the module object
        StringBuilder Module = new StringBuilder("Module[" + moduleId + "]\nEnrolled Students:\n");
        // append each enrolled student to the string
        for (Student enrolledStudent : enrolledStudents) {
            if (enrolledStudent == null) {
                continue;
            } else {
                Module.append(enrolledStudent).append("\n");
            }
        }
        return Module.toString();
    }
}
