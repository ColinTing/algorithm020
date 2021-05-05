package week3.permutationsIi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: algorithm020
 * @description: 47. 全排列 II
 * {@link: <a href="https://leetcode-cn.com/problems/permutations-ii/">}
 * @author: Colin Ting
 * @create: 2021-05-05 18:54
 **/
public class Solution {

    /**
     * 迭代代码过程中出现的3个错
     *
     * 1.if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == 0) {...} 判断中漏了i>0,导致i-1越界，这样也保证了不重复数组条件下，i-1一定是等于1的
     *
     * 2.if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == 0) {...} 判断中把nums[i] == nums[i-1]写成了visited[i] == visited[i-1]
     *
     * 3.没有先进行数组的排序
     * Arrays.sort(nums);
     *
     * @param nums
     * @return
     */

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permuts = new ArrayList<>();
        List<Integer> permut = new ArrayList<>();
        int[] visited = new int[nums.length];
        Arrays.sort(nums);
        helper(nums, 0, permuts, permut, visited);
        return permuts;
    }

    private void helper(int[] nums, int start, List<List<Integer>> perms, List<Integer> perm, int[] visited) {
        if (start == nums.length) {
            perms.add(new ArrayList<>(perm));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) {
                continue;
            }

            if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == 0) {
                continue;
            }

            visited[i] = 1;

            perm.add(nums[i]);
            helper(nums, start + 1, perms, perm, visited);
            perm.remove(perm.size() - 1);
            visited[i] = 0;
        }
    }

}
