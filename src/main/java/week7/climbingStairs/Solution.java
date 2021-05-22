package week7.climbingStairs;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: algorithm020
 * @description: 70. 爬楼梯
 * {@link: <a href="https://leetcode-cn.com/problems/climbing-stairs/">}
 * @author: Colin Ting
 * @create: 2021-05-22 21:53
 **/
public class Solution {

    final Map<Integer, Integer> stairs = new HashMap<>();

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        if (stairs.containsKey(n)) {
            return stairs.get(n);
        }

        stairs.putIfAbsent(n, climbStairs(n - 1) + climbStairs(n - 2));
        return stairs.get(n);
    }

}
