package week4.jumpGameIi;

/**
 * @program: algorithm020
 * @description: 45. 跳跃游戏 II
 * {@link: <a href="https://leetcode-cn.com/problems/jump-game-ii/">}
 * @author: Colin Ting
 * @create: 2021-05-07 22:02
 **/
public class Solution {

    public int jump(int[] nums) {
        int curEnd = 0, curFarthest = 0, jumps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, nums[i] + i);
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;
    }

}
