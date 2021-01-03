package week7.generateParentheses;

import java.util.ArrayList;
import java.util.List;


public class Solution {

    /**
     * 22.括号生成
     * <p>
     * 思路：回溯算法
     * 1.开始先添加左括号，直至添加完左括号，然后开始添加右括号,直至添加完
     * 2.之后开始回溯，抛弃")",并在之后试着添加上"(",看是否符合条件
     * 3.重复步骤2直至回到起点
     */
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    private void backtrack(List<String> list, String str, int open, int close, int n) {

        if (str.length() == n * 2) {
            list.add(str);
            return;
        }

        if (open < n) {
            backtrack(list, str + "(", open + 1, close, n);
        }

        if (close < open) {
            backtrack(list, str + ")", open, close + 1, n);
        }

    }

}
