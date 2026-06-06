class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] result = new int[nums.length];

        int acc = 0;

        for (int i = 0; i < nums.length; i++) {
            leftSum[i] = acc;
            acc += nums[i];
        }

        acc = 0;

        for (int j = nums.length - 1; j >= 0; j--) {
            result[j] = Math.abs(leftSum[j] - acc);
            acc += nums[j];
        }

        return result;
    }
}
