import java.util.Arrays;

class Solution {
    public int[] getStrongest(int[] arr, int l) {
        Arrays.sort(arr);
        int n = arr.length;
        int m = ((n - 1) / 2);
        int centre = arr[m];

        int[] diffs = new int[n];
        int[] result = new int[l];

        for (int i = 0, j = 0, k = n - 1; i < l; i++) {
            if (arr[k] > arr[j] && Math.abs(arr[k] - centre) >= Math.abs(arr[j] - centre)) {
                result[i] = arr[k];
                k--;
            } else {
                result[i] = arr[j];
                j++;
            }
        }

        return result;
    }
}
