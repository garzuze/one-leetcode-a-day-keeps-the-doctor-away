class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int j = 0;
        int sum = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int win_len = (i - j) + 1;
            sum += arr[i];

            if (win_len == k) {
                if (sum / k >= threshold) {
                    result++;
                }
                sum -= arr[j];
                j++;
            }
        }

        return result;
    }
}
