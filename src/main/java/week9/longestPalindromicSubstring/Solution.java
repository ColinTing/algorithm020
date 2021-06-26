package week9.longestPalindromicSubstring;

/**
 * @program: algorithm020
 * @description: 5. 最长回文子串
 * {@link: <a href="https://leetcode-cn.com/problems/longest-palindromic-substring/">}
 * @author: Colin Ting
 * @create: 2021-06-01 15:26
 **/
public class Solution {

    public String longestPalindrome(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        int tmp = maxLength;
                        maxLength = Math.max(maxLength, j - i);
                        if (maxLength > tmp) {
                            left = i;
                            right = j;
                        }
                    }
                }
            }
        }
        return s.substring(left, right + 1);
    }

}
