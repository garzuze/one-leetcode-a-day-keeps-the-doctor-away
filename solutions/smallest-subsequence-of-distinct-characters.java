import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public String smallestSubsequence(String s) {
        int[] lastSeen = new int[26];
        int[] used = new int[26];
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            lastSeen[index] = i;
            used[index] = 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';

            if (used[index] == 1) {
                continue;
            }

            while (!stack.isEmpty() && c < stack.peek() && lastSeen[index] >= i && lastSeen[stack.peek() - 'a'] > i) {
                char removed = stack.pop();
                used[removed - 'a'] = 0;
            }
            stack.push(c);
            used[index] = 1;

        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}
