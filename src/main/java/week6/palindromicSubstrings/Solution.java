package week6.palindromicSubstrings;

/**
 * @program: algorithm020
 * @description: 647. 回文子串
 * {@link: <a href="https://leetcode-cn.com/problems/palindromic-substrings/">}
 * @author: Colin Ting
 * @create: 2021-05-17 22:34
 **/
public class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int res = 0;
        boolean[][] dp = new boolean[n][n];
        for  (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 2 || dp[i+1][j-1]) {
                        dp[i][j] = true;
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
