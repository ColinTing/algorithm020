package week6.frogJump;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: algorithm020
 * @description: 403. 青蛙过河
 * {@link: <a href="https://leetcode-cn.com/problems/frog-jump/">}
 * @author: Colin Ting
 * @create: 2021-05-17 22:56
 **/
public class Solution {
    public boolean canCross(int[] stones) {
        if (stones.length < 2) {
            return true;
        }
        if (stones[0] != 0 || stones[1] != 1) {
            return false;
        }
        Map<Integer, Set<Integer>> dp = new HashMap<>(stones.length);
        for (int i = 0; i < stones.length; i++) {
            dp.put(stones[i], new HashSet<>());
        }
        dp.get(0).add(0);
        for (int i = 0; i < stones.length - 1; i++) {
            int stone = stones[i];
            for (int step : dp.get(stone)) {

                if (step - 1 > 0 && dp.containsKey(stone + step - 1)) {
                    dp.get(stone + step - 1).add(step - 1);
                }

                if (dp.containsKey(stone + step)) {
                    dp.get(stone + step).add(step);
                }

                if (dp.containsKey(stone + step + 1)) {
                    dp.get(stone + step + 1).add(step + 1);
                }
            }
        }
        return !dp.get(stones[stones.length-1]).isEmpty();
    }
}
