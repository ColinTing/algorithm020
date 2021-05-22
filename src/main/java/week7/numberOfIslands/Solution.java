package week7.numberOfIslands;

/**
 * @program: algorithm020
 * @description: 200. 岛屿数量
 * {@link: <a href="https://leetcode-cn.com/problems/number-of-islands/">}
 * @author: Colin Ting
 * @create: 2021-05-22 22:55
 **/
public class Solution {

    public int numIslands(char[][] grid) {
        if (grid.length < 1) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (visited[i][j] || grid[i][j] == '0') {
                    continue;
                }
                dfs(grid, visited, i, j);
                ++res;
            }
        }
        return res;
    }

    private void dfs(char[][] grid, boolean[][] visited, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length ||
                visited[x][y] || grid[x][y] == '0') {
            return;
        }
        visited[x][y] = true;

        dfs(grid, visited, x - 1, y);
        dfs(grid, visited, x + 1, y);
        dfs(grid, visited, x, y - 1);
        dfs(grid, visited, x, y + 1);

    }

}
