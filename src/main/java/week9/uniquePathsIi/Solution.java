package week9.uniquePathsIi;

/**
 * @program: algorithm020
 * @description: 63. 不同路径 II
 * {@link: <a href="https://leetcode-cn.com/problems/unique-paths-ii/">}
 * @author: Colin Ting
 * @create: 2021-06-01 15:02
 **/
public class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (m == 0 || n == 0 || obstacleGrid[0][0] == 1) {
            return 0;
        }
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] != 1) {
                dp[i][0] = dp[i - 1][0];
            }
        }

        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j] != 1) {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

}
