class Solution {
    public int maxProduct(int[] nums) {
        int currMin = nums[0], currMax = nums[0], maxPrd = nums[0];
        for(int i=1; i<nums.length; i++) {
            int tempMax = Math.max(nums[i],
                            Math.max(nums[i] * currMin, nums[i] * currMax));
            currMin = Math.min(nums[i],
                            Math.min(nums[i] * currMin, nums[i] * currMax));
            currMax = tempMax;
            maxPrd = Math.max(maxPrd, currMax);

        }
        return maxPrd;
    }
}
