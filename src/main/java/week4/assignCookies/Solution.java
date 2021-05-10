package week4.assignCookies;

import java.util.Arrays;

/**
 * @program: algorithm020
 * @description: 455. 分发饼干
 * {@link: <a href="https://leetcode-cn.com/problems/assign-cookies/description/">}
 * @author: Colin Ting
 * @create: 2021-05-10 17:37
 **/
public class Solution {

    public int findContentChildren(int[] g, int[] s) {
        int j = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        for (int i = 0; i < s.length; i++) {
            if (g[j] <= s[i]) {
                j++;
            }

            if (j >= g.length) {
                break;
            }
        }
        return j;
    }

}
