class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int target = 0;
        StringBuilder result = new StringBuilder(words[0]);

        for (char ch : words[0].toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                target++;
            }
        }

        for (int i = 1; i < words.length; i++) {
            result.append(" ");
            int count = 0;
            for (char ch : words[i].toCharArray()) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            if (count == target) {
                result.append(new StringBuilder(words[i]).reverse());
            } else {
                result.append(words[i]);
            }

        }

        return result.toString().trim();
    }
}
