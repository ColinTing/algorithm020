package week4.minesweeper;

/**
 * @program: algorithm020
 * @description: 529. 扫雷游戏
 * {@link: <a href="https://leetcode-cn.com/problems/minesweeper/description/">}
 * @author: Colin Ting
 * @create: 2021-05-06 22:34
 **/
public class Solution {

    public char[][] updateBoard(char[][] board, int[] click) {
        if (board.length == 0 || board[0].length == 0) {
            return new char[0][0];
        }
        int m = board.length;
        int n = board[0].length;
        int row = click[0];
        int col = click[1];
        int cnt = 0;

        if (board[row][col] == 'M') {
            board[row][col] = 'X';
        } else {
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    int x = row + i;
                    int y = col + j;
                    if (x < 0 || x >= m || y < 0 || y >= n) {
                        continue;
                    }
                    if (board[x][y] == 'M') {
                        cnt++;
                    }

                }
            }

            if (cnt > 0) {
                board[row][col] = (char) (cnt + '0');
            } else {
                board[row][col] = 'B';
                for (int i = -1; i < 2; i++) {
                    for (int j = -1; j < 2; j++) {
                        int x = row + i;
                        int y = col + j;
                        if (x < 0 || x >= m || y < 0 || y >= n) {
                            continue;
                        }
                        if (board[x][y] == 'E') {
                            int[] nextPox = new int[]{x, y};
                            updateBoard(board, nextPox);
                        }
                    }
                }
            }
        }
        return board;
    }

}
