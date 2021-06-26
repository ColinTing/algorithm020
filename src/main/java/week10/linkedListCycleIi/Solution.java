package week10.linkedListCycleIi;

import utils.ListNode;

/**
 * @program: algorithm020
 * @description: 142. 环形链表 II
 * {@link: <a href="https://leetcode-cn.com/problems/linked-list-cycle-ii/">}
 * @author: Colin Ting
 * @create: 2021-06-08 20:42
 **/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow =slow.next;
            if (fast == slow) {
                while (head != slow) {
                    head = head.next;
                    slow =slow.next;
                }
                return head;
            }
        }
        return null;
    }
}
