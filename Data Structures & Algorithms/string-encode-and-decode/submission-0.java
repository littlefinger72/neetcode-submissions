class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append((char) str.length()).append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String s) {
        List<String> decodedStrings = new ArrayList<>();
        int index = 0;
        int length = s.length();
        while (index < length) {
            int size = s.charAt(index++);
            decodedStrings.add(s.substring(index, index + size));
            index += size;
        }
        return decodedStrings;
    }
}
