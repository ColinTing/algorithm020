package week9.validPalindromeIi;

/**
 * @program: algorithm020
 * @description: 680. 验证回文字符串 Ⅱ
 * {@link: <a href="https://leetcode-cn.com/problems/valid-palindrome-ii/">}
 * @author: Colin Ting
 * @create: 2021-06-01 12:56
 **/
public class Solution {
    public boolean validPalindrome(String s) {

        int left = -1;
        int right = s.length();

        while (++left < --right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
