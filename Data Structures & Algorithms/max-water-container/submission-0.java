class Solution {
    public int maxArea(int[] heights) {
        int st = 0, en = heights.length - 1;
        int res = 0;
        while (st < en) {
            res = Math.max(res
            , Math.min(heights[st], heights[en]) * (en-st));
            if(heights[st] <= heights[en])
                st++;
            else
                en--;
        }
        return res;
    }
}
