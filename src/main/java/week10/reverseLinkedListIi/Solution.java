package week10.reverseLinkedListIi;


import utils.ListNode;

/**
 * @program: algorithm020
 * @description: 92. 反转链表 II 头插法
 * {@link: <a href="https://leetcode-cn.com/problems/reverse-linked-list-ii/">}
 * @author: Colin Ting
 * @create: 2021-06-11 17:17
 **/
public class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }

}
