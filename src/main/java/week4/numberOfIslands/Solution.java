package week4.numberOfIslands;

/**
 * @program: algorithm020
 * @description: 200. 岛屿数量
 * {@link: <a href="https://leetcode-cn.com/problems/number-of-islands/">}
 * @author: Colin Ting
 * @create: 2021-05-06 18:57
 **/
public class Solution {

    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '0' || visited[i][j]) {
                    continue;
                }
                helper(grid, visited, i, j);
                res++;
            }
        }
        return res;
    }

    private void helper(char[][] grid, boolean[][] visited, int x, int y) {

        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length ||
                grid[x][y] == '0' || visited[x][y]) {
            return;
        }
        visited[x][y] = true;
        helper(grid, visited, x - 1, y);
        helper(grid, visited, x + 1, y);
        helper(grid, visited, x, y - 1);
        helper(grid, visited, x, y + 1);
    }

}
