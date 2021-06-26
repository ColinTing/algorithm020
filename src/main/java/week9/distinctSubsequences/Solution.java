package week9.distinctSubsequences;

/**
 * @program: algorithm020
 * @description: 115. 不同的子序列
 * {@link: <a href="https://leetcode-cn.com/problems/distinct-subsequences/">}
 * @author: Colin Ting
 * @create: 2021-06-01 15:32
 **/
public class Solution {

    public int numDistinct(String s, String t) {
        int m = t.length();
        int n = s.length();
        int[][]dp = new int[m+1][n+1];
        dp[0][0] = 1;
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (t.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i][j - 1] + dp[i-1][j-1];
                } else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }

}
