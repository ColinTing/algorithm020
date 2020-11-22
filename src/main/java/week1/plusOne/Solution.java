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
        int i = digits.length - 1;
        for (; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;

            }

        }

        if (digits[0] == 0 && i < 0) {

            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            /**
             * 没必要每个数都赋值，因为如果只是加一导致首位变成了0，那其实首位之后的值都会是0
             */
//            for (int j = 1; j < newDigits.length; j++) {
//                newDigits[j] = digits[j - 1];
//            }

            digits = newDigits;
        }

        return digits;
    }

}
