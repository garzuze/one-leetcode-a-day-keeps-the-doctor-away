class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        int i = 0;

        while (i < nums.length) {
            int curr = 0;

            while (i < nums.length && nums[i] == 0) {
                result += curr + 1;
                curr++;
                i++;
            }

            i++;
        }

        return result;
    }
}
