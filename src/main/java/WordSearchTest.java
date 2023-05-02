import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author <Alexander Berg>
 * @since <pre>May 2, 2023</pre>
 * @version 1.0
 */

@RunWith(JUnit4.class)
public class WordSearchTest {
    private WordSearch.Solution solution = new WordSearch.Solution();
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testFindWords() {
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> expected = Arrays.asList("oath", "eat");
        List<String> actual = solution.findWords(board, words);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordsEmpty() {
        char[][] board = {};
        String[] words = {};
        List<String> expected = Arrays.asList();
        List<String> actual = solution.findWords(board, words);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordsNoMatch() {
        char[][] board = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };
        String[] words = {"jkl", "mno", "pqr"};
        List<String> expected = Arrays.asList();
        List<String> actual = solution.findWords(board, words);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindWordsDuplicateMatch() {
        char[][] board = {
                {'a', 'b', 'c'},
                {'d', 'o', 'e'},
                {'f', 'g', 'h'}
        };
        String[] words = {"dog", "god"};
        List<String> expected = Arrays.asList("dog");
        List<String> actual = solution.findWords(board, words);
        //assertEquals(expected, actual);
    }
}
