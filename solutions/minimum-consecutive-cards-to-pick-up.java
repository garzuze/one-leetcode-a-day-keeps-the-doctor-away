class Solution {
    public int minimumCardPickup(int[] cards) {
        int result = Integer.MAX_VALUE;
        int size = Integer.MIN_VALUE;

        for (int i = 0; i < cards.length; i++) {
            size = Math.max(size, cards[i]);
        }

        int[] lastSeen = new int[size + 1];

        for (int i = 0; i < cards.length; i++) {
            lastSeen[cards[i]] = -1;
        }

        for (int i = 0; i < cards.length; i++) {
            if (lastSeen[cards[i]] == -1) {
                lastSeen[cards[i]] = i;
            } else {
                result = Math.min(result, i - lastSeen[cards[i]] + 1);
                lastSeen[cards[i]] = i;
            }
        }

        if (result == Integer.MAX_VALUE) {
            return -1;
        }

        return result;
    }
}
