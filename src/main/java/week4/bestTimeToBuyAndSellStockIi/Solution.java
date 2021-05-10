package week4.bestTimeToBuyAndSellStockIi;

/**
 * @program: algorithm020
 * @description: 122.买卖股票的最佳时机 II
 * * {@link: <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/">}
 * @author: Colin Ting
 * @create: 2020-12-13 23:33
 **/
public class Solution {

    /**
     * 但真实情况下，我想很少人今天买了明天又卖又买，交易费也不得了啊，这里把非线性的想象简化成了线性了
     * （早上开盘就知道今天是涨还是跌了，该不该买，没人这么神）
     *
     * @param prices
     * @return
     */

    public int maxProfit(int[] prices) {
        int profile = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profile += prices[i] - prices[i-1];
            }
        }
        return profile;
    }

}
