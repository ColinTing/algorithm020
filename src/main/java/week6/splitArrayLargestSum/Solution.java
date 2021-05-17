package week6.splitArrayLargestSum;

/**
 * @program: algorithm020
 * @description: 410. 分割数组的最大值
 * {@link: <a href="https://leetcode-cn.com/problems/split-array-largest-sum/">}
 * @author: Colin Ting
 * @create: 2021-05-17 22:59
 **/
public class Solution {

    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        int[][] dp = new int[m+1][n];
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        int[] sums = new int[n];
        sums[0] = nums[0];
        for (int i = 1; i < n; ++i) {
            sums[i] = sums[i - 1] + nums[i];
        }
        for (int i = 0; i < n; ++i) {
            dp[1][i] = sums[i];
        }
        for (int i = 2; i <= m; ++i) {
            for (int j = 1; j < n; ++j) {
                for (int k = 0; k < j; ++k) {
                    int val = Math.max(dp[i - 1][k], sums[j] - sums[k]);
                    dp[i][j] =  Math.min(dp[i][j], val);
                }
            }
        }

        return dp[m][n - 1];
    }

}
