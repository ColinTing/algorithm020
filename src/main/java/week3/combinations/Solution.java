package week3.combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: algorithm020
 * @description: 77. 组合
 * {@link: <a href="https://leetcode-cn.com/problems/combinations/">}
 * @author: Colin Ting
 * @create: 2021-05-05 15:05
 **/
public class Solution {
    /**
     * 代码迭代过程中犯了4个错
     * 1.没有使用for循环
     * 2.k==0时如果直接combs.add(comb)，会出现都是空的数组，必须是combs.add(new ArrayList<>(comb));
     * 3.for循环中需要是i <= n，不能是i < n
     * 4. helper DFS调用时，最后一个参数只能是k-1，不能时k--，不然k == 0，只会经历一次
     *
     * @param n
     * @param k
     * @return
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        helper(combs, comb, 1, n, k);
        return combs;
    }

    private void helper(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if (k == 0) {
            combs.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i <= n; i++) {
            comb.add(i);
            helper(combs, comb, i + 1, n, k-1);
            comb.remove(comb.size() - 1);
        }

    }

}
