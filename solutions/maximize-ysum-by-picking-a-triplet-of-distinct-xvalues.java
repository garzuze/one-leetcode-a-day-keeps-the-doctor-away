import java.util.Map;
import java.util.HashMap;

class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < x.length; i++) {
            map.merge(x[i], y[i], Math::max);
        }

        if (map.size() < 3) {
            return -1;
        }

        int first = -1;
        int second = -1;
        int third = -1;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > first) {
                third = second;
                second = first;
                first = e.getValue();
            } else if (e.getValue() > second) {
                third = second;
                second = e.getValue();
            } else if (e.getValue() > third) {
                third = e.getValue();
            }
        }

        return first + second + third;
    }
}
