class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] mins = new int[n];
        int[] maxes = new int[n];
        int[] diff = new int[n];
        int ma = nums[0];
        int mi = nums[n - 1];

        for (int i = 0; i < n; i++) {
            mi = Math.min(mi, nums[n - i - 1]);
            ma = Math.max(ma, nums[i]);
            maxes[i] = ma;
            mins[n - i - 1] = mi;
        }

        for (int i = 0; i < n; i++) {
            if (maxes[i] - mins[i] <= k) {
                return i;
            }
        }
        
        return -1;
    }
}
