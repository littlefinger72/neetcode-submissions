class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
        dp = new int[amount+2][coins.length+2];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }        
        return recursive(coins, amount, 0);
        //return res < 10_000_000 ? res : -1;
    }

    public int recursive(int[] coins, int remAmt, int i) {
        if(remAmt == 0) {
            return 1;
        }
        if(remAmt < 0 || i >= coins.length) {
            return 0;
        }
        if(dp[remAmt][i] != -1) {
            return dp[remAmt][i];
        }
        return dp[remAmt][i] = recursive(coins, remAmt - coins[i], i) + 
                            recursive(coins, remAmt, i+1);
        
    }
}
