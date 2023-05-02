import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
/**
 *
 * @author <Alexander Berg>
 * @since <pre>May 2, 2023</pre>
 * @version 1.0
 */





public class MaxPointsOnLineTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testMaxPoints() {
        MaxPointsOnLine.Solution solution = new MaxPointsOnLine.Solution();

        // Test case 1
        int[][] points1 = {{1, 1}, {2, 2}, {3, 3}};
        int expected1 = 3;
        int result1 = solution.maxPoints(points1);
        assertEquals(expected1, result1);
    }
        @Test
        public void test2() {
            MaxPointsOnLine.Solution solution = new MaxPointsOnLine.Solution();
            // Test case 2
            int[][] points2 = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
            int expected2 = 4;
            int result2 = solution.maxPoints(points2);
            assertEquals(expected2, result2);
        }
            @Test
            public void test3() {
                MaxPointsOnLine.Solution solution = new MaxPointsOnLine.Solution();
        // Test case 3
        int[][] points3 = {{0,0},{1,1},{0,0}};
        int expected3 = 3;
        int result3 = solution.maxPoints(points3);
        assertEquals(expected3, result3);
    }
}

