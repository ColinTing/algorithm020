package week7.wordLadder;

import java.util.*;

/**
 * @program: algorithm020
 * @description: 127. 单词接龙
 * {@link: <a href="https://leetcode-cn.com/problems/word-ladder/">}
 * @author: Colin Ting
 * @create: 2021-05-22 23:13
 **/
public class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new LinkedHashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int res = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; ++i) {
                String word = queue.remove();
                if (word.equals(endWord)) {
                    return res + 1;
                }

                for (int j = 0; j < word.length(); ++j) {
                    char[] words = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; ++c) {
                        words[j] = c;
                        String newWord = new String(words);
                        if (!newWord.equals(word) && wordSet.contains(newWord)) {
                            wordSet.remove(newWord);
                            queue.add(newWord);
                        }
                    }
                }
            }
            res++;
        }
        return 0;
    }

}
