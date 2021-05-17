package week6.minimumPathSum;

/**
 * @program: algorithm020
 * @description: 64. 最小路径和
 * {@link: <a href="https://leetcode-cn.com/problems/minimum-path-sum/">}
 * @author: Colin Ting
 * @create: 2021-05-17 22:08
 **/
public class Solution {

    public int minPathSum(int[][] grid) {

        //dp公式 dp[i][j] = min(dp[i][j-1], dp[i-1][j]) + g[i][j]
        //边界条件
        // i=0, j=0 dp[0][0] = g[0][0]
        // i=0, dp[0][j] = dp[0][j-1] + g[i][j]
        // j=0, dp[i][0] = dp[i-1][0] + g[i][j]
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];

        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }

}
