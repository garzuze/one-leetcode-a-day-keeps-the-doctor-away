class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int count = 0;

        for (int n : nums) {
            if (n >= 0) {
                count++;
            }
        }

        int[] positive = new int[count];

        int i = 0;

        for (int n : nums) {
            if (n >= 0) {
                positive[Math.floorMod(i - k, count)] = n;
                i++;
            }
        }

        i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] >= 0) {
                nums[j] = positive[i];
                i++;
            }
        }

        return nums;
    }
}
