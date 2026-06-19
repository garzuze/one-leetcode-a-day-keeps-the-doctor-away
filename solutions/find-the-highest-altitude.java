class Solution {
    public int largestAltitude(int[] gain) {
        int[] newOne = new int[gain.length + 1];
        int result = 0;
        newOne[0] = 0;
        
        for (int i = 1; i < newOne.length; i++) {
            newOne[i] = newOne[i - 1] + gain[i - 1];
            result = Math.max(result, newOne[i]);
        }

        return result;
    }
}
