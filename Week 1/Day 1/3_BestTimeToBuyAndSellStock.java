class Solution {
    public int maxProfit(int[] prices) {
    int maxProfit=0;
    int BestBuy=prices[0];
    for(int i=0;i<prices.length;i++){
        if(prices[i]>BestBuy){
            maxProfit= Math.max(maxProfit,prices[i]-BestBuy);
        }
        BestBuy= Math.min(BestBuy,prices[i]);
    }
     return maxProfit;   
    }
}