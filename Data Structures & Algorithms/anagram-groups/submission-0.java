class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String str : strs) {
            int[] freqArr = getFreqArr(str);
            String key = Arrays.toString(freqArr);
            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }

    public int[] getFreqArr(String str) {
        int[] freq = new int[26];
        for(Character c : str.toCharArray()) {
            freq[c-'a']++;
        }
        return freq;
    }
}
