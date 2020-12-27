package week6.taskScheduler;

import java.util.Arrays;

public class Solution {

    /**
     * 621. 任务调度器
     * 计算公式：ans = （k - 1）* (n + 1) + p （p:剩余任务）
     * k-1个分组，最后一个后面不用间隔，所以分组不带他。组里有n+1个槽，因为需要间隔n，最后加上剩下的p task
     * p task:通过查看与*最高频率A*相同频率的任务，得到有多少个task
     * 因为剩余的任务不需要间隔，所以需要求得与A同等频率没被分组的任务，
     * 如果是小于A，那么就已经被分组了。剩下的多少就是和A相同频率的还没分配的任务
     * @param tasks
     * @param n
     * @return
     */
    public int leastInterval(char[] tasks, int n) {
        int[] c = new int[26];
        for (char t : tasks) {
            c[t - 'A']++;
        }
        Arrays.sort(c);
        int i = 25;
        while (i >= 0 && c[i] == c[25]) i--;

        return Math.max(tasks.length, (c[25]-1) * (n + 1) + 25 - i);
    }

}
