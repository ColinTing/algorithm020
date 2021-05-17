package week6.editDistance;

/**
 * @program: algorithm020
 * @description: 72. 编辑距离
 * {@link: <a href="https://leetcode-cn.com/problems/edit-distance/">}
 * @author: Colin Ting
 * @create: 2021-05-17 22:44
 **/
public class Solution {

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp =new int[m+1][n+1];
        dp[0][0] = 0;
        for (int i = m; i > 0; i--) {
            dp[i][0] = i;
        }

        for (int j = n; j > 0; j--) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]),
                            dp[i-1][j-1]) + 1;
                }
            }
        }
        return dp[m][n];
    }

}
