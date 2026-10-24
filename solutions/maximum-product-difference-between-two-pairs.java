import java.util.Arrays;

class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int first = nums[0] * nums[1];
        int sec = nums[n - 1] * nums[n - 2];

        if (first > sec) {
            sec = Math.max(sec, nums[2] * nums[3]);
            return first - sec;
        }

        return sec - first;
    }
}
