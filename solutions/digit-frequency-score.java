import java.util.Map;
import java.util.HashMap;


class Solution {
    public int digitFrequencyScore(int n) {
        String nString = String.valueOf(n);
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;

        for (int i = 0; i < nString.length(); i++) {
            int num = nString.charAt(i) - '0';
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            result += entry.getKey() * entry.getValue();
        }

        return result;
    }
}
