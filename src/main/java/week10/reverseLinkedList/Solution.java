package week10.reverseLinkedList;

import utils.ListNode;

/**
 * @program: algorithm020
 * @description: 206. 反转链表 递推版
 * {@link: <a href="https://leetcode-cn.com/problems/reverse-linked-list/">}
 * @author: Colin Ting
 * @create: 2021-06-10 15:38
 **/
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
