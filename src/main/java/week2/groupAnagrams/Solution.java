package week2.groupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: algorithm020
 * @description: 49. 字母异位词分组
 * {@link: <a href="https://leetcode-cn.com/problems/group-anagrams/">}
 * @author: Colin Ting
 * @create: 2021-05-03 23:50
 **/
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];

            for (char c : s.toCharArray()) {
                ca[c - 'a']++;
            }

            String keyStr = String.valueOf(ca);
            map.putIfAbsent(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
