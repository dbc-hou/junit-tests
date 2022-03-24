import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort c1 = new Cohort();
    Student s1 = new Student(1, "Steve");
    Student s2 = new Student(2,"Marina");
    Student s3 = new Student(3,"Tuyen");

    @Before
    public void setUp() {
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        s1.addGrade(87);
        s1.addGrade(93);
        s1.addGrade(78);
        s2.addGrade(100);
        s2.addGrade(80);
        s2.addGrade(92);
        s3.addGrade(95);
        s3.addGrade(88);
        s3.addGrade(74);
    }

    @Test
    public void testAddStudent () {
        assertFalse(c1.getStudents().isEmpty());
        assertEquals(1,s1.getId());
        assertEquals("Steve",s1.getName());
    }

    @Test
    public void testGetStudents() {
        assertEquals(3, c1.getStudents().size());
        assertEquals("Tuyen", c1.getStudents().get(2).getName());
    }

    @Test
    public void testGetCohortAverage() {
        double s1Avg = s1.getGradeAverage();
        double s2Avg = s2.getGradeAverage();
        double s3Avg = s3.getGradeAverage();
        assertEquals(c1.getCohortAverage(),(s1Avg + s2Avg + s3Avg)/c1.getStudents().size(),0);
    }

}
