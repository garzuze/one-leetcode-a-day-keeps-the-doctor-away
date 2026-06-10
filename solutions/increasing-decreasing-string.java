class Solution {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int[] count = new int[26];

        for (char c : chars) {
            count[c - 'a']++;
        }

        while (s.length() > sb.length()) {
            for (int i = 0; i < count.length; i++) {
                if (count[i] > 0) {
                    sb.append((char) (i + 'a'));
                    count[i]--;
                }
            }

            for (int i = count.length - 1; i >= 0; i--) {
                if (count[i] > 0) {
                    sb.append((char) (i + 'a'));
                    count[i]--;
                }
            }
        }


        return sb.toString();
    }
}
