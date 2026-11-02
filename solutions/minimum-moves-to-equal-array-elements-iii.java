class Solution {
    public int minMoves(int[] nums) {
        int target = Integer.MIN_VALUE;
        int acc = 0;

        for (int n : nums) {
            target = Math.max(target, n);
            acc += n;
        }

        return (target * nums.length) - acc;
    }
}
