class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i< nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            res.addAll(getSumPair(nums, i, i+1, nums.length-1));
            
        }
        return res;
    }

    public List<List<Integer>> getSumPair(int[] nums, int i, int l, int r) {
        Set<List<Integer>> triplets = new HashSet<>();
        while(l<r) {
            if(nums[i] + nums[l] + nums[r] == 0) {
                triplets.add(Arrays.asList(nums[i], nums[l], nums[r]));
                l++;
            } else if(nums[i] + nums[l] + nums[r] > 0) {
                r--;
            } else {
                l++;
            }
        }
        return new ArrayList<>(triplets);
    }
}
