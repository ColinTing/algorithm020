package week7.generateParentheses;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: algorithm020
 * @description: 22. 括号生成
 * {@link: <a href="https://leetcode-cn.com/problems/generate-parentheses/">}
 * @author: Colin Ting
 * @create: 2021-05-22 23:11
 **/
public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<>();

        dfs(n, n, "", res);

        return res;
    }

    private void dfs(int open, int close, String str, List<String> res) {
        if (open > close) {
            return;
        }

        if (open == 0 && close == 0) {
            res.add(str);
        } else {
            if (open > 0) {
                dfs(open - 1, close, str + '(', res);
            }

            if (close > 0) {
                dfs(open, close - 1, str + ')', res);
            }
        }
    }

}
