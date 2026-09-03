class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        char[] search = searchWord.toCharArray();
        int idx = 0;

        for (String word : words) {
            idx++;

            if (word.length() < search.length) {
                continue;
            }
            
            boolean isPrefix = true;
            
            for (int i = 0; i < search.length; i++) {
                if (word.charAt(i) != search[i]) {
                    isPrefix = false;
                    break;
                }
            }
            
            if (isPrefix) {
                return idx;
            }
        }

        return -1;
    }
}
