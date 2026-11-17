class Solution {
    public long minCost(String s, int[] cost) {
        long sum = 0L;
        long[] count = new long[26];
        char[] chars = s.toCharArray();
        long result = Long.MAX_VALUE;

        for (int i = 0; i < chars.length; i++) {
            count[chars[i] - 'a'] += cost[i];
            sum += cost[i];
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0L) {
                continue;
            }

            result = Math.min(result, sum - count[i]);
        }

        return result;
    }
}
