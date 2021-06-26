package week10.swapNodesInPairs;

import utils.ListNode;

/**
 * @program: algorithm020
 * @description: 24. 两两交换链表中的节点 递推法
 * {@link: <a href="https://leetcode-cn.com/problems/swap-nodes-in-pairs/">}
 * @author: Colin Ting
 * @create: 2021-06-14 20:15
 **/
public class Solution1 {
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next !=null && prev.next.next != null) {
            ListNode curr = prev.next;
            ListNode next = prev.next.next;
            prev.next.next = next.next;
            next.next = curr;
            prev.next = next;
            prev = curr;
        }
        return dummy.next;
    }
}
