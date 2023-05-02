import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author <Alexander Berg>
 * @since <pre>May 2, 2023</pre>
 * @version 1.0
 */



public class TrappingRainWaterTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testTrap() {
        TrappingRainWater.Solution solution = new TrappingRainWater().new Solution();

        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, solution.trap(height1));
    }
        @Test
        public void testTrap2() {
            TrappingRainWater.Solution solution = new TrappingRainWater().new Solution();
            int[] height2 = {4, 2, 0, 3, 2, 5};
            assertEquals(9, solution.trap(height2));
        }
            @Test
            public void testTrap3() {
            TrappingRainWater.Solution solution = new TrappingRainWater().new Solution();

        int[] height3 = {5,4,3,2,1};
        assertEquals(0, solution.trap(height3));
    }
}
