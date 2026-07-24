import java.util.Map;
import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int max = 0;

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            max = Math.max(freq.get(num), max);
        }

        int result = 0;

        for (Integer f : freq.values()) {
            if (f.equals(max)) {
                result++;
            }
        }

        return result * max;
    }
}
