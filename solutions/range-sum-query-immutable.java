class NumArray {
    private int[] prefixSum; 
    public NumArray(int[] nums) {
        int[] prefix  = new int[nums.length + 1];
        prefix[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        this.prefixSum = prefix;
    }
    
    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
