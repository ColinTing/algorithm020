package week9.reverseWords;

public class Solution {

    /**
     * 557. 反转字符串中的单词 III
     */

    public String reverseWords(String s) {
        char[] sArr = s.toCharArray();
        int start = 0, end = 0;
        for (; end < sArr.length; end++) {
            if (sArr[end] == ' ') {
                reverse(sArr, start, end - 1);
                start = end + 1;
            }
        }
        //最后一个单词没有翻转，因为最后没有空格
        reverse(sArr, start, end - 1);
        return String.valueOf(sArr);
    }

    private void reverse(char[] sArr, int start, int end) {
        while (start < end) {
            char temp = sArr[start];
            sArr[start] = sArr[end];
            sArr[end] = temp;
            start++;
            end--;
        }
    }

}
