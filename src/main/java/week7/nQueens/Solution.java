package week7.nQueens;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: algorithm020
 * @description: 51. N 皇后
 * {@link: <a href="https://leetcode-cn.com/problems/n-queens/">}
 * @author: Colin Ting
 * @create: 2021-05-22 23:27
 **/
public class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] queens = new char[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                queens[i][j] = '.';
            }
        }
        dfs(0, queens, res);
        return res;

    }

    private void dfs(int row, char[][] queens, List<List<String>> res) {
        int n = queens.length;
        if (row == n) {
            res.add(construct(queens));
            return;
        }
        for (int col = 0; col < n; ++col) {
            if (isValid(queens, row, col)) {
                queens[row][col] = 'Q';
                dfs(row + 1, queens, res);
                queens[row][col] = '.';
            }
        }
    }

    private boolean isValid(char[][] queens, int row, int col) {

        //检查当前列是否存在皇后
        for (int i = 0; i < row; ++i) {
            if (queens[i][col] == 'Q') {
                return false;
            }
        }

        //检查45度角
        for (int i = row - 1, j = col + 1; i >= 0 && j < queens.length; i--, j++) {
            if (queens[i][j] == 'Q') {
                return false;
            }
        }

        //检查135度角
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (queens[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> construct(char[][] queens) {
        List<String> queen = new ArrayList<>();
        for (int i = 0; i < queens.length; i++) {
            queen.add(new String(queens[i]));
        }
        return queen;
    }

}
