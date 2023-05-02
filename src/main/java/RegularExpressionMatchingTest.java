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


public class RegularExpressionMatchingTest {
@Before
public void before() throws Exception {
}

@After
public void after() throws Exception {
}
    @Test
    public void testIsMatch() {
        RegularExpressionMatching.Solution solution = new RegularExpressionMatching().new Solution();

        assertTrue(solution.isMatch("aa", "a*"));
        assertTrue(solution.isMatch("aab", "c*a*b"));
        assertFalse(solution.isMatch("mississippi", "mis*is*p*."));
        assertFalse(solution.isMatch("ab", ".*c"));
    }
}
