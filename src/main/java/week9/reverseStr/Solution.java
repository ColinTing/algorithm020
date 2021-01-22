package week9.reverseStr;

public class Solution {
    /**
     * 541. 反转字符串 II
     */

    public String reverseStr(String s, int k) {
        int n = s.length();
        //反转时分割的轮次
        int times = 1;
        //字符串无法直接操作，先转换成字符数组
        char[] sArr = s.toCharArray();
        //i 当前轮次的起始位置, i不是i++是因为每次走的个数是2k个
        //j 当前轮次的结束位置
        for (int i = 0; i < n; ) {
            int j = Math.min(n, times * 2 * k);
            //i和j之间间隔的字符数
            int gap = j - i;
            if (gap < k) {
                //如果间隔小于k反转所有字符
                // j-1 是因为index下标的原因
                reverse(sArr, i, j - 1);
            } else {
                reverse(sArr, i, i + k - 1);
            }

            i += 2 * k;
            times++;
        }
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
