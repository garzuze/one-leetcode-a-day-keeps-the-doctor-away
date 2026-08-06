import java.util.Map;
import java.util.TreeMap;
import java.util.PriorityQueue;


class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, PriorityQueue<Integer>> map = new TreeMap<>();

        for (int i = 0; i < mat.length; i++) {
            int acc = 0;

            for (int n : mat[i]) {
                acc += n;
            }

            map.computeIfAbsent(acc, x -> new PriorityQueue<>()).offer(i);
        }

        int n = 0;
        int[] result = new int[k];

        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
            while (n < k && !entry.getValue().isEmpty()) {
                result[n] = entry.getValue().poll();
                n++;
            }
        }

        return result;
    }
}
