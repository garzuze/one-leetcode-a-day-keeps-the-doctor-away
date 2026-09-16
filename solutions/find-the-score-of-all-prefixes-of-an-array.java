class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        long acc = 0;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            ans[i] = acc + nums[i] + max;
            acc += nums[i] + max;
        }

        return ans;
    }
}
