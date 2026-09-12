import java.util.Arrays;

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int k = 0;
            for (int j = i; j < n; j++) {
                sum += satisfaction[j] * (k + 1);
                k++;
            }

            max = Math.max(max, sum);
        }

        return max > 0 ? max : 0;
    }
}
