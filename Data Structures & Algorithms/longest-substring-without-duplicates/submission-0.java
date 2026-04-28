class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> uChars = new HashSet<>();
        int i=0, j=0, ans=0;
        while(j < s.length()) {
            while(uChars.contains(s.charAt(j))) {
                uChars.remove(s.charAt(i));
                i++;
            }
            ans = Math.max(ans, j-i+1);
            uChars.add(s.charAt(j));
            j++;
        }
        return ans;
    }
}
