import java.util.Arrays;



class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int opt1 = nums[n -1] * nums[n - 2] * nums[n - 3];
        int opt2 = nums[0] * nums[1] * nums[n -1];

        return (opt1 > opt2) ? opt1 : opt2;
    }
}
