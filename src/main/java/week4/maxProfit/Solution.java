package week4.maxProfit;

/**
 * @program: algorithm020
 * @description: 122.买卖股票的最佳时机 II
 * @author: Colin Ting
 * @create: 2020-12-13 23:33
 **/
public class Solution {

    public int maxProfit(int[] prices) {

        int buy, sell;
        int i = 0, profile = 0;
        int N = prices.length -1;
        while (i < N) {

            while (i < N && prices[i] > prices[i+1]) {
                i++;
            }
            buy = prices[i];

            while (i < N && prices[i] <= prices[i+1]) {
                i++;
            }
            sell = prices[i];

            profile += sell - buy;
        }
        return profile;
    }

}
