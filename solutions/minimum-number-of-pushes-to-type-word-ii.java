import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;



class Solution {
    public int minimumPushes(String word) {
        int result = 0;
        Map<Character, Integer> count = new HashMap<>(word.length());
        int free = 8;
        int acc = 1;

        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);
            count.put(curr, count.getOrDefault(curr, 0) + 1);
        }

        List<Character> sortedKeys = new ArrayList<>(count.keySet());
        sortedKeys.sort((a, b) -> count.get(b).compareTo(count.get(a)));

        for (Character key : sortedKeys) {
            result += acc * count.get(key);
            free --;
            
            if (free == 0) {
                acc++;
                free = 8;
            }
        }

        return result;
    }
}
