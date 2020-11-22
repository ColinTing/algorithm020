package week1.merge;

/**
 * @program: algorithm020
 * @description: 88.合并两个有序数组
 * {@link:  <a href="https://leetcode-cn.com/problems/merge-sorted-array/">}
 * @author: Colin Ting
 * @create: 2020-11-19 21:15
 **/
public class Solution {

    /**
     * 三指针法
     */
    public void merge(int[] nums1, int m, int[] nums2, int n){

        int j=1;
        int k=1;

        for(int i=nums1.length-1; i>=0; i--){

            if(m-j>=0 && n-k>=0){
                if(nums1[m-j]>=nums2[n-k]){
                    nums1[i]=nums1[m-j];
                    j++;
                }else{
                    nums1[i] = nums2[n-k];
                    k++;
                }
            }else if(m-j<0){
                nums1[i] = nums2[n-k];
                k++;
            }

        }

    }

}
