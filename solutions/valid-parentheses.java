import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        char[] f = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : f) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty() || stack.poll() != getCorresponding(ch)) {
                return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private char getCorresponding(char c) {
        if (c == ')') return '(';
        if (c == ']') return '[';
        return '{';
    }
}
