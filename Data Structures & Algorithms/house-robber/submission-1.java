class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
       return recursive(nums, 0); 
    }

    public int recursive(int[] nums, int i) {
        if (i>=nums.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        return dp[i] = Math.max(nums[i] + recursive(nums, i+2),
            recursive(nums, i+1));
    }
}
