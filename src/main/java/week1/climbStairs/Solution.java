package week1.climbStairs;

import java.util.HashMap;

/**
 * @program: algorithm020
 * @description: 70. 爬楼梯
 * {@link: <a href="https://leetcode-cn.com/problems/climbing-stairs/"/> }
 * @author: Colin Ting
 * @create: 2020-11-20 22:54
 **/
public class Solution {

    private HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    public int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if (cache.get(n) == null) {
            Integer result = climbStairs(n - 1) + climbStairs(n - 2);
            cache.put(n, result);

        }

        return cache.get(n);

    }

}
