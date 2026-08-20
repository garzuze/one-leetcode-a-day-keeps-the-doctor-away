import java.util.Arrays;


class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long result = 0L;
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            if (k > 0) {
                if (mul > 0) {
                    result += (long) nums[i] * mul;
                } else {
                    result += nums[i];
                }
                mul--;
                k--;
            }
            
        }

        return result;
    }
}
