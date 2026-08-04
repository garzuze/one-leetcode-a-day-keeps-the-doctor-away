import java.util.Deque;
import java.util.ArrayDeque;


class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque();

        for (String op : operations) {
            switch (op) {
                case "+":
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(second);
                    stack.push(first);
                    stack.push(first + second);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
            System.out.println(stack);
        }
        
        int result = 0;

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
