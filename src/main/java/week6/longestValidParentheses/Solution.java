package week6.longestValidParentheses;

/**
 * @program: algorithm020
 * @description: 32. 最长有效括号
 * {@link: <a href="https://leetcode-cn.com/problems/longest-valid-parentheses/">}
 * @author: Colin Ting
 * @create: 2021-05-17 22:40
 **/
public class Solution {

    public int longestValidParentheses(String s) {

        int n = s.length();
        int res = 0;
        int[] dp = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                int j = i + dp[i + 1] + 1;
                if (j < n && s.charAt(j) == ')') {
                    dp[i] = dp[i+1] + 2;

                    if (j + 1 < n) {
                        dp[i] += dp[j+1];
                    }
                    res = Math.max(dp[i], res);
                }
            }
        }


        return res;
    }

}
