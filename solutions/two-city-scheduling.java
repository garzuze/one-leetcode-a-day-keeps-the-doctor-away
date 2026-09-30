import java.util.Arrays;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        int total = 0;
        int[] refund = new int[n];

        for (int i = 0; i < n; i++) {
            total += costs[i][0];
            refund[i] = costs[i][1] - costs[i][0];
        }

        Arrays.sort(refund);

        for (int i = 0; i < n / 2; i++) {
            total += refund[i];
        }

        return total;
    }
}
