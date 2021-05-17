package week6.maxSumOfRectangleNoLargerThanK;

import java.util.TreeSet;

/**
 * @program: algorithm020
 * @description: 363. 矩形区域不超过 K 的最大数值和
 * {@link: <a href="https://leetcode-cn.com/problems/max-sum-of-rectangle-no-larger-than-k/">}
 * @author: Colin Ting
 * @create: 2021-05-17 22:49
 **/
public class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = Integer.MIN_VALUE;
        for (int left = 0; left < n; left++) {
            int[] sums = new int[m];
            for (int right = left; right < n; right++) {

                for (int i = 0; i < m; i++) {
                    sums[i] += matrix[i][right];
                }

                TreeSet<Integer> set = new TreeSet<>();

                set.add(0);
                int currSum = 0;
                for (int sum : sums) {
                    currSum += sum;
                    Integer num = set.ceiling(currSum - k);
                    if (num != null) {
                        res = Math.max(res, currSum - num);
                    }
                    set.add(currSum);
                }

            }
        }
        return res;
    }
}
