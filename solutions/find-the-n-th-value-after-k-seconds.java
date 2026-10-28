class Solution {
    private final static int MOD = 1000000007;

    public int valueAfterKSeconds(int n, int k) {
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }

        for (int i = 1; i <= k; i++) {
            long sum = 0L;
            for (int j = 0; j < n; j++) {
                sum = (sum + arr[j]) % MOD;
                arr[j] = sum;
            }
        }

        return (int) (arr[n - 1] % MOD);
    }
}
