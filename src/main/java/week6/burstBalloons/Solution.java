package week6.burstBalloons;

/**
 * @program: algorithm020
 * @description: 312. 戳气球
 * {@link: <a href="https://leetcode-cn.com/problems/burst-balloons/">}
 * @author: Colin Ting
 * @create: 2021-05-17 23:19
 **/
public class Solution {

    public int maxCoins(int[] nums) {
        int[] newNums = new int[nums.length + 2];
        int n = 1;
        for (int x : nums) {
            newNums[n++] = x;
        }
        newNums[0] = newNums[n++] = 1;
        int[][] dp = new int[n][n];
        for (int gap =2; gap < n; gap++) {
            for (int left = 0; left < n - gap; left++) {
                int right = left + gap;
                for (int i = left + 1; i < right; i++) {
                    dp[left][right] = Math.max(dp[left][right],
                            newNums[left] * newNums[i] * newNums[right] +
                                    dp[left][i] + dp[i][right]);
                }
            }
        }

        return dp[0][n - 1];
    }
}
