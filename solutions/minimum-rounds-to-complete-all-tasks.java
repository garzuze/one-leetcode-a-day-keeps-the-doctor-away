import java.util.Map;
import java.util.HashMap;

class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;

        for (int t : tasks) {
            count.put(t, count.getOrDefault(t, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            if (e.getValue() == 1) return -1;
            if (e.getValue() == 2) result++;
            if (e.getValue() == 3) result++;
            if (e.getValue() > 3) {
                result += (e.getValue() + 2) / 3;
            }
        }

        return result;
    }
}
