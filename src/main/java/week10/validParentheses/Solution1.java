package week10.validParentheses;

import java.util.Stack;

/**
 * @program: algorithm020
 * @description: 20. 有效的括号 解法二：栈数据结构
 * {@link: <a href="https://leetcode-cn.com/problems/valid-parentheses/">}
 * @author: Colin Ting
 * @create: 2021-06-03 15:54
 **/
public class Solution1 {

    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                parentheses.push(s.charAt(i));
            } else {
                if (parentheses.isEmpty()) {
                    return false;
                }
                if (s.charAt(i) == ')' && parentheses.peek() != '(') {
                    return false;
                }
                if (s.charAt(i) == ']' && parentheses.peek() != '[') {
                    return false;
                }
                if (s.charAt(i) == '}' && parentheses.peek() != '{') {
                    return false;
                }
                parentheses.pop();
            }
        }
        return parentheses.isEmpty();
    }

}
