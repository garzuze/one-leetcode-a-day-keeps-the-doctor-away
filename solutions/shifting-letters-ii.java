class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] diff = new int[n];

        for (int[] sh : shifts) {
            int d = sh[2];

            if (d == 1) {
                diff[sh[0]]++;
                if (sh[1] + 1 < n) {
                    diff[sh[1] + 1]--;
                }
            } else {
                diff[sh[0]]--;
                if (sh[1] + 1 < n) {
                    diff[sh[1] + 1]++;
                }
            }
        }

        int acc = 0;

        for (int i = 0; i < n; i++) {
            acc = (acc + diff[i]) % 26;
            chars[i] = shift(chars[i], acc);
        }

        return new String(chars);
    }

    private char shift(char ch, int i) {
        if (i < 0) i += 26;
        return (char)(((ch + i - 'a') % 26) + 'a');
    }
}
