package week8.validAnagram;

/**
 * @program: algorithm020
 * @description: 242. 有效的字母异位词
 * {@link: <a href="https://leetcode-cn.com/problems/valid-anagram/">}
 * @author: Colin Ting
 * @create: 2021-05-25 23:35
 **/
public class Solution {

    public boolean isAnagram(String s, String t) {

        int[] alphabet = new int[26];

        for (char c : s.toCharArray()) {
            ++alphabet[c - 'a'];
        }

        for (char c : t.toCharArray()) {
            --alphabet[c - 'a'];
        }

        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
