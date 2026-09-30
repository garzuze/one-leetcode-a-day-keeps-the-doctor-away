import java.util.Arrays;

class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
        
        int result = nums.length;
        long acc = 0L;
        
        for (int n : nums) {
            acc += n;
            if (acc <= 0) {
                result--;
            }
        }

        return result;
    }
}
