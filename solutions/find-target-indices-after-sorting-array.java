import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int countSmaller = 0;
        int countTarget = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                countSmaller++;
            } else if (nums[i] == target) {
                countTarget++;
            }
        }

        List<Integer> result = new ArrayList<>(countTarget);

        for (int i = countSmaller; i < countSmaller + countTarget; i++) {
            result.add(i);
        }

        return result;
    }
}
