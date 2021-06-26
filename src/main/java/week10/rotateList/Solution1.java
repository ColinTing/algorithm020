package week10.rotateList;

import utils.ListNode;

/**
 * @program: algorithm020
 * @description: 61. 旋转链表 双指针解法
 * {@link: <a href="https://leetcode-cn.com/problems/rotate-list/">}
 * @author: Colin Ting
 * @create: 2021-06-13 13:06
 **/
public class Solution1 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int n = 0;
        ListNode p = head;
        while (p != null) {
            n++;
            p = p.next;
        }
        k %= n;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            if (fast != null) {
                fast = fast.next;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        fast = slow.next;
        slow.next = null;
        return fast;
    }

}
