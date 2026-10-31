class Solution {
    public int minFlips(int[][] grid) {
        int rows = 0;

        for (int[] row : grid) {
            int l = 0;
            int r = row.length - 1;
            while (l < r) {
                if (row[l] != row[r]) {
                    rows++;
                }
                l++;
                r--;
            }
        }
        int cols = 0;

        for (int i = 0; i < grid[0].length; i++) {
            int l = 0;
            int r = grid.length - 1;
            while (l < r) {
                if (grid[l][i] != grid[r][i]) {
                    cols++;
                }
                l++;
                r--;
            }
        }

        return Math.min(rows, cols);
    }
}
