package week2.nAryTreePreorderTraversal;

import utils.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: algorithm020
 * @description: 589. N叉树的前序遍历
 * {@link: <a href="https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/">}
 * @author: Colin Ting
 * @create: 2020-11-25 22:42
 **/
public class Solution {

    private List<Integer> list = new LinkedList<>();
    public List<Integer> preorder(Node root){

        if (root == null) {
            return list;
        }

        list.add(root.val);

        for (Node node : root.children) {
            preorder(node);
        }

        return list;
    }

}
