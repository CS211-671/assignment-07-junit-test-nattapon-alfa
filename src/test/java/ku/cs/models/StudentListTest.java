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


}