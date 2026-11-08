class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int copy = n;

        while (copy > 0) {
            sum += copy % 10;
            prod *= copy % 10;
            copy /= 10;
        }

        return n % (prod + sum) == 0;
    }
}
