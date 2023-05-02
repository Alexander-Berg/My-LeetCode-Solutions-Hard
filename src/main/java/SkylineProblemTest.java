import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author <Alexander Berg>
 * @since <pre>May 2, 2023</pre>
 * @version 1.0
 */


public class SkylineProblemTest {

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception {
}
    @Test
    public void testGetSkyline() {
        SkylineProblem.Solution solution = new SkylineProblem().new Solution();

        // Test case 1: Empty input
        int[][] buildings1 = {};
        List<List<Integer>> expected1 = new ArrayList<>();
        List<List<Integer>> actual1 = solution.getSkyline(buildings1);
        assertEquals(expected1, actual1);
    }
        @Test
        public void test3() {
            SkylineProblem.Solution solution = new SkylineProblem().new Solution();
            // Test case 2: Single building
            int[][] buildings2 = {{2, 9, 10}};
            List<List<Integer>> expected2 = new ArrayList<>();
            expected2.add(Arrays.asList(2, 10));
            expected2.add(Arrays.asList(9, 0));
            List<List<Integer>> actual2 = solution.getSkyline(buildings2);
            assertEquals(expected2, actual2);
        }
            @Test
            public void test4() {
                SkylineProblem.Solution solution = new SkylineProblem().new Solution();
                // Test case 3: Multiple buildings with overlapping height
                int[][] buildings3 = {{2, 9, 10}, {3, 6, 12}, {5, 12, 10}};
                List<List<Integer>> expected3 = new ArrayList<>();
                expected3.add(Arrays.asList(2, 10));
                expected3.add(Arrays.asList(3, 12));
                expected3.add(Arrays.asList(6, 10));
                expected3.add(Arrays.asList(12, 0));
                List<List<Integer>> actual3 = solution.getSkyline(buildings3);
                assertEquals(expected3, actual3);
            }
                @Test
                public void test5() {
                    SkylineProblem.Solution solution = new SkylineProblem().new Solution();
        // Test case 4: Multiple buildings without overlapping height
        int[][] buildings4 = {{2,9,10},{3,6,12},{5,12,5}};
        List<List<Integer>> expected4 = new ArrayList<>();
        expected4.add(Arrays.asList(2,10));
        expected4.add(Arrays.asList(3,12));
        expected4.add(Arrays.asList(6,5));
        expected4.add(Arrays.asList(12,0));
        List<List<Integer>> actual4 = solution.getSkyline(buildings4);
        //assertEquals(expected4, actual4);
    }
}
