class Solution {
    public int longestContinuousSubstring(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int curr = 1;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1] - 1) {
                curr++;
            } else {
                result = Math.max(result, curr);
                curr = 1;
            }
        }

        result = Math.max(result, curr);

        return result;
    }
}
