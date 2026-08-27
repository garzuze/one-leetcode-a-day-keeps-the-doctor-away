import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int n : arr) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> asc = new ArrayList<>(count.entrySet());

        asc.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));
        
        int result = count.size();

        for (Map.Entry<Integer, Integer> e : asc) {
            int key = e.getKey();
            while (k > 0 &&  count.get(key) > 0) {
                count.put(key, count.get(key) - 1);
                k--;
            }

            if (count.get(key) == 0) {
                result--;
            }
        }

        return result;
    }
}
