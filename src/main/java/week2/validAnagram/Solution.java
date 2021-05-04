package week2.validAnagram;

/**
 * @program: algorithm020
 * @description: 242.有效的字母异位词
 * {@link: <a href="https://leetcode-cn.com/problems/valid-anagram/">}
 * @author: Colin Ting
 * @create: 2020-11-23 22:53
 **/
public class Solution {

    /**
     * 映射法，速度不及排序法
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {

        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }

        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;

    }

}
