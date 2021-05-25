package week8.relativeSortArray;

/**
 * @program: algorithm020
 * @description: 1122. 数组的相对排序
 * {@link: <a href="https://leetcode-cn.com/problems/relative-sort-array/">}
 * @author: Colin Ting
 * @create: 2021-05-25 23:16
 **/
public class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] cnt = new int[1001];
        for (int n : arr1) {
            ++cnt[n];
        }

        int j = 0;
        for (int n : arr2) {
            while (cnt[n]-- > 0) {
                arr1[j++] = n;
            }
        }

        for (int n = 0; n < cnt.length; n++) {
            while (cnt[n]-- > 0) {
                arr1[j++] = n;
            }
        }

        return arr1;
    }

}
