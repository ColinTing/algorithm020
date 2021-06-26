package week10.rotateList;

import utils.ListNode;

/**
 * @program: algorithm020
 * @description: 61. 旋转链表 如"189.旋转数组"般三次旋转解法
 * {@link: <a href="https://leetcode-cn.com/problems/rotate-list/">}
 * @author: Colin Ting
 * @create: 2021-06-13 13:00
 **/
public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int len = listNodeLength(head);
        k %= len;
        //先旋转全体链表
        ListNode rotateHead = rotateTotal(head);
        //再旋转前k个链表
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        dummy.next = rotateHead;
        ListNode curr = rotateHead;
        for (int i = 0; i < k -1; i++) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        //旋转后k个链表
        for (int i = 0; i < k; i++) {
            prev = prev.next;
        }
        curr = prev.next;
        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }

    private int listNodeLength(ListNode head) {
        int n = 0;
        ListNode p = head;
        while (p != null) {
            n++;
            p = p.next;
        }
        return n;
    }

    private ListNode rotateTotal(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverseListNode = rotateTotal(head.next);
        head.next.next = head;
        head.next = null;
        return reverseListNode;
    }

}
