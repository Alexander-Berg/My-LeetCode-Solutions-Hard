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




public class LargestRectangleHistogramTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testLargestRectangleArea() {
        LargestRectangleHistogram.Solution solution = new LargestRectangleHistogram().new Solution();

        // Test case 1
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        int expectedOutput1 = 10;
        int actualOutput1 = solution.largestRectangleArea(heights1);
        assertEquals(expectedOutput1, actualOutput1);
    }
        @Test
        public void test2() {
            LargestRectangleHistogram.Solution solution = new LargestRectangleHistogram().new Solution();
            // Test case 2
            int[] heights2 = {2, 4};
            int expectedOutput2 = 4;
            int actualOutput2 = solution.largestRectangleArea(heights2);
            assertEquals(expectedOutput2, actualOutput2);
        }
            @Test
            public void test3() {
                LargestRectangleHistogram.Solution solution = new LargestRectangleHistogram().new Solution();
        // Test case 3
        int[] heights3 = {1,1};
        int expectedOutput3 = 2;
        int actualOutput3 = solution.largestRectangleArea(heights3);
        assertEquals(expectedOutput3, actualOutput3);
    }
}
