package week2.containerWithMostWater;

/**
 * @program: algorithm020
 * @description: 盛最多水的容器，时间更快的写法，加了一些判断，减少了一些无用功
 * （加了些判断相当于多做了些有用功）
 * @author: Colin Ting
 * @create: 2020-11-24 23:34
 **/
public class Solution1 {



    public int maxArea(int[] height) {

        if (height.length == 0 || height == null) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int maxArea = 0;
        int high = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                high = height[left];
                maxArea = Math.max(maxArea, (right - left) * high);
                while (left < right && height[left] <= high) {
                    left++;
                }
            } else {
                high = height[right];
                maxArea = Math.max(maxArea, (right - left) * high);
                while (left < right && height[right] <= high) {
                    right--;
                }
            }
        }

        return maxArea;


    }

}
