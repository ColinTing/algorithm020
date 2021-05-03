package week1.removeDuplicates;

import java.util.Arrays;

/**
 * @program: algorithm020
 * @description: 26.删除排序数组中的重复项
 * {@link:  <a href=" https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/">}
 * @author: Colin Ting
 * @create: 2020-11-16 23:11
 **/
public class Solution1 {

    /**
     * 计数排序法,计算重复的个数
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {

        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }

        }

        return nums.length - count;

    }

    public static void main(String[] args) {

        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));

        System.out.println(Arrays.toString(nums));
    }
}
