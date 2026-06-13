class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int sum = 0;

            for (int i  = 0; i < word.length(); i++) {
                sum += weights[word.charAt(i) - 'a'];
            }

            int op = sum % 26;
            result.append((char) ('z' - op));
        }

        return result.toString();
    }
}
