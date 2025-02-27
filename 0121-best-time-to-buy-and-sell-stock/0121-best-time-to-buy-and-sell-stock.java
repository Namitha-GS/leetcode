class Solution {
    public int maxProfit(int[] prices) {
        // By using 2-pointers
        int l=0, r=1, maxProfit=0;
        while(r < prices.length) {
            if(prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                l = r;
            }
            r++;
        }
        return maxProfit;
    }

    // /* without using 2-pointers */
    // public int maxProfit(int[] prices) {
    //     int min = Integer.MAX_VALUE;
    //     int maxProfit = 0, profit = 0;
    //     for(int i=0; i<prices.length; i++){
    //         if(prices[i] < min){
    //             min = prices[i];
    //         }

    //         profit = prices[i] - min;

    //         // get Max Profit
    //         if(profit > maxProfit){
    //             maxProfit = profit;
    //         }
    //     }
    //     return maxProfit;
    // }
}