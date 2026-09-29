class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int len = 0;
        char[] str = s.toCharArray();
        int[] seen = new int[128];

        while (r < str.length) {
            if (seen[str[r]] == 0) {
                seen[str[r]]++;
                r++;
                len = Math.max(len, r - l);
            } else {
                seen[str[l]]--;
                l++;
            }
        }

        return len;
    }
}
