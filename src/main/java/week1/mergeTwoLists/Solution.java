package week1.mergeTwoLists;




/**
 * @program: algorithm020
 * @description: 合并两个有序链表
 * {@link:  <a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/">}
 * @author: Colin Ting
 * @create: 2020-11-18 21:45
 **/
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){

        if(l1==null){
            return l2;
        }

        if(l2==null){
            return l1;
        }

        if(l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

}
