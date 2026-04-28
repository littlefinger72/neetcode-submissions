class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int res = 0;
        int[] lMax = new int[len];
        int[] rMax = new int[len];
        lMax[0] = height[0];
        rMax[len-1] = height[len-1];
        for (int i=1; i<len; i++) {
            lMax[i] = Math.max(height[i], lMax[i-1]);
            rMax[len-1-i] = Math.max(height[len-i-1], rMax[len-i]);
        }
        for (int i=0; i< len; i++) {
            res += Math.min(lMax[i], rMax[i]) - height[i];
        }
        return res;

    }
}
