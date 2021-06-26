package week9.longestValidParentheses;

/**
 * @program: algorithm020
 * @description: 32. 最长有效括号
 * {@link: <a href="https://leetcode-cn.com/problems/longest-valid-parentheses/">}
 * @author: Colin Ting
 * @create: 2021-06-01 15:28
 **/
public class Solution {

    public int longestValidParentheses(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int n = s.length();
        int j;
        int[] dp = new int[n];
        int res = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                j = i + dp[i + 1] + 1;
                if (j < n && s.charAt(j) == ')') {
                    dp[i] = dp[i + 1] + 2;
                    if (j + 1 < n) {
                        dp[i] += dp[j + 1];
                    }
                }
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }

}
