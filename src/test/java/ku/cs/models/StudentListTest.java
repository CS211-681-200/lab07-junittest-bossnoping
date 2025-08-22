package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList s;
    @BeforeEach
    void init(){
        s = new StudentList();
        s.addNewStudent("6521010010", "Nick");

    }

    @Test
    void testAddNewStudent() {
        s.addNewStudent("6521010510", "Boss");
        assertEquals(s.getStudents().size(), 2);
    }

    @Test
    void findStudentById() {
        Student found = s.findStudentById("6521010010");
        assertNotNull(s);
    }

    @Test
    void filterByName() {
        s.addNewStudent("6511111111", "Boss");
        assertEquals(s.getStudents().get(0).getName(), "Nick");
    }

    @Test
    void giveScoreToId() {
        s.giveScoreToId("6521010010", 20);
        Student found = s.findStudentById("6521010010");
        assertEquals(found.getScore(), 20);
    }

    @Test
    void viewGradeOfId() {
        s.viewGradeOfId("6521010010");
        Student found = s.findStudentById("6521010010");
        assertEquals(found.getGrade(), "F");
    }
}