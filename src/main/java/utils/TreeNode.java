package utils;

/**
 * @program: algorithm020
 * @description: 树数据结构
 * @author: Colin Ting
 * @create: 2020-12-02 20:54
 **/
public class TreeNode {
    public int val;
    public TreeNode left;

    public TreeNode right;


    public TreeNode() {
    }


    public TreeNode(int val) {
        this.val = val;
    }


    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}