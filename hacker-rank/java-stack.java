import java.util.*;
class Solution{
    public static boolean isValid(String s) {
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

    static char getCorresponding(char c) {
        if (c == ')') return '(';
        if (c == ']') return '[';
        return '{';
    }
    
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(isValid(input));
		}
		
	}
}
