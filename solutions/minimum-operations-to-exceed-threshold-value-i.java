class Solution {
    public int minOperations(int[] nums, int k) {
        int result = 0;
        
        for (int n : nums) {
            if (n < k) {
                result++;
            }
        }

        return result;
    }
}
