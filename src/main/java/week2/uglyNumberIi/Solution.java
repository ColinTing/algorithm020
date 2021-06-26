package week2.uglyNumberIi;

import java.util.PriorityQueue;

/**
 * @program: algorithm020
 * @description: 264. 丑数 II 解法一：最小堆
 * {@link: <a href="https://leetcode-cn.com/problems/ugly-number-ii/">}
 * @author: Colin Ting
 * @create: 2021-06-02 16:47
 **/
public class Solution {

    public int nthUglyNumber(int n) {
        if (n == 1) {
            return 1;
        }
        PriorityQueue<Long> q = new PriorityQueue<>();
        q.add(1L);

        for (int i = 1; i < n; i++) {
            long t = q.poll();
            while (!q.isEmpty() && q.peek() == t) {
                q.poll();
            }
            q.add(t * 2);
            q.add(t * 3);
            q.add(t * 5);
        }
        return q.peek().intValue();
    }

}
