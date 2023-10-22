package LeetCode_Easy_Problems;

public class Best_Time_To_Buy_And_Sell_Stock {
    public int maxProfit(int[] prices) {

        // create variables.
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;

        // for loop to find the minimum price and maximum profit.
        for (int price : prices) {

            // if the current price is less than the minimum price, update the minimum price.
            if (price < minPrice) minPrice = price;

            // if the current price - the minimum price is greater than the maximum profit, update the maximum profit.
            else if (price - minPrice > maxProfit) maxProfit = price - minPrice;
        }

        return maxProfit; // return our maximum profit.
    }
}
