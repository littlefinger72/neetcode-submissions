class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int res = 0;
        for (int num : nums) {
            numSet.add(num);
        }
        for (int num : nums) {
            if (numSet.contains(num) && !numSet.contains(num-1)) {
                int curr = num;
                int cnt = 0;
                while (numSet.contains(curr)) {
                    numSet.remove(curr);
                    curr++;
                    cnt++;
                }
                res = Math.max(res, cnt);
            }
        }
        return res;
    }
}
