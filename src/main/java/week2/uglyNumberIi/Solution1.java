package week2.uglyNumberIi;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: algorithm020
 * @description: 264. 丑数 II 解法二：递推
 * {@link: <a href="https://leetcode-cn.com/problems/ugly-number-ii/">}
 * @author: Colin Ting
 * @create: 2021-06-02 16:49
 **/
public class Solution1 {

    public int nthUglyNumber(int n) {
        if (n < 1) {
            return 0;
        }
        List<Integer> res = new ArrayList<>();
        res.add(1);
        int i = 0, j = 0, k = 0;
        while (res.size() < n) {
            int t2 = res.get(i) * 2;
            int t3 = res.get(j) * 3;
            int t5 = res.get(k) * 5;
            int min = Math.min(t2, Math.min(t3, t5));

            if (min == t2) {
                i++;
            }
            if (min == t3) {
                j++;
            }
            if (min == t5) {
                k++;
            }
            res.add(min);
        }
        return res.get(res.size() - 1);
    }

}
