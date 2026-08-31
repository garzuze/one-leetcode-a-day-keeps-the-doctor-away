import java.util.Map;
import java.util.HashMap;


class Solution {
    public int equalPairs(int[][] grid) {
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> rows = new HashMap<>();

        for (int[] row : grid) {
            sb.setLength(0);
            for (int el : row) {
                sb.append(el);
                sb.append(",");
            }
            String id = sb.toString();
            rows.put(id, rows.getOrDefault(id, 0) + 1);
        }

        int result = 0;
        
        for (int i = 0; i < grid.length; i++) {
            sb.setLength(0);
            for (int j = 0; j < grid.length; j++) {
                sb.append(grid[j][i]);
                sb.append(",");
            }

            String id = sb.toString();
            
            if (rows.containsKey(id)) {
                result += rows.get(id);
            }
        }

        return result;
    }
}
