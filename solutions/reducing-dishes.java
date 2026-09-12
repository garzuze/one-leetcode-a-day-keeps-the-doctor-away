import java.util.Arrays;

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int acc = 0;
        int result = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            acc += satisfaction[i];
            
            if (acc <= 0) {
                break;
            }

            result += acc;
        }


        return result;
    }
}
