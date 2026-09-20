import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int mirrorFrequency(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> count = new HashMap<>();

        for (char c : chars) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        int result = 0;

        Set<Character> seen = new HashSet<>();

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            char k = entry.getKey();
            char mirror;

            if (k >= '0' && k <= '9') {
                mirror = (char) ('9' - (k - '0'));
            } else {
                mirror = (char) ('z' - (k - 'a'));
            }

            if (!seen.contains(k) && !seen.contains(mirror)) {
                int countChar = entry.getValue();
                int countMirror = count.getOrDefault(mirror, 0);

                int diff = Math.abs(countChar - countMirror);
                seen.add(k);
                seen.add(mirror);
                result += diff;
            }
        }

        return result;
    }
}
