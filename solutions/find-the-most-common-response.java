import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String, Integer> count = new TreeMap<>();
        int max = 0;

        for (List<String> list : responses) {
            Set<String> seen = new HashSet<>();
            for (int i = 0; i < list.size(); i++) {
                if (!seen.contains(list.get(i))) {
                    count.put(list.get(i), count.getOrDefault(list.get(i), 0) + 1);
                    seen.add(list.get(i));
                }
                max = Math.max(max, count.get(list.get(i)));
            }
        }

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() == max) {
                return entry.getKey();
            }
        }

        return "ok";
    }
}
