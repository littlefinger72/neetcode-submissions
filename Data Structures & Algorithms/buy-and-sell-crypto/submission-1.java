class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int cp = prices[0];
        for (int price : prices) {
            if (price < cp) {
                cp = price;
            } else {
                ans = Math.max(ans, price - cp);
            }
        }
        return ans;
    }
}
