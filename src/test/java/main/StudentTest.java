package main;

import org.junit.Test;

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
}
