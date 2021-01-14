package week8.powerOfTwo;

/**
 * 解题公式：
 * 2的幂的特性：
 * n的最高位是1外，其余位都是0
 * n-1的最高位是0外，其余位都是1
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
