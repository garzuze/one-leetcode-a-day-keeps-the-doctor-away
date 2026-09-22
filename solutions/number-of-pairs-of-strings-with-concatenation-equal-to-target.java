import java.util.Map;
import java.util.HashMap;

class Solution {
    public int numOfPairs(String[] nums, String target) {
        Map<String, Integer> count = new HashMap<>();
        int result = 0;

        for (String n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for (String n : nums) {
            if (target.startsWith(n)) {
                String suffix = target.substring(n.length());

                result += count.getOrDefault(suffix, 0);

                if (n.equals(suffix)) {
                    result--;
                }
            }
        }

        return result;
    }
}
