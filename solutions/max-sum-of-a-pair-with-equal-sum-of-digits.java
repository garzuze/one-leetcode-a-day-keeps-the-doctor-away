class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int[] seen = new int[82];
        int result = -1;

        for (int num : nums) {
            int sum = 0;
            int copy = num;

            while (copy > 0) {
                sum += copy % 10;
                copy /= 10;
            }

            if (seen[sum] != 0) {
                result = Math.max(result, num + seen[sum]);
                seen[sum] = Math.max(seen[sum], num);
            } else {
                seen[sum] = num;
            }
            
        }

        return result;
    }
}
