package week9.longestIncreasingSubsequence;

/**
 * @program: algorithm020
 * @description: 300. 最长递增子序列
 * {@link: <a href="https://leetcode-cn.com/problems/longest-increasing-subsequence/">}
 * @author: Colin Ting
 * @create: 2021-06-01 15:08
 **/
public class Solution {

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if (nums[j] > nums[i]) {
                    dp[j] = Math.max(dp[i] + 1, dp[j]);
                }
            }
            res = Math.max(res, dp[j]);
        }
        return res;
    }

}
