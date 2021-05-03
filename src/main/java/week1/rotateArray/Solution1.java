package week1.rotateArray;

/**
 * @program: algorithm020
 * @description: 189. 旋转数组
 * {@link: <a href="https://leetcode-cn.com/problems/rotate-array/">}
 * @author: Colin Ting
 * @create: 2021-05-02 15:27
 **/
public class Solution1 {

    /**
     * 三次旋转法 第二种写法
     *
     * 第一次前N-K个数旋转 
     *
     * 第二次后K个数旋转
     *
     * 第三次全体旋转
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);

    }

    private void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;

        }

    }

}
