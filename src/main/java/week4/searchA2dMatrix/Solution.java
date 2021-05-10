package week4.searchA2dMatrix;

/**
 * @program: algorithm020
 * @description: 74. 搜索二维矩阵
 * {@link: <a href="https://leetcode-cn.com/problems/search-a-2d-matrix/">}
 * @author: Colin Ting
 * @create: 2021-05-10 17:44
 **/
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int tmp = (right > 0) ? right - 1 : right;
        left = 0;
        right = matrix[tmp].length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (matrix[tmp][mid] == target) {
                return true;
            } else if (matrix[tmp][mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

}
