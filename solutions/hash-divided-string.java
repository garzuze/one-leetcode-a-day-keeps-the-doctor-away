class Solution {
    public String stringHash(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += k) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += (int) s.charAt(j) - 'a';
            }

            result.append((char) (sum % 26 + 'a'));
        }


        return result.toString();
    }
}
