class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int len = nums.length;
        if (len == 1) return 1;

        int[] count = new int[2001];
        int target = 0;
        int result = 0;
        int unique = 0;

        for (int n : nums) {
            if (count[n] == 0) {
                target++;
            }
            count[n]++;
        }

        count = new int[2001];
        
        for (int l = 0, r = 0; r < len; r++) {
            count[nums[r]]++;

            if (count[nums[r]] == 1) {
                unique++;
            }

            while (unique == target) {
                result += len - r;
                count[nums[l]]--;

                if (count[nums[l]] == 0) {
                    unique--;
                }
 
                l++;
            }
        }

        return result;
    }
}
