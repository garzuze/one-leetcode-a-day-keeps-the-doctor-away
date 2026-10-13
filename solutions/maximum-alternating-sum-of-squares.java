import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        Arrays.sort(nums);
        int l = 0;
        int r = n - 1;
        long result = 0L;

        while (l < r) {
            result += Math.pow(nums[r], 2) - Math.pow(nums[l], 2);
            l++;
            r--;
        }

        if (n % 2 != 0) {
            result += Math.pow(nums[n / 2], 2);
        }

        return result;
    }
}
