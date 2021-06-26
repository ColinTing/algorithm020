package week9.isomorphicStrings;

/**
 * @program: algorithm020
 * @description: 205. 同构字符串
 * {@link: <a href="https://leetcode-cn.com/problems/isomorphic-strings/">}
 * @author: Colin Ting
 * @create: 2021-06-01 11:44
 **/
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[128];
        int[] m2 = new int[128];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
                return false;
            }
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
