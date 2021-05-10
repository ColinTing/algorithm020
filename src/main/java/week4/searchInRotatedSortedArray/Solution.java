package week4.searchInRotatedSortedArray;

/**
 * @program: algorithm020
 * @description: 33. 搜索旋转排序数组
 * {@link: <a href="https://leetcode-cn.com/problems/search-in-rotated-sorted-array/">}
 * @author: Colin Ting
 * @create: 2021-05-10 17:42
 **/
public class Solution {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= nums[right]) {
                if (target >= nums[mid+1] && target <= nums[right]) {
                    left = mid +1;
                } else {
                    right = mid;
                }
            }  else {
                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
        }
        if (nums[right] == target) {
            return right;
        } else {
            return -1;
        }
    }

}
