package week9.reverseStringIi;

/**
 * @program: algorithm020
 * @description: 541. 反转字符串 II
 * {@link: <a href="https://leetcode-cn.com/problems/reverse-string-ii/">}
 * @author: Colin Ting
 * @create: 2021-06-01 11:19
 **/
public class Solution {

    public String reverseStr(String s, int k) {
        int n = s.length();
        int i = 0;
        char[] a = s.toCharArray();
        while (i < n) {
            int j = Math.min(i + k - 1, n - 1);
            reverse(a, i, j);
            i += 2 * k;
        }
        return String.valueOf(a);
    }

    private void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }

}
