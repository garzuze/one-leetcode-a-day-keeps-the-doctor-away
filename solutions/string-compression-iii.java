class Solution {
    public String compressedString(String word) {
        StringBuilder result = new StringBuilder();
        char[] wordChar = word.toCharArray();

        int i = 0;

        while (i < wordChar.length) {
            int j = 1;
            char curr = wordChar[i];
            
            while (i < wordChar.length - 1 && wordChar[i + 1] == curr && j < 9) {
                j++;
                i++;
            }

            result.append(j);
            result.append(curr);
            i++;
        }

        return result.toString();
    }
}
