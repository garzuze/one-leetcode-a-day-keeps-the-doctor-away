import java.util.Arrays;


class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int result = 0;
        int[] diff = new int[rocks.length];

        for (int i = 0; i < rocks.length; i++) {
            diff[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(diff);

        for (int i = 0; i < diff.length; i++) {
            if (additionalRocks >= diff[i]) {
                additionalRocks -= diff[i];
                result++;
            } else {
                break;
            }
        }

        return result;
    }
}
