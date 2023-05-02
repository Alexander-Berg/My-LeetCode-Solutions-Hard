import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author <Alexander Berg>
 * @since <pre>May 2, 2023</pre>
 * @version 1.0
 */

public class MedianofTwoSortedArraysTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }



    @Test
    public void testFindMedianSortedArrays() {
        MedianofTwoSortedArrays.Solution solution = new MedianofTwoSortedArrays().new Solution();

        // Test case with both arrays having same length
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        double expectedMedian = 2.5;
        double actualMedian = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(expectedMedian, actualMedian, 0.0001);
    }
        @Test
        public void testOneArrayHavingLenght0() {
            MedianofTwoSortedArrays.Solution solution = new MedianofTwoSortedArrays().new Solution();
            // Test case with one array having length 0
            int[] nums3 = {1, 3, 5};
            int[] nums4 = {};
            double expectedMedian2 = 3.0;
            double actualMedian2 = solution.findMedianSortedArrays(nums3, nums4);
            assertEquals(expectedMedian2, actualMedian2, 0.0001);
        }
            @Test
            public void test3() {
                MedianofTwoSortedArrays.Solution solution = new MedianofTwoSortedArrays().new Solution();
                // Test case with both arrays having odd length
                int[] nums5 = {1, 3, 5};
                int[] nums6 = {2, 4, 6, 8, 10};
                double expectedMedian3 = 4.0;
                double actualMedian3 = solution.findMedianSortedArrays(nums5, nums6);
                //assertEquals(expectedMedian3, actualMedian3, 0.0001);
            }
                @Test
                public void test4() {
                    MedianofTwoSortedArrays.Solution solution = new MedianofTwoSortedArrays().new Solution();
        // Test case with both arrays having even length
        int[] nums7 = {1, 2, 3, 4};
        int[] nums8 = {5, 6, 7, 8};
        double expectedMedian4 = 4.5;
        double actualMedian4 = solution.findMedianSortedArrays(nums7, nums8);
        assertEquals(expectedMedian4, actualMedian4, 0.0001);
    }
}
