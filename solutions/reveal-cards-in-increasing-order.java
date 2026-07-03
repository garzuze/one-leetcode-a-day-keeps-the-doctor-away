import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;


class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] result = new int[deck.length];
        Deque<Integer> idxs = new LinkedList<>();

        Arrays.sort(deck);

        for (int i = 0; i < deck.length; i++) {
            idxs.add(i);
        }

        for (int card : deck) {
            int idx = idxs.poll();
            result[idx] = card;

            if (!idxs.isEmpty()) {
                idxs.add(idxs.poll());
            }
        }

        return result;
    }
}
