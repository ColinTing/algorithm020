package week7.sudokuSolver;

/**
 * @program: algorithm020
 * @description: 37. 解数独
 * {@link: <a href="https://leetcode-cn.com/problems/sudoku-solver/#/description">}
 * @author: Colin Ting
 * @create: 2021-05-22 23:30
 **/
public class Solution {

    final boolean[][] rowFlag = new boolean[9][9];
    final boolean[][] colFlag = new boolean[9][9];
    final boolean[][] boxFlag = new boolean[9][9];

    public void solveSudoku(char[][] board) {


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int c = board[i][j] - '1';
                rowFlag[i][c] = true;
                colFlag[c][j] = true;
                boxFlag[3 * (i / 3) + j / 3][c] = true;
            }
        }
        dfs(board, 0, 0);
    }

    private boolean dfs(char[][] board, int x, int y) {
        if (x == 9) {
            return true;
        }

        if (y >= 9) {
            return dfs(board, x + 1, 0);
        }

        if (board[x][y] != '.') {
            return dfs(board, x, y + 1);
        }

        for (int c = 0; c < 9; ++c) {

            if (!rowFlag[x][c] && !colFlag[c][y] &&
                    !boxFlag[3 * (x / 3) + y / 3][c]) {
                rowFlag[x][c] = true;
                colFlag[c][y] = true;
                boxFlag[3 * (x / 3) + y / 3][c] = true;
                board[x][y] = (char) (c + '1');
                if (dfs(board, x, y + 1)) {
                    return true;
                }
                board[x][y] = '.';
                boxFlag[3 * (x / 3) + y / 3][c] = false;
                colFlag[c][y] = false;
                rowFlag[x][c] = false;
            }

        }
        return false;
    }

}
