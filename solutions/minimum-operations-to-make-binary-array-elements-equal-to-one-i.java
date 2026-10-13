class Solution {
    public int minOperations(int[] nums) {
        int j = 0;
        int n = nums.length;
        int result = 0;
        
        while (j < n) {
            while (j < n - 2 && nums[j] == 0) {
                result++;
                nums[j] = 1;
                nums[j + 1] = nums[j + 1] == 0 ? 1 : 0;
                nums[j + 2] = nums[j + 2] == 0 ? 1 : 0;
                j++;
            }
            j++;
        }

        for (int num : nums) {
            if (num == 0) {
                return -1;
            }
        }

        return result;
    }
}
