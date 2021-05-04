package week2.binaryTreeInorderTraversal;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: algorithm020
 * @description: 94. 二叉树的中序遍历
 * {@link: <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/">}
 * @author: Colin Ting
 * @create: 2021-05-04 15:25
 **/
public class Solution {

    /**
     * 迭代法
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;

        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }

        return list;

    }

}
