class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int result = Integer.MIN_VALUE;
        int maxR = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = n - 1 - k; i >= 0; i--) {
            maxR = Math.max(maxR, nums[i + k]);
            result = Math.max(result, nums[i] + maxR);
        }

        return result;
    }
}
