package week1.moveZeroes;

import java.util.Arrays;

/**
 * @program: algorithm020
 * @description: 移动零
 * {@link:  <a href="https://leetcode-cn.com/problems/move-zeroes/">}
 * @author: Colin Ting
 * @create: 2020-11-21 21:22
 **/
public class Solution {

    /**
     * 双指针法
     */
    public static int[] moveZeros(int[] nums) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;

            }
        }


        int zeroNum = nums.length - i;

        while (zeroNum != 0) {
            nums[nums.length - zeroNum] = 0;
            zeroNum--;
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(new int[]{0})));
    }

}
