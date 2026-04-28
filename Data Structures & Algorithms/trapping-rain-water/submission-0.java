class Solution {
    public int trap(int[] height) {
        int l=1, r=height.length - 2;
        int res = 0;
        int lMax = height[0], rMax = height[height.length-1];
        while(l <= r) {
            if (lMax < rMax) {
                res += lMax > height[l] ? lMax - height[l] : 0;
                lMax = Math.max(lMax, height[l]);
                l++;
            } else {
                res += rMax > height[r] ? rMax - height[r] : 0;
                rMax = Math.max(rMax, height[r]);
                r--;
            }
        }
        return res;
    }
}
