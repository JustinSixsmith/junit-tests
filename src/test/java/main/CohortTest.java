package main;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    public static final ArrayList<Integer> STUDENT_GRADES = new ArrayList<>(Arrays.asList(100, 90, 80));

    @Before
    public void setUp() {
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student s1 = new Student(2, "Bob Newhart");
        s1.addGrade(100);
        s1.addGrade(90);
        s1.addGrade(80);
        Student s2 = new Student(2, "Jimi Hendrix");
        s2.addGrade(100);
        s2.addGrade(90);
        s2.addGrade(80);
        Student s3 = new Student(2, "Martha Stewart");
        s3.addGrade(100);
        s3.addGrade(90);
        s3.addGrade(80);

        cohortWithOne.addStudent(new Student(1, "Bob Smith"));

        cohortWithMany.addStudent(s1);
        cohortWithMany.addStudent(s2);
        cohortWithMany.addStudent(s3);
    }

    @Test
    public void testAddStudent() {
        assertEquals(1, cohortWithOne.getStudents().size());
    }

    @Test
    public void testCohortAverage() {
        assertEquals(90, cohortWithMany.getCohortAverage(), 0);
    }


}
