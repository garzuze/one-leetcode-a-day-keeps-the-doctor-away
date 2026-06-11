import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        
        int min = nums[0];
        int max = nums[nums.length - 1];
        List<Integer> result = new ArrayList<>();

        int j = 0;

        for (int i = min; i < max; i++) {
            if (j < nums.length && nums[j] != i) {
                result.add(i);
                j--;
            }

            j ++;
        }

        return result;
    }
}
