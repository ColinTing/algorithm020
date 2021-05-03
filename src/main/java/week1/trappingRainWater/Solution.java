package week1.trappingRainWater;

/**
 * @program: algorithm020
 * @description: 42.接雨水
 * {@link: <a href="https://leetcode-cn.com/problems/trapping-rain-water/">}
 * @author: Colin Ting
 * @create: 2021-05-03 14:44
 **/
public class Solution {
    /**
     * 设定两个变量maxLeft（左边最大桶高度），maxRight（右边最大桶高度）
     * 在左侧桶高度更小时，只要当前桶高度比左边最高桶高度小，就表示可以储水
     * 在右侧桶高度更小时，只要当前桶高度比右边最高桶高度小，就表示可以储水
     *
     * @param height
     * @return
     */

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    res += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    res += maxRight - height[right];
                }
                right--;
            }
        }
        return res;
    }
}
