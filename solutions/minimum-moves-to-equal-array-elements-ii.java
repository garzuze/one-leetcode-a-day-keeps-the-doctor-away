import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int target = nums[l / 2];
        int result = 0;

        for (int n : nums) {
            if (n < target) {
                result += target - n;
            } else if (n > target) {
                result += n - target;
            }
        }

        return result;
    }
}
