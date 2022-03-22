import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {
@Test
    public void getIDTest() {
        Student s1 = new Student(1,"Steve Miller");
        assertEquals(1,s1.getId());
        assertEquals("Steve Miller",s1.getName());
        assertTrue(s1.getGrades().isEmpty());
    }

    public void testConstructor() {
        Student s1 = new Student(1,"Steve Miller");
        assertEquals(1,s1.getId());
        assertEquals("Steve Miller",s1.getName());
        assertTrue(s1.getGrades().isEmpty());
    }

    public void testAddGrade() {
        Student s2 = new Student(2,"Boz Scaggs");
        s2.getGrades().add(83);
        assertEquals(83,s2.getGrades().get(0).intValue());
    }
}
