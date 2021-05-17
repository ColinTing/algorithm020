package week6.minimumWindowSubstring;

/**
 * @program: algorithm020
 * @description: 76. 最小覆盖子串
 * {@link: <a href="https://leetcode-cn.com/problems/minimum-window-substring/">}
 * @author: Colin Ting
 * @create: 2021-05-17 23:15
 **/
public class Solution {

    public String minWindow(String s, String t) {
        int[] letterCnt = new int[128];
        int cnt = 0;
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        String res = "";
        for (char c : t.toCharArray()) {
            letterCnt[c]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (--letterCnt[s.charAt(i)] >= 0) {
                cnt++;
            }
            while (cnt == t.length()) {
                if (minLen > i - left + 1) {
                    minLen = i - left + 1;
                    res = s.substring(left, left+minLen);
                }

                if (++letterCnt[s.charAt(left)] > 0) {
                    cnt--;
                }
                left++;
            }
        }
        return res;
    }

}
