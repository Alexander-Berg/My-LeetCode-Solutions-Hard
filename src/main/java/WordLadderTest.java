import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
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
public class WordLadderTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception{
    }

    private final WordLadder.Solution solution = new WordLadder().new Solution();

    @Test
    public void testLadderLength_Example1() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int expectedOutput = 5;
        assertEquals(expectedOutput, solution.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void testLadderLength_Example2() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        int expectedOutput = 0;
        assertEquals(expectedOutput, solution.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void testLadderLength_Example3() {
        String beginWord = "red";
        String endWord = "tax";
        List<String> wordList = Arrays.asList("ted", "tex", "red", "tax", "tad", "den", "rex", "pee");
        int expectedOutput = 4;
        assertEquals(expectedOutput, solution.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void testLadderLength_EmptyWordList() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        int expectedOutput = 0;
        assertEquals(expectedOutput, solution.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void testLadderLength_NoPath() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "xyz");
        int expectedOutput = 0;
        assertEquals(expectedOutput, solution.ladderLength(beginWord, endWord, wordList));
    }
}
