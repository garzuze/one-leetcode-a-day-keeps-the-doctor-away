import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;


class Solution {
    public long maximumMedianSum(int[] nums) {
        long result = 0;
        Arrays.sort(nums);

        if (nums.length == 3) {
            return nums[1];
        }

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            deque.addLast(nums[i]);
        }

        while (!deque.isEmpty()) {
            deque.removeFirst();
            deque.pollLast();
            result += deque.pollLast();
        }

        return result;
    }
}
