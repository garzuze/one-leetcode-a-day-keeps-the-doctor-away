class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        int result = 0;

        while (right < chars.length) {
            count[chars[right] - 'a']++;

            while (hasAll(count)) {
                count[chars[left] - 'a']--;
                result += chars.length - right;
                left++;
            }

            right++;
        }
        
        return result;
    }

    private boolean hasAll(int[] count) {
        if (count.length < 3) {
            return false;
        }

        for (int c : count) {
            if (c == 0) {
                return false;
            }
        }

        return true;
    }
}
