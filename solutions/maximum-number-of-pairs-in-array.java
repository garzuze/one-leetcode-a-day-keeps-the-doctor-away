import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        int left = 0;
        int pairs = 0;

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            left += entry.getValue() % 2;
            pairs += entry.getValue() / 2;
        }

        return new int[] {pairs, left};
    }
}
