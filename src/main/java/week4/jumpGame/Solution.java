package week4.jumpGame;

/**
 * @program: algorithm020
 * @description: 55. 跳跃游戏
 * {@link: <a href="https://leetcode-cn.com/problems/jump-game/">}
 * @author: Colin Ting
 * @create: 2021-05-07 21:59
 **/
public class Solution {

    public boolean canJump(int[] nums) {

        int reach = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > reach || reach >= n - 1) {
                break;
            }
            reach = Math.max(reach, i + nums[i]);
        }

        return reach >= n - 1;

    }

}
