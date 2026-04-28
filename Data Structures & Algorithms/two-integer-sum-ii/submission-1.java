class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st = 0, ptr = 1;
        while(st < numbers.length) {
            while (ptr < numbers.length && numbers[st] + numbers[ptr] <= target) {
                if (numbers[st] + numbers[ptr] == target) {
                    return new int[]{st+1, ptr+1};
                }
                ptr++;
            }
            st++;
            ptr=st+1;
        }
        return new int[]{-1,-1};
    }
}
