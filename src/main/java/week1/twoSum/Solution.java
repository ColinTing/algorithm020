package week1.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: algorithm020
 * @description: 1.两数之和
 * {@link:  <a href="https://leetcode-cn.com/problems/two-sum/">}
 * @author: Colin Ting
 * @create: 2020-11-21 20:17
 **/
public class Solution {


    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>(16);

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }


}
