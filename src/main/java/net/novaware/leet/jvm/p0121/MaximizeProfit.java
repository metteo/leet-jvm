package net.novaware.leet.jvm.p0121;

import java.util.Arrays;

public class MaximizeProfit {

    static
    class Solution {
        public int maxProfit(int[] prices) {
            // constraints
            assert 1 <= prices.length && prices.length <= Math.pow(10, 5);
            assert Arrays.stream(prices).allMatch(p -> 0 <= p && p <= Math.pow(10, 4));

            final int length = prices.length;

            int buyVal = (int) (Math.pow(10, 4)) + 1;
            int buyIdx = -1;

            int sellVal = -1;
            int sellIdx = length;

            int maxProfit = 0;

            for (int i = 0; i < length; ++i) {
                int price = prices[i];
                int profit = price - buyVal;

                if (profit > maxProfit) {
                    maxProfit = profit;

                    sellVal = price;
                    sellIdx = i;
                } if (price < buyVal) {
                    buyVal = price;
                    buyIdx = i;
                }
            }

            if (maxProfit > 0) {
                IO.println("Buy: $" + buyVal + " @" + buyIdx + ", Sell: $" + sellVal + " @" + sellIdx);
            }

            return maxProfit;
        }
    }
}
