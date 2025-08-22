package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init(){
        s = new Student("6710450899", "Boss");
    }


    @Test
    @DisplayName("Add score nisit 49 and 2")
    void testAddScore() {
        s.addScore(40);
        assertEquals(40, s.getScore());
        s.addScore(20);
        assertEquals(60, s.getScore());

    }
    @Test
    void textCalculateGrade(){
        s.addScore(30);
        assertEquals("C", s.grade());
    }

    @Test
    void isId(){
        assertEquals(true, s.getId().equals("6710450899"));
    }

    @Test
    void isNameContains(){
        assertEquals(true, s.getName().equals("Boss"));
    }
}