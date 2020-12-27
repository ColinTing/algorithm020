package week6.maximalSquare;


public class Solution {

    /**
     *
     * 221. 最大正方形
     * a初始位置在正方形左上角，b初始位置在正方形的右下角
     * 通过a先赋值b，再通过a判断b正方形是否满足可扩展条件
     *
     * @param matrix
     * @return
     */
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int m = matrix.length, n = matrix[0].length, result = 0;
        int[][] b = new int[m+1][n+1];
        for (int x = 1; x <= m; x++) {
            for (int y = 1; y <= n; y++) {
                if (matrix[x-1][y-1] == '1') {
                    b[x][y] = Math.min(Math.min(b[x][y-1], b[x-1][y-1]), b[x-1][y])+1;
                    result = Math.max(b[x][y], result);
                }
            }
        }
        return result*result;
    }

}
