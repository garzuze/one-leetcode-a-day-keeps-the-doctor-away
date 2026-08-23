import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> result = new ArrayList<>(nums.length);
        Map<Integer, Integer> count = new HashMap<>(nums.length);
        
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (
                entry.getValue() == 1 && 
                !count.containsKey(entry.getKey() - 1) && 
                !count.containsKey(entry.getKey() + 1)
                ) {
                    result.add(entry.getKey());
            }
        }

        return result;
    }
}
