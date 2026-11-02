class Solution {
    public int minMoves(int[] nums) {
        int target = Integer.MAX_VALUE;
        int result = 0;

        for (int n : nums) {
            target = Math.min(target, n);
        }
        
        for (int n : nums) {
            result += n - target;
        }

        return result;
    }
}
