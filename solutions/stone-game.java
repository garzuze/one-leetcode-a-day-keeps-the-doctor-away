import java.util.Deque;
import java.util.ArrayDeque;


class Solution {
    public boolean stoneGame(int[] piles) {
        Deque<Integer> queue = new ArrayDeque<>(piles.length);

        for (int p : piles) {
            queue.add(p);
        }

        int first = 0;
        int last = 0;
        int alice = 0;
        int bob = 0;

        while (!queue.isEmpty()) {
            first = queue.getFirst();
            last = queue.getLast();

            if (first >= last) {
                alice += queue.removeFirst();
                bob += queue.removeLast();
            } else {
                alice += queue.removeLast();
                bob += queue.removeFirst();
            }
        }


        return alice > bob;
    }
}
