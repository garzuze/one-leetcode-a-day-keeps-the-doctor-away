class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        long acc = 0L;

        for (int i = n - 1; i >= 0; i--) {
            acc += shifts[i];
            chars[i] = shift(chars[i], acc);
        }

        return new String(chars);

    }

    private char shift(char ch, long i) {
        return (char)(((ch + i - 'a') % 26) + 'a');
    }
}
