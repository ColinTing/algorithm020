package week7.validSudoku;

/**
 * @program: algorithm020
 * @description: 36. 有效的数独
 * {@link: <a href="https://leetcode-cn.com/problems/valid-sudoku/description/">}
 * @author: Colin Ting
 * @create: 2021-05-22 23:04
 **/
public class Solution {

    public boolean isValidSudoku(char[][] board) {

        boolean[][] rowFlag = new boolean[9][9];
        boolean[][] colFlag = new boolean[9][9];
        boolean[][] boxFlag = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int c = board[i][j] - '1';
                if (rowFlag[i][c] || colFlag[c][j]
                        || boxFlag[3 * (i / 3) + j / 3][c]) {
                    return false;
                }
                rowFlag[i][c] = true;
                colFlag[c][j] = true;
                boxFlag[3 * (i / 3) + j / 3][c] = true;
            }
        }
        return true;
    }

}
