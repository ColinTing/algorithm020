package week6.maximalSquare;

/**
 * @program: algorithm020
 * @description: 221. 最大正方形
 * {@link: <a href="https://leetcode-cn.com/problems/maximal-square/">}
 * @author: Colin Ting
 * @create: 2021-05-17 22:23
 **/
public class Solution {

    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j] - '0';
                } else if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]),
                            dp[i - 1][j]) + 1;
                }
                res = Math.max(res, dp[i][j]);
            }
        }
        return res * res;
    }

}
