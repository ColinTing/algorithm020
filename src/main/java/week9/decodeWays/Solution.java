package week9.decodeWays;

/**
 * @program: algorithm020
 * @description: 91. 解码方法
 * {@link: <a href="https://leetcode-cn.com/problems/decode-ways/">}
 * @author: Colin Ting
 * @create: 2021-06-01 15:13
 **/
public class Solution {

    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = s.charAt(i - 1) == '0' ? 0 : dp[i-1];
            if (i > 1 && (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2' && s.charAt(i -1) <= '6'))) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

}
