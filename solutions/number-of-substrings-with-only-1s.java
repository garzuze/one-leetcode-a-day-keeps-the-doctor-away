class Solution {
    private final static int MOD = 1000000007;
    public int numSub(String s) {
        long result = 0L;
        long count = 0L;
        char[] chars = s.toCharArray();
        int i = 0;

        while (i < chars.length) {
            while (i < chars.length && chars[i] == '1') {
                count++;
                result = (result + count) % MOD;
                i++;
            }
            count = 0L;
            i++;
        }

        int finalResult = (int) result % MOD;

        return finalResult;
    }
}
