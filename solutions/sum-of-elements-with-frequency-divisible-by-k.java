import java.util.Map;
import java.util.HashMap;


class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() % k == 0) {
                result += entry.getKey() * entry.getValue();
            }
        }

        return result;

    }
}
