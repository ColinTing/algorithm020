package week9.reverseWordsInAString;

/**
 * @program: algorithm020
 * @description: 151. 翻转字符串里的单词
 * {@link: <a href="https://leetcode-cn.com/problems/reverse-words-in-a-string/">}
 * @author: Colin Ting
 * @create: 2021-06-01 11:27
 **/
public class Solution {
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }
        char[] a = s.toCharArray();
        int n = a.length;
        //反转整个字符串
        reverse(a, 0, n - 1);
        //反转每个单词
        reverseWords(a, n);
        //删除多余空格
        return cleanSpaces(a, n);
    }

    private void reverse(char[] a, int i, int j) {

        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }

    }

    private void reverseWords(char[] a, int n) {

        int i = 0, j = 0;

        while (i < n) {
            //跳过空格
            while (i < j || (i < n && a[i] == ' ')) {
                i++;
            }
            //挪到非空格的末尾
            while (j < i || (j < n && a[j] != ' ')) {
                j++;
            }
            reverse(a, i, j - 1);
        }

    }

    private String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;
        //循环删除单个单词两边的多余空格（关键的while循环）
        while (j < n) {

            //跳过空格
            while (j < n && a[j] == ' ') {
                j++;
            }
            //移动非空格字符
            while (j < n && a[j] != ' ') {
                a[i++] = a[j++];
            }
            //再一次跳过空格
            while (j < n && a[j] == ' ') {
                j++;
            }

            if (j < n) {
                a[i++] = ' ';
            }
        }
        return String.valueOf(a).substring(0, i);
    }
}
