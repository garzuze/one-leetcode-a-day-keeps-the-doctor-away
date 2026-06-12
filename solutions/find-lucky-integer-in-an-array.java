import java.util.Map;
import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                result = Math.max(result, entry.getValue());
            }
        }

        return result;

    }
}
