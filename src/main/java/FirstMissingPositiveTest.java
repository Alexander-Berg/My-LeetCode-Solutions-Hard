
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




public class FirstMissingPositiveTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testFirstMissingPositive() {
        FirstMissingPositive.Solution sol = new FirstMissingPositive().new Solution();
        int[] nums1 = {1, 2, 0};
        assertEquals(3, sol.firstMissingPositive(nums1));
    }
        @Test
        public void test2() {
            FirstMissingPositive.Solution sol = new FirstMissingPositive().new Solution();
            int[] nums2 = {3, 4, -1, 1};
            assertEquals(2, sol.firstMissingPositive(nums2));
        }
            @Test
            public void test3() {
                FirstMissingPositive.Solution sol = new FirstMissingPositive().new Solution();
                int[] nums3 = {7, 8, 9, 11, 12};
                assertEquals(1, sol.firstMissingPositive(nums3));
            }
                @Test
                public void Test4() {
                    FirstMissingPositive.Solution sol = new FirstMissingPositive().new Solution();
                    int[] nums4 = {};
                    assertEquals(1, sol.firstMissingPositive(nums4));
                }
                    @Test
                    public void Test5() {
                        FirstMissingPositive.Solution sol = new FirstMissingPositive().new Solution();
        int[] nums5 = {1};
        assertEquals(2, sol.firstMissingPositive(nums5));
    }
}
