class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String token : tokens) {
            if(isNumber(token)) {
                s.push(Integer.parseInt(token));
            } else {
                int n2 = s.pop();
                int n1 = s.pop();
                switch (token) {
                    case "+":
                        s.push(n1+n2);
                        break;
                    case "-":
                        s.push(n1-n2);
                        break;
                    case "*":
                        s.push(n1*n2);
                        break;
                    case "/":
                        s.push(n1/n2);
                        break;
                }
            }
        }
        return s.pop();
    }
    boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.length() > 1 && i==0 && s.charAt(i) == '-') {
                continue;
            }
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
