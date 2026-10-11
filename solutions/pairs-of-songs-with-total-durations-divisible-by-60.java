class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int target = 60;
        int[] remainder = new int[target];
        int result = 0;

        for (int t : time) {
            result += remainder[(60 - t % 60) % 60];
            remainder[t % 60]++;
        }

        return result;
    }
}
