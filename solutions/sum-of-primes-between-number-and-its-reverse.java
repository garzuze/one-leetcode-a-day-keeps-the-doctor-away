class Solution {
    public int sumOfPrimesInRange(int n) {
        int copy = n;
        int reversed = 0;
        int result = 0;

        while (copy != 0) {
            int digit = copy % 10;
            reversed = reversed * 10 + digit;
            copy /= 10;
        }

        int start = Math.min(n, reversed);
        int end = Math.max(n, reversed);

        if (start == end) {
            if (isPrime(start)) return start;
        }

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                result += i;
            }
        }

        return result;
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
