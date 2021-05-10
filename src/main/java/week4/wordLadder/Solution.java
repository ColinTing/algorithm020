package week4.wordLadder;

import java.util.*;

/**
 * @program: algorithm020
 * @description: 127. 单词接龙
 * {@link: <a href="https://leetcode-cn.com/problems/word-ladder/description/">}
 * @author: Colin Ting
 * @create: 2021-05-10 17:29
 **/
public class Solution {

    /**
     * 书写代码时犯了3个错误：
     * 1.if (!newWord.equals(word) && wordSet.contains(newWord)){...}这里不用判断newWord是不是等于endWord,因为这里只是拎出字典中所有匹配的值存入队列中，下一步循环一开始就会判断是不是和endWord匹配
     * 2.wordQueue是存储newWord，而不是存储word
     * 3.n需要拎出来，是因为每次新加入队列的值，都是放在下一次循环中进行比对的
     *
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new LinkedHashSet<>(wordList);
        Queue<String> wordQueue = new LinkedList<>();
        wordQueue.add(beginWord);
        int res = 0;
        while (!wordQueue.isEmpty()) {
            int n = wordQueue.size();
            for (int i = 0; i < n; i++) {
                String word = wordQueue.remove();
                if (word.equals(endWord)) {
                    return res + 1;
                }
                for (int j = 0; j < word.length(); j++) {
                    char[] wordChars = word.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        wordChars[j] = ch;
                        String newWord = new String(wordChars);
                        if (!newWord.equals(word) && wordSet.contains(newWord)) {
                            wordQueue.add(newWord);
                            wordSet.remove(newWord);
                        }
                    }
                }
            }
            res++;
        }
        return 0;
    }

}
