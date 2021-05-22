package week7.surroundedRegions;

/**
 * @program: algorithm020
 * @description: 130. 被围绕的区域
 * {@link: <a href="https://leetcode-cn.com/problems/surrounded-regions/">}
 * @author: Colin Ting
 * @create: 2021-05-22 23:00
 **/
public class Solution {

    public void solve(char[][] board) {

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if ((i == 0 || i == (m - 1) || j == 0 || j == (n - 1)) &&
                        board[i][j] == 'O') {
                    dfs(board, i, j);
                }
            }
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {

                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }

                if (board[i][j] == '$') {
                    board[i][j] = 'O';
                }
            }
        }

    }

    private void dfs(char[][] board, int x, int y) {

        board[x][y] = '$';

        if (x > 0 && board[x - 1][y] == 'O') {
            dfs(board, x - 1, y);
        }

        if (x < board.length - 1 && board[x + 1][y] == 'O') {
            dfs(board, x + 1, y);
        }

        if (y > 0 && board[x][y - 1] == 'O') {
            dfs(board, x, y - 1);
        }

        if (y < board[x].length - 1 && board[x][y + 1] == 'O') {
            dfs(board, x, y + 1);
        }

    }

}
