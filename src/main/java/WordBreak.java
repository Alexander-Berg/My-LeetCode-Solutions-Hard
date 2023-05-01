import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    class Solution {
        private List<String> sentences;

        public List<String> wordBreak(String s, List<String> wordDict) {
            Set<String> words = new HashSet<>(wordDict);
            sentences = new ArrayList<>();
            wordBreak(words, s, 0, "");
            return sentences;
        }

        private void wordBreak(Set<String> words, String s, int i, String sentence) {
            if (i == s.length()) {
                sentences.add(sentence);
                return;
            }

            for (int j = i; j < s.length(); j++) {
                String word = s.substring(i, j + 1);
                if (words.contains(word)) {
                    if (sentence.length() == 0) {
                        wordBreak(words, s, j + 1, sentence + word);
                    } else {
                        wordBreak(words, s, j + 1, sentence + " " + word);
                    }
                }
            }
        }
    }
}
