import com.codersbay.plakolb.Assignment;
import com.codersbay.plakolb.Lecture;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LectureTest {

    @Test
    @DisplayName("A Lecture without any assignments returns null for the grade")
    public void testLectureWithoutAssignments() {
        Lecture testLecture = new Lecture("testLecture");
        Integer finalGrade = testLecture.getFinalGrade();
        assertEquals((Integer) null, finalGrade);
    }

    @Test
    @DisplayName("A Lecture with exactly one assignments returns the grade of that assignment")
    public void testLectureWithSingleAssignment() {
        // TODO implement
        Lecture testLecture = new Lecture("testLecture");
        Assignment testAssignment = new Assignment("finalExam", 100);
        testAssignment.grade(75);
        testLecture.addAssignment(testAssignment);
        int finalGrade = testLecture.getFinalGrade();
        assertEquals(3, finalGrade);
    }

    @Test
    @DisplayName("A Lecture with many assignments returns the average grade of these assignments")
    public void testLectureWithMultipleAssignment() {
        Lecture testLecture = new Lecture("testLecture");
        Assignment testAssignment = new Assignment("finalExam", 100);
        Assignment secondAssignment = new Assignment("termpaper", 100);
        Assignment thirdAssignment = new Assignment("midterm", 100);
        testAssignment.grade(75); //3
        secondAssignment.grade(60); //4
        thirdAssignment.grade(84); //2
        testLecture.addAssignment(testAssignment);
        testLecture.addAssignment(secondAssignment);
        testLecture.addAssignment(thirdAssignment);
        int finalGrade = testLecture.getFinalGrade();
        assertEquals(3, finalGrade);
    }

}
