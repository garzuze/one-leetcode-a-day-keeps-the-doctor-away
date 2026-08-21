import java.util.Arrays;

class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        
        int[] result = new int[nums.length - k + 1];
        int len = 1;
        Arrays.fill(result, -1);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                len++;
            } else {
                len = 1;
            }

            if (len >= k) {
                result[i - k + 2] = nums[i + 1];
            }
        }

        return result;
    }
}
