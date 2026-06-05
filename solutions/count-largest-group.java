import java.util.Map;
import java.util.HashMap;


class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> count = new HashMap<>();
        int maxFreq = 0;

        for (int i = 1; i <= n; i ++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            count.put(sum, count.getOrDefault(sum, 0) + 1);
            maxFreq = Math.max(count.get(sum), maxFreq);
        }

        int result = 0;

        for (Integer freq : count.values()) {
            if (freq == maxFreq) {
                result += 1;
            }
        }

        return result;

    }
}
