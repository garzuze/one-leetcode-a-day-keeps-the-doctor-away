class Solution {
    public long maximumScore(int[] nums) {
        long result = Long.MIN_VALUE;
    
        int n = nums.length - 1;
        long acc = 0L;
        int min = Integer.MAX_VALUE;

        long[] prefixSum = new long[n];
        int[] suffixMin = new int[n];

        for (int i = 0; i < n; i++) {
            acc += nums[i];
            prefixSum[i] = acc;
            
            min = Math.min(min, nums[n - i]);
            suffixMin[n - i - 1] = min;
        }

        for (int i = 0; i < n; i++) {
            result = Math.max(result, prefixSum[i] - suffixMin[i]);
        }

        return result;
    }
}
