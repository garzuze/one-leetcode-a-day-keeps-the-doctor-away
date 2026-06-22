import java.util.HashMap;

class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        for (int j = 0; j < t.length(); j++) {
            result += Math.abs(map.get(t.charAt(j)) - j);
        }

        return result;
    }
}
