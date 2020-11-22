package week1.toSum;

import java.util.HashMap;

/**
 * @program: algorithm020
 * @description: 两数之和
 * {@link:  <a href="https://leetcode-cn.com/problems/two-sum/">}
 * @author: Colin Ting
 * @create: 2020-11-21 20:17
 **/
public class Solution {

    private static HashMap<Integer, Integer> indexCache = new HashMap<>();

    public static int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            int leftNum = target-nums[i];
            if(indexCache.containsKey(leftNum)){
                return new int[]{indexCache.get(leftNum),i};
            }else{
                indexCache.put(nums[i],i);
            }
        }

        throw new IllegalArgumentException("数组中没有找到指定值的两数之和");
    }



}
