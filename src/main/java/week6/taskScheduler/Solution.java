package week6.taskScheduler;

import java.util.Arrays;

/**
 * @program: algorithm020
 * @description: 621. 任务调度器
 * {@link: <a href="https://leetcode-cn.com/problems/task-scheduler/">}
 * @author: Colin Ting
 * @create: 2021-05-17 22:28
 **/
public class Solution {


    public int leastInterval(char[] tasks, int n) {
        int[] cnt = new int[26];
        for (char task : tasks) {
            ++cnt[task - 'A'];
        }
        Arrays.sort(cnt);
        int i = 25;
        int mx = cnt[i];
        int len = tasks.length;
        while (i >= 0 && cnt[i] == mx) {
            i--;
        }
        return Math.max(len, (mx - 1) * (1 + n) + 25 - i);
    }

}
