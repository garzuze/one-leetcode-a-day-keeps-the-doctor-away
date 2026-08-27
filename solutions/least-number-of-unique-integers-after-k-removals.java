import java.util.Map;
import java.util.HashMap;


class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int n : arr) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        int[] freqMap = new int[arr.length + 1];

        for (int f : count.values()) {
            freqMap[f]++;
        }

        int result = count.size();

        for (int freq = 1; freq < freqMap.length; freq++) {
            if (k < freq) {
                break;
            }

            int take = Math.min(freqMap[freq], k / freq);
            k -= take * freq;
            result -= take;
        }

        return result;
    }
}
