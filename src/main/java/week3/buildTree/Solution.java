package week3.buildTree;

import utils.TreeNode;

import java.util.HashMap;

/**
 * @program: algorithm020
 * @description: 105. 从前序与中序遍历序列构造二叉树
 * {@link: <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/"/> }
 * @author: Colin Ting
 * @create: 2020-12-06 22:30
 **/
public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0,
                inorder.length, map);
    }

    private TreeNode buildTreeHelper(int[] preorder, int p_start,
                                     int p_end, int[] inorder,
                                     int i_start, int i_end,
                                     HashMap<Integer, Integer> map) {

        if (p_start == p_end) {
            return null;
        }
        int root_val = preorder[p_start];
        TreeNode root = new TreeNode(root_val);
        int i_root_index = map.get(root_val);
        int left_num = i_root_index - i_start;
        root.left = buildTreeHelper(preorder, p_start + 1,
                p_start + left_num + 1, inorder, i_start, i_root_index-1,
                map);
        root.right = buildTreeHelper(preorder, p_start + left_num + 1,
                p_end, inorder, i_root_index + 1, i_end, map);
        return root;
    }

}
