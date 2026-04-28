class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            map.putIfAbsent(sorted.toString(), new ArrayList<>());
            map.get(sorted.toString()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
