class Solution {
    public int characterReplacement(String s, int k) {
       int l=0, r=0, res =0;
       int[] count = new int[26];
       for(;r<s.length();r++) {
            count[s.charAt(r) - 'A']++;
            int maxFreq = Integer.MIN_VALUE;
            for(int i=0; i<26; i++) {
                maxFreq = Math.max(maxFreq, count[i]);
            }
            int winSize = r-l+1;
            while(winSize - maxFreq > k) {
                count[s.charAt(l) - 'A']--;
                l++;
                for(int i=0; i<26; i++) {
                    maxFreq = Math.max(maxFreq, count[i]);
                }
                winSize = r-l+1;
            }
            res = Math.max(res, winSize);
       } 
       return res;
    }
}
