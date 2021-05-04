package week2.topKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: algorithm020
 * @description: 347. 前 K 个高频元素
 * {@link: <a href="https://leetcode-cn.com/problems/top-k-frequent-elements/">}
 * @author: Colin Ting
 * @create: 2021-05-04 19:06
 **/
public class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];

        Map<Integer, Integer> frequencyMap = new HashMap<>(16);

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int frequency = entry.getValue();
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);

        }

        List<Integer> res = new ArrayList<>();

        for (int pos = bucket.length - 1; pos > 0 && res.size() < k; pos--) {
            if (bucket[pos] != null) {
                res.addAll(bucket[pos]);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

}
