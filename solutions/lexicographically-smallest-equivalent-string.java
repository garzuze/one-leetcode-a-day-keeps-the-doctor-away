import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

// TODO: check union-find approach and refactor this
class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        Map<Character, List<Character>> group = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char s1Char = s1.charAt(i);
            char s2Char = s2.charAt(i);

            group.computeIfAbsent(s1Char, x -> new ArrayList<>()).add(s2Char);
            group.computeIfAbsent(s2Char, x -> new ArrayList<>()).add(s1Char);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : baseStr.toCharArray()) {
            boolean[] visited = new boolean[26];
            char min = dfs(group, ch, visited);
            result.append(min);
        }

        return result.toString();
    }

    private char dfs(Map<Character, List<Character>> group, char ch, boolean[] visited) {
        visited[ch - 'a'] = true;
        char min = ch;

        for (char neighbor : group.getOrDefault(ch, new ArrayList<>())) {
            if (!visited[neighbor - 'a']) {
                char candidate = dfs(group, neighbor, visited);
                if (candidate < min) {
                    min = candidate;
                }
            }
        }

        return min;
    }
}
