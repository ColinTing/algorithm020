package week1.rotate;

/**
 * @program: algorithm020
 * @description: 189. 旋转数组
 * {@link:  <a href="https://leetcode-cn.com/problems/rotate-array/">}
 * @author: Colin Ting
 * @create: 2020-11-17 22:03
 **/
public class Solution {

    /**
     * 三次旋转法
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {

        k%= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

    }

    public void reverse(int[] nums, int start, int end){

        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
