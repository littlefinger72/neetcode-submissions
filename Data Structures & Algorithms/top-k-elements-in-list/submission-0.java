class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frqMap = new HashMap<>();
        for(int i : nums) {
            frqMap.put(i, frqMap.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Integer> pQueue
            = new PriorityQueue<Integer>(
                (o1, o2) -> frqMap.get(o2).compareTo(frqMap.get(o1))
            );
        for(int i : frqMap.keySet()) {
            pQueue.offer(i);
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
            ans[i] = pQueue.poll();
        return ans;
    }
}
