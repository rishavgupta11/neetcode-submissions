class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int minPrice = prices[0];
        int n = prices.length;

        for(int i=0; i<n; i++) {

            int sell = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, sell);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
