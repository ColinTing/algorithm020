package week8.powerOfTwo;


/**
 * @program: algorithm020
 * @description: 231. 2的幂
 * {@link: <a href="https://leetcode-cn.com/problems/power-of-two/">}
 * @author: Colin Ting
 * @create: 2021-05-26 00:12
 **/
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
