package week10.linkedListCycle;

import utils.ListNode;

/**
 * @program: algorithm020
 * @description: 141. 环形链表
 * {@link: <a href="https://leetcode-cn.com/problems/linked-list-cycle/">}
 * @author: Colin Ting
 * @create: 2021-06-08 20:40
 **/
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
