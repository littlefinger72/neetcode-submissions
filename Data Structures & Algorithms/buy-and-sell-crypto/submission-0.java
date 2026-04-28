class Solution {
    public int maxProfit(int[] prices) {
       int minPrice = prices[0];
       int maxProfit = -1;
       for (int price : prices) {
        if(price < minPrice) {
            minPrice = price;
        } else {
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
       } 
       return maxProfit;
    }
}
