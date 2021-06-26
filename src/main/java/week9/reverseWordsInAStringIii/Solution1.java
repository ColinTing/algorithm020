package week9.reverseWordsInAStringIii;

/**
 * @program: algorithm020
 * @description: 557. 反转字符串中的单词 III 解法二
 * {@link: <a href="https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/">}
 * @author: Colin Ting
 * @create: 2021-06-01 11:37
 **/
public class Solution1 {

    public String reverseWords(String s) {
        if (s.isEmpty()) {
            return null;
        }
        int n = s.length();
        char[] a = s.toCharArray();
        int i = 0, j = 0;
        while (i < n) {
            //锁定单词的开头，只要i没有到n，就会循环一次又跳到下一个的开头
            //因为那时i < j
            while (i < j || (i < n) && a[i] == ' ') {
                i++;
            }

            //挪到单词的末尾
            while (j < i || (j < n) && a[j] != ' ') {
                j++;
            }

            reverse(a, i, j - 1);
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
