import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        Map<Integer, Integer> rank = new HashMap<>(arr.length);
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i - 1] != arr[i]) {
                count++;
            }
            rank.put(arr[i], count);
        }

        for (int i = 0; i < arrCopy.length; i++) {
            result[i] = rank.get(arrCopy[i]);
        }

        return result;
    }
}
