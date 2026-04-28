class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(Character c : s.toCharArray()) {
            if ((c >= 48 && c<= 57) ||
                 (c >= 65 && c<= 90) ||
                 (c >= 97 && c<= 122) ) {
                    sb.append(c);
                 }
        }
        String str = sb.toString().toLowerCase();
        int i=0, j=str.length()-1;
        while (i< str.length()/2) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
