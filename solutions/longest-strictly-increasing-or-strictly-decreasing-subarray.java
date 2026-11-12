class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int j = i;
            int count = 1;
            
            while (j < n - 1 && nums[j] < nums[j + 1]) {
                j++;
                count++;
            }
            
            result = Math.max(result, count);
            
            j = i;
            count = 1;
            
            while (j < n - 1 && nums[j] > nums[j + 1]) {
                j++;
                count++;
            }
            
            result = Math.max(result, count);
        }
        
        return result;
    }
}
