public class BestTimeToBuySellStock {


    //    Leetcode 121
    public static void main(String[] args) {
//        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {7, 6, 4, 3, 1};
//        System.out.println(bestTimeBuySell(prices));
        System.out.println(bestTimeBuySellStock(prices));
    }


    //    Linear Approach
    private static int bestTimeBuySell(int[] prices) {

        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    profit = Math.max(profit, prices[j] - prices[i]);
                }
            }
        }
        return profit;


//        return -1;
    }

    private static int bestTimeBuySellStock(int[] prices) {
        int bestPrice = 0;
        int buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            bestPrice = Math.max(bestPrice, prices[i] - buyPrice);
        }
        return bestPrice;
    }
}
