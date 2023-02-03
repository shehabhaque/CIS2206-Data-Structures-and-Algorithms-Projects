public class Student implements Comparable <Student> {
    // Declaring variables for student information
    String studentId;

    // Constructor for creating a new student object
    public Student(String studentId) {
        this.studentId=studentId;
    }


    // Getter and setter methods for student ID
    public String gets_id() { return studentId; }
    public void sets_id(String studentId) {
        this.studentId = studentId;
    }

    // Overriding the toString method to display student information
    @Override
    public String toString(){
        return "Student ID = " + this.studentId;
    }

    // Overriding the compareTo method to compare students based on their ID
    @Override
    public int compareTo(Student o) {
        return
                this.studentId.compareTo((o.studentId));
    }
}


