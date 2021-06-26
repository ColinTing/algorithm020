package week9.findAllAnagramsInAString;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: algorithm020
 * @description: 438. 找到字符串中所有字母异位词
 * {@link: <a href="https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/">}
 * @author: Colin Ting
 * @create: 2021-06-01 15:18
 **/
public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.isEmpty()) {
            return res;
        }
        int[] m = new int[26];
        int left = 0;
        int right = 0;
        int cnt = p.length();
        int n = s.length();
        for (char c : p.toCharArray()) {
            ++m[c - 'a'];
        }
        while (right < n) {
            if (m[s.charAt(right++) - 'a']-- >= 1) {
                --cnt;
            }
            if (cnt == 0) {
                res.add(left);
            }
            if (right - left == p.length() && m[s.charAt(left++) - 'a']++ >= 0) {
                ++cnt;
            }
        }
        return res;
    }

}
