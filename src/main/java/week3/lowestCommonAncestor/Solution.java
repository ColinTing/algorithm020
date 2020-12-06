package week3.lowestCommonAncestor;


import utils.TreeNode;

/**
 * @program: algorithm020
 * @description: 236.二叉树的最近公共祖先
 * {@link: <a href="https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/"/> }
 * @author: Colin Ting
 * @create: 2020-12-06 15:10
 **/
public class Solution {

    /**
     * 解体思路：
     * 终止条件：递推节点直到==null时，或者root == p 或者 root == q 时
     * 递推条件：递推左右子树获得返回值left，right
     * 返回值：
     * 如果left==null，说明p，q在右子树，返回right
     * 如果right==null, 说明p，q在左子树，返回left
     * 如果left和right都不为null时，这时返回root（当前递推下的root）
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || p == root || q == root) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        return left == null ? right : right == null ? left : root;


    }

}
