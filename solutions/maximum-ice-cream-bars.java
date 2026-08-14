import java.util.Arrays;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int result = 0;
        Arrays.sort(costs);

        for (int cost : costs) {
            if (coins  - cost >= 0) {
                coins -= cost;
                result++;
            } else {
                break;
            }
        }

        return result;
    }
}