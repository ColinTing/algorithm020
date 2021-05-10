package week4.bestTimeToBuyAndSellStock;

/**
 * @program: algorithm020
 * @description: 121. 买卖股票的最佳时机
 * {@link: <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/">}
 * @author: Colin Ting
 * @create: 2021-05-06 14:59
 **/
public class Solution {

    public int maxProfit(int[] prices) {

        int profile = 0, buy = Integer.MAX_VALUE;

        for (int price : prices) {
            buy = Math.min(buy, price);
            profile = Math.max(profile, price - buy);
        }

        return profile;
    }

}
