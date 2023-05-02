import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
import java.util.List;

/** 
* CountSmallerNumbersAfterSelf Tester. 
* 
* @author <Alexander Berg>
* @since <pre>May 2, 2023</pre> 
* @version 1.0 
*/ 
public class CountSmallerNumbersAfterSelfTest  {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}

        @Test
        public void testCountSmaller() {
            CountSmallerNumbersAfterSelf c = new CountSmallerNumbersAfterSelf();
            CountSmallerNumbersAfterSelf.Solution s = c.new Solution();

            int[] nums = {5, 2, 6, 1};
            List<Integer> result = s.countSmaller(nums);
            assertArrayEquals(new Integer[]{2, 1, 1, 0}, result.toArray());
        }
            @Test
            public void test2()  {
                CountSmallerNumbersAfterSelf c = new CountSmallerNumbersAfterSelf();
                CountSmallerNumbersAfterSelf.Solution s = c.new Solution();

                int[] nums2 = {1, 1, 1, 1};
                List<Integer> result2 = s.countSmaller(nums2);
                assertArrayEquals(new Integer[]{0, 0, 0, 0}, result2.toArray());
            }
                @Test
                public void test3() {
                    CountSmallerNumbersAfterSelf c = new CountSmallerNumbersAfterSelf();
                    CountSmallerNumbersAfterSelf.Solution s = c.new Solution();
            int[] nums3 = {5,4,3,2,1};
            List<Integer> result3 = s.countSmaller(nums3);
            assertArrayEquals(new Integer[]{4,3,2,1,0}, result3.toArray());
        }
    }
