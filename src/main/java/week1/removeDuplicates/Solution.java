package week1.removeDuplicates;

import java.util.Arrays;

/**
 * @program: algorithm020
 * @description: 删除排序数组中的重复项
 * {@link:  <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/">}
 * @author: Colin Ting
 * @create: 2020-11-16 22:41
 **/
public class Solution {

    /**
     * 双指针解法
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {


        int i=0;

        for(int j=1; j<nums.length; j++){

            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }

        }

        return i+1;

    }

    public static void main(String[] args) {

//        int[] nums = new int[]{1,1,2};

        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));

        System.out.println(Arrays.toString(nums));

    }

}
