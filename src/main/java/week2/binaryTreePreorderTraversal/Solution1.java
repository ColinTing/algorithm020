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
 * @create: 2021-05-04 16:45
 **/
public class Solution1 {

    /**
     * 递归法
     * 与 94.二叉树的中序遍历 类似（改下代码的顺序就能实现）
     * @param root
     * @return
     */

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        preorder(list, root);

        return list;

    }

    private void preorder(List<Integer> list, TreeNode root) {

        if (root == null) {
            return;
        }

        list.add(root.val);

        preorder(list, root.left);

        preorder(list, root.right);


    }

}
