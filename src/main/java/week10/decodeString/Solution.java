package week10.decodeString;

import java.util.Stack;

/**
 * @program: algorithm020
 * @description: 394. 字符串解码 stack数据结构解法
 * {@link: <a href="https://leetcode-cn.com/problems/decode-string/">}
 * @author: Colin Ting
 * @create: 2021-06-04 16:19
 **/
public class Solution {

    public String decodeString(String s) {
        String t = "";
        Stack<Integer> sNum = new Stack<>();
        Stack<String> sStr = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                cnt = 10 * cnt + s.charAt(i) - '0';
            } else if (s.charAt(i) == '[') {
                sNum.push(cnt);
                sStr.push(t);
                cnt = 0;
                t = "";
            } else if (s.charAt(i) == ']') {
                int k = sNum.pop();
                StringBuilder unionStr = new StringBuilder();
                for (int j = 0; j < k; j++) {
                    unionStr.append(t);
                }
                t = sStr.pop() + unionStr;
            } else {
                t += s.charAt(i);
            }
        }
        return t;
    }

}
