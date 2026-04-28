class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = 0, maxVal = nums[0];
        for(int n : nums) {
            if(maxSoFar < 0) {
                maxSoFar = 0;
            }
            maxSoFar += n;
            maxVal = Math.max(maxVal, maxSoFar);
        }
        return maxVal;
    }
}
