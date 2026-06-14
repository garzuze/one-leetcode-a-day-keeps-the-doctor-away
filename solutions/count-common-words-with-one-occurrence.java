import java.util.Map;
import java.util.HashMap;


class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> countOne = new HashMap<>();
        Map<String, Integer> countTwo = new HashMap<>();
        int result = 0;

        for (String word : words1) {
            countOne.put(word, countOne.getOrDefault(word, 0) + 1);
        }
        
        for (String word : words2) {
            countTwo.put(word, countTwo.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countOne.entrySet()) {
            if (entry.getValue() == 1 && countTwo.getOrDefault(entry.getKey(), 0) == 1) {
                result += 1;
            }
        }

        return result;
    }
}
