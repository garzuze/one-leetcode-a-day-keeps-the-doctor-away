class Solution {
    public int minimumOperations(int[] nums) {
        int result = 0;

        for (int n : nums) {
            result += Math.min(n % 3, 3 - (n % 3));
        }

        return result;
    }
}
