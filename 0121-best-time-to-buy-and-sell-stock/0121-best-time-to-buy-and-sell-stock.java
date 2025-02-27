class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0, profit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }

            profit = prices[i] - min;

            // get Max Profit
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}