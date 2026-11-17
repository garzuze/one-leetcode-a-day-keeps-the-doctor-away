class Solution {
    public long minCost(String s, int[] cost) {
        boolean[] seen = new boolean[26];
        char[] chars = s.toCharArray();
        long result = Long.MAX_VALUE;
        int uniqueCount = 0;

        for (char ch : chars) {
            if (!seen[ch - 'a']) {
                seen[ch - 'a'] = true;
                uniqueCount++;
            }
        }

        if (uniqueCount == 1) {
            return 0L;
        }

        for (int i = 0; i < seen.length; i++) {
            if (!seen[i]) {
                continue;
            }

            char ch = (char) (i + 'a');
            long curr = 0L;

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] != ch) {
                    curr += cost[j];
                }
            }

            result = Math.min(result, curr);
        }

        return result;
    }
}
