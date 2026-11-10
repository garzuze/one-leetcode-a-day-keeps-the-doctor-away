class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] cost = new int[n + 1];
        cost[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            cost[i] = costs[i - 1];
        }

        int[] dp = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            if (i == 1) {
                dp[i] = cost[i] + (int) Math.pow((i - (i - 1)), 2);
            } else if (i == 2) {
                dp[i] = Math.min(
                    cost[i] + dp[i - 1] + (int) Math.pow((i - (i - 1)), 2),
                    cost[i] + dp[i - 2] + (int) Math.pow((i - (i - 2)), 2)
                );
            } else {
                int one = cost[i] + dp[i - 1] + (int) Math.pow((i - (i - 1)), 2);
                int two = cost[i] + dp[i - 2] + (int) Math.pow((i - (i - 2)), 2);
                int three = cost[i] + dp[i - 3] + (int) Math.pow((i - (i - 3)), 2);
                dp[i] = Math.min(Math.min(one, two), three);
            }
        }

        return dp[n];
    }
}
