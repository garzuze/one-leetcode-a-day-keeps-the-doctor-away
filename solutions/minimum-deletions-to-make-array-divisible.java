class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd = numsDivide[0];

        for (int num : numsDivide) {
            gcd = getGcd(gcd, num);
        }

        int minGcd = Integer.MAX_VALUE;

        for (int num : nums) {
            if (gcd % num == 0) {
                minGcd = Math.min(minGcd, num);
            }
        }

        if (minGcd == Integer.MAX_VALUE) {
            return -1;
        }

        int result = 0;

        for (int num : nums) {
            if (num < minGcd) {
                result++;
            }
        }

        return result;
    }

    private int getGcd(int a, int b) {
        if (a > b)  return getGcd(b, a);
        if (b % a == 0)
            return a;
        return getGcd(b % a, a);
    }
}