class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int n : nums) {
            if(!numSet.add(n))
                return true;
        }
        return false;
    }
}
