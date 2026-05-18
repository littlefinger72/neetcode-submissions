class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int i=0, j=0;
        while (j < s.length()) {
            Character currentChar =  s.charAt(j);
            charMap.put(currentChar, charMap.getOrDefault(currentChar, 0) + 1);
            while (charMap.get(currentChar) > 1) {
                charMap.put(s.charAt(i), charMap.get(s.charAt(i))-1);
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}
