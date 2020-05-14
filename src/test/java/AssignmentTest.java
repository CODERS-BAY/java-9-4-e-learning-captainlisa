import com.codersbay.plakolb.Assignment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentTest {

    @Test
    @DisplayName("An assignment that is graded with less than 50 percent of the points results in a Grade 5")
    public void testGradeBadAssignment() {
        Assignment testAssignment = new Assignment("finalExam", 100);
        Integer grade = testAssignment.grade(48);
        assertEquals(5, grade);
    }

    @Test
    @DisplayName("An assignment that is graded with 100 percent of the points results in a Grade 1")
    public void testGradeGoodAssignment() {
        Assignment testAssignment = new Assignment("finalExam", 100);
        Integer grade = testAssignment.grade(100);
        assertEquals(1, grade);
    }

    @Test
    @DisplayName("An assignment that is graded with more than 100 percent of the points results in a Grade 1")
    public void testGradeGreatAssignment() {
        Assignment testAssignment = new Assignment("finalExam", 100);
        Integer grade = testAssignment.grade(110);
        assertEquals(1, grade);
    }

}
