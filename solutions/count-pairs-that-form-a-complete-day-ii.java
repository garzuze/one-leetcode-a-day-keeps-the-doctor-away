class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long result = 0L;
        int[] count = new int[24];

        for (int h : hours) {
            result += count[h % 24];
            count[(24 - h % 24) % 24]++;
        }

        return result;
    }
}
