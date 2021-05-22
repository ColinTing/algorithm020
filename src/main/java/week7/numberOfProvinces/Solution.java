package week7.numberOfProvinces;

/**
 * @program: algorithm020
 * @description: 547. 省份数量
 * {@link: <a href="https://leetcode-cn.com/problems/number-of-provinces/">}
 * @author: Colin Ting
 * @create: 2021-05-22 22:50
 **/
public class Solution {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int res = 0;
        int[] visited = new int[n];
        for (int i = 0; i < n; ++i) {
            if (visited[i] == 1) {
                continue;
            }
            dfs(isConnected, i, visited);
            ++res;
        }
        return res;
    }

    private void dfs(int[][] isConnected, int k, int[] visited) {

        for (int i = 0; i < isConnected.length; ++i) {
            if (isConnected[k][i] == 0 || visited[i] == 1) {
                continue;
            }
            visited[i] = 1;
            dfs(isConnected, i, visited);
        }
    }

}
