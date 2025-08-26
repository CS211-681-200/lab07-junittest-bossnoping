package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    void readData() {
        StudentHardCodeDatasource d = new StudentHardCodeDatasource();
        StudentList list = d.readData();

        assertEquals(4,list.getStudents().size(),"Student list contain 4 student");

        Student s1 =  list.findStudentById("6710400001");
        assertNotNull(s1);
        assertEquals("First",s1.getName());

        Student s2 =  list.findStudentById("6710400002");
        assertNotNull(s2);
        assertEquals("Second",s2.getName());
    }
}