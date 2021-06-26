package week10.validParentheses;

/**
 * @program: algorithm020
 * @description: 20. 有效的括号 解法一：动态规划
 * {@link: <a href="https://leetcode-cn.com/problems/valid-parentheses/">}
 * @author: Colin Ting
 * @create: 2021-06-03 15:51
 **/
public class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n < 2) {
            return false;
        }
        int[] dp = new int[n];
        boolean res;
        int curLength = 0;
        for (int i = n - 2; i >= 0; i--) {
            int a = validFunc(dp, s, i, '(', ')');
            int b = validFunc(dp, s, i, '{', '}');
            int c = validFunc(dp, s, i, '[', ']');
            curLength = Math.max(a, Math.max(b, c));
        }
        res = curLength == n;
        return res;
    }

    private int validFunc(int[] dp, String s, int i, char lc, char rc) {
        if (s.charAt(i) == lc) {
            int j = i + dp[i + 1] + 1;
            if (j < s.length() && s.charAt(j) == rc) {
                dp[i] = dp[i + 1] + 2;
                if (j + 1 < s.length()) {
                    dp[i] += dp[j + 1];
                }
            }
        }
        return dp[i];
    }
}
