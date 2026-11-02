class Solution {
    public boolean completePrime(int num) {  
        if (!isPrime(num % 10)) return false;
        int acc = 0;
        int i = 0;

        while (num > 0) {
            int n = num % 10;
            acc += n * (int) Math.pow(10, i);
            if (!isPrime(acc)) return false;
            if (!isPrime(num)) return false;
            num /= 10;
            i++;
        }

        return true;
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
