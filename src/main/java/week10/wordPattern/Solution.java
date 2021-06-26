package week10.wordPattern;

import java.util.HashMap;

/**
 * @program: algorithm020
 * @description: 290. 单词规律
 * {@link: <a href="https://leetcode-cn.com/problems/word-pattern/">}
 * @author: Colin Ting
 * @create: 2021-06-06 17:11
 **/
public class Solution {

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<String, Integer> m2 = new HashMap<>();
        String[] sArr = s.split(" ");
        int i = 0;
        for (; i < pattern.length(); i++) {
            if (i == sArr.length ||
                    !m1.getOrDefault(pattern.charAt(i), 0).equals(m2.getOrDefault(sArr[i], 0))) {
                return false;
            }
            m1.put(pattern.charAt(i), i+1);
            m2.put(sArr[i], i+1);
        }

        return i == sArr.length;
    }

}
