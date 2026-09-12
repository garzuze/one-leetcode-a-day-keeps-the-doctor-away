import java.util.Map;
import java.util.HashMap;

class Solution {
    public int minSetSize(int[] arr) {
        int target = arr.length / 2;
        Map<Integer, Integer> count = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int result = 0;

        for (int n : arr) {
            count.put(n, count.getOrDefault(n, 0) + 1);
            max = Math.max(max, count.get(n));
        }

        int[] freqs = new int[max + 1];

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freqs[entry.getValue()]++;
        }
        
        while (max >= 0 && target > 0) {
            target -= max;
            freqs[max]--;
            result++;
            
            while (max > 0 && freqs[max] == 0) {
                max--;
            }
        }

        return result;
    }
}
