class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int result = 0;

        for (int i = 1; i < n -1; i++) {
            int s = 0;
            int g = 0;
            
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    s++;
                }
            }
            
            for (int j = i + 1; j < n; j++) {
                if (rating[j] > rating[i]) {
                    g++;
                }
            }

            result += s * g;
            
            s = 0;
            g = 0;

            for (int j = 0; j < i; j++) {
                if (rating[j] > rating[i]) {
                    g++;
                }
            }
            
            for (int j = i + 1; j < n; j++) {
                if (rating[j] < rating[i]) {
                    s++;
                }
            }

            result += s * g;
        }

        return result;
    }
}
