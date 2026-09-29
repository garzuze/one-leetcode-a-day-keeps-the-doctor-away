class Solution {
    public int partitionString(String s) {
        int count = 0;
        char[] str = s.toCharArray();
        int i = 0;
        int[] seen = new int[26];

        while (i < str.length){
            if (seen[str[i] - 'a'] == 0) {
                seen[str[i] - 'a']++;
            } else {
                count++;
                seen = new int[26];
                seen[str[i] - 'a']++;
            }
            i++;
        }

        return count + 1;
    }
}
