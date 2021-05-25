package week8.LruCache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: algorithm020
 * @description: 146. LRU 缓存机制
 * {@link: <a href="https://leetcode-cn.com/problems/lru-cache/">}
 * @author: Colin Ting
 * @create: 2021-05-25 23:38
 **/
public class LRUCache {

    private Map<Integer, Integer> map;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<Integer, Integer>(16, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

}
