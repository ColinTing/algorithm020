package week7.nQueens;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 51. N 皇后
 * 抄的高票回答
 * 与上一题一样的思路，到临界值后开始回溯
 * 只是与上一题添加值的条件不同
 * 这个题目后面会多写，直至记住
 */
public class Solution {



    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        dfs(board, 0, res);
        return res;
    }

    private void dfs(char[][] board, int colIndex, List<List<String>> res) {
        if (colIndex == board[0].length) {
            res.add(construct(board));
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                dfs(board, colIndex + 1, res);
                board[i][colIndex] = '.';
            }
        }


    }

    private boolean validate(char[][] board, int x, int y) {
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < y; j++) {
                if(board[i][j] == 'Q' && (x + j == y +i || x + y == i + j || x == i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

}
