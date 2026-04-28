class Solution {
    public boolean isValid(String s) {
        Stack<Character> openBrackets = new Stack<>();
        for(Character c : s.toCharArray()) {
            if (c=='(' || c=='{' || c=='[') {
                openBrackets.push(c);
            } else {
                if(openBrackets.isEmpty()) {
                    return false;
                }
                Character top = openBrackets.pop();
                if ((c==')' && top=='(') ||
                    (c=='}' && top=='{') ||
                    (c==']' && top=='[') ) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return openBrackets.isEmpty();
    }
}
