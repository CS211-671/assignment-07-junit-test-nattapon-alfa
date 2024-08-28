package ku.cs;

import ku.cs.models.Student;
import ku.cs.models.StudentList;

public class MainTestConsole {
    public void main(String[] args) {
        StudentList students = new StudentList();
        students.addNewStudent("0123","a");
        students.addNewStudent("1234","b");
        students.addNewStudent("5678","c");

        Student s1 = new Student("0123","a");
        System.out.println(students.findStudentByObject(s1));
    }
}
