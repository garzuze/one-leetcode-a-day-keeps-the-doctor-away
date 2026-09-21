import java.util.Arrays;

class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int m = ((n - 1) / 2);
        int centre = arr[m];

        int[] diffs = new int[n];
        int[] map = new int[Math.abs(arr[n - 1] - centre) + 1];

        for (int i = 0; i < n; i++) {
            diffs[i] = Math.abs(arr[i] - centre);
        }
        
        int[] result = new int[k];

        n--;
        int j = 0;
        for (int i = 0; i < k; i++) {
            int chosen = 0;
            
            if (diffs[n] == diffs[j]) {
                chosen = arr[n] > arr[j] ? n : j;
            } else {
                chosen = diffs[n] > diffs[j] ? n : j;
            }

            result[i] = arr[chosen];
            diffs[chosen] = 0;

            if (chosen == n) {
                n--;
            } else {
                j++;
            }
        }

        return result;
    }
}
