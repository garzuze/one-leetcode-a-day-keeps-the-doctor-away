import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int len = n / 3;
        int[][] result = new int[len][3];

        for (int i = 0; i < len; i++) {
            int j = 0;

            if (nums[(j + (3 * i)) + 2] - nums[j + (3 * i)] > k) {
                return new int[][]{};
            }
            
            while (j < 3) {
                int rel = j + (3 * i);
                result[i][j] = nums[rel];
                if (i < len - 1 ) {
                    result[i + 1][j] = nums[rel + 3];
                }
                j++;
            }
        }

        return result;
    }

}
