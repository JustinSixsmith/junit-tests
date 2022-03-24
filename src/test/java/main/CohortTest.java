package main;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class CohortTest {
    public static final ArrayList<Integer> STUDENT_GRADES = new ArrayList<>(Arrays.asList(100, 90, 80));

    @Before
    public void setup() {
        Cohort cobol = new Cohort();
        Student s1 = new Student(1, "Bob Dole");
        for (Integer grade : STUDENT_GRADES) {
            s1.addGrade(grade);
        }
        Student s2 = new Student(2, "Jack Palance");
        for (Integer grade : STUDENT_GRADES) {
            s2.addGrade(grade);
        }
        Student s3 = new Student(3, "Martha Stewart");
        for (Integer grade : STUDENT_GRADES) {
            s3.addGrade(grade);
        }
        Student s4 = new Student(3, "Jimi Hendrix");
        for (Integer grade : STUDENT_GRADES) {
            s4.addGrade(grade);
        }
    }


//    @Test
//    private void testAddStudent() {
//        assertEquals(false, );
//    }

}
