package week4.WordLadderIi;

import java.util.*;

/**
 * @program: algorithm020
 * @description: 126. 单词接龙 II
 * {@link: <a href="https://leetcode-cn.com/problems/word-ladder-ii/description/">}
 * @author: Colin Ting
 * @create: 2021-05-10 17:32
 **/
public class Solution {

    /**
     * 书写时犯的错误：
     * 在发现新路径时要新建一条路径，而我却没有新建
     * List<String> nextPath = t 应该替换成（->）List<String> nextPath = new LinkedList<>(t);
     *
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return
     */

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        Set<String> wordSet = new LinkedHashSet<>(wordList);
        List<String> curPath = new LinkedList<>();
        curPath.add(beginWord);
        Queue<List<String>> paths = new LinkedList<>();
        paths.add(curPath);
        int level = 1, minLevel = Integer.MAX_VALUE;
        Set<String> words = new LinkedHashSet<>();
        while (!paths.isEmpty()) {
            List<String> t = paths.remove();
            if (t.size() > level) {
                for (String w : words) {
                    wordSet.remove(w);
                }
                words.clear();
                level = t.size();
                if (level > minLevel) {
                    break;
                }
            }

            String last = t.get(t.size() - 1);

            for (int i = 0; i < last.length(); i++) {
                char[] lastChars = last.toCharArray();
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    lastChars[i] = ch;
                    String newLast = new String(lastChars);
                    if (wordSet.contains(newLast)) {
                        words.add(newLast);
                        List<String> nextPath = new LinkedList<>(t);
                        nextPath.add(newLast);
                        if (newLast.equals(endWord)) {
                            res.add(nextPath);
                            minLevel = level;
                        } else {
                            paths.add(nextPath);
                        }
                    }
                }
            }
        }
        return res;
    }

}
