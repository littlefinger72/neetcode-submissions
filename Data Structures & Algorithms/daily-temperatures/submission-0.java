class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> indices = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i=0; i< temperatures.length; i++) {
            while(!indices.isEmpty() && temperatures[i] > temperatures[indices.peek()]) {
                int poppedIndex = indices.pop();
                res[poppedIndex] = i - poppedIndex;
            }
            indices.push(i);
        }
        return res;
    }
}
