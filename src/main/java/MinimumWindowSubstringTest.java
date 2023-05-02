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

public class MinimumWindowSubstringTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void test1() {
        MinimumWindowSubstring.Solution sol = new MinimumWindowSubstring().new Solution();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String expected = "BANC";
        String actual = sol.minWindow(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        MinimumWindowSubstring.Solution sol = new MinimumWindowSubstring().new Solution();
        String s = "cabwefgewcwaefgcf";
        String t = "cae";
        String expected = "cwae";
        String actual = sol.minWindow(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        MinimumWindowSubstring.Solution sol = new MinimumWindowSubstring().new Solution();
        String s = "a";
        String t = "aa";
        String expected = "";
        String actual = sol.minWindow(s, t);
        assertEquals(expected, actual);
    }
}

