class Solution {
    public long splitArray(int[] nums) {
        long a = 0;
        long b = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(i)) {
                a += nums[i];
            } else {
                b += nums[i];
            }
        }

        return Math.abs(a - b);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int i = 5;

        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;

        }

        return true;
    }
}
