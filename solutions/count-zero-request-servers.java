import java.util.Arrays;

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        int m = queries.length;
        Integer[] ids = new Integer[m];

        int[] result = new int[m];
        int[] count = new int[n + 1];
        int l = 0, r = 0, active = 0;
        
        for (int i = 0; i < m; i++) {
            ids[i] = i;
        }

        Arrays.sort(ids, (i, j) -> Integer.compare(queries[i], queries[j]));

        for (int i : ids) {
            int q = queries[i];
            while (r < logs.length && logs[r][1] <= q) {
                int id = logs[r][0];
                r++;
                if (count[id] == 0) {
                    active++;
                }
                count[id]++;
            }
            while (l < r && logs[l][1] < q - x) {
                int id = logs[l][0];
                l++;
                count[id]--;
                if (count[id] == 0) {
                    active--;
                }
            }
            result[i] = n - active;
        }

        return result;
    }
}
