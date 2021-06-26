package week2.nAryTreeLevelOrderTraversal;

import utils.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: algorithm020
 * @description: 429. N 叉树的层序遍历
 * {@link: <a href="https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/">}
 * @author: Colin Ting
 * @create: 2021-06-02 16:55
 **/
public class Solution {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer>curLevel = new LinkedList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node curr = queue.poll();
                curLevel.add(curr.val);
                for (Node c : curr.children) {
                    queue.offer(c);
                }
            }
            res.add(curLevel);
        }
        return res;
    }

}
