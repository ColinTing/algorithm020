package week7.generateParentheses;

import java.util.ArrayList;
import java.util.List;


public class Solution {

    public static void main(String[] args) {
        List<String> strings = new Solution().generateParenthesis(3);
    }

    /**
     * 22.括号生成
     *
     * 思路：回溯算法
     * 1.开始先添加左括号，直至添加完左括号，然后开始添加右括号,直至添加完
     * 2.之后开始回溯，开始在前三位中抛弃"（",并在之后试着添加上"）"
     * 3.一轮过后试着保留前三位中的最后一位"）"，试着抛弃第四位"（"，改成"）"
     * 4.再一轮之后保留前四位，改变第五位的值
     * 5.再一轮之后保留前五位，改变第六位的值
     * 总之，回溯之前未处理到的步骤
     */
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    private void backtrack(List<String> list, String str, int open, int close, int max) {

        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max) {
            backtrack(list, str + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(list, str + ")", open, close + 1, max);
        }

    }

}
