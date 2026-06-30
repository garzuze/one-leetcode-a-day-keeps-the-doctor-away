import java.util.HashMap;
import java.util.Map;


class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> count = new HashMap<>(3);
        int left = 0;
        int right = 0;
        int result = 0;

        while (right < s.length()) {
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0) + 1);
            
            while (hasAll(count)) {
                count.put(
                    s.charAt(left),
                    count.get(s.charAt(left)) - 1
                );

                result += s.length() - right;
                left++;
            }

            right++;
        }
        
        return result;
    }

    private boolean hasAll(HashMap<Character, Integer> count) {
        if (count.size() < 3) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == null || entry.getValue() <= 0) {
                return false;
            }
        }

        return true;
    }
}
