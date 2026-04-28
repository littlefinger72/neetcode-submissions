class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tFreq = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for(Character tchar : t.toCharArray()) {
            tFreq.put(tchar, tFreq.getOrDefault(tchar,0)+1);
        } 
        int need = tFreq.keySet().size(), have=0;
        int l=0, resLen = Integer.MAX_VALUE;
        int[] res = new int[2];
        for (int r=0; r<s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (tFreq.containsKey(c) && window.get(c).equals(tFreq.get(c))) {
                have++;
            }
            while(have == need) {
                if ((r - l + 1) < resLen) {
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);
                if (tFreq.containsKey(leftChar) && window.get(leftChar) < tFreq.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
