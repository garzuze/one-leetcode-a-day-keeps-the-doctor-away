import java.util.Set;
import java.util.HashSet;

class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> unique = new HashSet<>();

        for (char ch : s.toCharArray()) {
            unique.add(ch);
        }

        return unique.size();
    }
}
