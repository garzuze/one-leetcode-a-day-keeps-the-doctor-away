import java.util.Map;
import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;

        for (int n : nums) {
            int target = k - n;

            if (count.containsKey(target)) {
                result++;
                if (count.get(target) == 1) {
                    count.remove(target);
                } else {
                    count.put(target, count.get(target) - 1);
                }
            } else {
                count.put(n, count.getOrDefault(n, 0) + 1);
            }
        }

        return result;
    }
}
