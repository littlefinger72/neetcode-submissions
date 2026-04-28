class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int l=0, r = len-1;
        while (l<r) {
            int m = l + (r-l)/2;
            if(nums[m] == target) {
                return m;
            } else if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m+1;
            }
        }
        int pivot = l;
        l=0; r=len-1;
        if (target >= nums[pivot] && target <= nums[r]) {
            l = pivot;
        } else {
            r = pivot - 1;
        }
        while (l<=r) {
            int m = l + (r-l)/2;
            if(nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m+1;
            } else {
                r = m-1;
            }
        }
        return -1;
    }
}
