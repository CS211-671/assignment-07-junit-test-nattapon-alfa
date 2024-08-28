package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {



    @Test
    @DisplayName("testFindStudentById")
    void testFindStudentById() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6XXXXXXX","AAAA");
        studentList.findStudentById("6XXXXXXX");
        assertEquals("6XXXXXXX",studentList.findStudentById("6XXXXXXX").getId());
    }

    @Test
    @DisplayName("testGiveScoreToId")
    void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6XXXXXXX","AAAA");
        studentList.giveScoreToId("6XXXXXXX",60);
        assertEquals(60,studentList.findStudentById("6XXXXXXX").getScore());

    }

    @Test
    @DisplayName("testViewGradeOfId")
    void testViewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6XXXXXXX","AAAA");
        studentList.giveScoreToId("6XXXXXXX",85);
        assertEquals("A",studentList.viewGradeOfId("6XXXXXXX"));
    }

    @Test
    @DisplayName("findStudentByObject")
    void testFindStudentByObject() {
        StudentList students = new StudentList();
        students.addNewStudent("0123","a");
        students.addNewStudent("1234","b");
        students.addNewStudent("5678","c");

        Student s1 = new Student("0123","a");
        //System.out.println(students.findStudentByObject(s1));
        assertEquals(s1,students.findStudentByObject(s1));
    }


}