class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = piles[0];
        for(int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }
        int l=1, r=maxPile, k=maxPile;
        while (l<=r) {
            int m = l + (r-l)/2;
            int time = 0;
            for(int pile:piles) {
                time += Math.ceil((double) pile / m);
            }
            if (time <= h) {
                k=m;
                r=m-1;
            } else {
                l=m+1;
            }
        }
        return k;
    }
}
