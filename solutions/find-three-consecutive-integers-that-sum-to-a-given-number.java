class Solution {
    public long[] sumOfThree(long num) {
        long base = num / 3;
        
        if (base - 1 + base + base + 1 == num) {
            return new long[] {base - 1, base, base + 1};
        }

        return new long[] {};
    }
}
