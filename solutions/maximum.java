class Solution {
    public int maxVowels(String s, int k) {
        int curr = 0;
        char[] chs = s.toCharArray();
        int left = 0;
        int right = 0;
        int result = 0;

        while (right < chs.length) {
            int len = (right - left) + 1;
            
            if (isVowel(chs[right])) {
                curr++;
            }

            if (len == k) {
                result = Math.max(curr, result);
                if (isVowel(chs[left])) {
                    curr--;
                }
                left++;
            }


            right++;
        }
        
        return result;
    }

    private boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}