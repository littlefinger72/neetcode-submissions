class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m+2][n+2];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return calculate(m, n, 0, 0);
    }


    public int calculate(int m, int n, int i, int j) {
        if(i==m-1 && j==n-1) {
            return 1;
        }
        if(i==m || j==n) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        return dp[i][j] = calculate(m,n,i+1,j) + calculate(m,n,i,j+1);
    }
}
