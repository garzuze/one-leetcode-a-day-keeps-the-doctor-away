class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        int len = s.length();
        int partition = len / 2;

        for (int i = 0; i < partition; i++) {
            freq[s.charAt(i) - 'a'] += 1;
        }

        StringBuilder left = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char ch = (char) (i + 'a');
                left.append(String.valueOf(ch).repeat(freq[i]));
            }
        }
    
        String middle = len % 2 != 0 ? String.valueOf(s.charAt(partition)) : "";

        return left.toString() + middle + left.reverse().toString();
    }
}
