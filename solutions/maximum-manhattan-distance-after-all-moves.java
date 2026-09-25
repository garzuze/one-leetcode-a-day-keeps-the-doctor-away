class Solution {
    public int maxDistance(String moves) {
        int[] count = new int[26];
        int var = 0;

        for (char m : moves.toLowerCase().toCharArray()) {
            if (m != '_') {
                count[m - 'a']++;
            } else {
                var++;
            }
        }

        int x = count['r' - 'a'] - count['l' - 'a'];
        int y = count['u' - 'a'] - count['d' - 'a'];

        return Math.abs(x) + Math.abs(y) + var;
    }
}
