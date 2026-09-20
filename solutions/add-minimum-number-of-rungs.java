class Solution {
    public int addRungs(int[] rungs, int dist) {
        int n = rungs.length;
        int result = 0;

        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (pos + dist < rungs[i]) {
                int gap = rungs[i] - pos;
                int missing = gap / dist;

                if (gap % dist == 0) {
                    missing--;
                }

                result += missing;
            }

            pos = rungs[i];
        }

        return result;
    }
}
