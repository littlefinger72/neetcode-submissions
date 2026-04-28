class Solution {
    int[][] dp;
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        dp = new int[nums.length][2];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }        
       return recursive(nums, 0, 0); 
    }

    public int recursive(int[] nums, int i, int flag) {
        if (i>=nums.length) {
            return 0;
        }
        if (i==nums.length-1 && flag==1) {
            return 0;
        }
        if (dp[i][flag] != -1) {
            return dp[i][flag];
        }
        return dp[i][flag] = Math.max(nums[i] + recursive(nums, i+2, i==0?1:flag),
            recursive(nums, i+1, i==0?0:flag));
    }
}
