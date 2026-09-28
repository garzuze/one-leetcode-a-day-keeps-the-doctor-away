import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;

class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        TreeMap<String, Integer> count = new TreeMap<>(Collections.reverseOrder());
        int max = 0;
        for (int i = 0; i < senders.length; i++) {
            count.put(senders[i], count.getOrDefault(senders[i], 0) + messages[i].split(" ").length);
            max = Math.max(max, count.get(senders[i]));
        }

        for (Map.Entry<String, Integer> e : count.entrySet()) {
            if (e.getValue() == max) {
                return e.getKey();
            }
        }
        return count.firstKey();
    }
}
