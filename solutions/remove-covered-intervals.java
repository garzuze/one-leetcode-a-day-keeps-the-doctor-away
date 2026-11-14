import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        int result = 0;
        int right = 0;
        
        for (int[] inter : intervals) {
            if (inter[1] > right) {
                right = inter[1];
                result++;
            }
        }

        return result;
    }
}
