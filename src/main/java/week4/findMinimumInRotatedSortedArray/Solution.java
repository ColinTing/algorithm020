package week4.findMinimumInRotatedSortedArray;

/**
 * @program: algorithm020
 * @description: 153. 寻找旋转排序数组中的最小值
 * {@link: <a href="https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/">}
 * @author: Colin Ting
 * @create: 2021-05-10 17:46
 **/
public class Solution {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[right];
    }

}
