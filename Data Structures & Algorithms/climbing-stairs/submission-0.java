class Solution {
    int[] cache;
    public int climbStairs(int n) {
        cache = new int[n];
        return recurse(n, 0);
    }

    public int recurse(int n, int i) {
        if (i >= n) {
            return i==n ? 1 : 0;
        }
        return cache[i] = recurse(n, i+1) + recurse(n, i+2);
    }
}
