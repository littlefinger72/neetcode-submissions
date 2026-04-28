class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int l=s.length();
        for(int i=0; i<l; i++) {
            if(isAlphanumeric((int)s.charAt(i)))
                sb1.append(s.charAt(i));
            if(isAlphanumeric((int)s.charAt(l-i-1)))
                sb2.append(s.charAt(l-i-1));
        }
        //System.out.println(sb1.toString());
        //System.out.println(sb2.toString());
        return sb1.toString().equalsIgnoreCase(sb2.toString());
    }
    boolean isAlphanumeric(int codePoint) {
    return (codePoint >= 65 && codePoint <= 90) ||
           (codePoint >= 97 && codePoint <= 122) ||
           (codePoint >= 48 && codePoint <= 57);
}
}
