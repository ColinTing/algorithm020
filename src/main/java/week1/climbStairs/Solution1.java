package week1.climbStairs;

/**
 * @program: algorithm020
 * @description: 70.爬楼梯
 * @author: Colin Ting
 * @create: 2020-11-29 20:03
 **/
public class Solution1 {

    /**
     * 动态规划的写法
     */
    public int climbStairs(int n) {


        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;


        int one = 1;
        int two = 2;
        int three = 0;

        for (int i = 2; i < n; i++) {
            three = one + two;
            one = two;
            two = three;
        }

        return three;


    }


}
