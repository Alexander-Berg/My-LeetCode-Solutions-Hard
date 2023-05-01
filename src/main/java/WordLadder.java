import java.util.*;

public class WordLadder {
    class Pair{
        String first;
        int steps;
        Pair(String _first,int _steps){
            this.first = _first;
            this.steps = _steps;
        }
    }
    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(beginWord,1));
            Set<String> set = new HashSet<>();
            // for(String i=0;i<wordList.size();i++){
            //     set.add(i);
            // }
            set.addAll(wordList);
            set.remove(beginWord);
            while(!q.isEmpty()){
                String word = q.peek().first;
                int step = q.peek().steps;
                q.remove();
                if(word.equals(endWord)==true) return step;
                for(int i=0;i<word.length();i++){
                    for(char ch='a';ch<='z';ch++){
                        char[] replacedcharword = word.toCharArray();
                        replacedcharword[i] = ch;
                        String replacedWord = new String(replacedcharword);
                        if(set.contains(replacedWord)==true){
                            set.remove(replacedWord);
                            q.add(new Pair(replacedWord,step+1));
                        }
                    }
                }
            }
            return 0;
        }
    }
}
