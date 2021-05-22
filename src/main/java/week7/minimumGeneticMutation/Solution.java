package week7.minimumGeneticMutation;

import java.util.*;

/**
 * @program: algorithm020
 * @description: 433. 最小基因变化
 * {@link: <a href="https://leetcode-cn.com/problems/minimum-genetic-mutation/">}
 * @author: Colin Ting
 * @create: 2021-05-22 23:17
 **/
public class Solution {

    public int minMutation(String start, String end, String[] bank) {
        Set<String> wordSet = new LinkedHashSet<>(Arrays.asList(bank));
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        int res = 0;
        String charLib = "ACGT";
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; ++i) {
                String word = queue.remove();
                if (word.equals(end)) {
                    return res;
                }

                for (int j = 0; j < word.length(); ++j) {
                    char[] words = word.toCharArray();
                    for (char c : charLib.toCharArray()) {
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
        return -1;
    }

}
