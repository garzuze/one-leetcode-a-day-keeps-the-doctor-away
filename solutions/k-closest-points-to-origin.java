import java.util.TreeMap;
import java.util.Deque;
import java.util.ArrayDeque;


class Solution {
    public int[][] kClosest(int[][] points, int k) {
        TreeMap<Double, Deque<Integer>> distances = new TreeMap<>();
        int[][] result = new int[k][2];
        
        for (int i = 0; i < points.length; i++) {
            distances.computeIfAbsent(
                calculateDistanceFromOrigin(points[i]), 
                x -> new ArrayDeque<>()).offerLast(i);
        }

        int i = 0;

        while (i < k) {
            Deque<Integer> deque = distances.pollFirstEntry().getValue();

            while (!deque.isEmpty() && i < k) {
                result[i] = points[deque.pollFirst()];
                i++;
            }
        }

        return result;
    }

    private static double calculateDistanceFromOrigin(int[] point) {
        return Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2));
    }
}
