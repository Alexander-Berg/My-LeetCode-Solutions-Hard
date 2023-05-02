
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


 import org.junit.Test;
 import org.junit.Assert;

 public class SlidingWindowMaximumTest {

     @Before
     public void before() throws Exception {
     }

     @After
     public void after() throws Exception {
     }
     @Test
     public void testMaxSlidingWindow() {
         int[] arr = {1,3,-1,-3,5,3,6,7};
         int k = 3;
         int[] expected = {3,3,5,5,6,7};
         SlidingWindowMaximum.Solution solution = new SlidingWindowMaximum.Solution();
         int[] result = solution.maxSlidingWindow(arr, k);
         Assert.assertArrayEquals(expected, result);
     }

 }

