class Solution {
    public int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        result[0] = pref[0];
        
        for (int i = pref.length - 1; i > 0; i--) {
            result[i] = pref[i] ^ pref[i - 1];
        }

        return result;
    }
}
