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


public class WildcardMatchingTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testIsMatch() {
        WildcardMatching wc = new WildcardMatching();

        assertTrue(wc.new Solution().isMatch("", ""));
        assertFalse(wc.new Solution().isMatch("aa", "a"));
        assertTrue(wc.new Solution().isMatch("aa", "*"));
       // assertTrue(wc.new Solution().isMatch("cb", "?a"));
        assertFalse(wc.new Solution().isMatch("acdcb", "a*c?b"));
    }
}
