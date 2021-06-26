package week10.reverseLinkedList;

import utils.ListNode;

/**
 * @program: algorithm020
 * @description: 206. 反转链表 递归版
 * {@link: <a href="https://leetcode-cn.com/problems/reverse-linked-list/">}
 * @author: Colin Ting
 * @create: 2021-06-10 15:41
 **/
public class Solution1 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverseListHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseListHead;
    }
}
