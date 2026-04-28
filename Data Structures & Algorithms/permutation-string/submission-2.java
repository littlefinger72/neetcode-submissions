class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }
        int[] s1Chars = new int[26];
        int[] s2Chars = new int[26];
        int i=0,j=0 ;
        while(true) {
            s1Chars[s1.charAt(j) - 'a']++;
            if(j == s1.length()-1) {
                break;
            }
            s2Chars[s2.charAt(j) - 'a']++;
            j++;
        }        
        while(j < s2.length()) {
            s2Chars[s2.charAt(j) - 'a']++;
            if (isPermutation(s1Chars, s2Chars)) {
                return true;
            }
            s2Chars[s2.charAt(i) - 'a']--;
            i++;
            j++;
            
        }
        return false;
    }
    public boolean isPermutation(int[] s1Chars, int[] s2Chars) {
        for(int i=0; i<26; i++) {
            if (s1Chars[i] != s2Chars[i]) {
                return false;
            }
        }
        return true;
    }
}
