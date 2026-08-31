class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int result = 0;
        int start = 0;

        for (int n : nums) {
            start += n;
            if (start == 0) {
                result++;
            }
        }

        return result;
    }
}
