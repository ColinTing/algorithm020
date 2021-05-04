package week2.binaryTreeInorderTraversal;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: algorithm020
 * @description: 94. 二叉树的中序遍历
 * {@link: <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/">}
 * @author: Colin Ting
 * @create: 2021-05-04 15:27
 **/
public class Solution1 {

    /**
     * 递归法
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        inorder(list, root);

        return list;

    }

    private void inorder(List<Integer> list, TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(list, root.left);

        list.add(root.val);

        inorder(list, root.right);

    }
}
