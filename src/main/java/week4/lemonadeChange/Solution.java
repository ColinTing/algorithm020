package week4.lemonadeChange;

/**
 * @program: algorithm020
 * @description: 860.柠檬水找零
 * @author: Colin Ting
 * @create: 2020-12-13 23:19
 **/
public class Solution {

    public boolean lemonadeChange(int[] bills) {


        /**
         * 解题思路：
         * 划分:当前都到的面值可分成 5， 10， 20
         * 判断过程：
         * 5元，5元面值 + 1
         * 10元，10元面值 + 1， 5元面值 - 1
         * 如果收到20时需要特殊处理下
         * 如果当前有10元的零钱，按有10元+5元的处理方法
         * 如果当前没有10元，按3个5元的处理方法
         * 返回结果bool值：
         * 当前如果five < 0，那么就是没有正确找零
         * 当前如果five >= 0，那么就是有正确找零
         * （为什么不用判断ten < 0 的情况， 因为单独设置了条件使得ten不会小于0）
         */

        int five = 0, ten = 0;

        for (int i : bills) {
            if (i == 5) {
                five++;
            } else if (i == 10) {
                ten++;
                five--;
            } else if (ten > 0) {
                ten--;
                five--;
            } else {
                five -= 3;
            }
            if ( five < 0) {
                return false;
            }
        }
        return true;
    }
}
