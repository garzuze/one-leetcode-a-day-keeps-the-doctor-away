import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] count = new int[100001];
        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            if (count[winner] == 0) {
                count[winner] = -1;
            }

            if (count[loser] == -1) {
                count[loser] = 1;
            } else {
                count[loser]++;
            }
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] == -1) {
                zeroLoss.add(i);
            }

            if (count[i] == 1) {
                oneLoss.add(i);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(zeroLoss);
        result.add(oneLoss);

        return result;
    }
}
