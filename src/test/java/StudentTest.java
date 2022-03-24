import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {
    private static Student s1 = new Student(1,"Steve Miller");
    private static Student s2 = new Student(2, "Boz Scaggs");

    @Before
    public void setUp() {
        s1.addGrade(59);
        s1.addGrade(90);
        s1.addGrade(79);
        s2.addGrade(83);
        s2.addGrade(98);
        s2.addGrade(86);
    }

    @Test
    public void getIDTest() {
        assertEquals(1,s1.getId());
        assertEquals("Steve Miller",s1.getName());
        assertFalse(s1.getGrades().isEmpty());
    }

    @Test
    public void testConstructor() {
        assertEquals(1,s1.getId());
        assertEquals("Steve Miller",s1.getName());
        assertFalse(s1.getGrades().isEmpty());
    }

    @Test
    public void testAddGrade() {
        assertEquals(83,s2.getGrades().get(0).intValue());
    }
}
