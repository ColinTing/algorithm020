package week2.nAryTreePreorderTraversal;

import java.util.List;

/**
 * @program: algorithm020
 * @description:
 * @author: Colin Ting
 * @create: 2020-11-25 21:46
 **/
public class Node {

    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

}
