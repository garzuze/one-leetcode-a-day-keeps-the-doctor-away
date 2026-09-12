class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        char[] word = s.toCharArray();

        int j = 0;

        for (int i = 0; i < word.length; i++) {
            if (j < spaces.length && spaces[j] == i) {
                result.append(" ");
                j++;
            }
            result.append(word[i]);
        }

        return result.toString();
    }
}
