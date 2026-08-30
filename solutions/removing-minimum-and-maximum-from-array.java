import java.util.Deque;
import java.util.ArrayDeque;


class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Deque<Integer> deque = new ArrayDeque<>();

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            deque.addLast(n);
        }

        int result = 0;
        Deque<Integer> copy = new ArrayDeque<>(deque);
        boolean gotMin = false;
        boolean gotMax = false;

        while (!copy.isEmpty()) {
            int front = copy.removeFirst();
            result++;
            
            if (front == min) {
                gotMin = true;
            } else if (front == max) {
                gotMax = true;
            }

            if (gotMin && gotMax) {
                break;
            }

        }

        copy = new ArrayDeque<>(deque);
        int resultTwo = 0;
        gotMin = false;
        gotMax = false;

        while (!copy.isEmpty()) {
            int back = copy.removeLast();
            resultTwo++;
            
            if (back == min) {
                gotMin = true;
            } else if (back == max) {
                gotMax = true;
            }

            if (gotMin && gotMax) {
                break;
            }

        }
        
        copy = new ArrayDeque<>(deque);
        int resultThree = 0;
        gotMin = false;
        gotMax = false;
        boolean frontOk = false;
        boolean backOk = false;

        while (!copy.isEmpty()) {
            if (gotMin && gotMax) {
                break;
            }

            if (!frontOk) {
                int front = copy.removeFirst();
                
                resultThree++;
                if (front == min) {
                    gotMin = true;
                    frontOk = true;
                } else if (front == max) {
                    gotMax = true;
                    frontOk = true;
                }
            }


            if ((gotMin && gotMax) || copy.isEmpty()) {
                break;
            }

            if (!backOk) {
                int back = copy.removeLast();
                resultThree++;
                if (back == min) {
                    gotMin = true;
                    backOk = true;
                } else if (back == max) {
                    gotMax = true;
                    backOk = true;
                }

            }
        }

        return Math.min(result, Math.min(resultTwo, resultThree));
    }
}
