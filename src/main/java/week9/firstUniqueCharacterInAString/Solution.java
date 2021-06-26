package week9.firstUniqueCharacterInAString;

/**
 * @program: algorithm020
 * @description: 387. 字符串中的第一个唯一字符
 * {@link: <a href="https://leetcode-cn.com/problems/first-unique-character-in-a-string/">}
 * @author: Colin Ting
 * @create: 2021-06-01 11:05
 **/
public class Solution {

    public int firstUniqChar(String s) {
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i) - 'a';
            if (alphabet[k] == 1) {
                return i;
            }
        }
        return -1;
    }

}
