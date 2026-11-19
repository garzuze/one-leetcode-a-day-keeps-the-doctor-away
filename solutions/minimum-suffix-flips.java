class Solution {
    public int minFlips(String target) {
        int flips = 0;
        char curr = '0';

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != curr) {
                flips++;
            }
            curr = flips % 2 == 1 ? '1' : '0';
        }
        

        return flips;
    }
}
