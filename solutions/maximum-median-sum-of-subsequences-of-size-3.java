import java.util.Arrays;

class Solution {
    public long maximumMedianSum(int[] nums) {
        long result = 0;
        Arrays.sort(nums);
        int init = nums.length / 3;

        for (int i = init; i < nums.length; i += 2) {
            result += nums[i];
        }
        

        return result;
    }
}
