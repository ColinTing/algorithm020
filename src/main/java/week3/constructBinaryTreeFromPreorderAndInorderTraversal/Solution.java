package week3.constructBinaryTreeFromPreorderAndInorderTraversal;

import utils.TreeNode;

/**
 * @program: algorithm020
 * @description: 105. 从前序与中序遍历序列构造二叉树
 * {@link: <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/"/> }
 * @author: Colin Ting
 * @create: 2020-12-06 22:30
 **/
public class Solution {

    /**
     * 由于先序的顺序的第一个肯定是根，所以先序二叉树的根节点可以知道，
     * 在中序遍历中也可以定位出根节点的位置，并以根节点的位置将中序遍历拆分为左右两个部分
     * 这样就知道左右节点的下标范围，前序遍历和中序遍历都可以应用此信息，分别对其递归调用
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int pLeft, int pRight, int[] inorder, int iLeft, int iRight) {
        if (pLeft > pRight || iLeft > iRight) {
            return null;
        }

        int i;
        for (i = iLeft; i<= iRight; i++) {
            if (preorder[pLeft] == inorder[i]) {
                break;
            }
        }

        TreeNode root = new TreeNode(preorder[pLeft]);

        root.left = buildTree(preorder, pLeft + 1, pLeft + i - iLeft, inorder, iLeft, i - 1);
        root.right = buildTree(preorder, pLeft + i - iLeft + 1, pRight, inorder, i+1, iRight);

        return root;
    }

}
