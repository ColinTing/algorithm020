package week9.reverseOnlyLetters;

/**
 * @program: algorithm020
 * @description: 917. 仅仅反转字母
 * {@link: <a href="https://leetcode-cn.com/problems/reverse-only-letters/">}
 * @author: Colin Ting
 * @create: 2021-06-01 11:40
 **/
public class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        reverse(a, 0, n - 1);
        return new String(a);
    }

    private void reverse(char[] a, int i, int j) {
        while (i < j) {
            while (j >= 0 && !Character.isLetter(a[j])) {
                j--;
            }
            while (i <= a.length - 1 && !Character.isLetter(a[i])) {
                i++;
            }
            if (i < j) {
                char t = a[i];
                a[i++] = a[j];
                a[j--] = t;
            }

        }

    }


}
