package week8.mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: algorithm020
 * @description: 56. 合并区间
 * {@link: <a href="https://leetcode-cn.com/problems/lru-cache/">}
 * @author: Colin Ting
 * @create: 2021-05-25 23:41
 **/
public class Solution {

    public int[][] merge(int[][] intervals) {
        if (intervals.length < 1 || intervals[0].length < 1) {
            return intervals;
        }

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int[] interval : intervals) {
            int[] tmp = res.get(res.size() - 1);
            if (tmp[1] < interval[0]) {
                res.add(interval);
            } else {
                tmp[1] = Math.max(tmp[1], interval[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

}
