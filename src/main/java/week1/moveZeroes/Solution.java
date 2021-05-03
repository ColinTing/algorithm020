package week1.moveZeroes;

/**
 * @program: algorithm020
 * @description: 283.移动零
 * {@link:  <a href="https://leetcode-cn.com/problems/move-zeroes/">}
 * @author: Colin Ting
 * @create: 2020-11-21 21:22
 **/
public class Solution {

    /**
     * 双指针法
     */
    public void moveZeros(int[] nums) {

        if (nums == null || nums.length == 0) {
            return;
        }

        int insertPos = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

    }

}
