package week2.binaryTreePreorderTraversal;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: algorithm020
 * @description: 144. 二叉树的前序遍历
 * {@link: <a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/">}
 * @author: Colin Ting
 * @create: 2021-05-04 16:44
 **/
public class Solution {



    /**
     * 迭代法
     */
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;

        while (cur != null || !stack.empty()) {
            while (cur != null) {
                list.add(cur.val);
                stack.add(cur.right);
                cur = cur.left;
            }

            cur = stack.pop();
        }

        return list;
    }

}
