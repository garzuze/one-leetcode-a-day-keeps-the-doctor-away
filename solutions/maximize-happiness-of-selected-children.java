import java.util.Arrays;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int dec = 0;
        int n = happiness.length;
        long result = 0L;

        for (int i = n - 1; i >= 0 && k > 0 && happiness[i] - dec > 0; i--) {
            if (k > 0 && happiness[i] - dec > 0) {
                result += happiness[i] - dec;
                k--;
                dec++;
            }
        }

        return result;
    }
}
