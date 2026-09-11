class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                for (int j = nums.length - 1; j >= 0; j--) {
                    if (isPrime(nums[j])) {
                        return j - i;
                    }
                }
            }
        }

        return 0;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i < (int) Math.sqrt(n) + 1; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
