import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author <Alexander Berg>
 * @since <pre>May 2, 2023</pre>
 * @version 1.0
 */


public class LongestIncreasingPathMatrixTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testLongestIncreasingPath() {
        LongestIncreasingPathMatrix.Solution solution = new LongestIncreasingPathMatrix.Solution();
        int[][] matrix1 = {{9,9,4},{6,6,8},{2,1,1}};
        int expected1 = 4;
        int result1 = solution.longestIncreasingPath(matrix1);
        assertEquals(expected1, result1);

        int[][] matrix2 = {{3,4,5},{3,2,6},{2,2,1}};
        int expected2 = 4;
        int result2 = solution.longestIncreasingPath(matrix2);
        assertEquals(expected2, result2);

        int[][] matrix3 = {{1,2,3},{4,5,6},{7,8,9}};
        int expected3 = 9;
        int result3 = solution.longestIncreasingPath(matrix3);
        assertEquals(expected3, result3);
    }

    @Test
    public void testDfs() {
        LongestIncreasingPathMatrix.Solution solution = new LongestIncreasingPathMatrix.Solution();
        int[][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
        Integer[][] cache = new Integer[matrix.length][matrix[0].length];
        int expected1 = 1;
        int result1 = solution.dfs(0, 0, -1, matrix, cache);
        assertEquals(expected1, result1);

        int expected2 = 4;
        int result2 = solution.dfs(0, 2, 4, matrix, cache);
        assertEquals(expected2, result2);

        int expected3 = 3;
        int result3 = solution.dfs(1, 1, 6, matrix, cache);
        assertEquals(expected3, result3);
    }
}
