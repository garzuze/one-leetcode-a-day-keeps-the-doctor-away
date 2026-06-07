import java.util.Map;
import java.util.HashMap;

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;

        for (int i = lowLimit; i < highLimit + 1; i++) {
            int temp = i;
            int acc = 0;

            while (temp > 0) {
                acc += temp % 10;
                temp /= 10;
            }

            count.put(acc, count.getOrDefault(acc, 0) + 1);
            result = Math.max(result, count.get(acc));
        }

        return result;
    }
}
