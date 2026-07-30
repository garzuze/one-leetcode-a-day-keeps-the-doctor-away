class Solution {
    public int minimumPushes(String word) {
        int length = word.length();
        int result = 0;

        for (int i = 0; i < length; i++) {
            result += i / 8 + 1;
        }

        return result;
    }
}
