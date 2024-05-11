class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int oldStockPrice = prices[0];
        int n = prices.length;
        int profit = 0;
        for(int i = 1 ;i < n;i++){
            if(oldStockPrice > prices[i]){
                oldStockPrice = prices[i];
            }else{
                profit += (prices[i] - oldStockPrice); 
                oldStockPrice = prices[i];
            }
        }

        return profit;
    }
}
