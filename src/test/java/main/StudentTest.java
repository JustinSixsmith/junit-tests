package main;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class StudentTest {
    public static final long STUDENT_ID = 1;
    public static final String STUDENT_NAME = "Bob Smith";
    public static final int GRADE_1 = 100;
    public static final ArrayList<Integer> STUDENT_GRADES = new ArrayList<>(Arrays.asList(100, 90, 80));



    @Test
    public void testGetID() {
        Student s1 = new Student();
        // Set the id
        s1.setId(1);
        // Test to make sure the id was set
        assertEquals(STUDENT_ID, s1.getId());
    }

    @Test
    public void testGetName() {
        Student s1 = new Student();
        s1.setName(STUDENT_NAME);
        assertEquals("Bob Smith", s1.getName());
    }

    @Test
    public void testGetGrades() {
        Student s1 = new Student();
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, s1.getGrades());
    }

    @Test
    public void testAddGrade() {
        Student s1 = new Student();
        s1.addGrade(100);
        assertEquals(100, s1.getGrades().get(0).intValue());
    }

    @Test
    public void testGetGradesAverage() {
        Student s1 = new Student();
        for (Integer grade : STUDENT_GRADES) {
            s1.addGrade(grade);
        }
        assertEquals(90, s1.getGradeAverage(), 0);
    }

    @Test(expected = NoGradesException.class)
    public void testGetAverageNoGrade() {
        Student s1 = new Student();
        assertEquals(0, s1.getGradeAverage(), 1);
    }

    @Test
    public void testUpdateGrade() {
        Student s1 = new Student();
        for (Integer grade : STUDENT_GRADES) {
            s1.addGrade(grade);
        }
        assertEquals(GRADE_1, s1.getGrades().get(0).intValue());
        s1.updateGrade(0, 95);
        assertEquals(95, s1.getGrades().get(0).intValue());
    }

    @Test
    public void testDeleteGrade() {
        Student s1 = new Student();
        for (Integer grade : STUDENT_GRADES) {
            s1.addGrade(grade);
        }
        assertEquals(100, s1.getGrade(0));
        s1.deleteGrade(0);
        assertEquals(90, s1.getGrade(0));
    }

}
