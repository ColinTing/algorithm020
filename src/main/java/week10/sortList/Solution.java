package week10.sortList;

import utils.ListNode;

/**
 * @program: algorithm020
 * @description: 148. 排序链表 归并排序（快慢指针+合并两个有序链表）
 * {@link: <a href="https://leetcode-cn.com/problems/sort-list/">}
 * @author: Colin Ting
 * @create: 2021-06-13 14:42
 **/
public class Solution {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mergeTwoSortedLists(sortList(head), sortList(mid));
    }

    private ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoSortedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoSortedLists(l1, l2.next);
            return l2;
        }
    }

}
