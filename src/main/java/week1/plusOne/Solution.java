package week1.plusOne;

/**
 * @program: algorithm020
 * @description: 66.加一
 * {@link:  <a href="https://leetcode-cn.com/problems/plus-one">}
 * @author: Colin Ting
 * @create: 2020-11-21 16:21
 **/
public class Solution {


    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i>=0; i--) {
            if (digits[i]< 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigits = new int[n+1];
        newDigits[0] = 1;
        return newDigits;
    }

}
