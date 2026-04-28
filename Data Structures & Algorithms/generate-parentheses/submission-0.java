class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        addBracket(list, new StringBuilder("("), n, 1, 0);
        return list;
    }

    public void addBracket(List<String> list, StringBuilder sb, int n, int oc, int cc ) {
        if(cc==n) {
            list.add(sb.toString());
        }
        if(oc < n) {
            addBracket(list, new StringBuilder(sb+"("), n, oc+1, cc);
        }
        if(cc < oc) {
            addBracket(list, new StringBuilder(sb+")"), n, oc, cc+1);
        }
    }
}
