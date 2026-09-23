class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int result = 0;
        long[] right = new long[n];
        long[] left = new long[n];
        
        right[0] = nums[0];
        left[n - 1] = nums[n - 1];

        for (int i = 1; i < n; i++) {
            right[i] = (long) (right[i - 1] + nums[i]);
            left[n - i - 1] = (long) (left[n - i] + nums[n - i - 1]);
        }

        for (int i = 0; i < n - 1; i++) {
            if (right[i] >= left[i + 1]) {
                result++;
            }
        }

        return result;
    }
}
