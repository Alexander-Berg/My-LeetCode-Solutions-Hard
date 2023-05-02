import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author <Alexander Berg>
 * @since <pre>May 2, 2023</pre>
 * @version 1.0
 */

public class WordBreakTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testWordBreak() {
        WordBreak.Solution solution = new WordBreak().new Solution();

        // Test case 1
        String s1 = "catsanddog";
        List<String> wordDict1 = Arrays.asList("cat", "cats", "and", "sand", "dog");
        Set<String> expectedSentences1 = new HashSet<>(
                Arrays.asList("cats and dog", "cat sand dog")
        );
        List<String> actualSentences1 = solution.wordBreak(s1, wordDict1);
        assertEquals(expectedSentences1, new HashSet<>(actualSentences1));
    }
        @Test
        public void test2() {
            WordBreak.Solution solution = new WordBreak().new Solution();

            // Test case 2
            String s2 = "pineapplepenapple";
            List<String> wordDict2 = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
            Set<String> expectedSentences2 = new HashSet<>(
                    Arrays.asList("pine apple pen apple", "pineapple pen apple", "pine applepen apple")
            );
            List<String> actualSentences2 = solution.wordBreak(s2, wordDict2);
            assertEquals(expectedSentences2, new HashSet<>(actualSentences2));
        }
            @Test
            public void test3k() {
                WordBreak.Solution solution = new WordBreak().new Solution();

        // Test case 3
        String s3 = "catsandog";
        List<String> wordDict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        Set<String> expectedSentences3 = new HashSet<>();
        List<String> actualSentences3 = solution.wordBreak(s3, wordDict3);
        assertEquals(expectedSentences3, new HashSet<>(actualSentences3));
    }
}
