package week10.swapNodesInPairs;

import utils.ListNode;

/**
 * @program: algorithm020
 * @description: 24. 两两交换链表中的节点 递归法
 * {@link: <a href="https://leetcode-cn.com/problems/swap-nodes-in-pairs/">}
 * @author: Colin Ting
 * @create: 2021-06-14 20:12
 **/
public class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }

}
