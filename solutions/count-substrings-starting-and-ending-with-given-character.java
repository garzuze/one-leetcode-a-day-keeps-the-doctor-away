class Solution {
    public long countSubstrings(String s, char c) {
        char[] chars = s.toCharArray();
        long result = 0L;
        long count = 0L;

        for (char ch : chars) {
            if (ch == c) {
                count++;
                result += count;
            }
        }

        return result;
    }
}
