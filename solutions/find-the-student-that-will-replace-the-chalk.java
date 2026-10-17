class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        if (chalk.length == 1) return 0;
        
        int n = chalk.length;
        long sum = 0L;
        
        for (int c : chalk) {
            sum = (long) (sum + c);
        }

        k %= sum;

        for (int i = 0; i < n; i++) {
            if (chalk[i] > k) {
                return i;
            }
            k -= chalk[i];
        }

        return 0;
    }
}
