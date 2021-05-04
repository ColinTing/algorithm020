package week2.containerWithMostWater;

/**
 * @program: algorithm020
 * @description: 11.盛最多水的容器
 * {@link: <a href="https://leetcode-cn.com/problems/container-with-most-water/"/> }
 * @author: Colin Ting
 * @create: 2020-11-24 23:18
 **/
public class Solution {
    /**
     * 时间方面战胜67%的用户，如何才能更快
     * 更快的写法在Solution1,加了些判断减少了一些无用功
     * @param height
     * @return
     */
    public int maxArea(int[] height){

        int left = 0, right = height.length-1;
        int maxArea = 0;

        while(left<right){
            maxArea = Math.max(maxArea,
                    Math.min(height[left],height[right])
                            *(right-left));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;

    }
}
