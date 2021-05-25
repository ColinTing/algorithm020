package week8.nQueensIi;

/**
 * @program: algorithm020
 * @description: 52. N皇后 II
 * {@link: <a href="https://leetcode-cn.com/problems/n-queens-ii/description/">}
 * @author: Colin Ting
 * @create: 2021-05-25 23:56
 **/
public class Solution {

    public int totalNQueens(int n) {
        int res = 0;
        boolean[][] queens = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                queens[i][j] = false;
            }
        }
        res = dfs(0, queens, res);
        return res;
    }

    private int dfs(int row, boolean[][] queens, int res) {
        int n = queens.length;
        if (row == n) {
            res++;
            return res;
        }
        for (int col = 0; col < n; ++col) {
            if (isValid(queens, row, col)) {
                queens[row][col] = true;
                res = dfs(row + 1, queens, res);
                queens[row][col] = false;
            }
        }
        return res;
    }

    private boolean isValid(boolean[][] queens, int row, int col) {

        //检查当前列是否存在皇后
        for (int i = 0; i < row; ++i) {
            if (queens[i][col]) {
                return false;
            }
        }

        //检查45度角
        for (int i = row - 1, j = col + 1; i >= 0 && j < queens.length; i--, j++) {
            if (queens[i][j]) {
                return false;
            }
        }

        //检查135度角
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (queens[i][j]) {
                return false;
            }
        }
        return true;
    }
}
