package main;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class StudentTest {
    public static final long STUDENT_ID = 1;
    public static String STUDENT_NAME = "Bob Smith";


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
        assertArrayEquals(expected.toArray(), s1.getGrades().toArray());
    }

    @Test
    public void testAddGrade() {
        Student s1 = new Student();
        s1.addGrade(100);
        assertEquals(100, s1.getGrades().get(0).intValue());
    }

    @Test
    public void testGetGradeAverage() {
        Student s1 = new Student();
        s1.addGrade(100);
        s1.addGrade(90);
        s1.addGrade(80);
        assertEquals(90, s1.getGradeAverage());
    }

}
