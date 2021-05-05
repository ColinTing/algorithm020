package week3.permutations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: algorithm020
 * @description: 46. 全排列
 * {@link: <a href="https://leetcode-cn.com/problems/permutations/">}
 * @author: Colin Ting
 * @create: 2021-05-05 16:56
 **/
public class Solution {

    /**
     * 与 77.组合 类似
     * 不同点在于那道不同的数字顺序只算一种，是一道典型的组合题，而此题是求全排列问题，
     * 还是用递归 DFS 来求解。这里需要用到一个 visited 数组来标记某个数字是否访问过，
     * 然后在 DFS 递归函数从的循环应从头开始，而不是从 start 开始，
     * 这是和 Combinations 不同的地方，其余思路大体相同。
     * 这里再说下 start 吧，其本质是记录当前已经拼出的个数，一旦其达到了 nums 数组的长度，说明此时已经是一个全排列了，
     * 因为再加数字的话，就会超出。还有就是，为啥这里的 start 要从0开始遍历，因为这是求全排列，每个位置都可能放任意一个数字，
     * 这样会有个问题，数字有可能被重复使用，由于全排列是不能重复使用数字的，所以需要用一个 visited 数组来标记某个数字是否使用过.
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permuts = new ArrayList<>();
        List<Integer> permut = new ArrayList<>();
        List<Integer> visited = new ArrayList<>(Collections.nCopies(nums.length, 0));
        helper(nums, 0, permuts, permut, visited);
        return permuts;
    }

    private void helper(int[] nums, int start, List<List<Integer>> perms, List<Integer> perm,  List<Integer> visited) {
        if (start == nums.length) {
            perms.add(new ArrayList<>(perm));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited.get(i) == 1) {
                continue;
            }
            visited.set(i, 1);

            perm.add(nums[i]);
            helper(nums, start + 1, perms, perm, visited);
            perm.remove(perm.size() - 1);
            visited.set(i, 0);
        }

    }

}
