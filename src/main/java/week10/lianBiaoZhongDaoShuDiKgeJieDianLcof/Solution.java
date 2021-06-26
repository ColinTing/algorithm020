package week10.lianBiaoZhongDaoShuDiKgeJieDianLcof;

import utils.ListNode;

/**
 * @program: algorithm020
 * @description: 剑指 Offer 22. 链表中倒数第k个节点 双指针解法
 * {@link: <a href="https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/">}
 * @author: Colin Ting
 * @create: 2021-06-13 16:51
 **/
public class Solution {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            if (fast != null) {
                fast = fast.next;
            }
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

}
